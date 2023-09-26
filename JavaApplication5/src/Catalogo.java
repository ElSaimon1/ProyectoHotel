
import java.util.ArrayList;

public class Catalogo {
    
    private ArrayList<Libro> catalogo;
    
    public Catalogo()
    {
        this.catalogo = new ArrayList();
    }
    
    //agregar libro
    public void agregarLibros(Libro libro)
    {
        this.catalogo.add(libro);
    }
    
    //mostrar libro
    public void mostrarCatalogo()
    {
        for (Libro libro : catalogo) {
            libro.imprimirInfo();
        }
    }
    
    
    
    
    
    
    
    
}
