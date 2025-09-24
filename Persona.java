
import java.time.LocalDate;
import java.time.format.DateTimeFormatter; 

/**
 * Clase que representa a una persona que puede adquirir un boleto de museo.
 * Forma parte de la Actividad Asincrónica 4 (AA4). 
 *
 * @author Tamara Ortega
 * @version 1.0
 */

public class Persona
{
    
    private String nombre;  /** Nombre de la persona. */
    private String identificacion; /** Numero para identificar a la persona */
    private BoletoMuseo miBoleto; /** Boleto adquirido */

    /**
     * Primer metodo contructor para la clase persona:
     * Crea una nueva persona con la identificacion. 
     * @param nombre Nombre de la persona
     * @param ident Identificacion de la persona 
     */
    public Persona(String nombre, String ident)
    {
        this(nombre);
        identificacion = ident;

    }
    /**
     * Segundo metodo contructor para la clase persona:
     * Crea una nueva persona unicamente con el nombre
     * @param nombre Nombre de la persona
     */
    
    public Persona(String nombre) {
        this.nombre= nombre;
    }
    /**
     * Metodo para asignar la identificacion a la persona 
     * @param pIdentificacion Identificacion a asignar
     */
    public void setIdentificacion(String pIdentificacion) {
        identificacion = pIdentificacion;
    }
    /**
     * Metodo para asignar la identificacion a la persona 
     * @param pIdentificacion Identificacion a asignar
     */
    public void asignarBoleto(BoletoMuseo pMiBoleto) {
        miBoleto= miBoleto;
    }
    /**
     * Metodo para asignar consultar el numero de boleto 
     * @param miBoleto Boleto de museo a asignar
     * @throws NullPointerException si la persona no tiene boleto asignado
     */
    public int consultarMiNumeroDeBoleto(){
        return miBoleto.getNumeroBoleto();
    }
    /**
     * Metodo para retornar todos los datos de la clase
     * @return Cadena de caracteres con la informacion de persona 
     */
    public String toString(){
        String msg= "Persona\n";
        msg +=" Nombre:" + nombre + "\n";
        msg +=" Identificacion: " + identificacion + "\n";
        if (miBoleto != null) {
            msg +=" Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n";
            
        } else {
            msg +=" Boleto asignado: (ninguno)\n";
        }
        return msg;
    }
}
