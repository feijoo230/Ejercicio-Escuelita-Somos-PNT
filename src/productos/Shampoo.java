package productos;

public class Shampoo extends Producto {
    private int contenido;

    public Shampoo(String nombre, int contenido, double precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Contenido: %dml /// Precio: $%.0f", nombre, contenido, precio);
    }
}
