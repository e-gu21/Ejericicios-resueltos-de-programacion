/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import entidades.*;
import accesoDatos.*;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Home
 */
public class JIFGenerarCronograma extends javax.swing.JInternalFrame {
    
    static BaseDatosCuotas BCuota = new BaseDatosCuotas();
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form JIFGenerarCronograma
     */
    public JIFGenerarCronograma() {
        initComponents();
        crearTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuotas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtInteres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFechaEmision = new javax.swing.JTextField();
        txtFechaPago = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        btnBuscar1 = new javax.swing.JButton();

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/iconos/Buscar2.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        setClosable(true);
        setTitle("Generador de Cronograma");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        tblCuotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCuotas);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Prestamo"));
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        jLabel2.setText("Cliente:");

        txtNombres.setEnabled(false);

        jLabel3.setText("Monto:");

        txtMonto.setEnabled(false);

        jLabel4.setText("Interes:");

        txtInteres.setEnabled(false);

        jLabel5.setText("Fecha Emision:");

        jLabel6.setText("Fecha de Pago:");

        txtFechaEmision.setEnabled(false);

        txtFechaPago.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtInteres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txtMonto, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFechaEmision, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(txtFechaPago))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setText("Código:");

        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/iconos/Buscar2.gif"))); // NOI18N
        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar1)
                        .addGap(67, 67, 67)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void crearTabla(){
        modelo.addColumn("Nro");
        modelo.addColumn("Saldo");
        modelo.addColumn("Amortización");
        modelo.addColumn("Interés");
        modelo.addColumn("Cuota");
        modelo.addColumn("Fecha Vencimiento");
        modelo.addColumn("Estado");
        
        tblCuotas.setModel(modelo);
    }
    
    public void limpiarTabla(){        
        int nf = modelo.getRowCount()-1;
        for (int i = nf; i >= 0; i--) {
            modelo.removeRow(modelo.getRowCount()-1);
        }
    }
    
    private void llenarTabla(Prestamo p){        
        Cuota c;
        String dato[]= new String[7];
        
        for(int i=0; i<BCuota.getCuotas().size(); i++){
            
            if(p==BCuota.getCuotas().get(i).getPrestamo()){
                
                c = BCuota.getCuotas().get(i);
                Date fechaVec = c.getFechaVencimiento();
                DecimalFormat df = new DecimalFormat("0.00");
                
                    dato[0]= String.valueOf(c.getNumeroDeCuota());
                    dato[1]= String.valueOf(df.format(c.getSaldoRestante()));
                    dato[2]= String.valueOf(df.format(c.getAmortizacion()));
                    dato[3]= String.valueOf(df.format(c.getInteres()));
                    dato[4]= String.valueOf(df.format(c.getCuota()));
                    dato[5]= String.valueOf(fechaVec.toLocaleString());
                    if(c.isEstadoCuota()==false){
                        dato[6]= "NP";
                    }
                    else{
                        dato[6]= "SP";
                    }
                    modelo.addRow(dato);
            }
        }
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        limpiarTabla();
        
        String dni = txtDNI.getText();
        Cliente cliente=null;
        Prestamo prestamo;
        Calendar fechaE;
        Calendar fechaP;
        int k = -1;
        int l = -1;

        if(dni.length()!=0){

            for(int i=0;i<JIFRegistroCliente.cli.getCNaturales().size();i++){
                if(dni.equals(JIFRegistroCliente.cli.getCNaturales().get(i).getCodigo())){
                    txtNombres.setText(JIFRegistroCliente.cli.getCNaturales().get(i).getNombre());
                    cliente = JIFRegistroCliente.cli.getCNaturales().get(i);
                    l=0;
                }
            }

            for(int i=0;i<JIFRegistroCliente.cli.getCJuridicos().size();i++){
                if(dni.equals(JIFRegistroCliente.cli.getCJuridicos().get(i).getCodigo())){
                    txtNombres.setText(JIFRegistroCliente.cli.getCJuridicos().get(i).getNombre());
                    cliente = JIFRegistroCliente.cli.getCJuridicos().get(i);
                    l=0;
                }
            }
            
            if(l!=-1){
            
            for(int i=0;i<JIFRegistroPrestamo.BPres.getPrestamos().size();i++){
                if(cliente==JIFRegistroPrestamo.BPres.getPrestamos().get(i).getCliente()){
                    if(JIFRegistroPrestamo.BPres.getPrestamos().get(i).isEstado()==false){
                        k=i;
                    }
                }
            }
            
            if(k!=-1){
                prestamo = JIFRegistroPrestamo.BPres.getPrestamos().get(k);
                
                txtNombres.setText(cliente.getNombre());
                txtMonto.setText(String.valueOf(prestamo.getMonto()));
                txtInteres.setText(String.valueOf(prestamo.getInteresMensual()));
                fechaE=prestamo.getFechaEmisionPrestamo();
                txtFechaEmision.setText(Integer.toString(fechaE.get(Calendar.DATE))+"/"+Integer.toString(fechaE.get(Calendar.MONTH))+"/"+ Integer.toString(fechaE.get(Calendar.YEAR)));
                fechaP=prestamo.getFechaEntregaDinero();
                txtFechaPago.setText(Integer.toString(fechaP.get(Calendar.DATE))+"/"+Integer.toString(fechaP.get(Calendar.MONTH))+"/"+ Integer.toString(fechaP.get(Calendar.YEAR)));
                
                
                llenarTabla(prestamo);
            }
            else{
                limpiarTabla();
                JOptionPane.showMessageDialog(this, "El cliente no tiene un prestamo vigente", "Regresar", 1);
            }
            }
            else{
                limpiarTabla();
                JOptionPane.showMessageDialog(this, "No hay un cliente registrado con este código", "Regresar", 1);
            }
            
        }else{
            limpiarTabla();
            JOptionPane.showMessageDialog(this, "Ingrese un codigo", "Regresar", 1);
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:                                       
        JFMenu.vCroCuo=false;
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCuotas;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtFechaEmision;
    private javax.swing.JTextField txtFechaPago;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
