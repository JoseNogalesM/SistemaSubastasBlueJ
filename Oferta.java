
/**
 * Write a description of class Oferta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oferta 
{
    // instance variables - replace the example below with your own
    private Persona ofertante;
    private long monto;

    /**
     * Constructor for objects of class Oferta
     */
    public Oferta(Persona ofertante, long monto)
    {
        // initialise instance variables
        this.ofertante=ofertante;
        this.monto=monto;
    }

    public long getMonto(){
        return monto;
        
    }
    public String getNombre(){
        return ofertante.getPersona();
    }
}
