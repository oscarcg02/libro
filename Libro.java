
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
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numero, boolean texto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numero;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = texto;
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
    
    /**
     * Devuelve las veces que ha sido prestado
     */
    public int getVecesPrestado() {
        return vecesPrestado;
    }
    
    /**
     * Devuelve si es de texto o no
     */
    public boolean getEsLibroDeTexto() {
        return esLibroDeTexto;
    }
    
    public void prestar () {
        vecesPrestado = vecesPrestado + 1;
    }
    
    public void setNumeroReferencia(String referencia) {
        if (numeroReferencia.length() <= 3) {
            numeroReferencia = referencia;
        }
        else {
            System.out.println("Nesceita al meno 3 caracteres");
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
        System.out.println("Prestado: " + vecesPrestado);
        if (esLibroDeTexto == true) {
            System.out.println("Libro de texto: " + "Si");
        }
        else {
            System.out.println("Libro de texto: " + "No");
        }
        
    }
    
    /**
     * Devuelve los detalles
     */
    public String getmostrarDetalles() {
        String referencia = "ZZZ";
        if (numeroReferencia.length() > 0) {
            referencia = numeroReferencia;
        }
        String textoSiNo = "no";
        if (esLibroDeTexto == true) {
            textoSiNo = "si";
        }
        return "Titulo: " + titulo + " | " + " Autor: " + autor + " | " + " Paginas: " + numeroPaginas + " | " + "Numero de Referencia: " + referencia + " | " + "Prestado: " + vecesPrestado + " | " + "Libro de texto: " + "textoSiNo";
    }
}
