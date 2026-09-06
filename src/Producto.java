public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    String describir() {
        return "Hay " + this.stock + " de " + this.nombre + " a " + this.precio + "€";
    }

    public void vender(int cantidad) {
        if (cantidad > this.stock) {
            System.out.println("Error: No hay la cantidad suficiente. Tienes: " + this.stock);
        } else {
            stock = stock - cantidad;
        }
    }

    double calcularValorTotal() {
        return precio * stock;
    }

    public int getStock() {
        return this.stock;
    }
    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("Error: El stock no puede ser negativo.");
            return;
        } else {
            this.stock = stock;
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        if (precio < 0.0) {
            System.out.println("Error: No se puede poner un valor negativo");
        } else {
            this.precio = precio;
        }
    }
}
