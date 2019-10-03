package practica23;


/**
 *
 * @author 18PROGB0452
 */
public class libro {
    //atributos
    private String titulo;
    private String autor;
    private int num_ejemplares;
    private int ejemplares_prestados;
    
 
    //constructor vacio
    public libro () {}

    public libro(String titulo, String autor, int num_ejemplares, int ejemplares_prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.num_ejemplares = num_ejemplares;
        this.ejemplares_prestados = ejemplares_prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNum_ejemplares() {
        return num_ejemplares;
    }

    public void setNum_ejemplares(int num_ejemplares) {
        this.num_ejemplares = num_ejemplares;
    }

    public int getEjemplares_prestados() {
        return ejemplares_prestados;
    }

    public void setEjemplares_prestados(int ejemplares_prestados) {
        this.ejemplares_prestados = ejemplares_prestados;
    }

    @Override
    public String toString() {
        return "libro{" + "titulo=" + titulo + ", autor=" + autor + ", num_ejemplares=" + num_ejemplares + ", ejemplares_prestados=" + ejemplares_prestados + '}';
    }
    
    
    
}