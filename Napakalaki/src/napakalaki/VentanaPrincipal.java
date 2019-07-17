/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Mario
 */
public class VentanaPrincipal extends javax.swing.JFrame implements Vista {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(Napakalaki unJuego) {
        juego=unJuego;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        TV7 = new javax.swing.JPanel();
        TV8 = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        TerritorioMonstruo = new javax.swing.JPanel();
        Nombre_Monstruo = new javax.swing.JLabel();
        NivelesPerdidos = new javax.swing.JLabel();
        MalRollo = new javax.swing.JLabel();
        NivelCombate = new javax.swing.JLabel();
        NivelesGanados = new javax.swing.JLabel();
        TesorosGanados = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Jugadores = new javax.swing.JPanel();
        Nombre_Jugador = new javax.swing.JLabel();
        NivelCombateJ = new javax.swing.JLabel();
        SectarioNiveles = new javax.swing.JLabel();
        tesorosVisible = new javax.swing.JPanel();
        tesorosOculto = new javax.swing.JPanel();
        NivelJugador = new javax.swing.JLabel();
        Sectario = new javax.swing.JLabel();
        equiparse = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        descartar = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        jB_combatir = new javax.swing.JButton();
        resultado = new javax.swing.JPanel();
        gana = new javax.swing.JPanel();
        ganador = new javax.swing.JLabel();
        risa = new javax.swing.JLabel();
        nuevoNivel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        TV7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TV8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout TV8Layout = new javax.swing.GroupLayout(TV8);
        TV8.setLayout(TV8Layout);
        TV8Layout.setHorizontalGroup(
            TV8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        TV8Layout.setVerticalGroup(
            TV8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TV7Layout = new javax.swing.GroupLayout(TV7);
        TV7.setLayout(TV7Layout);
        TV7Layout.setHorizontalGroup(
            TV7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(TV7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TV7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(TV8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        TV7Layout.setVerticalGroup(
            TV7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(TV7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TV7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(TV8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Napakalaki");
        setForeground(java.awt.Color.white);

        TerritorioMonstruo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2), "Enemigo", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), java.awt.Color.red)); // NOI18N
        TerritorioMonstruo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TerritorioMonstruo.setOpaque(false);
        TerritorioMonstruo.setPreferredSize(new java.awt.Dimension(437, 24));

        Nombre_Monstruo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nombre_Monstruo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre_Monstruo.setText("Nombre del Monstruo");
        Nombre_Monstruo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NivelesPerdidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NivelesPerdidos.setText("Niveles Perdidos");

        MalRollo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MalRollo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MalRollo.setText("Mal Rollo");
        MalRollo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 153), new java.awt.Color(255, 255, 51), new java.awt.Color(183, 56, 19), new java.awt.Color(183, 56, 19)), "Mal Rollo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        NivelCombate.setText("Nivel de Combate");

        NivelesGanados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NivelesGanados.setText("Niveles Ganados");

        TesorosGanados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TesorosGanados.setText("Tesoros Ganados");

        javax.swing.GroupLayout TerritorioMonstruoLayout = new javax.swing.GroupLayout(TerritorioMonstruo);
        TerritorioMonstruo.setLayout(TerritorioMonstruoLayout);
        TerritorioMonstruoLayout.setHorizontalGroup(
            TerritorioMonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Nombre_Monstruo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TerritorioMonstruoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TerritorioMonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TerritorioMonstruoLayout.createSequentialGroup()
                        .addComponent(MalRollo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TerritorioMonstruoLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(NivelesPerdidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16)
                        .addComponent(TesorosGanados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(61, 61, 61)))
                .addContainerGap())
            .addGroup(TerritorioMonstruoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(NivelCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(NivelesGanados, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        TerritorioMonstruoLayout.setVerticalGroup(
            TerritorioMonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TerritorioMonstruoLayout.createSequentialGroup()
                .addComponent(Nombre_Monstruo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TerritorioMonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NivelCombate)
                    .addComponent(NivelesGanados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TerritorioMonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NivelesPerdidos)
                    .addComponent(TesorosGanados))
                .addGroup(TerritorioMonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TerritorioMonstruoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MalRollo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(TerritorioMonstruoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Jugadores.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2), "Jugadores", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        Jugadores.setOpaque(false);

        Nombre_Jugador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nombre_Jugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre_Jugador.setText("Nombre del Jugador");

        NivelCombateJ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NivelCombateJ.setText("Nivel Jugador");

        SectarioNiveles.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SectarioNiveles.setText("+2 por cada sectario en juego");

        tesorosVisible.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tesoros Visibles", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        tesorosOculto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tesoros Ocultos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        NivelJugador.setText("Nivel:");

        Sectario.setText("Sectario");

        javax.swing.GroupLayout JugadoresLayout = new javax.swing.GroupLayout(Jugadores);
        Jugadores.setLayout(JugadoresLayout);
        JugadoresLayout.setHorizontalGroup(
            JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JugadoresLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(NivelJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Sectario, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SectarioNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NivelCombateJ, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(JugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tesorosVisible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tesorosOculto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(Nombre_Jugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JugadoresLayout.setVerticalGroup(
            JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JugadoresLayout.createSequentialGroup()
                .addComponent(Nombre_Jugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NivelJugador)
                    .addComponent(NivelCombateJ)
                    .addComponent(Sectario)
                    .addComponent(SectarioNiveles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tesorosVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tesorosOculto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        equiparse.setText("Equiparse");
        equiparse.setName("Equiparse"); // NOI18N
        equiparse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equiparseActionPerformed(evt);
            }
        });

        comprar.setText("Comprar Niveles");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });

        descartar.setText("Descartar Tesoros");
        descartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descartarActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        jB_combatir.setText("¡ COMBATIR !");
        jB_combatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_combatirActionPerformed(evt);
            }
        });

        resultado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2), "Resultado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(51, 255, 0))); // NOI18N

        gana.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0)), "Gana", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        ganador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ganador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ganador.setText("Ganador");
        ganador.setOpaque(true);

        risa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        risa.setText("muahahaha");

        nuevoNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoNivel.setText("nuevoNivel");

        javax.swing.GroupLayout ganaLayout = new javax.swing.GroupLayout(gana);
        gana.setLayout(ganaLayout);
        ganaLayout.setHorizontalGroup(
            ganaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ganador, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(risa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nuevoNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ganaLayout.setVerticalGroup(
            ganaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ganaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ganador)
                .addGap(18, 18, 18)
                .addComponent(risa)
                .addGap(18, 18, 18)
                .addComponent(nuevoNivel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout resultadoLayout = new javax.swing.GroupLayout(resultado);
        resultado.setLayout(resultadoLayout);
        resultadoLayout.setHorizontalGroup(
            resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        resultadoLayout.setVerticalGroup(
            resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoLayout.createSequentialGroup()
                .addComponent(gana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TerritorioMonstruo, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(equiparse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(descartar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jB_combatir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Jugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TerritorioMonstruo, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equiparse)
                    .addComponent(comprar)
                    .addComponent(siguiente)
                    .addComponent(descartar)
                    .addComponent(jB_combatir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descartarActionPerformed
        juego.descartarTesoros(tesorosVisiblesSeleccionados, tesorosOcultosSeleccionados);
        if(juego.obtenerJugadorActivo().cumploMalRollo()){
            descartar.setEnabled(false);
            siguiente.setEnabled(true);
        }
        actualizarJugador();
    }//GEN-LAST:event_descartarActionPerformed

    private void equiparseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equiparseActionPerformed
        juego.obtenerJugadorActivo().equiparTesoros(tesorosOcultosSeleccionados);
        actualizarJugador();
    }//GEN-LAST:event_equiparseActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        juego.obtenerJugadorActivo().comprarNiveles(tesorosOcultosSeleccionados);
        actualizarJugador();
    }//GEN-LAST:event_comprarActionPerformed

    private void jB_combatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_combatirActionPerformed
        int resultado=juego.desarrollarCombate();
        actualizarResultado(resultado);
        comprar.setEnabled(false);
        equiparse.setEnabled(false);
        jB_combatir.setEnabled(false);
        switch(resultado){
            
            //EXAMEN (Ejercicio 4): Se elimina el caso=0 porque ya no se puede huir
//    (-)    case 0:{
//                JOptionPane.showMessageDialog(this,"Conseguite huir del monstruo.", "Has huido", JOptionPane.INFORMATION_MESSAGE);

//                equiparse.setEnabled(true);
//                comprar.setEnabled(false);
//                jB_combatir.setEnabled(false);
//                descartar.setEnabled(false);
//                siguiente.setEnabled(true);
//                break;
//            }
            
            case 1:{
//                equiparse.setEnabled(true);
//                descartar.setEnabled(false);
//                jB_combatir.setEnabled(false);
//                siguiente.setEnabled(true);
//                break;
            }
            case -2:{
                descartar.setEnabled(false);
                siguiente.setEnabled(true);
                break;
            }
            case -1:{
                if(!juego.obtenerJugadorActivo().cumploMalRollo()){
                    JOptionPane.showMessageDialog(this,"Descarta los tesoros indicados por el mal rollo del monstruo.", "Mal Rollo", JOptionPane.WARNING_MESSAGE);
                    descartar.setEnabled(true);
                    siguiente.setEnabled(false);
                }else{
                    siguiente.setEnabled(true);
                    descartar.setEnabled(false);
                }
                break;
            }
            case 10:{
                JOptionPane.showMessageDialog(this,juego.obtenerJugadorActivo().getNombre()+" ha ganado la partida.", "Has vencido.", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
                break;
            }
            
        }
        
        actualizarJugador();
        
        
        
        
        
        
//        equiparse.setEnabled(false);
//        comprar.setEnabled(false);
//        descartar.setEnabled(true);
//        jB_combatir.setEnabled(false);
//        actualizarJugador();
    }//GEN-LAST:event_jB_combatirActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        System.out.println(juego.obtenerJugadorActivo().getNombre());
        int fin=juego.siguienteTurno();
        System.out.println(juego.obtenerJugadorActivo().getNombre());
        actualizarJugador();
        actualizarMonstruo();
        if(fin==0){
            actualizarResultado(-5);
            actualizarJugador();
            actualizarMonstruo();
            jugador=juego.obtenerJugadorActivo();
            //if(jugador.)
            equiparse.setEnabled(true);
            comprar.setEnabled(true);
            descartar.setEnabled(false);
            jB_combatir.setEnabled(true);
            
             
        }
        if(fin>0){
            descartar.setEnabled(true);
            JOptionPane.showMessageDialog(this,"Debes descartarte de " +fin+ " tesoros ocultos.", "Demasiados tesoros ocultos", JOptionPane.WARNING_MESSAGE);
            equiparse.setEnabled(false);
            comprar.setEnabled(false);
            jB_combatir.setEnabled(false);
            siguiente.setEnabled(false);
            
        }
        
        
    }//GEN-LAST:event_siguienteActionPerformed
    
    @Override
    public void mostrar(String args[]){
        JD_nombreJugadores dialogoNombres;
        dado=new JD_dado (this,true);
        dialogoNombres = new JD_nombreJugadores (this,true);
        nombresJugadores = dialogoNombres.getNombres();
        juego.comenzarJuego(nombresJugadores);
        actualizarJugador();
        actualizarMonstruo();
        actualizarResultado(-5);
        this.setVisible(true);
    }
    
    @Override
    public int getDado(String s1,String s2){
        return dado.getValor(s1,s2);
    }
    
    private void actualizarResultado(int resultado){
        if(resultado==-5){
            ganador.setText("");
            nuevoNivel.setText("");
            risa.setText("");     
            equiparse.setEnabled(true);
            comprar.setEnabled(true);
            descartar.setEnabled(false);
            jB_combatir.setEnabled(true);
            siguiente.setEnabled(false);
            
        }else{
            jugador=juego.obtenerJugadorActivo();
            monstruo=juego.obtenerMonstruoActivo();
            if(resultado==10 || resultado==1){
                ganador.setBackground(new java.awt.Color(0,0,255));
                ganador.setText(jugador.getNombre());
                nuevoNivel.setText("Nuevo nivel: "+jugador.obtenerNivel());
                risa.setText("");
            }else{
                ganador.setBackground(new java.awt.Color(255,0,0));
                ganador.setText(monstruo.getNombre());
                nuevoNivel.setText(jugador.getNombre()+"");
                if(resultado==-2)
                        nuevoNivel.setText(jugador.getNombre()+" ha muerto");
                else
                    nuevoNivel.setText("Nuevo nivel "+jugador.getNombre()+": "+jugador.obtenerNivel());
                risa.setText("muahahahaha");
            }
        }
        
        pack();
            
    }
    
    private void actualizarMonstruo() {
        Nombre_Monstruo.setText(juego.obtenerMonstruoActivo().getNombre());
        MalRollo.setText(juego.obtenerMonstruoActivo().malRollo());
        NivelCombate.setText("Nivel de Combate: "+juego.obtenerMonstruoActivo().getValorBasico());
        NivelesGanados.setText("Niveles Ganados: "+juego.obtenerMonstruoActivo().obtenerNivelesGanados());
        TesorosGanados.setText("Tesoros Ganados: "+juego.obtenerMonstruoActivo().obtenerGananciaTesoros());
        NivelesPerdidos.setText("Niveles Perdidos: "+juego.obtenerMonstruoActivo().obtenerNivelesPerdidos());
        
        pack();
    }
    
    private void actualizarJugador(){
        jugador=juego.obtenerJugadorActivo();
        TesoroGrafico unTesoroGrafico;
        
        Nombre_Jugador.setText(jugador.getNombre());
        NivelJugador.setText("Nivel básico: "+jugador.obtenerNivel());
        NivelCombateJ.setText("Nivel de combate: "+jugador.obtenerNivelCombate());
        
        if(jugador instanceof JugadorSectario){
            Sectario.setText("Sectario");
            SectarioNiveles.setText("+"+((JugadorSectario)jugador).getMiCartaSectario().getValorBasico()+" por cada jugador: "+jugador.getJugadoresTotales());
        }else{
            Sectario.setText("");
            SectarioNiveles.setText("");
        }
        
        for(TesoroGrafico tg : tesorosVisiblesAlimpiar)
            tesorosVisible.remove(tg);
        tesorosVisiblesAlimpiar.clear();
        
        for (Tesoro t: jugador.getTesorosVisibles()){
            unTesoroGrafico=new TesoroGraficoVisible(t);
            tesorosVisible.add(unTesoroGrafico);
            tesorosVisiblesAlimpiar.add(unTesoroGrafico);
        }
        
        
        for(TesoroGrafico tg : tesorosOcultosAlimpiar)
            tesorosOculto.remove(tg);
        tesorosOcultosAlimpiar.clear();
        
        for (Tesoro t: jugador.getTesorosOcultos()){
            unTesoroGrafico=new TesoroGraficoOculto(t);
            tesorosOculto.add(unTesoroGrafico);
            tesorosOcultosAlimpiar.add(unTesoroGrafico);
        }
        
        tesorosVisiblesSeleccionados.clear();
        tesorosOcultosSeleccionados.clear();
        
        repaint();
        pack();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jugadores;
    private javax.swing.JLabel MalRollo;
    private javax.swing.JLabel NivelCombate;
    private javax.swing.JLabel NivelCombateJ;
    private javax.swing.JLabel NivelJugador;
    private javax.swing.JLabel NivelesGanados;
    private javax.swing.JLabel NivelesPerdidos;
    private javax.swing.JLabel Nombre_Jugador;
    private javax.swing.JLabel Nombre_Monstruo;
    private javax.swing.JLabel Sectario;
    private javax.swing.JLabel SectarioNiveles;
    private javax.swing.JPanel TV7;
    private javax.swing.JPanel TV8;
    private javax.swing.JPanel TerritorioMonstruo;
    private javax.swing.JLabel TesorosGanados;
    private javax.swing.JButton comprar;
    private javax.swing.JButton descartar;
    private javax.swing.JButton equiparse;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel gana;
    private javax.swing.JLabel ganador;
    private javax.swing.JButton jB_combatir;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel nuevoNivel;
    private javax.swing.JPanel resultado;
    private javax.swing.JLabel risa;
    private javax.swing.JButton siguiente;
    private javax.swing.JPanel tesorosOculto;
    private javax.swing.JPanel tesorosVisible;
    // End of variables declaration//GEN-END:variables
    
    private Napakalaki juego;
    
    private JD_dado dado;
    
    private String[] nombresJugadores;        
    
    private Jugador jugador;
    private Monstruo monstruo;
    
    private ArrayList<Tesoro> tesorosVisiblesSeleccionados=new ArrayList();
    private ArrayList<Tesoro> tesorosOcultosSeleccionados=new ArrayList();
    private ArrayList<TesoroGrafico> tesorosVisiblesAlimpiar=new ArrayList();
    private ArrayList<TesoroGrafico> tesorosOcultosAlimpiar=new ArrayList();
    
    private class TesoroGrafico extends JPanel {
        
        protected Tesoro tesoro;
        private javax.swing.JLabel nombreTesoro=new javax.swing.JLabel();
        private javax.swing.JLabel nivelTesoro=new javax.swing.JLabel();
        private javax.swing.JLabel piezasOro=new javax.swing.JLabel();
        private javax.swing.JLabel piezasOro2=new javax.swing.JLabel();
        private javax.swing.JLabel tipoTesoro=new javax.swing.JLabel();
        
        TesoroGrafico(Tesoro unTesoro){
            tesoro=unTesoro;
            this.setPreferredSize(new java.awt.Dimension(150,150));
            this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            this.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK,2));
            
            nombreTesoro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            nombreTesoro.setText(tesoro.getNombre());
            
            nivelTesoro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            nivelTesoro.setText(tesoro.getValorBasico()+" / "+tesoro.getValorEspecial());
            
            piezasOro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            piezasOro.setText(""+tesoro.getPiezasOro());
            
            piezasOro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            piezasOro2.setText("p. oro");

            tipoTesoro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            tipoTesoro.setText(""+tesoro.getTipo());
            
            this.add(nombreTesoro,new org.netbeans.lib.awtextra.AbsoluteConstraints(1,1,150,25));
            this.add(nivelTesoro,new org.netbeans.lib.awtextra.AbsoluteConstraints(12,60,57,28));
            this.add(piezasOro,new org.netbeans.lib.awtextra.AbsoluteConstraints(75,51,100,28)); 
            this.add(piezasOro2,new org.netbeans.lib.awtextra.AbsoluteConstraints(75,55,100,56));
            this.add(tipoTesoro,new org.netbeans.lib.awtextra.AbsoluteConstraints(1,90,150,91));
        }
    };
    
    private class TesoroGraficoVisible extends TesoroGrafico{
        TesoroGraficoVisible(Tesoro unTesoro){
            super(unTesoro);            
            this.setBackground(new java.awt.Color(153, 153, 255));
            addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    if(tesorosVisiblesSeleccionados.contains(TesoroGraficoVisible.this.tesoro)){
                        tesorosVisiblesSeleccionados.remove(TesoroGraficoVisible.this.tesoro);
                        TesoroGraficoVisible.this.setBackground(new java.awt.Color(153, 153, 255));
                        TesoroGraficoVisible.this.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK,2));
                        TesoroGraficoVisible.this.setEnabled(true);
                    }else{
                        tesorosVisiblesSeleccionados.add(TesoroGraficoVisible.this.tesoro);
                        TesoroGraficoVisible.this.setBackground(new java.awt.Color(204, 255, 255));
                        TesoroGraficoVisible.this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,153),3));
                        TesoroGraficoVisible.this.setEnabled(false);
                    }                    
                }
            });
        }
    }

    private class TesoroGraficoOculto extends TesoroGrafico{
        TesoroGraficoOculto(Tesoro unTesoro){
            super(unTesoro);            
            this.setBackground(new java.awt.Color(102, 255, 255));
            addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    if(tesorosOcultosSeleccionados.contains(TesoroGraficoOculto.this.tesoro)){
                        tesorosOcultosSeleccionados.remove(TesoroGraficoOculto.this.tesoro);
                        TesoroGraficoOculto.this.setBackground(new java.awt.Color(102, 255, 255));
                        TesoroGraficoOculto.this.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK,2));
                        TesoroGraficoOculto.this.setEnabled(true);
                    }else{
                        tesorosOcultosSeleccionados.add(TesoroGraficoOculto.this.tesoro);
                        TesoroGraficoOculto.this.setBackground(new java.awt.Color(204, 255, 255));
                        TesoroGraficoOculto.this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,153),3));
                        TesoroGraficoOculto.this.setEnabled(false);
                    }                    
                }
            });
        }
    }


}
