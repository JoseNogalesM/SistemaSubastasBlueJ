
/**
 * Write a description of class Lote here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lote
{
    // instance variables - replace the example below with your own
    private int numeroDeLote;
    private String descripcion;
    private Oferta ofertaMaxima;

    /**
     * Constructor for objects of class Lote
     */
    public Lote(int numeroDeLote, String descripcion)
    {
        this.numeroDeLote=numeroDeLote;
        this.descripcion=descripcion;
    }
    public boolean ofertaPara(Oferta oferta){
        if((ofertaMaxima == null) || (oferta.getMonto()>ofertaMaxima.getMonto())){
          ofertaMaxima = oferta;
          return true;
        }
        else{
            return false;
        }
    }

  
    public Oferta getOfertaMaxima(){
        return ofertaMaxima;
    }
    public int getNumero(){
        return numeroDeLote;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String toString()
    {
        String cadena = numeroDeLote + ":"+ descripcion;
        if(ofertaMaxima !=null) cadena += "Oferta Max"+ ofertaMaxima.getMonto();
        else cadena += "( sin oferta)";
        return cadena;

    }
    public String mostrarGanador(){
        
        String cadena= numeroDeLote+ ":" + descripcion;
        cadena += "Ganador" + ofertaMaxima.getNombre();
        cadena += " monto" + ofertaMaxima.getMonto();
        return cadena;
    }
}
