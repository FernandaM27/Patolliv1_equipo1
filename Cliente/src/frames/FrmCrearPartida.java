/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import controles.ControlCrearPartida;
import creadorCasillas.CreadorCasillas;
import entidades.Partida;
import entidades.Tablero;
import java.util.Observable;
import javax.swing.JOptionPane;
import modelos.ModeloCrearPartida;

/**
 *
 * @author fermi
 */
public class FrmCrearPartida extends javax.swing.JFrame implements FrameBase<ControlCrearPartida, ModeloCrearPartida> {

    private static FrmCrearPartida crearPartida;
    private ControlCrearPartida cCrearPartida;
    private ModeloCrearPartida modeloCrearPartida;

    /**
     * Creates new form FrmPartida
     */
    private FrmCrearPartida() {
        initComponents();
        this.cCrearPartida = ControlCrearPartida.getInstance(this);
        this.modeloCrearPartida = new ModeloCrearPartida();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setResizable(false);
        this.inicializarComandos();
        this.asignarEtiquetas();
        this.agregarActionListeners(cCrearPartida);
    }

    public static FrmCrearPartida getInstance() {
        if (crearPartida == null) {
            return crearPartida = new FrmCrearPartida();
        } else if (crearPartida != null) {
            return crearPartida;
        }
        return null;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.asignarEtiquetas();
    }

    private void inicializarComandos() {
        this.btnListo.setActionCommand("listo");
    }

