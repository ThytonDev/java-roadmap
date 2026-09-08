public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    //Constructor: mismo nombre que la clase, recibe los datos necesarios y los asigna a ESTE objeto.

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }


    public String describir() {
        return "Hay " + this.stock + " de " + this.nombre + " a " + this.precio + "€";
    }

    public void vender(int cantidad) {
        if (cantidad > this.stock) {
            throw new IllegalArgumentException("Error: No hay la cantidad suficiente. Tienes: " + this.stock);
        } else {
            stock = stock - cantidad;
        }
    }

    public double calcularValorTotal() {
        return precio * stock;
    }

    public int getStock() {
        return this.stock;
    }
    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Error: El stock no puede ser negativo.");

        } else {
            this.stock = stock;
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser null o vacio");
        } else {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        if (precio < 0.0) {
            throw new IllegalArgumentException("Error: No se puede poner un valor negativo");
        } else {
            this.precio = precio;
        }
    }
}
