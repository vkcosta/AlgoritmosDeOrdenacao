/*
 * Copyright (C) 2018 mgarcia
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package VISAO;

import static LOGICA.SortBy.BubbleSort;
import static LOGICA.SortBy.HeapSort;
import static LOGICA.SortBy.InsertionSort;
import static LOGICA.SortBy.MergeSort;
import static LOGICA.SortBy.QuickSort;
import static LOGICA.SortBy.SelectionSort;
import LOGICA.Util.Files;
import LOGICA.Util.Vetores;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author mgarcia
 */
public class MainApp extends javax.swing.JFrame {

    File entrada;
    File saida;

    /**
     * Creates new form MainApp
     */
    public MainApp() {
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

        jButton1 = new javax.swing.JButton();
        AlgBOX = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        saidaTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        quantTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        entradaTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("I C A  01");
        setAlwaysOnTop(true);

        jButton1.setText("Selecionar Arquivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AlgBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Algoritmo", "Bubble Sort", "Insertion Sort", "Selection Sort", "Merge Sort", "Quick Sort", "Heap Sort" }));

        jButton2.setText("Execute");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do arquivo de saída");

        quantTF.setText("0");

        jLabel2.setText("Quantidade de numeros a ser ordenada ( deixe 0 para ordenar TODOS )");

        jLabel3.setText("Escolha o algoritmo..");

        entradaTF.setEditable(false);
        entradaTF.setText("Nenhum arquivo selecionado...");

        jLabel4.setText("Arquivo de entrada dos dados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saidaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quantTF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(entradaTF)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AlgBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlgBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saidaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entradaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.showOpenDialog(entradaTF);
        entrada = fc.getSelectedFile();
        entradaTF.setText(entrada.getPath());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean valid = true; //auxiliar na validação do formulario
        if (null == entrada) { //checa arquivo de entrada
            valid = false;
            JOptionPane.showMessageDialog(this, "Nenhum arquivo de entrada selecionado");
            jButton1.grabFocus();
        }
        if (AlgBOX.getSelectedIndex() == 0) { //checa algoritmo selecionado
            valid = false;
            JOptionPane.showMessageDialog(this, "Nenhum algoritmo foi selecionado.");
            AlgBOX.grabFocus();
        }
        try { //checa a validade do valor para quantidade a ser ordenada
            int num = Integer.parseInt(quantTF.getText());
            if (num < 0) {
                valid = false;
                JOptionPane.showMessageDialog(this, "quantidade nao pode ser negativa");
                quantTF.grabFocus();
            }
        } catch (Exception e) { // o valor em quantTF não é um numero inteiro
            valid = false;
            JOptionPane.showMessageDialog(this, "quantidade invalida");
            quantTF.grabFocus();
        }

        if (saidaTF.getText().isEmpty()) { //checa arquivo de saída
            valid = false;
            JOptionPane.showMessageDialog(this, "nenhum arquivo de saída especificado");
            saidaTF.grabFocus();
        }

        //se nada deu falso, o formulário foi preenchido, bora executar
        if (valid) {
            long start; // tempo em milisegundos do começo da execução
            long elapsed = 0; //diferença de tempo entre o começo e o final da execução
            int quant = Integer.parseInt(quantTF.getText());

            saida = new File(saidaTF.getText() + ".txt");
            int[] Array = {0, 0}; //inicialização do vetor a ser ordenado

            try {
                if (!saida.createNewFile()) {
                    JOptionPane.showMessageDialog(this, "O arquivo não pode ser criado, pois ele ja existe!");
                }
            } catch (IOException ex) {
                Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Falha ao criar arquivo de saída\n+ex");
                dispose();
            }
            try {
                Array = Files.getIntArray(entrada.getPath());
            } catch (Exception ex) {
                Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Erro ao recuperar dados do "
                        + "arquivo de entrada\n" + ex);
                dispose();
            }

            switch (AlgBOX.getSelectedIndex()) {
                case 1: //bubble Sort
                    start = System.currentTimeMillis();
                    BubbleSort(Array, quant);
                    elapsed = System.currentTimeMillis() - start;
                    break;
                case 2: // insertion Sort
                    start = System.currentTimeMillis();
                    InsertionSort(Array, quant);
                    elapsed = System.currentTimeMillis() - start;
                    break;
                case 3: //selection Sort
                    start = System.currentTimeMillis();
                    SelectionSort(Array, quant);
                    elapsed = System.currentTimeMillis() - start;
                    break;
                case 4:// merge Sort
                    start = System.currentTimeMillis();
                    if (quant != 0) {
                        MergeSort(Array, 0, quant);
                    } else {
                        MergeSort(Array, 0, Array.length - 1);
                    }
                    elapsed = System.currentTimeMillis() - start;
                    break;
                case 5: //quick Sort
                    start = System.currentTimeMillis();
                    if (quant != 0) {
                        QuickSort(Array, 0, quant);
                    } else {
                        QuickSort(Array, 0, Array.length - 1);
                    }
                    elapsed = System.currentTimeMillis() - start;
                    System.out.println("Elapsed: " + elapsed);
                    break;
                case 6: //Heap Sort
                    start = System.currentTimeMillis();
                    HeapSort(Array, quant);
                    elapsed = System.currentTimeMillis() - start;
                    break;
            }

            //faz a escrita dos dados processados no arquivo de saída
            try {
                String tempo = ("\n\nTempo de execução: " + elapsed
                        + " milisegundos");

                Files.setFileContentAsSingleLine(saida.getPath(), Vetores.ToString(Array));
                Files.AddThisLineAtEOF(saida.getPath(), tempo);
                JOptionPane.showMessageDialog(this, "Arquivo" + saida.getPath()
                        + "gravado com êxito.");
            } catch (IOException ex) {
                Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Erro ao gravar no arquivo de saida\n" + ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AlgBOX;
    private javax.swing.JTextField entradaTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField quantTF;
    private javax.swing.JTextField saidaTF;
    // End of variables declaration//GEN-END:variables
}
