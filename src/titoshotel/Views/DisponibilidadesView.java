package titoshotel.Views;

import titoshotel.Controllers.DisponibilidadController;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

import titoshotel.Models.Entities.Disponibilidad;
import titoshotel.Views.Model.DisponibilidadesTableModel;

public class DisponibilidadesView extends javax.swing.JPanel {
    private final DisponibilidadesTableModel disponibilidadesTableModel;
    private final DisponibilidadController controller;

    public DisponibilidadesView() {
        disponibilidadesTableModel = new DisponibilidadesTableModel();
        controller = new DisponibilidadController();
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        loadingPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();

        jLabelFechaDesde = new javax.swing.JLabel();
        fieldFechaDesde = new javax.swing.JTextField();
        jLabelFechaHasta = new javax.swing.JLabel();
        fieldFechaHasta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        content.setLayout(new java.awt.CardLayout());

        tabla.setModel(disponibilidadesTableModel);
        tableScrollPane.setViewportView(tabla);

        content.add(tableScrollPane, "table");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cargando...");
        jLabel6.setAlignmentX(0.5F);

        javax.swing.GroupLayout loadingPanelLayout = new javax.swing.GroupLayout(loadingPanel);
        loadingPanel.setLayout(loadingPanelLayout);
        loadingPanelLayout.setHorizontalGroup(
                loadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
        loadingPanelLayout.setVerticalGroup(
                loadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loadingPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)));

        content.add(loadingPanel, "loading");

        jPanel2.setMaximumSize(new java.awt.Dimension(156, 48));
        jPanel2.setMinimumSize(new java.awt.Dimension(156, 48));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Disponibilidades");

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 10);
        flowLayout1.setAlignOnBaseline(true);
        buttonsPanel.setLayout(flowLayout1);

        jLabelFechaDesde.setText("Desde (YYYY-MM-DD):");
        buttonsPanel.add(jLabelFechaDesde);

        fieldFechaDesde.setColumns(10);
        buttonsPanel.add(fieldFechaDesde);

        jLabelFechaHasta.setText("Hasta (YYYY-MM-DD):");
        buttonsPanel.add(jLabelFechaHasta);

        fieldFechaHasta.setColumns(10);
        buttonsPanel.add(fieldFechaHasta);

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarMousePressed(evt);
            }
        });
        buttonsPanel.add(btnBuscar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnBuscarMousePressed
        try {
            java.sql.Date fechaDesde = java.sql.Date.valueOf(fieldFechaDesde.getText());
            java.sql.Date fechaHasta = java.sql.Date.valueOf(fieldFechaHasta.getText());

            if (fechaDesde.after(fechaHasta)) {
                JOptionPane.showMessageDialog(this, "La fecha 'Desde' no puede ser posterior a la fecha 'Hasta'.");
                return;
            }

            loadData(fechaDesde, fechaHasta);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Formato de fecha inválido. Intente YYYY-MM-DD.");
        }
    }// GEN-LAST:event_btnBuscarMousePressed

    private void changePanel(String panel) {
        if (content != null) {
            CardLayout layout = (CardLayout) content.getLayout();
            layout.show(content, panel);
        }
    }

    private void loadData(java.sql.Date fechaDesde, java.sql.Date fechaHasta) {
        changePanel("loading");
        disponibilidadesTableModel.clearTableModelData();

        for (Disponibilidad d : controller.getDisponibilidad(fechaDesde, fechaHasta)) {
            disponibilidadesTableModel.addRow(d);
        }
        changePanel("table");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JPanel content;
    private javax.swing.JTextField fieldFechaDesde;
    private javax.swing.JTextField fieldFechaHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFechaDesde;
    private javax.swing.JLabel jLabelFechaHasta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel loadingPanel;
    private javax.swing.JTable tabla;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