    private void agregarActionListeners(ControlCrearPartida ctrlCrearPartida) {
        this.btnListo.addActionListener(ctrlCrearPartida);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgCasillas = new javax.swing.ButtonGroup();
        btgJugadores = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCasillas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnListo = new javax.swing.JButton();
        cuatroC = new javax.swing.JRadioButton();
        cincoC = new javax.swing.JRadioButton();
        seisC = new javax.swing.JRadioButton();
        sieteC = new javax.swing.JRadioButton();
        lblNumJugadores = new javax.swing.JLabel();
        lblNumFichas = new javax.swing.JLabel();
        cbxNumJugadores = new javax.swing.JComboBox<>();
        lblFondos = new javax.swing.JLabel();
        lblApuesta = new javax.swing.JLabel();
        lbltamanio = new javax.swing.JLabel();
        txtApuesta = new javax.swing.JTextField();
        txtFondos = new javax.swing.JTextField();
        cbxNumFichas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(199, 213, 76));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 181, 42), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Algerian", 0, 34)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(174, 35, 13));
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        lblCasillas.setFont(new java.awt.Font("Algerian", 0, 22)); // NOI18N
        lblCasillas.setForeground(new java.awt.Color(68, 32, 6));
        jPanel1.add(lblCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mm5.PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 410));

        btnListo.setBackground(new java.awt.Color(155, 3, 2));
        btnListo.setFont(new java.awt.Font("Algerian", 0, 26)); // NOI18N
        btnListo.setForeground(new java.awt.Color(248, 228, 180));
        btnListo.setText("Listo");
        btnListo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListoMouseClicked(evt);
            }
        });
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });
        jPanel1.add(btnListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 170, -1));

        cuatroC.setBackground(new java.awt.Color(199, 213, 76));
        btgCasillas.add(cuatroC);
        cuatroC.setFont(new java.awt.Font("Algerian", 0, 22)); // NOI18N
        cuatroC.setForeground(new java.awt.Color(68, 32, 6));
        cuatroC.setText("4");
        jPanel1.add(cuatroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        cincoC.setBackground(new java.awt.Color(199, 213, 76));
        btgCasillas.add(cincoC);
        cincoC.setFont(new java.awt.Font("Algerian", 0, 22)); // NOI18N
        cincoC.setForeground(new java.awt.Color(68, 32, 6));
        cincoC.setText("5");
        jPanel1.add(cincoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        seisC.setBackground(new java.awt.Color(199, 213, 76));
        btgCasillas.add(seisC);
        seisC.setFont(new java.awt.Font("Algerian", 0, 22)); // NOI18N
        seisC.setForeground(new java.awt.Color(68, 32, 6));
        seisC.setText("6");
        jPanel1.add(seisC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        sieteC.setBackground(new java.awt.Color(199, 213, 76));
        btgCasillas.add(sieteC);
        sieteC.setFont(new java.awt.Font("Algerian", 0, 22)); // NOI18N
        sieteC.setForeground(new java.awt.Color(68, 32, 6));
        sieteC.setText("7");
        jPanel1.add(sieteC, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        lblNumJugadores.setFont(new java.awt.Font("Algerian", 0, 22)); // NOI18N
        lblNumJugadores.setForeground(new java.awt.Color(68, 32, 6));
        jPanel1.add(lblNumJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        lblNumFichas.setFont(new java.awt.Font("Algerian", 0, 22)); // NOI18N
        lblNumFichas.setForeground(new java.awt.Color(68, 32, 6));
        jPanel1.add(lblNumFichas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        cbxNumJugadores.setBackground(new java.awt.Color(199, 213, 76));
        cbxNumJugadores.setFont(new java.awt.Font("Algerian", 0, 22)); // NOI18N
        cbxNumJugadores.setForeground(new java.awt.Color(68, 32, 6));
        cbxNumJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        jPanel1.add(cbxNumJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        lblFondos.setFont(new java.awt.Font("Algerian", 0, 22)); // NOI18N
        lblFondos.setForeground(new java.awt.Color(68, 32, 6));
        jPanel1.add(lblFondos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        lblApuesta.setFont(new java.awt.Font("Algerian", 0, 22)); // NOI18N
        lblApuesta.setForeground(new java.awt.Color(68, 32, 6));
        jPanel1.add(lblApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        lbltamanio.setFont(new java.awt.Font("Algerian", 0, 22)); // NOI18N
        lbltamanio.setForeground(new java.awt.Color(68, 32, 6));
        jPanel1.add(lbltamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 310, -1));

        txtApuesta.setBackground(new java.awt.Color(248, 228, 180));
        jPanel1.add(txtApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 80, 30));

        txtFondos.setBackground(new java.awt.Color(248, 228, 180));
        jPanel1.add(txtFondos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 80, 30));

        cbxNumFichas.setBackground(new java.awt.Color(199, 213, 76));
        cbxNumFichas.setFont(new java.awt.Font("Algerian", 0, 22)); // NOI18N
        cbxNumFichas.setForeground(new java.awt.Color(68, 32, 6));
        cbxNumFichas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));
        jPanel1.add(cbxNumFichas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FrmPrincipal frmPrincipal = FrmPrincipal.getInstance();
        frmPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        if (validarCampos()) {
            this.crearPartida();
        } else {
            JOptionPane.showMessageDialog(this, "Todos los campos deben de estar llenos");
        }
    }//GEN-LAST:event_btnListoActionPerformed

    private void btnListoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListoMouseClicked
        if (validarCampos()) {
            this.crearPartida();
        } else {
            JOptionPane.showMessageDialog(this, "Todos los campos deben de estar llenos");
        }
    }//GEN-LAST:event_btnListoMouseClicked

    /**
     * Verificar validaciones FERNANDA M
     *
     * @return
     */
    private boolean validarCampos() {
//        if (this.getNumCasillas() == 0) {
//            return false;
//        }
        return true;
    }

    private void crearPartida(){
         cCrearPartida.crearPartida("localhost",this.crearInstanciaPartida());
         
    }
    
    private Partida crearInstanciaPartida() {
        Partida partida = new Partida();
        partida.setNumeroJugadores(this.cbxNumJugadores.getSelectedIndex() + 2);
        partida.setNumeroFichas(this.cbxNumFichas.getSelectedIndex() + 2);
        partida.setMontoApuestas(Integer.valueOf(this.txtApuesta.getText()));
        CreadorCasillas cc = new CreadorCasillas(this.getNumCasillas());
        Tablero tablero = new Tablero(this.getNumCasillas(), cc.crearCasillas(this.getNumCasillas()));
        partida.setTablero(tablero);
        
        //FrmTablero frmTablero= new FrmTablero(6);
        //frmTablero.setVisible(true);
        return partida;
    }

    private int getNumCasillas() {
        if (this.cuatroC.isSelected()) {
            return 4;
        } else if (this.cincoC.isSelected()) {
            return 5;
        } else if (this.seisC.isSelected()) {
            return 6;
        } else if (this.sieteC.isSelected()) {
            return 7;
        }
        return 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgCasillas;
    private javax.swing.ButtonGroup btgJugadores;
    private javax.swing.JButton btnListo;
    private javax.swing.JComboBox<String> cbxNumFichas;
    private javax.swing.JComboBox<String> cbxNumJugadores;
    private javax.swing.JRadioButton cincoC;
    private javax.swing.JRadioButton cuatroC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApuesta;
    private javax.swing.JLabel lblCasillas;
    private javax.swing.JLabel lblFondos;
    private javax.swing.JLabel lblNumFichas;
    private javax.swing.JLabel lblNumJugadores;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbltamanio;
    private javax.swing.JRadioButton seisC;
    private javax.swing.JRadioButton sieteC;
    private javax.swing.JTextField txtApuesta;
    private javax.swing.JTextField txtFondos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void asignarEtiquetas() {
        this.lblTitulo.setText(this.modeloCrearPartida.getEtiqueta(0));
        this.lbltamanio.setText(this.modeloCrearPartida.getEtiqueta(1));
        this.lblCasillas.setText(this.modeloCrearPartida.getEtiqueta(2));
        this.lblNumJugadores.setText(this.modeloCrearPartida.getEtiqueta(3));
        this.lblNumFichas.setText(this.modeloCrearPartida.getEtiqueta(4));
        this.lblFondos.setText(this.modeloCrearPartida.getEtiqueta(5));
        this.lblApuesta.setText(this.modeloCrearPartida.getEtiqueta(6));
        this.btnListo.setText(this.modeloCrearPartida.getEtiquetas().get(7));
    }

    @Override
    public void asignarComando() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void asignarEventos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
