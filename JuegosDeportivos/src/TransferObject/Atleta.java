/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TransferObject;

import java.util.Date;

/**
 *
 * @author Braulio Rivera
 */
public class Atleta {
    
    private String Nombre;
    private String Apellidos;
    private Date FechaNacimiento;
    private int Edad;
    private String Ocupacion;
    private String Ciudad;

    public Atleta(String Nombre, String Apellidos, Date FechaNacimiento, int Edad, String Ocupacion, String Ciudad) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.FechaNacimiento = FechaNacimiento;
        this.Edad = Edad;
        this.Ocupacion = Ocupacion;
        this.Ciudad = Ciudad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
                            
    
}
