/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclase;

/**
 *
 * @author developer
 */
public class Tarjeta {

//Atributos de instancia    
private int saldoCreditos;
private int saldoTikets;
private int numTarjeta;

//Atributos de clase
private static int contador=1;

    public Tarjeta(int creditos) {
        this.saldoCreditos = creditos;
        this.saldoTikets = 0;
        this.numTarjeta = contador;
        contador++;

        
    }

    public int getCreditos() {
        return saldoCreditos;
    }

    public void setCreditos(int creditos) {
        this.saldoCreditos = creditos;      
    }
    public int getTikets() {
        return saldoTikets;
    }
    public void setTikets(int tikets) {
        this.saldoTikets = tikets;
    }
    public int getNumTarjeta() {
        return numTarjeta;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "saldoCreditos=" + saldoCreditos + ", saldoTikets=" + saldoTikets + ", numTarjeta=" + numTarjeta + '}';
    }
    

 


}


