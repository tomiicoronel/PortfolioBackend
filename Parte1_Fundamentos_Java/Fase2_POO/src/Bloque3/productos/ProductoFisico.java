package Bloque3.productos;

public class ProductoFisico extends Producto{
    private double costoEnvio;

    public ProductoFisico(String nombre, String descripcion, double precioBase, double costoEnvio) {
        super(nombre, descripcion, precioBase);
        this.costoEnvio = costoEnvio;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase()+getCostoEnvio() ;
    }
}
