package titoshotel.Views;

import titoshotel.Controllers.HabitacionController;
import java.awt.CardLayout;
import java.util.Objects;
import javax.swing.JTable;

import titoshotel.Models.Entities.Habitacion;
import titoshotel.Views.Model.HabitacionesTableModel;

public class HabitacionesView extends javax.swing.JPanel {
    private final HabitacionesTableModel habitacionesTableModel;
    private Habitacion habitacionSelect;
    private String actualPanel = "table";
    private final HabitacionController controller;
    private int updateId;

    
    public HabitacionesView() {
        habitacionesTableModel = new HabitacionesTableModel();
        controller = new HabitacionController();
        initComponents();
        loadData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        createPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        fieldNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        fieldCamasSimples = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        fieldCamasDobles = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        fieldPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        loadingPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        deletedPanel = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        deleted = new javax.swing.JLabel();
        goBackDeleteButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        remove = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        add = new javax.swing.JButton();

        content.setLayout(new java.awt.CardLayout());

        tabla.setModel(habitacionesTableModel);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        tableScrollPane.setViewportView(tabla);

        content.add(tableScrollPane, "table");

        jPanel5.setMaximumSize(new java.awt.Dimension(200, 32767));

        fieldNumero.setToolTipText("Numero");

        jLabel2.setText("Numero:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fieldNumero)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setMaximumSize(new java.awt.Dimension(200, 32767));

        fieldCamasSimples.setToolTipText("Camas simples");

        jLabel3.setText("Camas simples:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fieldCamasSimples)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fieldCamasSimples, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setMaximumSize(new java.awt.Dimension(200, 32767));

        fieldCamasDobles.setToolTipText("Camas dobles");

        jLabel4.setText("Camas dobles:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fieldCamasDobles)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fieldCamasDobles, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setMaximumSize(new java.awt.Dimension(200, 32767));

        fieldPrecio.setToolTipText("Precio");

        jLabel5.setText("Precio:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fieldPrecio)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        createButton.setText("Crear habitación");
        createButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createButtonMousePressed(evt);
            }
        });
        jPanel9.add(createButton);

        editButton.setText("Editar habitación");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editButtonMousePressed(evt);
            }
        });
        jPanel9.add(editButton);

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        content.add(createPanel, "form");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cargando...");
        jLabel6.setAlignmentX(0.5F);

        javax.swing.GroupLayout loadingPanelLayout = new javax.swing.GroupLayout(loadingPanel);
        loadingPanel.setLayout(loadingPanelLayout);
        loadingPanelLayout.setHorizontalGroup(
            loadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        loadingPanelLayout.setVerticalGroup(
            loadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
        );

        content.add(loadingPanel, "loading");

        deletedPanel.setLayout(new java.awt.GridBagLayout());

        jPanel12.setLayout(new java.awt.GridBagLayout());

        deleted.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleted.setText("Habitacion eliminada:");
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

        jPanel2.setMaximumSize(new java.awt.Dimension(156, 48));
        jPanel2.setMinimumSize(new java.awt.Dimension(156, 48));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Habitaciones");

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
                .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Events
    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());

        Habitacion habitacion = habitacionesTableModel.getDomainObject(row);

        if (habitacionSelect == null || !Objects.equals(habitacion.getId(), habitacionSelect.getId())) {
            habitacionSelect = habitacion;
            remove.setEnabled(true);
            edit.setEnabled(true);
        } else {
            unSelectTable();
        }

    }//GEN-LAST:event_tablaMousePressed

    private void createButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButtonMousePressed
        this.createHabitacion();
    }//GEN-LAST:event_createButtonMousePressed

    private void addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMousePressed
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
    }//GEN-LAST:event_addMousePressed

    private void removeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMousePressed
        if (habitacionSelect != null) {
            Habitacion data = habitacionSelect.clone();
            
            controller.remove(data.getId());
            loadData();
            deleted.setText("Habitacion eliminada: N° " + data.getNumero());
            changePanel("deleted");
        }
    }//GEN-LAST:event_removeMousePressed

    private void goBackDeleteButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackDeleteButtonMousePressed
        changePanel("table");
        loadData();
    }//GEN-LAST:event_goBackDeleteButtonMousePressed

    private void editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMousePressed
        if (actualPanel.equals("table")) {
            updateId = habitacionSelect.getId();
            fieldCamasDobles.setText(habitacionSelect.getCamasDobles().toString());
            fieldCamasSimples.setText(habitacionSelect.getCamasSimples().toString());
            fieldNumero.setText(habitacionSelect.getNumero().toString());
            fieldPrecio.setText(habitacionSelect.getPrecio().toString());
            
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
    }//GEN-LAST:event_editMousePressed

    private void editButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMousePressed
        controller.update(
            new Habitacion(
                updateId,
                Integer.valueOf(this.fieldNumero.getText()),
                Integer.valueOf(this.fieldCamasSimples.getText()),
                Integer.valueOf(this.fieldCamasDobles.getText()),
                Double.valueOf(this.fieldPrecio.getText())
            )
        );
        changePanel("table");
        add.setText("Añadir");
        edit.setVisible(true);
        remove.setVisible(true);
        createButton.setVisible(true);
        editButton.setVisible(false);
        loadData();
    }//GEN-LAST:event_editButtonMousePressed

    // Methods
    private void unSelectTable() {
        habitacionSelect = null;
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
    
    private void createHabitacion() {
        Habitacion nueva = new Habitacion();
        nueva.setNumero(Integer.valueOf(this.fieldNumero.getText()));
        nueva.setPrecio(Double.valueOf(this.fieldPrecio.getText()));
        nueva.setCamasSimples(Integer.valueOf(this.fieldCamasSimples.getText()));
        nueva.setCamasDobles(Integer.valueOf(this.fieldCamasDobles.getText()));

        this.add.setEnabled(false);
        this.fieldNumero.setEnabled(false);
        this.fieldPrecio.setEnabled(false);
        this.fieldCamasDobles.setEnabled(false);
        this.fieldCamasSimples.setEnabled(false);
        
        controller.save(nueva);

        this.add.setEnabled(true);
        this.fieldNumero.setEnabled(true);
        this.fieldPrecio.setEnabled(true);
        this.fieldCamasDobles.setEnabled(true);
        this.fieldCamasSimples.setEnabled(true);

        
        changePanel("table");
        add.setText("Añadir");
        edit.setVisible(true);
        remove.setVisible(true);
        
        loadData();
    }
    
    private void clearFields() {
        this.fieldNumero.setText("");
        this.fieldPrecio.setText("");
        this.fieldCamasDobles.setText("");
        this.fieldCamasSimples.setText("");
    }
    
    private void loadData() {
        changePanel("loading");
        habitacionesTableModel.clearTableModelData();
        
        for (Habitacion h : controller.getAll()) {
            habitacionesTableModel.addRow(h);
        }
        changePanel("table");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JPanel content;
    private javax.swing.JButton createButton;
    private javax.swing.JPanel createPanel;
    private javax.swing.JLabel deleted;
    private javax.swing.JPanel deletedPanel;
    private javax.swing.JButton edit;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField fieldCamasDobles;
    private javax.swing.JTextField fieldCamasSimples;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JTextField fieldPrecio;
    private javax.swing.JButton goBackDeleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel loadingPanel;
    private javax.swing.JButton remove;
    private javax.swing.JTable tabla;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
