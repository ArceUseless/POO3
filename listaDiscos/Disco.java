/**
 * Disco.java
 * Definici�n de la clase Disco
 * 
 * @author �lvaro Garc�a Fuentes
 * @author Rafael Jes�s Nieto Cardador
 */
package listaDiscos;

public class Disco {

  //Atributos
  private String codigo = "LIBRE";
  private String titulo;
  private String autor;
  private String genero;
  private int duracion;
  
  //Getters
  public String getCodigo() {
    return this.codigo;
    }
  public String getTitulo() {
    return this.titulo;
    }
  public String getAutor() {
    return this.autor;
    }
  public String getGenero() {
    return this.genero;
    }
  public int getDuracion() {
    return this.duracion;
    }

  //Setters
  public void setCodigo(String codigo) {
    this.codigo = codigo;
    }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
    }
  public void setAutor(String autor) {
    this.autor = autor;
    }
  public void setGenero(String genero) {
    this.genero = genero;
    }
  public void setDuracion(int duracion) {
    this.duracion = duracion;
    }
  
  //Metodos
  public String toString() {
    return "\nC�digo - " + this.codigo
        + "\nTitulo - " + this.titulo
        + "\nAutor/a - " + this.autor
        + "\nG�nero - " + this.genero
        + "\nDuraci�n - " + this.duracion;
    }

} // Fin de la clase Disco