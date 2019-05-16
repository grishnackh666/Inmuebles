
package clases;



public class Plazasdegaraje extends Superficies{
    
    private Formar formar;

    public Plazasdegaraje(Formar formar, int metrocu, long ubicacion, double metros) {
        super(metrocu, ubicacion, metros);
        this.formar = formar;
    }

    public Formar getFormar() {
        return formar;
    }
    public void setFormar(Formar formar) {
        this.formar = formar;
    }


        
    
    
    
}
