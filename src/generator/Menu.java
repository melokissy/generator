/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import java.awt.Color;

/**
 *
 * @author Kissy de Melo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextFieldAtualizacao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextFieldTecnico1 = new javax.swing.JTextField();
        TextFieldCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextFieldContato = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextFieldContato1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TextFieldDataInicio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TextFieldDataFinal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TextFieldVersaoAtual = new javax.swing.JTextField();
        TextFieldVersaoAnterior1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TextFieldObservacoes = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TextFieldBancaDados1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TextFieldObjetivo1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TextFieldModificacoes1 = new javax.swing.JTextField();
        TextFieldProtocolo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TextFieldRepsonsavel1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TextFieldModificacoes2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TextFieldProtocolo1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TextFieldRepsonsavel2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        TextFieldObservacoes1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Rubik", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Documento de atualização");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Técnico responsável");

        TextFieldAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAtualizacaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cliente");

        TextFieldTecnico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTecnico1ActionPerformed(evt);
            }
        });

        TextFieldCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("N. Jira.");

        TextFieldContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldContatoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Contato");

        TextFieldContato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldContato1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Data");

        TextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEmailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        TextFieldDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDataInicioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Data/Hora início");

        TextFieldDataFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDataFinalActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Versão Anterior");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Data/Hora final");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Versão Atual");

        TextFieldVersaoAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldVersaoAtualActionPerformed(evt);
            }
        });

        TextFieldVersaoAnterior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldVersaoAnterior1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Atualizar banco de dados");

        TextFieldObservacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldObservacoesActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Objetivo da atualização:");

        TextFieldBancaDados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldBancaDados1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Rubik", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 204));
        jLabel14.setText("Plano de pré-atualização");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Configurações/modificações");

        TextFieldObjetivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldObjetivo1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Responsável");

        TextFieldModificacoes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldModificacoes1ActionPerformed(evt);
            }
        });

        TextFieldProtocolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldProtocoloActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Protocolo");

        TextFieldRepsonsavel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldRepsonsavel1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Observações");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Configurações/modificações");

        TextFieldModificacoes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldModificacoes2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Protocolo");

        TextFieldProtocolo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldProtocolo1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Responsável");

        TextFieldRepsonsavel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldRepsonsavel2ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Observações");

        TextFieldObservacoes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldObservacoes1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Rubik", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 204));
        jLabel23.setText("Plano de pós-atualização");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(TextFieldProtocolo1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(TextFieldRepsonsavel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(TextFieldObservacoes1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7))
                                        .addGap(10, 10, 10)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextFieldContato, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextFieldTecnico1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextFieldContato1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextFieldAtualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextFieldVersaoAnterior1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextFieldDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TextFieldVersaoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TextFieldBancaDados1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TextFieldModificacoes2, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(18, 18, 18)
                                                .addComponent(TextFieldObjetivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(TextFieldProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(TextFieldRepsonsavel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(50, 50, 50)
                        .addComponent(TextFieldObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextFieldModificacoes1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldTecnico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldContato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(TextFieldAtualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TextFieldContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(TextFieldDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TextFieldVersaoAnterior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(TextFieldVersaoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(TextFieldBancaDados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(TextFieldObjetivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(TextFieldModificacoes2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextFieldProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel16))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(TextFieldRepsonsavel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextFieldObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(TextFieldModificacoes1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TextFieldProtocolo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldRepsonsavel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(TextFieldObservacoes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(153, 153, 153))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);   
    }//GEN-LAST:event_jMenu2MouseClicked

    private void TextFieldAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAtualizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAtualizacaoActionPerformed

    private void TextFieldTecnico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldTecnico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldTecnico1ActionPerformed

    private void TextFieldClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldClienteActionPerformed

    private void TextFieldContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldContatoActionPerformed

    private void TextFieldContato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldContato1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldContato1ActionPerformed

    private void TextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEmailActionPerformed

    private void TextFieldDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDataInicioActionPerformed

    private void TextFieldDataFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDataFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDataFinalActionPerformed

    private void TextFieldVersaoAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldVersaoAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldVersaoAtualActionPerformed

    private void TextFieldVersaoAnterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldVersaoAnterior1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldVersaoAnterior1ActionPerformed

    private void TextFieldObservacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldObservacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldObservacoesActionPerformed

    private void TextFieldBancaDados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldBancaDados1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldBancaDados1ActionPerformed

    private void TextFieldObjetivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldObjetivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldObjetivo1ActionPerformed

    private void TextFieldModificacoes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldModificacoes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldModificacoes1ActionPerformed

    private void TextFieldProtocoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldProtocoloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldProtocoloActionPerformed

    private void TextFieldRepsonsavel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldRepsonsavel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldRepsonsavel1ActionPerformed

    private void TextFieldModificacoes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldModificacoes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldModificacoes2ActionPerformed

    private void TextFieldProtocolo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldProtocolo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldProtocolo1ActionPerformed

    private void TextFieldRepsonsavel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldRepsonsavel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldRepsonsavel2ActionPerformed

    private void TextFieldObservacoes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldObservacoes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldObservacoes1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldAtualizacao;
    private javax.swing.JTextField TextFieldBancaDados1;
    private javax.swing.JTextField TextFieldCliente;
    private javax.swing.JTextField TextFieldContato;
    private javax.swing.JTextField TextFieldContato1;
    private javax.swing.JTextField TextFieldDataFinal;
    private javax.swing.JTextField TextFieldDataInicio;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldModificacoes1;
    private javax.swing.JTextField TextFieldModificacoes2;
    private javax.swing.JTextField TextFieldObjetivo1;
    private javax.swing.JTextField TextFieldObservacoes;
    private javax.swing.JTextField TextFieldObservacoes1;
    private javax.swing.JTextField TextFieldProtocolo;
    private javax.swing.JTextField TextFieldProtocolo1;
    private javax.swing.JTextField TextFieldRepsonsavel1;
    private javax.swing.JTextField TextFieldRepsonsavel2;
    private javax.swing.JTextField TextFieldTecnico1;
    private javax.swing.JTextField TextFieldVersaoAnterior1;
    private javax.swing.JTextField TextFieldVersaoAtual;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables


}