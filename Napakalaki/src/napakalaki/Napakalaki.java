/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Mario
 */
public class Napakalaki {
    
    //EXAMEN (Ejercicio 2): Indice para identificar el tercer monstruo
    private int indiceMonstruo=1;
    
    private Vista vista;
    
    private LinkedList<Monstruo> descarteMonstruos=new LinkedList();
    private LinkedList<Monstruo> mazoMonstruos=new LinkedList();
    private Monstruo monstruoActivo;
    
    private LinkedList<Tesoro> descarteTesoros=new LinkedList();
    private LinkedList<Tesoro> mazoTesoros=new LinkedList();
    
    private Jugador jugadorActivo;
    private ArrayList<Jugador> jugadores= new ArrayList(4);
    
    private ArrayList<Sectario> mazoSectarios = new ArrayList(6);
    
    private static final Napakalaki instance = new Napakalaki();
    
    private Napakalaki(){}
    
    public static Napakalaki getInstance(){ return instance; }
    
    public void comenzarJuego(String[] nombreJugadores){
        if(nombreJugadores.length<3 && nombreJugadores.length>4) {
            throw new Error("Número de jugadores incorrecto.");
        }
        inicializarJuego();
        inicializarJugadores(nombreJugadores);
        repartirCartas();
        siguienteTurno();       
    }
    
