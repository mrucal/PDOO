/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Mario
 */
public class Jugador{
    
    //EXAMEN (Ejercicio 5)
    private static int jugadoresTotales;
    
    private String nombre;
    private int nivel=1;
    private static int NIVEL_MINIMO=1;
    private static int NIVEL_MAXIMO=10;
    private static int TESOROS_OCULTOS_MAXIMO=4;
    private int numeroVisibles=0;
    private int numeroOcultos=0;
    
    private ArrayList<Tesoro> tesorosOcultos=new ArrayList();
    private ArrayList<Tesoro> tesorosVisibles=new ArrayList();
    
    private ArrayList<TipoTesoro> malRolloVisible=new ArrayList();
    private ArrayList<TipoTesoro> malRolloOculto=new ArrayList();
    
    public Jugador(String nombre) {
        this.nombre=nombre;
    }
    
    Jugador(Jugador jugador){
        this.nombre=jugador.nombre;
        this.nivel=jugador.nivel;
        this.numeroVisibles=jugador.numeroVisibles;
        this.numeroOcultos=jugador.numeroOcultos;
        this.tesorosOcultos.addAll(jugador.tesorosOcultos);
        this.tesorosVisibles.addAll(jugador.tesorosVisibles);
        this.malRolloVisible.addAll(jugador.malRolloVisible);
        this.malRolloOculto.addAll(jugador.malRolloOculto);   
        this.jugadoresTotales++;
    }
    
    //EXAMEN (Ejercicio 5) consultor de jugadores totales
    public int getJugadoresTotales(){
        return jugadoresTotales;
    }
    public String getNombre(){
        return nombre;
    }
    
    public ArrayList<Tesoro> getTesorosVisibles(){
        return tesorosVisibles;
    }
    
    public ArrayList<Tesoro> getTesorosOcultos(){
        return tesorosOcultos;
    }
    
    public int getNumeroVisibles(){
        return numeroVisibles;
    }
    
    public int getNumeroOcultos(){
        return numeroOcultos;
    }
    
    public JugadorSectario convertirme(Sectario cartaSectario){
        return new JugadorSectario(this,cartaSectario);
    }
    
    private int obtenerNivelContrincante(Monstruo monstruo){
        return monstruo.getValorBasico();
    }
    
    public boolean puedoConvertirme(){
        return Napakalaki.getInstance().obtenerVista().getDado("Pulsa sobre el dado para convertire","6 para convertirte")==6;
    }
    
    public int obtenerNivel() {return nivel;}
        
    public int obtenerNivelCombate() {
        int bonus=0;
        
        //EXAMEN (Ejercicio 4): Primero se calcula el bonus como antes: si tiene el collar con el valor especial
        // y si no con el basico de todos los tesoros visibles
        if(tienesCollar()){
            for(Tesoro tesoro:tesorosVisibles)
                bonus+=tesoro.getValorEspecial();
        }else{
            for(Tesoro tesoro:tesorosVisibles)
                bonus+=tesoro.getValorBasico();
        }
        
        //EXAMEN si tiene algun casco (ya sea visible o no)
        if(buscaTesoros(TipoTesoro.CASCO)){
            
           //Se recorren de nuevo los tesoros añadiendo el bonus correspondiente
           for(Tesoro tesoro:tesorosVisibles){
               // Si es un tesoro MANO, su valor vale el doble (solo se suma una vez, porque la primera ya fue contada
               // al aplicar el bonus de todos los tesoros. 
               if(tesoro.getTipo()==TipoTesoro.MANO)
                   if(tienesCollar())
                       bonus+=tesoro.getValorEspecial();
                   else
                       bonus+=tesoro.getValorBasico();
            
               // Si es un tesoro DOS_MANOS, su valor vale la mitad (como ya se ha añadido una vez el valor de este tesoro
               // tenemos que restar la mitad para que nos quede la mitad del valor)
               if(tesoro.getTipo()==TipoTesoro.DOS_MANOS)
                   if(tienesCollar())
                       bonus-=(tesoro.getValorEspecial())/2;
                   else
                       bonus-=(tesoro.getValorBasico())/2;
           }

        }
        return bonus+nivel;
    }
    
    public void robarTesoro(Tesoro unTesoro) {       
            tesorosOcultos.add(unTesoro);
    }
    
