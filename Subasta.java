
import java.util.ArrayList;

public class Subasta {
   private ArrayList<Lote> lotes;
   private int numeroDeLoteSiguiente;


public Subasta ()
{
        lotes = new ArrayList<Lote>();

        numeroDeLoteSiguiente =1;


    }
  public void ingresarlote (String descripcion)
   {
    lotes.add(new Lote (numeroDeLoteSiguiente, descripcion) ); 
    numeroDeLoteSiguiente++;
  }

   public void mostrarLotes () {
      for (Lote lote : lotes) {

        System.out.println(lote.toString());

    }
    }

   public void ofertaPara(int numeroDeLote, Persona ofertante, long valor)
   {   
     Lote loteElegido=getLote (numeroDeLote);

      boolean exito = false;

     if (loteElegido != null) {

     exito=loteElegido.ofertaPara(new Oferta (ofertante, valor));
    }
    if (exito) {

     System.out.println("La oferta para el lote No "+numeroDeLote+" resultó exitosa");

     }

     else{

     Oferta ofertaMaxima=loteElegido.getOfertaMaxima ();
     System.out.println("El lote No" +numeroDeLote + "tiene una oferta de:" + ofertaMaxima.getMonto());
    }
    
   }
   public Lote getLote(int numeroDeLote)
   {
    if((numeroDeLote >= 1) && (numeroDeLote < numeroDeLoteSiguiente))
    {
       Lote loteElegido = lotes.get(numeroDeLote -1); 
    
       if (loteElegido.getNumero() != numeroDeLote)
       {
           System.out.println("Error interno: Se retorno el lote Nro.:"+ loteElegido.getNumero()+"en lugar de"+numeroDeLote);
           
       }
       return loteElegido;
    } 
    else{
       System.out.println("El lote nro;" + numeroDeLote+ "no existe");
       return null;
    }
  }
   public void mostrarAdjudicados(){
    for(Lote lote : lotes){
           System.out.println(lote.mostrarGanador());
    }
  } 
}
    

   

