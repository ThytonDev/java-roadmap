import java.util.ArrayList;

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
        inventario.buscarPorNombre("Roble");
        inventario.buscarPorNombre("Dragon");
    }
}
