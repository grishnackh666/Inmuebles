
package clases;


public class Superficies extends Inmueble{

   private int metrocuadrado;

    public Superficies(int metrocu, long ubicacion, double metros) {
        super(ubicacion, metros);
        this.metrocuadrado = metrocu;
    }

    public int getMetrocuadrado() {
        return metrocuadrado;
    }
    public void setMetrocuadrado(int metrocuadrado) {
        this.metrocuadrado = metrocuadrado;
    }

    @Override
        public int getPrecio(){
        return super.getMetros()*metrocuadrado;
    }

    
    @Override
    public String mostrar() {
        String mostrar= super.mostrar();
        mostrar+=" precio por metro cuadrado : "+metrocuadrado+" precio :"+getPrecio();
        return mostrar;
    }
    
    
}
