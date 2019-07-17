/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author Mario
 */
public class Tesoro implements Carta{
    
    private String nombre;
    private int bonusMinimo;
    private int bonusMaximo;
    private int piezasOro;
    
    private TipoTesoro tipo;
    
    public Tesoro(String nombre, TipoTesoro tipo, int bonusMinimo, int bonusMaximo, int piezas){
        this.nombre=nombre;
        this.tipo=tipo;
        this.bonusMinimo=bonusMinimo;
        this.bonusMaximo=bonusMaximo;
        piezasOro=piezas;
    }
    
    //EXAMEN: Ejercicio 3
    //Constructor para crear tesoros indicando unicamente su nombre y su tipo.
    public Tesoro(String nombre, TipoTesoro tipo){
        this.nombre=nombre;
        this.tipo=tipo;
        this.bonusMinimo=0;
        this.bonusMaximo=0;
        this.piezasOro=1000;
        
    }
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public int getValorBasico(){
        return bonusMinimo;
    }
    
    @Override
    public int getValorEspecial(){
        return bonusMaximo;
    }
    
    public int getPiezasOro(){
        return piezasOro;
    }
    
    public TipoTesoro getTipo(){
        return tipo;
    }

}
