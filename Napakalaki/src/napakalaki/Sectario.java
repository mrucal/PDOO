/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author Mario
 */
class Sectario implements Carta{
    private String nombre;
    private int gananciaNivel;
    
    public Sectario(String nombre, int ganancia) {
        this.nombre=nombre;
        gananciaNivel=ganancia;
    }
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public int getValorBasico(){
        return gananciaNivel;
    }
    
    //EXAMEN (Ejercicio 5)
    @Override
    public int getValorEspecial(){
        return getValorBasico();
}
}
