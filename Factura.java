package lab06;

public class Factura implements PorPagar {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura( String pieza, String descripcion, int cuenta,double precio ){
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        establecerCantidad(cuenta); 
        establecerPrecioPorArticulo(precio);
    }

    @Override
    public double obtenerMontoPago(){ 
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    } 
}
