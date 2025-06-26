package productos;

public class Bebida extends Producto {
    private double litros;

    public Bebida(String nombre, double litros, double precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Litros: %.1f /// Precio: $%.0f", nombre, litros, precio);
    }
}
