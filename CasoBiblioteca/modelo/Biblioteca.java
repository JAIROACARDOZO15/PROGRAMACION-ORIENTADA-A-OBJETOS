package modelo;

import java.util.ArrayList;

import vista.PanelResultados;

public class Biblioteca
{
    // ATRIBUTOS
    private ArrayList<Libro> librosDeLaBiblioteca;

    //METODO CONSTRUCTOR
    public Biblioteca(ArrayList<Libro> libroDeLaBiblioteca)
    {
        this.librosDeLaBiblioteca = libroDeLaBiblioteca;
    }
    
    public Biblioteca()
    {
        this.librosDeLaBiblioteca = new ArrayList<>();
    }

    public void setLibrosDeLaBiblioteca(ArrayList<Libro> librosDeLaBiblioteca) 
    {
        this.librosDeLaBiblioteca = librosDeLaBiblioteca;
    }

    public ArrayList<Libro> getLibrosDeLaBiblioteca() 
    {
        return librosDeLaBiblioteca;
    }

    public void agregarLibro(Libro libro)
    {
        librosDeLaBiblioteca.add(libro);
    }

    public void imprimirLibros()
    {
        for(int i = 0; i < librosDeLaBiblioteca.size(); i ++)
        {
            PanelResultados.mostrarResultado(librosDeLaBiblioteca.get(i).toString());
        }
    }
}