    public void modificarNivel(int incDec) {
        if(incDec>=NIVEL_MINIMO && incDec<=NIVEL_MAXIMO)
            nivel=incDec;
    }
    
    //public int nivelCombate() {return 0;}
    
    private boolean puedoEquipar(Tesoro unTesoro) {
        ArrayList<TipoTesoro> tipos=new ArrayList();
        boolean puedo;
        
        for(Tesoro t : tesorosVisibles)
            tipos.add(t.getTipo());
        
        if(unTesoro.getTipo()!=TipoTesoro.MANO && unTesoro.getTipo()!=TipoTesoro.DOS_MANOS)
            puedo=!tipos.contains(unTesoro.getTipo());
        else
            if(unTesoro.getTipo()==TipoTesoro.DOS_MANOS)
                puedo=!tipos.contains(TipoTesoro.DOS_MANOS) && !tipos.contains(TipoTesoro.MANO);
            else
                puedo=!tipos.contains(TipoTesoro.DOS_MANOS) && (tipos.indexOf(TipoTesoro.MANO) == tipos.lastIndexOf(TipoTesoro.MANO));
        
        return puedo;
        
    }
    
    public boolean descartarTesoros(ArrayList<Tesoro> tesorosVisDes, ArrayList<Tesoro> tesorosOcuDes) {
        boolean cumploMR;
        actualizarMalRollo(tesorosVisDes,tesorosOcuDes);
        cumploMR=cumploMalRollo();
        tesorosVisibles.removeAll(tesorosVisDes);
        tesorosOcultos.removeAll(tesorosOcuDes);
        return cumploMR;
  }
    
    //public void descartarTesorosVisibles(ArrayList<Tesoro> listaTesoros) {}
    
    //public void descartarTesorosOcultos(ArrayList<Tesoro> listaTesoros) {}
    
    public void equiparTesoros(ArrayList<Tesoro> listaTesoro) {
        for(Tesoro tesoro: listaTesoro){
            if(puedoEquipar(tesoro)){
                tesorosVisibles.add(tesoro);
                tesorosOcultos.remove(tesoro);
            }
        }
    }
    
    private void actualizarMalRollo(ArrayList<Tesoro> tesVisibles, ArrayList<Tesoro> tesOcultos) {
        for(Tesoro t:tesVisibles){
            tesorosVisibles.remove(t);
            if(numeroVisibles>0)
                numeroVisibles--;
            if(!malRolloVisible.isEmpty())
                malRolloVisible.remove(t.getTipo());
        }
        for(Tesoro t:tesOcultos){
            tesorosOcultos.remove(t);
            if(numeroOcultos>0)
                numeroOcultos--;
            if(!malRolloOculto.remove(t.getTipo()));
        }        
    }
    
    public boolean cumploMalRollo() {
        return numeroVisibles==0 && numeroOcultos==0 && malRolloVisible.isEmpty() && malRolloOculto.isEmpty();
    }
    
    public int puedoPasar() {
        if(!cumploMalRollo()){
            return -1;
        }else
            if(tesorosOcultos.size()>TESOROS_OCULTOS_MAXIMO) {
                return tesorosOcultos.size()-TESOROS_OCULTOS_MAXIMO;
            }
            else{
                return 0;
            }
    }
    
    public boolean tengoTesoros() {
        return !(tesorosVisibles.isEmpty() && tesorosOcultos.isEmpty());
    }
    
    public int calcularNiveles(ArrayList<Tesoro> tesoros) {
        int piezasOro=0;
        for(Tesoro tesoro:tesoros){
            piezasOro+=tesoro.getPiezasOro();
        }
        return piezasOro/1000;
    }
    
    public boolean comprarNiveles(ArrayList<Tesoro> tesoros) {
        int niveles=calcularNiveles(tesoros);
        boolean puedo=niveles+nivel<10;
        if(puedo){
            incDecNivel(niveles);
        }
        tesorosOcultos.removeAll(tesoros);
        tesorosVisibles.removeAll(tesoros);
        return puedo;
    }
    
    public void incDecNivel(int incDec) {
        if(incDec+nivel>NIVEL_MAXIMO)
            nivel=NIVEL_MAXIMO;
        else
            if(incDec+nivel<NIVEL_MINIMO)
                nivel=NIVEL_MINIMO;
            else
                nivel+=incDec;
    }
    
