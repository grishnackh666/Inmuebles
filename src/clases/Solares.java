

package clases;


public class Solares extends Superficies{
    
    private Estar estado;

    public Solares(Estar estado, int metrocu, long ubicacion, double metros) {
        super(metrocu, ubicacion, metros);
        this.estado = estado;
    }

    @Override
    public String mostrar() {
        String mostrar = super.mostrar();
        mostrar +=" Esta en una zona : "+estado;
        return mostrar;
    }
    
    public Estar getEstado() {
        return estado;
    }
    public void setEstado(Estar estado) {
        this.estado = estado;
    }
    
    
    
}
