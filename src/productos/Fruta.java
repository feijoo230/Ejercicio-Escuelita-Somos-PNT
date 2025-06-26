package productos;

public class Fruta extends Producto {
    private String unidadVenta;

    public Fruta(String nombre, double precio, String unidadVenta) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Precio: $%.0f /// Unidad de venta: %s", nombre, precio, unidadVenta);
    }
}
