
package vigenere;

public class Interfaz extends javax.swing.JFrame {
    
    TextosVigi vigi = new TextosVigi();
    OperacionesVigi operaciones = new OperacionesVigi();
    
    public Interfaz() {
        initComponents();
        tabla.setText(operaciones.OperacionesVigi("a", "a"));
        texto.disable();
        tabla.disable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        itexto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        iclave = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(548, 379, 379, 379));
        setMaximumSize(new java.awt.Dimension(1182, 700));
        setMinimumSize(new java.awt.Dimension(1182, 700));
        setPreferredSize(new java.awt.Dimension(1182, 700));
        getContentPane().setLayout(null);

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(730, 150, 320, 160);

        tabla.setColumns(20);
        tabla.setRows(5);
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(730, 400, 310, 180);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aquí se muestra la matríz");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(740, 350, 300, 40);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Aquí se mostrará la cadena");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(727, 110, 320, 34);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIGENERE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 40, 200, 51);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Introduce la cadena que quieres cifrar o descifrar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 120, 570, 60);

        itexto.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        itexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itextoActionPerformed(evt);
            }
        });
        getContentPane().add(itexto);
        itexto.setBounds(210, 190, 340, 60);

        jButton2.setBackground(new java.awt.Color(204, 204, 0));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jButton2.setText("DESCIFRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 260, 170, 60);

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jButton1.setText("CIFRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 260, 170, 60);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Introduce la clave");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 350, 220, 34);

        iclave.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        iclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iclaveActionPerformed(evt);
            }
        });
        getContentPane().add(iclave);
        iclave.setBounds(230, 390, 260, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cyber.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-30, 0, 1220, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String textoClaro = itexto.getText().toLowerCase();
        String clave = operaciones.Longitud(iclave.getText().toLowerCase(), textoClaro);
        
        String textoCifrado = vigi.encryptTextoClaro(textoClaro, clave);
        
        texto.setText(textoCifrado);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String textoCifrado = itexto.getText().toLowerCase();
        String clave = operaciones.Longitud(iclave.getText().toLowerCase(), textoCifrado);
        String textoClaro = vigi.desencryptTextoCifrado(textoCifrado, clave);
        texto.setText(textoClaro);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void itextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itextoActionPerformed
        
    }//GEN-LAST:event_itextoActionPerformed

    private void iclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iclaveActionPerformed
        
    }//GEN-LAST:event_iclaveActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField iclave;
    private javax.swing.JTextField itexto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tabla;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
