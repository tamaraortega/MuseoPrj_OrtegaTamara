
/**
 * Clase principal del sistema del museo.
 * Contiene el método main donde se crean instancias de 
 * {@link Persona}, {@link BoletoMuseo} y {@link VentaDelDia},
 * simulando el proceso de asignación de boletos y registro de ventas.
 *
 * @author 
 * @version 1.0
 */

public class PrincipalMuseo
{
    /**
     * Método principal que ejecuta el programa.
     *
     * @param args argumentos de línea de comando (no utilizados).
     */
    public static void main(String [] args){ 
        Persona a, b, c; 
        a = new Persona("Nicolás Maduro", "666-6"); 
        b = new Persona("Donald Trump", "333-3"); 
        c = new Persona("Claudia Sheinbaum", "777-7"); 

        BoletoMuseo b1, b2, b3; 
        b1 = new BoletoMuseo(4500.0); 
        b2 = new BoletoMuseo(6000.0); 
        b3 = new BoletoMuseo(5800.0); 

        VentaDelDia vd; 
        vd = new VentaDelDia(); 

        a.asignarBoleto(b1); 
        System.out.println("Detalle del primer objeto Persona:\n" + a.toString()); 
        vd.registrarVentaBoleto(b1); 

        b.asignarBoleto(b2); 
        System.out.println("Detalle del segundo objeto Persona:\n" + b.toString()); 
        vd.registrarVentaBoleto(b2); 

        c.asignarBoleto(b3); 
        System.out.println("Detalle del tercer objeto Persona:\n" + c.toString()); 
        vd.registrarVentaBoleto(b3); 

        System.out.println("Contador global de boletos creados: " + BoletoMuseo.getContador()); 
        System.out.println("Detalle de la Venta Del Día:\n" + vd.toString()); 
    } 
}
    

