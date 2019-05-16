
package clases;


public abstract class Construcciones extends Inmueble{

    
    private Puede ser;

    public Construcciones(Puede ser, long ubicacion, double metros) {
        super(ubicacion, metros);
        this.ser = ser;
    }

    public Puede getSer() {
        return ser;
    }
    public void setSer(Puede ser) {
        this.ser = ser;
    }

}