    private void inicializarJuego(){
        mazoTesoros.add(new Tesoro("¡Sí mi amo!",TipoTesoro.CASCO,4,7,0));
        mazoTesoros.add(new Tesoro("Botas de investigación",TipoTesoro.CALZADO,3,4,600));
        mazoTesoros.add(new Tesoro("Capucha de Cthulhu",TipoTesoro.CASCO,3,5,500));
        mazoTesoros.add(new Tesoro("A prueba de babas",TipoTesoro.ARMADURA,2,5,400));
        mazoTesoros.add(new Tesoro("Botas de lluvia ácida",TipoTesoro.DOS_MANOS,1,1,800));
        mazoTesoros.add(new Tesoro("Casco minero",TipoTesoro.CASCO,2,4,400));
        mazoTesoros.add(new Tesoro("Ametralladora Thompson",TipoTesoro.DOS_MANOS,4,8,600));
        mazoTesoros.add(new Tesoro("Camiseta de la UGR",TipoTesoro.ARMADURA,1,7,100));
        mazoTesoros.add(new Tesoro("Clavo de rail ferroviario",TipoTesoro.MANO,3,6,400));
        mazoTesoros.add(new Tesoro("Cuchillo de sushi arcano",TipoTesoro.MANO,2,3,300));
        mazoTesoros.add(new Tesoro("Fez alópodo",TipoTesoro.CASCO,3,5,700));
        mazoTesoros.add(new Tesoro("Hacha prehistórica",TipoTesoro.MANO,2,5,500));
        mazoTesoros.add(new Tesoro("El aparato del Pr. Tesla",TipoTesoro.ARMADURA,4,8,900));
        mazoTesoros.add(new Tesoro("Gaita",TipoTesoro.DOS_MANOS,4,5,500));
        mazoTesoros.add(new Tesoro("Insecticida",TipoTesoro.MANO,2,3,300));
        mazoTesoros.add(new Tesoro("Escopeta de 3 cañones",TipoTesoro.DOS_MANOS,4,6,700));
        mazoTesoros.add(new Tesoro("Garabato místico",TipoTesoro.MANO,2,2,300));
        mazoTesoros.add(new Tesoro("La fuerza de Mr T",TipoTesoro.COLLAR,0,0,1000));
        mazoTesoros.add(new Tesoro("La rebeca metálica",TipoTesoro.ARMADURA,2,3,400));
        mazoTesoros.add(new Tesoro("Mazo de los antiguos",TipoTesoro.MANO,3,4,200));
        mazoTesoros.add(new Tesoro("Necroplayboycón",TipoTesoro.MANO,3,5,300));
        mazoTesoros.add(new Tesoro("Lanzallamas",TipoTesoro.DOS_MANOS,4,8,800));
        mazoTesoros.add(new Tesoro("Necrocomicón",TipoTesoro.MANO,1,1,100));
        mazoTesoros.add(new Tesoro("Necronomicón",TipoTesoro.DOS_MANOS,5,7,800));
        mazoTesoros.add(new Tesoro("Linterna a 2 manos",TipoTesoro.DOS_MANOS,3,6,400));
        mazoTesoros.add(new Tesoro("Necrognomicón",TipoTesoro.MANO,2,4,200));
        mazoTesoros.add(new Tesoro("Necrotelecom",TipoTesoro.CASCO,2,3,300));
        mazoTesoros.add(new Tesoro("Porra preternatural",TipoTesoro.MANO,2,3,200));
        mazoTesoros.add(new Tesoro("Tentáculo de pega",TipoTesoro.CASCO,0,1,200));
        mazoTesoros.add(new Tesoro("Zapato deja-amigos",TipoTesoro.CASCO,0,1,500));
        mazoTesoros.add(new Tesoro("Shogulador",TipoTesoro.DOS_MANOS,1,1,600));
        mazoTesoros.add(new Tesoro("Varita de atizamiento",TipoTesoro.MANO,3,4,400));
        
        LinkedList<TipoTesoro> tipoVisiblesPerdidos = new LinkedList();
        LinkedList<TipoTesoro> tipoOcultosPerdidos = new LinkedList();
        
        tipoVisiblesPerdidos.add(TipoTesoro.ARMADURA);
        tipoOcultosPerdidos.add(TipoTesoro.ARMADURA);
        mazoMonstruos.add(new Monstruo("3 Byakhees de bonanza",8,2,1, "Pierdes tu armadura visible y otra oculta",1,tipoVisiblesPerdidos,tipoOcultosPerdidos,1,1));
        tipoVisiblesPerdidos.clear();
        tipoOcultosPerdidos.clear();
        
        tipoVisiblesPerdidos.add(TipoTesoro.CASCO);
        mazoMonstruos.add(new Monstruo("Chibithulhu",2,1,1,"Embobados con el lindo primigenio te descartas de tu casco visible",1,tipoVisiblesPerdidos,tipoOcultosPerdidos,1,0));
        tipoVisiblesPerdidos.clear();
        
        tipoVisiblesPerdidos.add(TipoTesoro.CALZADO);
        mazoMonstruos.add(new Monstruo("El sopor de Dunwich",2,1,1,"El primordialbostezo contagioso. Pierdes el calzado visible",1,tipoVisiblesPerdidos,tipoOcultosPerdidos,1,0));
        tipoVisiblesPerdidos.clear();
        
        tipoVisiblesPerdidos.add(TipoTesoro.MANO);
        tipoOcultosPerdidos.add(TipoTesoro.MANO);                             
        mazoMonstruos.add(new Monstruo("Ángeles de la noche ibicenca",14,4,1,"Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta.",1,tipoVisiblesPerdidos,tipoOcultosPerdidos,1,1));
        tipoOcultosPerdidos.clear();
        tipoVisiblesPerdidos.clear();
        
        mazoMonstruos.add(new Monstruo("El gorrón en el umbral",10,3,1,"Pierdes todos tus tesoros visibles",1,tipoVisiblesPerdidos,tipoOcultosPerdidos,6,0));
        
        tipoVisiblesPerdidos.add(TipoTesoro.ARMADURA);
        mazoMonstruos.add(new Monstruo("H.P. Munchcraft",6,2,1,"Pierdes la armadura visible.",1,tipoVisiblesPerdidos,tipoOcultosPerdidos,1,0));
        tipoVisiblesPerdidos.clear();
        
        tipoVisiblesPerdidos.add(TipoTesoro.ARMADURA);
        mazoMonstruos.add(new Monstruo("Bichgooth",2,1,1,"Sientes bichos bajo la ropa. Descarta la armadura visible",1,tipoVisiblesPerdidos,tipoOcultosPerdidos,1,0));
        tipoVisiblesPerdidos.clear();
        
        mazoMonstruos.add(new Monstruo("El rey rosa",13,4,2,"Pierdes 5 niveles y 3 tesoros visibles.",5,tipoVisiblesPerdidos,tipoOcultosPerdidos,3,0));

        mazoMonstruos.add(new Monstruo("La que redacta en las tinieblas",2,1,1,"Toses los pulmones y pierdes 2 niveles",2,tipoVisiblesPerdidos,tipoOcultosPerdidos,0,0));
                                                           
        mazoMonstruos.add(new Monstruo("Los hondos",8,2,1,"Estos monstruos resultan bastante superficiales y te aburren mortalmente. Estas muerto.",10,tipoVisiblesPerdidos,tipoOcultosPerdidos,6,6));
        
        tipoVisiblesPerdidos.add(TipoTesoro.DOS_MANOS);
        mazoMonstruos.add(new Monstruo("Roboggoth",8,2,1,"La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible.",2,tipoVisiblesPerdidos,tipoOcultosPerdidos,1,0));
        tipoVisiblesPerdidos.clear();
        
        mazoMonstruos.add(new Monstruo("Yskhtishyssg-Goth",12,3,1,"No le hace gracia que pronuncien mal su nombre. Estas muerto.",10,tipoVisiblesPerdidos,tipoOcultosPerdidos,6,6));

        mazoMonstruos.add(new Monstruo("Pollipólipo volante",3,1,1,"Da mucho asquito. Pierdes 3 niveles.",3,tipoVisiblesPerdidos,tipoOcultosPerdidos,0,0));

        mazoMonstruos.add(new Monstruo("Semillas Cthulhu",4,2,1,"Pierdes 2 niveles y 2 tesoros ocultos.",2,tipoVisiblesPerdidos,tipoOcultosPerdidos,0,2));

        tipoVisiblesPerdidos.add(TipoTesoro.CASCO);
        mazoMonstruos.add(new Monstruo("El espia",5,1,1,"Te asusta en la noche. Pierdes un casco visible.",1,tipoVisiblesPerdidos,tipoOcultosPerdidos,1,0));
        tipoVisiblesPerdidos.clear();
        
        tipoVisiblesPerdidos.add(TipoTesoro.MANO);
        mazoMonstruos.add(new Monstruo("Dameargo",1,2,1,"Te intentas escaquear. Pierdas una mano visible.",1,tipoVisiblesPerdidos,tipoOcultosPerdidos,1,0));
        tipoVisiblesPerdidos.clear();

        mazoMonstruos.add(new Monstruo("El Lenguas",20,1,1,"Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles.",2,tipoVisiblesPerdidos,tipoOcultosPerdidos,5,0));

        tipoVisiblesPerdidos.add(TipoTesoro.DOS_MANOS);
        mazoMonstruos.add(new Monstruo("Bicéfalo",20,1,1,"Te faltan manos para tanta cabeza. Pierdes 3 niveles y tus tesoros visibles de las manos.",3,tipoVisiblesPerdidos,tipoOcultosPerdidos,1,0));
        tipoVisiblesPerdidos.clear();
        
        mazoMonstruos.add(new Monstruo("Familia feliz",1,4,1,"La familia te atrapa. Estás muerto.",10,tipoVisiblesPerdidos,tipoOcultosPerdidos,6,6));
        
        //Monstruos con Sectarios
        tipoVisiblesPerdidos.add(TipoTesoro.MANO);
        mazoMonstruos.add(new Monstruo("El mal indecible impronunciable",10,3,1,"Pierdes 1 mano visible.",0,tipoVisiblesPerdidos,tipoOcultosPerdidos,1,0,-2));
        tipoVisiblesPerdidos.clear();
        
        mazoMonstruos.add(new Monstruo("Testigos Ocultares",6,2,1,"Pierdes tus tesoros visibles. Jajaja.",0,tipoVisiblesPerdidos,tipoOcultosPerdidos,6,0,2));
        
        mazoMonstruos.add(new Monstruo("El gran cthulhu",20,2,5,"Hoy no es tu día de suerte. Mueres.",10,tipoVisiblesPerdidos,tipoOcultosPerdidos,6,6,4));
        
        mazoMonstruos.add(new Monstruo("Serpiente Político",8,2,1,"Tu gobierno te recorta 2 niveles",2,tipoVisiblesPerdidos,tipoOcultosPerdidos,0,0,-2));

        tipoVisiblesPerdidos.add(TipoTesoro.CASCO);
        tipoVisiblesPerdidos.add(TipoTesoro.ARMADURA);
        mazoMonstruos.add(new Monstruo("Felpuggoth",2,1,1,"Pierdes tu casco y tu armadura visible. Pierdes 3 tesoros ocultos.",0,tipoVisiblesPerdidos,tipoOcultosPerdidos,2,3,5));
        tipoVisiblesPerdidos.clear();
        
        mazoMonstruos.add(new Monstruo("Shoggoth",16,4,2,"Pierdes 2 niveles.",2,tipoVisiblesPerdidos,tipoOcultosPerdidos,0,0,-4));
        
        mazoMonstruos.add(new Monstruo("Lolitagooth",2,1,1,"Pintalabios negro. Pierdes 2 niveles.",2,tipoVisiblesPerdidos,tipoOcultosPerdidos,0,0,3));
        
        
        
        //Sectarios
        
        mazoSectarios.add(new Sectario("Sectario",1));
        mazoSectarios.add(new Sectario("Sectario",2));
        mazoSectarios.add(new Sectario("Sectario",1));
        mazoSectarios.add(new Sectario("Sectario",2));
        mazoSectarios.add(new Sectario("Sectario",1));
        mazoSectarios.add(new Sectario("Sectario",1));
        
        Collections.shuffle(mazoMonstruos);
        Collections.shuffle(mazoTesoros);
        Collections.shuffle(mazoSectarios);
    }   
    
