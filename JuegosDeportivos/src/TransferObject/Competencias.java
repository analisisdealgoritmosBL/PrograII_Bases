/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TransferObject;

/**
 *
 * @author Braulio Rivera
 */
public class Competencias {
    private String Modalidad;
    private String Genero;
    private String Metrica;
    private int RangoValores;

    public Competencias(String Modalidad, String Genero, String Metrica, int RangoValores) {
        this.Modalidad = Modalidad;
        this.Genero = Genero;
        this.Metrica = Metrica;
        this.RangoValores = RangoValores;
    }

    public String getModalidad() {
        return Modalidad;
    }

    public void setModalidad(String Modalidad) {
        this.Modalidad = Modalidad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getMetrica() {
        return Metrica;
    }

    public void setMetrica(String Metrica) {
        this.Metrica = Metrica;
    }

    public int getRangoValores() {
        return RangoValores;
    }

    public void setRangoValores(int RangoValores) {
        this.RangoValores = RangoValores;
    }

    
    
    
}
