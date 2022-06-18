/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JProgressBar;

/**
 *
 * @author gerar
 */
public class administrarTodo extends Thread{
    
    private int numero;
    private JProgressBar progBar;
    private boolean avanzar;
    private boolean vive;

    public administrarTodo(JProgressBar progBar, int numero) {
        this.numero = numero;
        this.progBar = progBar;
        avanzar = true;
        vive = true;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                progBar.setValue((progBar.getValue()+1));
                //activar y modificar propiedad stringPainted para que esto funciones
                progBar.setString(Integer.toString(progBar.getValue()) + " Process");

            }
            int num = this.numero;
            try {
                Thread.sleep(numero);
            } catch (InterruptedException ex) {
            }
        }

    }
}