    public Vista obtenerVista(){
        return vista;
    }
    
    public Monstruo obtenerMonstruoActivo(){
        return monstruoActivo;
    }
    
    public Jugador obtenerJugadorActivo(){
        return jugadorActivo;
    }
    
    private void inicializarJugadores(String[] nombres) {

        for(String jugador: nombres) {
            jugadores.add(new Jugador(jugador));
        }
        
    }
    
    private void repartirCartas() {
       for(Jugador jugador : jugadores){
           
           int numTesoros;
           
           switch(Napakalaki.getInstance().obtenerVista().getDado("Decidir el numero de tesoros(1->1  2,3,4 o 5->2  6->3 ) ",jugador.getNombre())){
               case 1: {
                   numTesoros=1;
                   break;                
               }
               case 6:{
                   numTesoros=3;
                   break;
               }
               default:{
                   numTesoros=2;
                   break;
               }
           }
           
           for(int i=1;i<=numTesoros;++i)
               jugador.robarTesoro(siguienteTesoro());
       }    
    }
    
    public int desarrollarCombate() { 
        int resultado=jugadorActivo.combatir(monstruoActivo);
        System.out.println("RESULTADO: "+resultado);
        switch(resultado) {
            case 1:{
                int tesorosGanados=monstruoActivo.obtenerGananciaTesoros();
                for(int i=0;i<tesorosGanados;++i){
                    Tesoro tesoro=siguienteTesoro();
                    jugadorActivo.robarTesoro(tesoro);
                }
                if(jugadorActivo.tienesCollar()){
                    Tesoro collar=jugadorActivo.devuelveElCollar();
                    descarteTesoros.add(collar);
                }
                break;
            }
            case -1:{
                if(jugadorActivo.puedoConvertirme()){
                    JugadorSectario activoSectario = jugadorActivo.convertirme(siguienteSectario());
                    jugadores.set(jugadores.indexOf(jugadorActivo),activoSectario);
                    jugadorActivo=activoSectario;
                }
                break;
            }
            case -2:{
                ArrayList<Tesoro> tesoros=jugadorActivo.dameTodosTusTesoros();
                descarteTesoros.addAll(tesoros);
                break;
            }
        }
        return resultado;
    }
    
