
package clases;

import java.util.ArrayList;


public abstract class Inmueble {
    protected  long ubicacion;
    protected  double metros;
    

    public Inmueble(long ubicacion, double metros) {
        this.ubicacion = ubicacion;
        this.metros = metros;
    }

    public long getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(long ubicacion) {
        this.ubicacion = ubicacion;
    }
    public double getMetros() {
        return metros;
    }
    public void setMetros(double metros) {
        this.metros = metros;
    }
    
    protected abstract int getPrecio();
    
    public String mostrar(){
        String mostrar ="ubicado en: "+ubicacion+" tiene estos metros cuadrados:"+metros;
        return mostrar;
    }
    
}
