/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.ActionListener;

/**
 *
 * @author Kevin
 */
public class SubVistaDatosBatalla extends javax.swing.JDialog {

    /**
     * Creates new form SubVistaDatosBatalla
     */
    public SubVistaDatosBatalla(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jComboBox2.setVisible(false);
        this.jComboBox4.setVisible(false);
    }
    
    public void agregarListeners(ActionListener A){
        this.jButton1.addActionListener(A);
        this.jButton2.addActionListener(A);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        labelNick = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        labelRol = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        labelTipo = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jProgressBar4 = new javax.swing.JProgressBar();
        barraAtaque = new javax.swing.JProgressBar();
        barraDefensa = new javax.swing.JProgressBar();
        barraMagia = new javax.swing.JProgressBar();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        labelAtaque = new javax.swing.JLabel();
        labelDef = new javax.swing.JLabel();
        labelMagia = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 24, 130, 120));

        labelNick.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNick.setText("Nick");
        labelNick.setOpaque(true);
        getContentPane().add(labelNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 24, 67, 30));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 24, 115, 30));

        labelRol.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelRol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRol.setText("Rol");
        labelRol.setOpaque(true);
        getContentPane().add(labelRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 64, 67, 30));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 64, 115, 30));

        labelTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTipo.setText("Tipo");
        labelTipo.setOpaque(true);
        getContentPane().add(labelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 104, 67, 30));

        jTextField3.setEditable(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 104, 115, 30));
        getContentPane().add(jProgressBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 24, 150, 20));
        getContentPane().add(barraAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 54, 150, 20));
        getContentPane().add(barraDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 84, 150, 20));
        getContentPane().add(barraMagia, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 114, 150, 20));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, 173, 29));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Ver Aliado");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 162, 121, 29));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 255, 748, 10));

        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, -1, -1));

        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 163, 198, 29));

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Ver Enemigo");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 164, 144, -1));

        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 217, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Vida");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 24, 90, 20));

        labelAtaque.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelAtaque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAtaque.setText("Ataque");
        labelAtaque.setOpaque(true);
        getContentPane().add(labelAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 54, 90, 20));

        labelDef.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelDef.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDef.setText("Defensa");
        labelDef.setName("labelDef"); // NOI18N
        labelDef.setOpaque(true);
        getContentPane().add(labelDef, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 84, 90, 20));

        labelMagia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelMagia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMagia.setText("Magia");
        labelMagia.setOpaque(true);
        getContentPane().add(labelMagia, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 114, 90, 20));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Pasto0.png"))); // NOI18N
        jButton4.setText("jButton3");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 40, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Altura 0");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 60, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Bosques");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 230, 30));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Tierra");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 110, 30));

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Ríos");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 230, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Montaña6.png"))); // NOI18N
        jButton5.setText("jButton3");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 40, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Altura 6");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 60, 20));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Agua1.png"))); // NOI18N
        jButton6.setText("jButton3");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 40, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Altura 0");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 60, 20));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Agua6.png"))); // NOI18N
        jButton7.setText("jButton3");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 40, 40));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Bosque1.png"))); // NOI18N
        jButton8.setText("jButton3");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 40, 40));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Bosque6.png"))); // NOI18N
        jButton9.setText("jButton3");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 40, 40));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Pasto1.png"))); // NOI18N
        jButton10.setText("jButton3");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 40, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Altura 1");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 60, 20));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Montaña7.png"))); // NOI18N
        jButton11.setText("jButton3");
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 40, 40));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Altura 7");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 60, 20));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Agua2.png"))); // NOI18N
        jButton12.setText("jButton3");
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 40, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Altura 1");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 60, 20));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Agua7.png"))); // NOI18N
        jButton13.setText("jButton3");
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 40, 40));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Bosque2.png"))); // NOI18N
        jButton14.setText("jButton3");
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 40, 40));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Bosque7.png"))); // NOI18N
        jButton15.setText("jButton3");
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 40, 40));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Pasto2.png"))); // NOI18N
        jButton16.setText("jButton3");
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 40, 40));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Altura 2");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 60, 20));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Montaña8.png"))); // NOI18N
        jButton17.setText("jButton3");
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 40, 40));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText(" Altura 8");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 60, 20));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Agua3.png"))); // NOI18N
        jButton18.setText("jButton3");
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 40, 40));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Altura 2");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 60, 20));

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Agua8.png"))); // NOI18N
        jButton19.setText("jButton3");
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 40, 40));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Bosque3.png"))); // NOI18N
        jButton20.setText("jButton3");
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 40, 40));

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Bosque8.png"))); // NOI18N
        jButton21.setText("jButton3");
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 40, 40));

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Pasto3.png"))); // NOI18N
        jButton22.setText("jButton3");
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 40, 40));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Altura 3");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 60, 20));

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Montaña9.png"))); // NOI18N
        jButton23.setText("jButton3");
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 40, 40));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Altura 9");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 60, 20));

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Agua4.png"))); // NOI18N
        jButton24.setText("jButton3");
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 40, 40));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Altura 3");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 60, 20));

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Agua9.png"))); // NOI18N
        jButton25.setText("jButton3");
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 40, 40));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Bosque4.png"))); // NOI18N
        jButton26.setText("jButton3");
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 40, 40));

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Bosque9.png"))); // NOI18N
        jButton27.setText("jButton3");
        getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 40, 40));

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Pasto4.png"))); // NOI18N
        jButton28.setText("jButton3");
        getContentPane().add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 40, 40));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Altura 4");
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 60, 20));

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Montaña10.png"))); // NOI18N
        jButton29.setText("jButton3");
        getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 40, 40));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Altura 10");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 60, 20));

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Agua5.png"))); // NOI18N
        jButton30.setText("jButton3");
        getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 40, 40));

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Agua10.png"))); // NOI18N
        jButton31.setText("jButton3");
        getContentPane().add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 40, 40));

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Bosque5.png"))); // NOI18N
        jButton32.setText("jButton3");
        getContentPane().add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 40, 40));

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Bosque10.png"))); // NOI18N
        jButton33.setText("jButton3");
        getContentPane().add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 40, 40));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Montaña");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 110, 30));

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Pasto5.png"))); // NOI18N
        jButton34.setText("jButton3");
        getContentPane().add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 40, 40));

        jLabel38.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Altura 5");
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 60, 20));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Altura 4");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 60, 20));

        jLabel40.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Altura 6");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 60, 20));

        jLabel41.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Altura 7");
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 60, 20));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText(" Altura 8");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 60, 20));

        jLabel43.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Altura 9");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 60, 20));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Altura 5");
        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 60, 20));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Agua10.png"))); // NOI18N
        jButton3.setText("jButton3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 40, 40));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Altura 10");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 60, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Altura 1");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 60, 20));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Altura 2");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 60, 20));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Altura 3");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 60, 20));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Altura 4");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 60, 20));

        jLabel45.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Altura 5");
        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 60, 20));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Altura 10");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 60, 20));

        jLabel46.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Altura 6");
        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 60, 20));

        jLabel47.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Altura 7");
        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 60, 20));

        jLabel48.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText(" Altura 8");
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 60, 20));

        jLabel49.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Altura 9");
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 60, 20));

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTablero/Bosque0.png"))); // NOI18N
        jButton35.setText("jButton35");
        getContentPane().add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 40, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Altura 0");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 60, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar barraAtaque;
    public javax.swing.JProgressBar barraDefensa;
    public javax.swing.JProgressBar barraMagia;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox2;
    public javax.swing.JComboBox<String> jComboBox3;
    public javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelAtaque;
    private javax.swing.JLabel labelDef;
    private javax.swing.JLabel labelMagia;
    private javax.swing.JLabel labelNick;
    private javax.swing.JLabel labelRol;
    private javax.swing.JLabel labelTipo;
    // End of variables declaration//GEN-END:variables
}
