import java.util.ArrayList;
import java.util.Scanner;

public class GestorInventario {
    public static void main() {
        //Crear nuevo inventario
        Inventario inventario = new Inventario();
        //Añadir los productos
        inventario.agregar(new Producto("Fresno", 3.0, 30));
        inventario.agregar(new Producto("Castaño", 2.0, 50));
        inventario.agregar(new Producto("Arce", 5.0, 25));
        inventario.agregar(new Producto("Roble", 8.0, 80));
        inventario.agregar(new Producto("Bambu", 1.5, 95));
        //Listar inventario
        inventario.listar();
        System.out.println(inventario.calcularValorTotalInventario());

        //Crear Menu
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("1)Listar Productos");
            System.out.println("2)Ver Valor Total");
            System.out.println("3)Buscar un Producto");
            System.out.println("4)Vender un Producto");
            System.out.println("5)Salir");

            int opcion = sc.nextInt();
            sc.nextLine();   // línea de limpieza: se traga el \n fantasma que dejó nextInt()

            switch (opcion) {
                case 1 -> inventario.listar();
                case 2 -> System.out.println(inventario.calcularValorTotalInventario());
                case 3 -> {
                    System.out.println("Que producto buscas?");
                    Producto producto = inventario.buscarPorNombre(sc.nextLine());
                    if (producto != null) {
                        System.out.println(producto.describir());
                    } else {
                        System.out.println("Producto no encontrado");
                    }
                }
                case 4 -> {
                    System.out.println("Que producto quieres vender?");
                    Producto producto = inventario.buscarPorNombre(sc.nextLine());
                    if (producto != null) {
                        System.out.println("Cuantos quieres vender?");
                        producto.vender(sc.nextInt());
                    } else {
                        System.out.println("Producto no encontrado");
                    }
                }
                case 5 -> salir = true;
                default -> System.out.println("Opcion no valida");
            }
        }
    }
}
