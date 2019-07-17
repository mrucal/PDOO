/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class Monstruo implements Carta{
    
    private String nombre;
    private int nivel;
    private int gananciaTesoros;
    private int gananciaNiveles;
    private String malRollo;
    private int nivelesPerdidos;
    private int ocultosPerdidos;
    private int visiblesPerdidos;
    private int nivelContraSectarios;
    
    private ArrayList<TipoTesoro> tipoVisiblesPerdidos=new ArrayList();
    private ArrayList<TipoTesoro> tipoOcultosPerdidos=new ArrayList();
    
    public Monstruo(String nombre,int nivel,int gananciaTesoros,int gananciaNivel,String malRollo, int nivelesPerdidos, LinkedList<TipoTesoro> tipoVisiblesPerdidos, LinkedList<TipoTesoro> tipoOcultosPerdidos, int visiblesPerdidos, int ocultosPerdidos){
        this.nombre=nombre;
        this.nivel=nivel;
        this.gananciaTesoros=gananciaTesoros;
        this.gananciaNiveles=gananciaNivel;
        this.malRollo=malRollo;
        this.nivelesPerdidos=nivelesPerdidos;
        this.tipoVisiblesPerdidos.addAll(tipoVisiblesPerdidos);
        this.tipoOcultosPerdidos.addAll(tipoOcultosPerdidos);
        this.visiblesPerdidos=visiblesPerdidos;
        this.ocultosPerdidos=ocultosPerdidos;
        //this.nivelContraSectarios=nivelContraSectarios
    }
    
    public Monstruo(String nombre,int nivel,int gananciaTesoros,int gananciaNivel,String malRollo, int nivelesPerdidos, LinkedList<TipoTesoro> tipoVisiblesPerdidos, LinkedList<TipoTesoro> tipoOcultosPerdidos, int visiblesPerdidos, int ocultosPerdidos,int nivelContraSectarios){
        this.nombre=nombre;
        this.nivel=nivel;
        this.gananciaTesoros=gananciaTesoros;
        this.gananciaNiveles=gananciaNivel;
        this.malRollo=malRollo;
        this.nivelesPerdidos=nivelesPerdidos;
        this.tipoVisiblesPerdidos.addAll(tipoVisiblesPerdidos);
        this.tipoOcultosPerdidos.addAll(tipoOcultosPerdidos);
        this.visiblesPerdidos=visiblesPerdidos;
        this.ocultosPerdidos=ocultosPerdidos;
        this.nivelContraSectarios=nivelContraSectarios;
    }
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public int getValorBasico(){
        return nivel;
    }
    @Override
    public int getValorEspecial(){
        return nivelContraSectarios;
    }
    
    public int obtenerGananciaTesoros() { return gananciaTesoros;}
    
    public int obtenerNivel() {return nivel;}
    
    public int obtenerNivelesGanados() {return gananciaNiveles;}
    
    public boolean malRolloEsMuerte() {
        return nivelesPerdidos==10 && visiblesPerdidos==6 && ocultosPerdidos==6;
    }
    
    public ArrayList cualEsTuMalRollo() {
        ArrayList mr=new ArrayList();
        
        mr.add(malRollo);
        mr.add(nivelesPerdidos);
        mr.add(visiblesPerdidos);
        mr.add(ocultosPerdidos);
        mr.add(tipoVisiblesPerdidos);
        mr.add(tipoOcultosPerdidos);
        
        return mr;
    }
    
    public String malRollo() {return malRollo; }
    
    public int obtenerNivelesPerdidos() {return nivelesPerdidos;}
}
