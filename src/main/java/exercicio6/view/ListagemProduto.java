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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ListagemProduto extends JInternalFrame {
	private JTable table;
	private JTextField txtNome;
	private JTextField txtCodBarras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListagemProduto frame = new ListagemProduto();
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
	public ListagemProduto() {
		setTitle("Listagem de Produtos");
		setForeground(Color.WHITE);
		setClosable(true);
		setBounds(100, 100, 600, 445);
		getContentPane().setLayout(null);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisar.setBounds(30, 353, 140, 40);
		getContentPane().add(btnPesquisar);

		JComboBox cmbTipo = new JComboBox();
		cmbTipo.setBounds(77, 140, 114, 20);
		getContentPane().add(cmbTipo);

		table = new JTable();
		table.setBounds(229, 11, 351, 383);
		getContentPane().add(table);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipo.setBounds(10, 143, 81, 14);
		getContentPane().add(lblTipo);

		txtNome = new JTextField();
		txtNome.setBounds(77, 96, 114, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 97, 81, 14);
		getContentPane().add(lblNome);

		JLabel lblCodBarra = new JLabel("Código de Barras:");
		lblCodBarra.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodBarra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodBarra.setBounds(33, 228, 137, 14);
		getContentPane().add(lblCodBarra);

		txtCodBarras = new JTextField();
		txtCodBarras.setColumns(10);
		txtCodBarras.setBounds(33, 253, 140, 40);
		getContentPane().add(txtCodBarras);

	}
}