/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TransferObject;

/**
 *
 * @author Braulio Rivera
 */
public class Series {
    private int Resultado;
    private int Posicion;

    public Series(int Resultado, int Posicion) {
        this.Resultado = Resultado;
        this.Posicion = Posicion;
    }

    public int getResultado() {
        return Resultado;
    }

    public void setResultado(int Resultado) {
        this.Resultado = Resultado;
    }

    public int getPosicion() {
        return Posicion;
    }

    public void setPosicion(int Posicion) {
        this.Posicion = Posicion;
    }

    
    
    
}
