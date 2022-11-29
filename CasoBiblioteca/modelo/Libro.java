package modelo;

public class Libro 
{
    protected String nombreLibro;
    protected String nombreAutor;
    protected Integer anioEdicion;
    protected Boolean libroDeLujo;
    
    public Libro (String nombreLibro, String nombreAutor, Integer anioEdicion, Boolean libroDeLujo)
    {
        this.nombreLibro = nombreLibro;
        this.nombreAutor = nombreAutor;
        this.anioEdicion = anioEdicion;
        this.libroDeLujo = libroDeLujo;
    }

    public Libro()
    {
        this.nombreLibro = "";
        this.nombreAutor = "";
        this.anioEdicion = 0;
        this.libroDeLujo = false;
    }
    
    public String getNombreLibro() 
    {
        return nombreLibro;
    }

    public String getNombreAutor() 
    {
        return nombreAutor;
    }

    public Boolean getLibroDeLujo() 
    {
        return libroDeLujo;
    }

    public Integer getAnioEdicion() 
    {
        return anioEdicion;
    }

    public String toString()
    {
        return "\nNombre: " + nombreLibro + "\nAutores: " + nombreAutor + "\nAño: " + anioEdicion + "\nEdicion de lujo: " + libroDeLujo + "\n";
    }
}
