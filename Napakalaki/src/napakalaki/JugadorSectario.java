/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class JugadorSectario extends Jugador{
    Sectario miCartaSectario;
    private static int numeroSectarios;
    
    public static int getNumeroSectarios(){
        return numeroSectarios;
    }
    
    public Sectario getMiCartaSectario(){
        return miCartaSectario;
    }
    
    private static void incrementarSectarios() {
        numeroSectarios++;    
    }
    
    public JugadorSectario(Jugador jugador, Sectario carta){
        super(jugador);
        miCartaSectario=new Sectario(carta.getNombre(),carta.getValorBasico());
        numeroSectarios++;
    }
    
    @Override
    public JugadorSectario convertirme(Sectario cartaSectario) {
        return this;
    }
    
    @Override
    public int obtenerNivelCombate(){
        return super.obtenerNivelCombate()+miCartaSectario.getValorEspecial()*getJugadoresTotales();
    }
    
    private int obtenerNivelContrincante(Monstruo monstruo){
        return monstruo.getValorEspecial();
    }
    
    public int calcularNivelesAComprar(ArrayList<Tesoro> tesoros){return 0;}
    
    @Override
    public boolean puedoConvertirme() {return false;}
    
    @Override
    public int calcularNiveles(ArrayList<Tesoro> tesoros) {
        int piezasOro=0;
        for(Tesoro tesoro: tesoros){
            piezasOro+=2*tesoro.getPiezasOro();
        }
        return piezasOro/1000;
    }
}
