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
}
