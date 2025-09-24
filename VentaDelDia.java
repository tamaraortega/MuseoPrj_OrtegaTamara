import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List; 

/**
 * Clase que representa las ventas realizadas en un día en el museo.
 * Contiene la lista de boletos vendidos, la fecha de la venta y métodos
 * para calcular el total de ingresos.
 *
 * @author Tamara Ortega
 * @version 1.0
 */


public class VentaDelDia
{
    private String fechaDeLaVenta; /** Fecha en la que se realiza la venta. */
    private List<BoletoMuseo> boletosVendidos; /** Lista de boletos vendidos en el dia. */

    /**
     * Constructor que inicializa la fecha de la venta y 
     * la lista de boletos vendidos.
     */
    public VentaDelDia()
    {
        fechaDeLaVenta = establecerFechaDeLaVenta();
        boletosVendidos = new ArrayList<>();
    }
    /**
     * Calcula el monto total de todas las ventas del día.
     *
     * @return el total acumulado de la venta.
     */
    public double calcularTotalVentaDelDia(){
        double total = 0.0;
        for (BoletoMuseo b : boletosVendidos ) {
            total += b.getPrecio();
        }
        return total;
    }
    /**
     * Establece la fecha de la venta utilizando la fecha actual del sistema.
     *
     * @return la fecha actual en formato yyyy-MM-dd.
     */
    private String establecerFechaDeLaVenta() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
    /**
     * Registra un boleto dentro de la lista de ventas del día.
     *
     * @param boleto el objeto {@link BoletoMuseo} que se agrega a la venta.
     */
    public void registrarVentaBoleto(BoletoMuseo boleto) {
        boletosVendidos.add(boleto);
    }
    /**
     * Devuelve un resumen detallado de la venta del día,
     * incluyendo la cantidad de boletos y el total de ingresos.
     *
     * @return cadena de texto con el detalle de la venta.
     */
    public String toString(){
        String msg = "VentaDelDia\n";
        msg +=" Fecha: " +fechaDeLaVenta + "\n";
        msg +=" Cantidad de boletos: " + boletosVendidos.size() + "\n";
        msg +=" Detalle:\n";
        for (BoletoMuseo b: boletosVendidos) {
            msg +=" -Boleto#" +b.getNumeroBoleto() + "|" + b.getPrecio() +"\n";
        }
        msg +=" Total: " + calcularTotalVentaDelDia();
        return msg;
    }
}
