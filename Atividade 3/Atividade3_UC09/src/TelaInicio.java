
import Atividadde3_UC09.model.Consulta;
import Atividadde3_UC09.model.Listagem;
import Atividadde3_UC09.model.Pessoa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public final class TelaInicio extends javax.swing.JFrame {

    private final List<Pessoa> listaPessoa = Listagem.ListarPessoa();
    private final List<Consulta> listaConsulta = Listagem.ListarConsulta();

    private final String[] tableColoumns = {"Paciente", "CPF", "Telefone", "Data", "Já era paciente ?", "Consulta Realizada"};
    DefaultTableModel tableModel = new DefaultTableModel(tableColoumns, 0);

    public TelaInicio() {
        initComponents();
        atualizarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        BtNovaConsulta = new javax.swing.JButton();
        BtExcluirConsulta = new javax.swing.JButton();
        BtFinalizarConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Boas vindas ao sistema de agendamento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "CPF", "Telefone", "Data", "Já era paciente ?", "Consulta Realizada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPacientes.getSelectionModel () .addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int linhaSelecionada = tblPacientes.getSelectedRow();
                }
            }
        }
    );
    jScrollPane1.setViewportView(tblPacientes);

    BtNovaConsulta.setText("Nova consulta");
    BtNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            BtNovaConsultaActionPerformed(evt);
        }
    });

    BtExcluirConsulta.setText("Excluir consulta");
    BtExcluirConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    BtExcluirConsulta.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            BtExcluirConsultaActionPerformed(evt);
        }
    });

    BtFinalizarConsulta.setText("Finalizar consulta");
    BtFinalizarConsulta.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            BtFinalizarConsultaActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(BtNovaConsulta)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
            .addComponent(BtExcluirConsulta)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
            .addComponent(BtFinalizarConsulta))
        .addComponent(jScrollPane1)
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jScrollPane1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(BtNovaConsulta)
                .addComponent(BtExcluirConsulta)
                .addComponent(BtFinalizarConsulta)))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void atualizarLista() {

        if (!listaPessoa.isEmpty()) {

            Pessoa pessoaAtual;
            Consulta consultaAtual;

            for (int i = 0; i < listaPessoa.size(); i++) {
                pessoaAtual = listaPessoa.get(i);
                consultaAtual = listaConsulta.get(i);
                String consRealizada;

                consRealizada = consultaAtual.getConsultaRealizada() ? "Sim" : "Não";

                String[] rowData = {
                    pessoaAtual.getNome(),
                    pessoaAtual.getCpf(),
                    pessoaAtual.getTelefone(),
                    consultaAtual.getData(),
                    consultaAtual.getPaciente(),
                    consRealizada
                };

                tableModel.addRow(rowData);
            }
            tblPacientes.setModel(tableModel);
        }
    }

    private void BtNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNovaConsultaActionPerformed
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtNovaConsultaActionPerformed

    private void BtFinalizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtFinalizarConsultaActionPerformed

        if (tblPacientes.getSelectedRow() != -1) {

            Consulta consultaSelecionada = listaConsulta.get(tblPacientes.getSelectedRow());
            TelaDetalhes telaDetalhe = new TelaDetalhes(consultaSelecionada);
            telaDetalhe.setVisible(true);
            dispose();

        } else {

            JOptionPane.showMessageDialog(null, "Selecione uma consulta para finalizar.", "Aviso", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_BtFinalizarConsultaActionPerformed

    private void BtExcluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirConsultaActionPerformed
        int linhaSelecionada = tblPacientes.getSelectedRow();

        if (linhaSelecionada != -1) {

            DefaultTableModel modelo = (DefaultTableModel) tblPacientes.getModel();
            modelo.removeRow(linhaSelecionada);
            listaPessoa.remove(linhaSelecionada);
            listaConsulta.remove(linhaSelecionada);

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_BtExcluirConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtExcluirConsulta;
    private javax.swing.JButton BtFinalizarConsulta;
    private javax.swing.JButton BtNovaConsulta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPacientes;
    // End of variables declaration//GEN-END:variables
}