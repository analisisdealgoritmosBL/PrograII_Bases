/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TransferObject;

/**
 *
 * @author Braulio Rivera
 */
public class Equipo {
    
    private String Nombre;
    private String TelefonoContacto;
    private String CorreoContacto;

    public Equipo(String Nombre, String TelefonoContacto, String CorreoContacto) {
        this.Nombre = Nombre;
        this.TelefonoContacto = TelefonoContacto;
        this.CorreoContacto = CorreoContacto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefonoContacto() {
        return TelefonoContacto;
    }

    public void setTelefonoContacto(String TelefonoContacto) {
        this.TelefonoContacto = TelefonoContacto;
    }

    public String getCorreoContacto() {
        return CorreoContacto;
    }

    public void setCorreoContacto(String CorreoContacto) {
        this.CorreoContacto = CorreoContacto;
    }
    
    
}
