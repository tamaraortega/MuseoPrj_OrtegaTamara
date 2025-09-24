import java.time.LocalDate;
import java.time.format.DateTimeFormatter; 
/**
 * Clase que representa un boleto de entrada a un mueso. 
 * Cada boleto tiene un precio, numero unico y fecha de emision. 
 * Forma parte de la Actividad Asincronica 4 (AA4)
 *
 * @author Tamara Ortega
 * @version 1.0
 */

public class BoletoMuseo
{
    private double precio; /** Precio del boleto. */
    private int numeroBoleto; /** Numero asociado al boleto */
    private String fechaEmision;  /** Fecha en la  que fue emitido */
    private static int contador = 0; /** Contador estatico que lleva la cantidad de boletos creados. */

    /**
     * Metodo contructor: Crea un nuevo boleto de museo con un precio indicado. 
     * Se incrementa el contador global y se asigna la fecha actual como fecha de emision.
     * 
     * @param precio Precio del boleto
     */
    public BoletoMuseo(double precio)
    {
        this.precio=precio;/** Fecha en la  que fue emitido */
        contador++;
        this.numeroBoleto = contador;
        this.fechaEmision = establecerFechaEmisionBoleto();
    }
    /**
     * Establece la fecha de emisión del boleto con el formato yyyy-MM-dd.
     *
     * @return Fecha de emisión como cadena de texto
     */
    private String establecerFechaEmisionBoleto() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
        /**
     * Devuelve el contador global de boletos creados.
     *
     * @return Cantidad de boletos creados
     */
    public static int getContador(){
        return contador;
    }
        /**
     * Devuelve el número único del boleto.
     *
     * @return Número de boleto
     */
    public int getNumeroBoleto(){
        return numeroBoleto;
    }
    /**
     * Devuelve el precio del boleto.
     *
     * @return Precio del boleto
     */
    public double getPrecio(){
        return precio;
    }
    /**
     * Devuelve la representación en texto del boleto.
     *
     * @return Cadena con los datos del boleto
     */
    public String toString(){
        String msg = "BoletoMuseo\n";
        msg +=" Numero:" + numeroBoleto + "\n";
        msg +=" Precio:" +precio + "\n";
        msg +=" Fecha Emision:" +fechaEmision;
        return msg;
    }
    
}