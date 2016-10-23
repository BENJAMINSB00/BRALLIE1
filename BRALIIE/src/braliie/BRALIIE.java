/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package braliie;

/**
 *
 * @author SOTO
 */
public class BRALIIE implements IBRALIIE {

    private String Mensaje;

    public BRALIIE(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public void imprimir() {
        System.out.println("El mensaje es: "+Mensaje);
        
    }
    
}
