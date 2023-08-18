
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona 
{
    // instance variables - replace the example below with your own
    private String nombre;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre)
    {
        // initialise instance variables
        this.nombre=nombre;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setPersona(String nombre){
        this.nombre=nombre;
    }
    public String getPersona(){
        return nombre;
    }
}
