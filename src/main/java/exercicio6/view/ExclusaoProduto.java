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
import javax.swing.SwingConstants;

public class ExclusaoProduto extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExclusaoProduto frame = new ExclusaoProduto();
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
	public ExclusaoProduto() {
		setClosable(true);
		setTitle("Excluir Produto");
		setBounds(100, 100, 333, 238);
		getContentPane().setLayout(null);

		JComboBox cmbProdutos = new JComboBox();
		cmbProdutos.setBackground(Color.LIGHT_GRAY);
		cmbProdutos.setBounds(10, 60, 182, 94);
		getContentPane().add(cmbProdutos);

		JLabel lblSelecao = new JLabel("Selecione o Produto para Excluir:");
		lblSelecao.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblSelecao.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecao.setBounds(0, 16, 321, 33);
		getContentPane().add(lblSelecao);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setForeground(Color.RED);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Isso é só uma tela teste!");
			}
		});
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnExcluir.setBounds(222, 84, 91, 43);
		getContentPane().add(btnExcluir);

		JLabel lblObsProdutosJ = new JLabel("Obs: Produtos já vendidos não podem ser excluídos");
		lblObsProdutosJ.setFont(new Font("Verdana", Font.ITALIC, 10));
		lblObsProdutosJ.setBounds(10, 171, 303, 27);
		getContentPane().add(lblObsProdutosJ);

	}
}
