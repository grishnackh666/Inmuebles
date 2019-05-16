
package clases;


public class Locales_comerciales extends Construcciones{
    
    private int metrocuadrado;

    public Locales_comerciales(int metrocuadrado, Puede ser, long ubicacion, double metros) {
        super(ser, ubicacion, metros);
        this.metrocuadrado = metrocuadrado;
    }

    public int getMetrocuadrado() {
        return metrocuadrado;
    }
    public void setMetrocuadrado(int metrocuadrado) {
        this.metrocuadrado = metrocuadrado;
    }

    @Override
    protected int getPrecio() {
        throw new UnsupportedOperationException("Not supported yet.");
       
    }
    
    
    
    
}
