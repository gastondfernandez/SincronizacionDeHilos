 public class CampoDeTiro {
	 
/**
 * Esta clase ejecuta dos "Threads" simult�neamente, sin embargo, a diferencia del ejemplo descrito
 * anteriormente notar� que el orden de ejecuci�n ser� llevado acabo de manera ordenada, esto es,
 * el resultado producido siempre ser� id�ntico.
 *  Esto debe al uso del vocablo synchronized y los diversos eventos disponibles para manipulaci�n
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