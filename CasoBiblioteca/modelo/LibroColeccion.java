package modelo;

public class LibroColeccion extends Libro
{
    private String nombreColeccion;
    private Integer numeroColeccion;

    public LibroColeccion(String nombreLibro, String nombreAutor, Integer anioEdicion, Boolean libroDeLujo, String nombreColeccion, Integer numeroColeccion)
    {
        super(nombreLibro, nombreAutor, anioEdicion, libroDeLujo);
        this.nombreColeccion = nombreColeccion;
        this.numeroColeccion = numeroColeccion;
    }

    public String getNombreColeccion() 
    {
        return nombreColeccion;
    }

    public Integer getNumeroColeccion() 
    {
        return numeroColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) 
    {
        this.nombreColeccion = nombreColeccion;
    }

    public void setNumeroColeccion(Integer numeroColeccion) 
    {
        this.numeroColeccion = numeroColeccion;
    }

    @Override
    public String  toString()
    {
        return "\nNombre: " + nombreLibro + "\nAutores: " + nombreAutor + "\nAño: " + anioEdicion + "\nEdición de lujo: " + libroDeLujo + "\nNombre de colección: " + nombreColeccion + "\nNúmero de colección: " + numeroColeccion + "\n";
    }
}