    public int siguienteTurno() { 
        int fin=0;
        if(jugadorActivo==null){
            jugadorActivo=primerJugador();
            monstruoActivo=siguienteMonstruo();
        }else{
            fin=jugadorActivo.puedoPasar();
            if(fin==0){
                jugadorActivo=siguienteJugador();
                boolean tieneTesoros=jugadorActivo.tengoTesoros();
                if(!tieneTesoros){
                    int numTesoros;
                    switch(Napakalaki.getInstance().obtenerVista().getDado("Decidir el numero de tesoros(1->1  2,3,4 o 5->2  6->3 ) ",jugadorActivo.getNombre())){
                        case 1: {
                            numTesoros=1;
                            break;                
                        }
                        case 6:{
                            numTesoros=3;
                            break;
                        }
                        default:{
                            numTesoros=2;
                            break;
                        }
                    }                    
                    for(int i=1;i<=numTesoros;++i){
                        Tesoro tesoro=siguienteTesoro();
                        jugadorActivo.robarTesoro(tesoro);
                    }
                }
                monstruoActivo=siguienteMonstruo();
            }
        }
        return fin;
    }
    
    private Jugador primerJugador() { 
        int primero;
        if(jugadores.size()==4)
            do{
                primero=Napakalaki.getInstance().obtenerVista().getDado("Primer jugador","Se repite si el resultado es mayor que 4");
            }while(primero>4);
        else
            do{
                primero=Napakalaki.getInstance().obtenerVista().getDado("Primer jugador","Se repite si el resultado es mayor que 3");
            }while(primero>3);
        return jugadores.get(primero-1);
    }  
    