    public int combatir(Monstruo monstruoEnJuego) {
        int nivelM=obtenerNivelContrincante(monstruoEnJuego);
        int nivelJ=obtenerNivelCombate();
        if(nivelJ>nivelM){
            int nivelesGanados=monstruoEnJuego.obtenerNivelesGanados();
            incDecNivel(nivelesGanados);  
            if(nivel>=NIVEL_MAXIMO){
                return 10;
            }else{
                return 1;
            }
        }else{
            //EXAMEN (Ejercicio 4) Las partes comentadas indicadas con (-) se eliminan para que no haya opcion a huir.
            // (-) if(Napakalaki.getInstance().obtenerVista().getDado("Pulsa sobre el dado para intentar huir", "Para huir necesitas un 5 o un 6")<5){
                if(monstruoEnJuego.malRolloEsMuerte()){
                    modificarNivel(NIVEL_MINIMO);
                    return -2;
                }else{
                    ArrayList miMalRollo=monstruoEnJuego.cualEsTuMalRollo();
                    incluirMalRollo(miMalRollo);
                    int nivelesPerdidos=monstruoEnJuego.obtenerNivelesPerdidos();
                    incDecNivel(-nivelesPerdidos);
                    return -1;
                }
           /* (-) }else{
                return 0;
            }*/
        }
    }
    
    public ArrayList<Tesoro> dameTodosTusTesoros() {
        ArrayList<Tesoro> tesoros=new ArrayList();
        
        tesoros.addAll(tesorosVisibles);
        tesoros.addAll(tesorosOcultos);
        
        tesorosVisibles.clear();
        tesorosOcultos.clear();
        
        return tesoros;
    }
    
    public void incluirMalRollo(ArrayList malRollo) {
        
        //incDecNivel(-((int)malRollo.get(1)));
        numeroVisibles=0;
        numeroOcultos=0;
        
        ArrayList<TipoTesoro> tiposVisiblePerdidos = ((ArrayList<TipoTesoro>)malRollo.get(4));
        ArrayList<TipoTesoro> tiposOcultoPerdidos = ((ArrayList<TipoTesoro>)malRollo.get(5));
        
        ArrayList<TipoTesoro> tipoVisibles = new ArrayList();
        ArrayList<TipoTesoro> tipoOcultos = new ArrayList();
        
        for(Tesoro t:tesorosVisibles)
            tipoVisibles.add(t.getTipo());
        for(Tesoro t:tesorosOcultos)
            tipoOcultos.add(t.getTipo());
        
        if(tiposVisiblePerdidos.isEmpty()) {
            numeroVisibles=Math.min(tesorosVisibles.size(),((int)malRollo.get(2)));
        }
        else{
            for(TipoTesoro tt:tiposVisiblePerdidos)
                if(tipoVisibles.contains(tt)){
                    malRolloVisible.add(tt);
                    tipoVisibles.remove(tt);
                    numeroVisibles++;
                }
        }
        
        if(tiposOcultoPerdidos.isEmpty()) {
            numeroOcultos=Math.min(tesorosOcultos.size(),((int)malRollo.get(3)));
        }
        else{
            for(TipoTesoro tt:tiposOcultoPerdidos)
                if(tipoOcultos.contains(tt)){
                    malRolloOculto.add(tt);
                    tipoOcultos.remove(tt);
                    numeroOcultos++;
                }
        }
        //actualizarMalRollo(malRolloVisible,malRolloOculto);
    }
    
    public Tesoro devuelveElCollar() {
        for(Tesoro t: tesorosVisibles)
            if(t.getTipo()==TipoTesoro.COLLAR){
                tesorosVisibles.remove(t);
                return t;
            }
        return null;
    }
    
    public boolean tienesCollar() {
        boolean collar=false;
        for(Tesoro t:tesorosVisibles)
            if(t.getTipo()==TipoTesoro.COLLAR)
                collar=true;
        return collar;
    }
    
    //EXAMEN (Ejercicio 4) Busca tesoros (ocultoos o visibles) que sean del tipo tipo.
    public boolean buscaTesoros(TipoTesoro tipo){
        
        for(Tesoro to: tesorosOcultos)
            if(to.getTipo()==tipo)
                return true;
        
        for(Tesoro tv: tesorosVisibles)
            if(tv.getTipo()==tipo)
                return true;
        
        
        return false;
    }
    
}
