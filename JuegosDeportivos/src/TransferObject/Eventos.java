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
public class Eventos {
    private String TipoEvento;
    private Date Fecha;

    public Eventos(String TipoEvento, Date Fecha, String Instalaciones, String Direccion, int NumeroAsientos) {
        this.TipoEvento = TipoEvento;
        this.Fecha = Fecha;
    }

    public String getTipoEvento() {
        return TipoEvento;
    }

    public void setTipoEvento(String TipoEvento) {
        this.TipoEvento = TipoEvento;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
}
