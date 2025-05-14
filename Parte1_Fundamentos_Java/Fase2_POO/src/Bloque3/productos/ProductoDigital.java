package Bloque3.productos;

public class ProductoDigital extends Producto{
    private double descuento;

    public ProductoDigital(String nombre, String descripcion, double precioBase, double descuento) {
        super(nombre, descripcion, precioBase);
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() - (getPrecioBase() * descuento / 100);
    }
}
