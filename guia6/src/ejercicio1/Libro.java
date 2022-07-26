package ejercicio1;

public class Libro {
int Isbn;
String  Titulo;
String Autor;
int NumerodePagina;

    public Libro() {
    }

    public Libro(int Isbn, String Titulo, String Autor, int NumerodePagina) {
        this.Isbn = Isbn;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumerodePagina = NumerodePagina;
    }
   

    public int getIsbn() {
        return Isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumerodePagina() {
        return NumerodePagina;
    }

   
    public void setIsbn(int Isbn) {
        this.Isbn = Isbn;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumerodePagina(int NumerodePagina) {
        this.NumerodePagina = NumerodePagina;
    }

   

    @Override
    public String toString() {
        return "Isbn: " + Isbn + "\n Titulo: " + Titulo + "\n Autor: " + Autor + "\n NumerodePagina: " + NumerodePagina ;
    }
            
       
    
}


