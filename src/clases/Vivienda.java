
package clases;


public class Vivienda extends Construcciones{
    
    
    private double precion;
    private int numeroHabi;
    private int piso;

    public Vivienda(double precion, int numeroHabi, int piso, Puede ser, long ubicacion, double metros) {
        super(ser, ubicacion, metros);
        this.precion = precion;
        this.numeroHabi = numeroHabi;
        this.piso = piso;
    }

    @Override
    public String mostrar() {
        String mostrar = super.mostrar();
        mostrar +=" el precio es: "+precion+" los por numero de abitantes: "+numeroHabi+" tiene estos piso: "+piso;
        return mostrar;
    }
    
    
    public double getPrecion() {
        return precion;
    }
    public void setPrecion(double precion) {
        this.precion = precion;
    }
    public int getNumeroHabi() {
        return numeroHabi;
    }
    public void setNumeroHabi(int numeroHabi) {
        this.numeroHabi = numeroHabi;
    }
    public int getPiso() {
        return piso;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    protected int getPrecio() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
    
}
