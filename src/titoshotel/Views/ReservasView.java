package titoshotel.Views;

import titoshotel.Controllers.ReservaController;
import titoshotel.Controllers.HabitacionController;
import titoshotel.Controllers.PasajeroController;
import java.awt.CardLayout;
import java.util.Objects;
import java.sql.Date;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import titoshotel.Models.Entities.Reserva;
import titoshotel.Models.Entities.Habitacion;
import titoshotel.Models.Entities.Pasajero;
import titoshotel.Views.Model.ReservasTableModel;

public class ReservasView extends javax.swing.JPanel {

    private final ReservasTableModel reservasTableModel;
    private Reserva reservaSelect;
    private String actualPanel = "table";
    private final ReservaController controller;
    private int updateId;

    public ReservasView() {
        reservasTableModel = new ReservasTableModel();
        controller = new ReservaController();
        initComponents();
        loadComboBoxes();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        loadingPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        deletedPanel = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        deleted = new javax.swing.JLabel();
        goBackDeleteButton = new javax.swing.JButton();
        createPanel = new javax.swing.JPanel();
        jPanelNumero = new javax.swing.JPanel();
        jLabelNumero = new javax.swing.JLabel();
        fieldNumero = new javax.swing.JTextField();
        jPanelFechaDesde = new javax.swing.JPanel();
        jLabelFechaDesde = new javax.swing.JLabel();
        fieldFechaDesde = new javax.swing.JTextField();
        jPanelFechaHasta = new javax.swing.JPanel();
        jLabelFechaHasta = new javax.swing.JLabel();
        fieldFechaHasta = new javax.swing.JTextField();
        jPanelHabitacion = new javax.swing.JPanel();
        jLabelHabitacion = new javax.swing.JLabel();
        comboHabitacion = new javax.swing.JComboBox<>();
        jPanelPasajero = new javax.swing.JPanel();
        jLabelPasajero = new javax.swing.JLabel();
        comboPasajero = new javax.swing.JComboBox<>();
        jPanelPrecio = new javax.swing.JPanel();
        jLabelPrecio = new javax.swing.JLabel();
        fieldPrecio = new javax.swing.JTextField();
        jPanelAnticipo = new javax.swing.JPanel();
        jLabelAnticipo = new javax.swing.JLabel();
        fieldAnticipo = new javax.swing.JTextField();
        jPanelBotonesForm = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        remove = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        add = new javax.swing.JButton();

        content.setLayout(new java.awt.CardLayout());

        tabla.setModel(reservasTableModel);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
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
                                javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE));
        loadingPanelLayout.setVerticalGroup(
                loadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loadingPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)));

        content.add(loadingPanel, "loading");

        deletedPanel.setLayout(new java.awt.GridBagLayout());

        jPanel12.setLayout(new java.awt.GridBagLayout());

        deleted.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleted.setText("Reserva eliminada:");
        deleted.setAlignmentX(0.5F);
        deleted.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel12.add(deleted, new java.awt.GridBagConstraints());

        goBackDeleteButton.setText("Volver");
        goBackDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goBackDeleteButtonMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        jPanel12.add(goBackDeleteButton, gridBagConstraints);

        deletedPanel.add(jPanel12, new java.awt.GridBagConstraints());

        content.add(deletedPanel, "deleted");

        createPanel.setLayout(new java.awt.GridLayout(4, 2, 10, 10));

        jPanelNumero.setMaximumSize(new java.awt.Dimension(0, 26));
        jPanelNumero.setPreferredSize(new java.awt.Dimension(64, 28));
        jPanelNumero.setLayout(new java.awt.BorderLayout());

        jLabelNumero.setText("Numero:");
        jPanelNumero.add(jLabelNumero, java.awt.BorderLayout.NORTH);

        fieldNumero.setMaximumSize(new java.awt.Dimension(2147483647, 18));
        fieldNumero.setMinimumSize(new java.awt.Dimension(64, 18));
        jPanelNumero.add(fieldNumero, java.awt.BorderLayout.CENTER);

        createPanel.add(jPanelNumero);

        jPanelFechaDesde.setMaximumSize(new java.awt.Dimension(0, 26));
        jPanelFechaDesde.setPreferredSize(new java.awt.Dimension(64, 28));
        jPanelFechaDesde.setLayout(new java.awt.BorderLayout());

        jLabelFechaDesde.setText("Fecha Desde (YYYY-MM-DD):");
        jPanelFechaDesde.add(jLabelFechaDesde, java.awt.BorderLayout.NORTH);

        fieldFechaDesde.setMaximumSize(new java.awt.Dimension(2147483647, 18));
        fieldFechaDesde.setMinimumSize(new java.awt.Dimension(64, 18));
        jPanelFechaDesde.add(fieldFechaDesde, java.awt.BorderLayout.CENTER);

        createPanel.add(jPanelFechaDesde);

        jPanelFechaHasta.setMaximumSize(new java.awt.Dimension(0, 26));
        jPanelFechaHasta.setPreferredSize(new java.awt.Dimension(64, 28));
        jPanelFechaHasta.setLayout(new java.awt.BorderLayout());

        jLabelFechaHasta.setText("Fecha Hasta (YYYY-MM-DD):");
        jPanelFechaHasta.add(jLabelFechaHasta, java.awt.BorderLayout.NORTH);
        jPanelFechaHasta.add(fieldFechaHasta, java.awt.BorderLayout.CENTER);

        createPanel.add(jPanelFechaHasta);

        jPanelHabitacion.setMaximumSize(new java.awt.Dimension(0, 26));
        jPanelHabitacion.setPreferredSize(new java.awt.Dimension(64, 28));
        jPanelHabitacion.setLayout(new java.awt.BorderLayout());

        jLabelHabitacion.setText("Habitacion:");
        jPanelHabitacion.add(jLabelHabitacion, java.awt.BorderLayout.NORTH);

        jPanelHabitacion.add(comboHabitacion, java.awt.BorderLayout.CENTER);

        createPanel.add(jPanelHabitacion);

        jPanelPasajero.setMaximumSize(new java.awt.Dimension(0, 26));
        jPanelPasajero.setPreferredSize(new java.awt.Dimension(64, 28));
        jPanelPasajero.setLayout(new java.awt.BorderLayout());

        jLabelPasajero.setText("Pasajero:");
        jPanelPasajero.add(jLabelPasajero, java.awt.BorderLayout.NORTH);

        jPanelPasajero.add(comboPasajero, java.awt.BorderLayout.CENTER);

        createPanel.add(jPanelPasajero);

        jPanelPrecio.setMaximumSize(new java.awt.Dimension(0, 26));
        jPanelPrecio.setPreferredSize(new java.awt.Dimension(64, 28));
        jPanelPrecio.setLayout(new java.awt.BorderLayout());

        jLabelPrecio.setText("Precio:");
        jPanelPrecio.add(jLabelPrecio, java.awt.BorderLayout.NORTH);
        jPanelPrecio.add(fieldPrecio, java.awt.BorderLayout.CENTER);

        createPanel.add(jPanelPrecio);

        jPanelAnticipo.setMaximumSize(new java.awt.Dimension(0, 26));
        jPanelAnticipo.setPreferredSize(new java.awt.Dimension(64, 28));
        jPanelAnticipo.setLayout(new java.awt.BorderLayout());

        jLabelAnticipo.setText("Anticipo:");
        jPanelAnticipo.add(jLabelAnticipo, java.awt.BorderLayout.NORTH);
        jPanelAnticipo.add(fieldAnticipo, java.awt.BorderLayout.CENTER);

        createPanel.add(jPanelAnticipo);

        jPanelBotonesForm.setMaximumSize(new java.awt.Dimension(0, 26));
        jPanelBotonesForm.setPreferredSize(new java.awt.Dimension(64, 28));

        createButton.setText("Crear reserva");
        createButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createButtonMousePressed(evt);
            }
        });
        jPanelBotonesForm.add(createButton);

        editButton.setText("Editar reserva");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editButtonMousePressed(evt);
            }
        });
        jPanelBotonesForm.add(editButton);

        createPanel.add(jPanelBotonesForm);

        content.add(createPanel, "form");

        jPanel2.setMaximumSize(new java.awt.Dimension(156, 48));
        jPanel2.setMinimumSize(new java.awt.Dimension(156, 48));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Reservas");

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 10);
        flowLayout1.setAlignOnBaseline(true);
        buttonsPanel.setLayout(flowLayout1);

        remove.setText("Eliminar");
        remove.setAlignmentX(0.5F);
        remove.setEnabled(false);
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                removeMousePressed(evt);
            }
        });
        buttonsPanel.add(remove);

        edit.setText("Editar");
        edit.setEnabled(false);
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editMousePressed(evt);
            }
        });
        buttonsPanel.add(edit);

        add.setText("Añadir");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addMousePressed(evt);
            }
        });
        buttonsPanel.add(add);

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
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

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

    // Events
    private void tablaMousePressed(java.awt.event.MouseEvent evt) {
        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());

        Reserva reserva = reservasTableModel.getDomainObject(row);

        if (reservaSelect == null || !Objects.equals(reserva.getId(), reservaSelect.getId())) {
            reservaSelect = reserva;
            remove.setEnabled(true);
            edit.setEnabled(true);
        } else {
            unSelectTable();
        }

    }

    private void createButtonMousePressed(java.awt.event.MouseEvent evt) {
        this.createReserva();
    }

    private void addMousePressed(java.awt.event.MouseEvent evt) {
        loadComboBoxes();
        
        if (actualPanel.equals("table")) {
            clearFields();
            changePanel("form");
            add.setText("Volver");
            edit.setVisible(false);
            remove.setVisible(false);
            createButton.setVisible(true);
            editButton.setVisible(false);
        } else {
            changePanel("table");
            add.setText("Añadir");
            edit.setVisible(true);
            remove.setVisible(true);
        }
    }

    private void removeMousePressed(java.awt.event.MouseEvent evt) {
        if (reservaSelect != null) {
            controller.remove(reservaSelect.getId());
            loadData();
            deleted.setText("Reserva eliminada: N° " + reservaSelect.getNumero());
            changePanel("deleted");
        }
    }

    private void goBackDeleteButtonMousePressed(java.awt.event.MouseEvent evt) {
        changePanel("table");
        loadData();
    }

    private void editMousePressed(java.awt.event.MouseEvent evt) {
        if (actualPanel.equals("table")) {
            updateId = reservaSelect.getId();
            fieldNumero.setText(reservaSelect.getNumero() != null ? reservaSelect.getNumero().toString() : "");
            fieldFechaDesde
                    .setText(reservaSelect.getFechaDesde() != null ? reservaSelect.getFechaDesde().toString() : "");
            fieldFechaHasta
                    .setText(reservaSelect.getFechaHasta() != null ? reservaSelect.getFechaHasta().toString() : "");
            fieldPrecio.setText(reservaSelect.getPrecio() != null ? reservaSelect.getPrecio().toString() : "");
            fieldAnticipo.setText(reservaSelect.getAnticipo() != null ? reservaSelect.getAnticipo().toString() : "");

            if (reservaSelect.getOHabitacion() != null) {
                for (int i = 0; i < comboHabitacion.getItemCount(); i++) {
                    if (comboHabitacion.getItemAt(i).getId().equals(reservaSelect.getOHabitacion().getId())) {
                        comboHabitacion.setSelectedIndex(i);
                        break;
                    }
                }
            } else {
                if (comboHabitacion.getItemCount() > 0)
                    comboHabitacion.setSelectedIndex(0);
            }

            if (reservaSelect.getOPasajero() != null) {
                for (int i = 0; i < comboPasajero.getItemCount(); i++) {
                    if (comboPasajero.getItemAt(i).getId().equals(reservaSelect.getOPasajero().getId())) {
                        comboPasajero.setSelectedIndex(i);
                        break;
                    }
                }
            } else {
                if (comboPasajero.getItemCount() > 0)
                    comboPasajero.setSelectedIndex(0);
            }

            changePanel("form");
            add.setText("Volver");
            edit.setVisible(false);
            remove.setVisible(false);
            createButton.setVisible(false);
            editButton.setVisible(true);
        } else {
            changePanel("table");
            add.setText("Añadir");
            edit.setVisible(true);
            remove.setVisible(true);
            createButton.setVisible(true);
            editButton.setVisible(false);
        }
    }

    private void editButtonMousePressed(java.awt.event.MouseEvent evt) {
        try {
            Reserva r = new Reserva();
            r.setId(updateId);
            r.setNumero(Integer.valueOf(this.fieldNumero.getText()));
            r.setFechaDesde(java.sql.Date.valueOf(this.fieldFechaDesde.getText()));
            r.setFechaHasta(java.sql.Date.valueOf(this.fieldFechaHasta.getText()));

            Habitacion h = (Habitacion) comboHabitacion.getSelectedItem();
            r.setOHabitacion(h);

            Pasajero p = (Pasajero) comboPasajero.getSelectedItem();
            r.setOPasajero(p);

            r.setPrecio(Float.valueOf(this.fieldPrecio.getText()));
            r.setAnticipo(Float.valueOf(this.fieldAnticipo.getText()));

            controller.update(r);
            changePanel("table");
            add.setText("Añadir");
            edit.setVisible(true);
            remove.setVisible(true);
            createButton.setVisible(true);
            editButton.setVisible(false);
            loadData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Datos ingresados no válidos: " + e.getMessage());
        }
    }

    // Methods
    private void loadComboBoxes() {
        comboHabitacion.removeAllItems();
        comboPasajero.removeAllItems();
        
        HabitacionController hc = new HabitacionController();
        for (Habitacion h : hc.getAll()) {
            comboHabitacion.addItem(h);
        }

        PasajeroController pc = new PasajeroController();
        for (Pasajero p : pc.getAll()) {
            comboPasajero.addItem(p);
        }
    }

    private void unSelectTable() {
        reservaSelect = null;
        tabla.clearSelection();
        edit.setEnabled(false);
        remove.setEnabled(false);
    }

    private void changePanel(String panel) {
        if (content != null) {
            CardLayout layout = (CardLayout) content.getLayout();
            layout.show(content, panel);
            actualPanel = panel;
            unSelectTable();
        }
    }

    private void createReserva() {
        try {
            Reserva nueva = new Reserva();
            nueva.setNumero(Integer.valueOf(this.fieldNumero.getText()));
            nueva.setFechaDesde(java.sql.Date.valueOf(this.fieldFechaDesde.getText()));
            nueva.setFechaHasta(java.sql.Date.valueOf(this.fieldFechaHasta.getText()));

            Habitacion h = (Habitacion) comboHabitacion.getSelectedItem();
            nueva.setOHabitacion(h);

            Pasajero p = (Pasajero) comboPasajero.getSelectedItem();
            nueva.setOPasajero(p);

            nueva.setPrecio(Float.valueOf(this.fieldPrecio.getText()));
            nueva.setAnticipo(Float.valueOf(this.fieldAnticipo.getText()));

            this.add.setEnabled(false);

            controller.save(nueva);

            this.add.setEnabled(true);

            changePanel("table");
            add.setText("Añadir");
            edit.setVisible(true);
            remove.setVisible(true);

            loadData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Datos ingresados no válidos: " + e.getMessage());
        }
    }

    private void clearFields() {
        this.fieldNumero.setText("");
        this.fieldFechaDesde.setText("");
        this.fieldFechaHasta.setText("");
        this.fieldPrecio.setText("");
        this.fieldAnticipo.setText("");
        if (comboHabitacion.getItemCount() > 0)
            comboHabitacion.setSelectedIndex(0);
        if (comboPasajero.getItemCount() > 0)
            comboPasajero.setSelectedIndex(0);
    }

    private void loadData() {
        changePanel("loading");
        reservasTableModel.clearTableModelData();

        for (Reserva h : controller.getAll()) {
            reservasTableModel.addRow(h);
        }
        changePanel("table");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JComboBox<Habitacion> comboHabitacion;
    private javax.swing.JComboBox<Pasajero> comboPasajero;
    private javax.swing.JPanel content;
    private javax.swing.JButton createButton;
    private javax.swing.JPanel createPanel;
    private javax.swing.JLabel deleted;
    private javax.swing.JPanel deletedPanel;
    private javax.swing.JButton edit;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField fieldAnticipo;
    private javax.swing.JTextField fieldFechaDesde;
    private javax.swing.JTextField fieldFechaHasta;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JTextField fieldPrecio;
    private javax.swing.JButton goBackDeleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAnticipo;
    private javax.swing.JLabel jLabelFechaDesde;
    private javax.swing.JLabel jLabelFechaHasta;
    private javax.swing.JLabel jLabelHabitacion;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPasajero;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAnticipo;
    private javax.swing.JPanel jPanelBotonesForm;
    private javax.swing.JPanel jPanelFechaDesde;
    private javax.swing.JPanel jPanelFechaHasta;
    private javax.swing.JPanel jPanelHabitacion;
    private javax.swing.JPanel jPanelNumero;
    private javax.swing.JPanel jPanelPasajero;
    private javax.swing.JPanel jPanelPrecio;
    private javax.swing.JPanel loadingPanel;
    private javax.swing.JButton remove;
    private javax.swing.JTable tabla;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
