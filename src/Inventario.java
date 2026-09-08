import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    //Metodo para añadir productos a la lista.
    public void agregar(Producto producto) {
        this.productos.add(producto);
    }

    //Metodo para listar inventario.
    public void listar() {
        for (Producto p : this.productos) {
            System.out.println(p.describir());
        }
    }

    //Metodo buscar por nombre.
    public void buscarPorNombre(String nombre) {
        Producto encontrado = null;
        for (Producto p : this.productos) {
            if (nombre.equals(p.getNombre())) {
                encontrado = p;
            }
        }
        if (encontrado != null){
            System.out.println(encontrado.describir());
        } else {
            System.out.println("No se encontro este producto");
        }
    }

    //Metodo calcularValorTotalInventario.
    public double calcularValorTotalInventario() {
        double valorTotal = 0;
        for (Producto p : this.productos){
            valorTotal = valorTotal + p.calcularValorTotal();
        }
        return valorTotal;

    }
}
