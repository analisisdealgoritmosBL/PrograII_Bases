/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TransferObject;

/**
 *
 * @author Braulio Rivera
 */
public class Instalaciones {
    
    private String Nombre;
    private String Direccion;
    private int NumeroAsientos;

    public Instalaciones(String Nombre, String Direccion, int NumeroAsientos) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.NumeroAsientos = NumeroAsientos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNumeroAsientos() {
        return NumeroAsientos;
    }

    public void setNumeroAsientos(int NumeroAsientos) {
        this.NumeroAsientos = NumeroAsientos;
    }
    
    
}
