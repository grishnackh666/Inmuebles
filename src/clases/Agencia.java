
package clases;

import java.util.ArrayList;


public class Agencia {
    private ArrayList<Inmueble> venta;
    private ArrayList<Inmueble> alquiler;
   

    public Agencia() {
        this.venta = new ArrayList<>();
        this.alquiler = new ArrayList<>();
        
    }
    
    
    public boolean añadirInmueble(Inmueble Venta){
        if((Vivienda.class==Venta.getClass()) ||(Solares.class==Venta.getClass())){
            if(!venta.contains(Venta)){
                venta.add(Venta);
                return true;
            }
        }
        return false;
    }
    
    
    public boolean añadirAlquiler(Inmueble enAlquiler){
        if(enAlquiler.getClass()==Plazasdegaraje.class || enAlquiler.getClass()==Locales_comerciales.class  ){
            if(!alquiler.contains(enAlquiler)){
                alquiler.add(enAlquiler);
                return true;
            }
        }
        return false;
    }
    
    
    
    public ArrayList<Inmueble> Venta(int precio){
        ArrayList<Inmueble> salida= new ArrayList<>();
        for (Inmueble to : venta) {
            if(precio>to.getPrecio()){
                salida.add(to);
            }
        }
        return salida;
    }
    
    
    
     public ArrayList<Inmueble> localesSegundaMano(int metros){
        ArrayList<Inmueble> mostrar= new ArrayList<>();
        for (Inmueble to : alquiler) {
            if((to.getClass())&&(metros<to.getMetros())==(Locales_comerciales.class))
            {
                if(to.valueOf("segunda")){
                    mostrar.add(to);
                }
            }
        }
        return mostrar;
    }
     
     
     public int solar(){
         int mostrar= 0;
        for (Inmueble to : venta) {
            
            if(Solares.class==to.getClass()){
                if(to.getZona().equals("Rustica")){
                mostrar++;
                }
            }
        }
        return mostrar;
     }
    
    
}
