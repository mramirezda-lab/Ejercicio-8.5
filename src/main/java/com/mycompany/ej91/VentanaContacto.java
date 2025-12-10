package com.mycompany.ej91;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class VentanaContacto extends javax.swing.JFrame {

    ListaContactos listaContactos = new ListaContactos();

    private void mostrarDatos() {
    DefaultListModel<String> modelo = new DefaultListModel<>();
    
    for (int i = 0; i < listaContactos.lista.size(); i++) {
        Contacto c = (Contacto) listaContactos.lista.get(i);
        modelo.addElement(c.nombres + " - " + c.apellidos + " - " + 
            c.fechaNacimiento + " - " + c.dirección + " - " + c.teléfono);
    }
    
    lista.setModel(modelo);
}
    public VentanaContacto() {
        initComponents();
        
        // Acción del botón Agregar
        agregar.addActionListener(e -> agregarContacto());
    }
    
    private void agregarContacto() {
    // Validar campos vacíos
    if (campoNombres.getText().isEmpty() || 
        campoApellidos.getText().isEmpty() ||
        campoFechaNacimiento.getText().isEmpty() ||
        campoDirección.getText().isEmpty() ||
        campoTelefono.getText().isEmpty() ||
        campoCorreo.getText().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, 
            "No se permiten campos vacíos", 
            "Error en ingreso de datos", 
            JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    
    // Crear contacto (sin parsear fecha)
    Contacto contacto = new Contacto(
        campoNombres.getText(),
        campoApellidos.getText(),
        campoFechaNacimiento.getText(),  // ← Se guarda como texto
        campoDirección.getText(),
        campoTelefono.getText(),
        campoCorreo.getText()
    );
    
    listaContactos.agregarContacto(contacto);
    mostrarDatos();
}
        // Acción cuando se presiona Enter en el campo fecha
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apellidos = new javax.swing.JLabel();
        nombres = new javax.swing.JLabel();
        fechaNacimiento = new javax.swing.JLabel();
        dirección = new javax.swing.JLabel();
        télefono = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        campoNombres = new javax.swing.JTextField();
        campoApellidos = new javax.swing.JTextField();
        campoDirección = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoFechaNacimiento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        apellidos.setText("Apellidos:");

        nombres.setText("Nombres:");

        fechaNacimiento.setText("Fecha nacimiento:");

        dirección.setText("Dirección:");

        télefono.setText("Télefono:");

        correo.setText("Correo:");

        agregar.setText("Agregar");
        agregar.addActionListener(this::agregarActionPerformed);

        campoFechaNacimiento.addActionListener(this::campoFechaNacimientoActionPerformed);

        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agregar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(télefono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dirección, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoTelefono)
                    .addComponent(campoCorreo)
                    .addComponent(campoDirección)
                    .addComponent(campoApellidos)
                    .addComponent(campoNombres)
                    .addComponent(campoFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(485, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidos)
                            .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaNacimiento)
                            .addComponent(campoFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dirección)
                            .addComponent(campoDirección, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(télefono)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correo)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(agregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(nombres)
                    .addContainerGap(243, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFechaNacimientoActionPerformed
ListaContactos ListaContactos = new ListaContactos();

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
    if (campoNombres.getText().isEmpty() || 
        campoApellidos.getText().isEmpty() ||
        campoFechaNacimiento.getText().isEmpty() ||
        campoDirección.getText().isEmpty() ||
        campoTelefono.getText().isEmpty() ||
        campoCorreo.getText().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, 
            "No se permiten campos vacíos", 
            "Error en ingreso de datos", 
            JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    
    // Crear contacto
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy");
    LocalDate fecha = LocalDate.parse(campoFechaNacimiento.getText(), formato);
    
    Contacto contacto = new Contacto(
        campoNombres.getText(),
        campoApellidos.getText(),
        campoFechaNacimiento.getText(),
        campoDirección.getText(),
        campoTelefono.getText(),
        campoCorreo.getText()
    );
    
    listaContactos.agregarContacto(contacto);
    mostrarDatos();

    }//GEN-LAST:event_agregarActionPerformed
public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> new VentanaContacto().setVisible(true));
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JLabel apellidos;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDirección;
    private javax.swing.JTextField campoFechaNacimiento;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel dirección;
    private javax.swing.JLabel fechaNacimiento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JLabel nombres;
    private javax.swing.JLabel télefono;
    // End of variables declaration//GEN-END:variables
}
