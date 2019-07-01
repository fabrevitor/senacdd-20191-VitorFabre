package exercicio6.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AlteracaoProduto extends JInternalFrame {
	private JTextField txtNovoNome;
	private JTextField txtNovoPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlteracaoProduto frame = new AlteracaoProduto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AlteracaoProduto() {
		setClosable(true);
		setTitle("Altera\u00E7\u00E3o de Produto");
		setBounds(100, 100, 630, 415);
		getContentPane().setLayout(null);

		JLabel lblSelecaoAlterar = new JLabel("Selecione um produto para alterá-lo:");
		lblSelecaoAlterar.setFont(new Font("Verdana", Font.BOLD, 16));
		lblSelecaoAlterar.setBounds(22, 23, 382, 50);
		getContentPane().add(lblSelecaoAlterar);

		JComboBox cmbBoxProduto = new JComboBox();
		cmbBoxProduto.setBounds(397, 11, 213, 80);
		getContentPane().add(cmbBoxProduto);

		JLabel lblNovoNome = new JLabel("Novo Nome:");
		lblNovoNome.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNovoNome.setBounds(22, 145, 96, 28);
		getContentPane().add(lblNovoNome);

		JLabel lblNovoPreo = new JLabel("Novo Preço:");
		lblNovoPreo.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNovoPreo.setBounds(22, 184, 96, 22);
		getContentPane().add(lblNovoPreo);

		txtNovoNome = new JTextField();
		txtNovoNome.setBounds(128, 151, 196, 20);
		getContentPane().add(txtNovoNome);
		txtNovoNome.setColumns(10);

		txtNovoPreco = new JTextField();
		txtNovoPreco.setColumns(10);
		txtNovoPreco.setBounds(128, 187, 196, 20);
		getContentPane().add(txtNovoPreco);

		JComboBox cmbBoxTipo = new JComboBox();
		cmbBoxTipo.setBounds(128, 246, 196, 35);
		getContentPane().add(cmbBoxTipo);

		JLabel lblNovotipo = new JLabel("Novo Tipo:");
		lblNovotipo.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNovotipo.setBounds(22, 254, 78, 14);
		getContentPane().add(lblNovotipo);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Isso é só uma tela teste!!");
			}
		});
		btnSalvar.setForeground(Color.ORANGE);
		btnSalvar.setFont(new Font("Verdana", Font.BOLD, 15));
		btnSalvar.setBounds(397, 236, 213, 50);
		getContentPane().add(btnSalvar);

		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNovoNome.setText("");
				txtNovoPreco.setText("");
			}
		});
		btnLimparCampos.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnLimparCampos.setForeground(Color.MAGENTA);
		btnLimparCampos.setBounds(397, 299, 213, 50);
		getContentPane().add(btnLimparCampos);

	}
}
