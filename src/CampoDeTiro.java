 public class CampoDeTiro {
	 
/**
 * Esta clase ejecuta dos "Threads" simultáneamente, sin embargo, a diferencia del ejemplo descrito
 * anteriormente notará que el orden de ejecución será llevado acabo de manera ordenada, esto es,
 * el resultado producido siempre será idéntico.
 *  Esto debe al uso del vocablo synchronized y los diversos eventos disponibles para manipulación
 * de "Threads" (notifyAll y wait).	 
 * @param args
 */
	 
    public static void main(String[] args) {
        Pistola arma = new Pistola();
        Cargar c = new Cargar(arma, 1);
        Descargar d = new Descargar(arma, 1);
        c.start();
        d.start();
    }
    
 }