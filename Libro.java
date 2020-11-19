
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numero)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numero;
        numeroReferencia = "";
    }
    
    /**
     * Devuelve el autor
     */
    public String getAutor() {
        return autor;
    }
    
    /**
     * Devuelve el titulo
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Devuelve numero de paginas
     */
    public int getnumeroPaginas() {
        return numeroPaginas;
    }
    
    /**
     * Devuelve el numero de referencia
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    public void setNumeroReferencia(String referencia) {
        if (numeroReferencia.length() <= 3) {
            System.out.println("Nesceita al meno 3 caracteres");
        }
        else {
            numeroReferencia = referencia;
        }
    }
    
    /**
     * Imprime el nombre del autor
     */
    public void imprimeAutor() {
        System.out.println(autor);
    }
    
    /**
     * Imprime el el titulo del libro
     */
    public void imprimeTitulo() {
        System.out.println(titulo);
    }
    
    /**
     * Imprime por pantalla los detalles
     */
    public void imprimeDetalles() {
        System.out.println("Titulo: " + titulo );
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + numeroPaginas);
        if (numeroReferencia.length() <= 0) {
            System.out.println("Numero de Referencia: " + "ZZZ");
        }
        else {
            System.out.println("Numero de Referencia: " + numeroReferencia);
        }
    }
    
    /**
     * Devuelve los detalles
     */
    public String getmostrarDetalles() {
        String referenciaError = "ZZZ";
        if (numeroReferencia.length() <= 0) {
            numeroReferencia = referenciaError;
        }
        return "Titulo: " + titulo + " | " + " Autor: " + autor + " | " + " Paginas: " + numeroPaginas + " | " + "Numero de Referencia: " + numeroReferencia;
    }
}