    private Monstruo siguienteMonstruo() { 
        if(mazoMonstruos.isEmpty()){
            mazoMonstruos=new LinkedList(descarteMonstruos);
            descarteMonstruos.clear();
            Collections.shuffle(mazoMonstruos);
        }
        //EXAMEN (Ejercicio 2): si es el tercer monstruo, monstruoActivo es Ángeles de la noche ibicenca
        if(indiceMonstruo==3){
            Monstruo m=buscaMonstruo("Ángeles de la noche ibicenca");
            if(m!=null)
                monstruoActivo=mazoMonstruos.get(mazoMonstruos.indexOf(m));
        }else{            
            monstruoActivo=mazoMonstruos.get(mazoMonstruos.size()-1);
        }
        indiceMonstruo++;
        descarteMonstruos.add(monstruoActivo);
        mazoMonstruos.remove(monstruoActivo);
        return monstruoActivo;
    }
    
    //EXAMEN (Ejercicio 2): busca en el mazo de monstruos, el monstruo que tenga nombre nombre.
    private Monstruo buscaMonstruo(String nombre){
        for(Monstruo m:mazoMonstruos){
            if(m.getNombre()==nombre)
                return m;
        }
        return null;
    }
    private Tesoro siguienteTesoro() { 
        if(mazoTesoros.isEmpty()){
            mazoTesoros=new LinkedList(descarteTesoros);
            descarteTesoros.clear();
            Collections.shuffle(mazoTesoros);
        }
        Tesoro tesoro=mazoTesoros.get((mazoTesoros.size()-1));
        mazoTesoros.remove(tesoro);
        return tesoro;
    }
    
    //private Monstruo primerMonstruo() { return null; }
    
    //private Tesoro primerTesoro() {return null;}
    
    private Jugador siguienteJugador() {
        int indexJugador = jugadores.indexOf(jugadorActivo);
        indexJugador=(indexJugador+1)%jugadores.size();
        jugadorActivo=jugadores.get(indexJugador);
        return jugadorActivo;
    }
    
    public Sectario siguienteSectario() {
        Sectario sectario = mazoSectarios.get(mazoSectarios.size()-1);
        mazoSectarios.remove(sectario);
        return sectario;
    }
    
    public boolean comprarNivelesJugador(ArrayList<Tesoro> listaTesoros) {
        boolean puedo=jugadorActivo.comprarNiveles(listaTesoros);
        descarteTesoros.addAll(listaTesoros);
        return puedo;
    }
    
    public boolean descartarTesoros(ArrayList<Tesoro> tesorosVisibles, ArrayList<Tesoro> tesorosOcultos) {
        boolean cumploMR;
        cumploMR=jugadorActivo.descartarTesoros(tesorosVisibles,tesorosOcultos);
        if(!tesorosVisibles.isEmpty())
            descarteTesoros.addAll(tesorosVisibles);
        if(!tesorosOcultos.isEmpty())
            descarteTesoros.addAll(tesorosOcultos);
        return cumploMR;
    }
    
    public void setVista (Vista unaVista){
        vista=unaVista;
    }
    
}
