package exercicio6.view;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import net.miginfocom.swing.MigLayout;

public class MenuSobre extends JFrame {
	public static MenuSobre instance = null;

	/**
	 * Create the frame.
	 */
	public MenuSobre() {
		instance = this;

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("TELA SOBRE");
		setBounds(100, 100, 662, 300);
		getContentPane().setLayout(new MigLayout("", "[][grow]", "[grow][grow][][][]"));

		JLabel lblMessage = new JLabel("SEJA BEM-VINDO AO SISTEMA DO EXERCÍCIO 6!!");
		getContentPane().add(lblMessage, "cell 1 0");

		JButton btnAjudaClique = new JButton("Ajuda? Clique!");
		btnAjudaClique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mouseClickAjuda();
			}
		});
		getContentPane().add(btnAjudaClique, "cell 1 1");

	}

	private void mouseClickAjuda() {
		Desktop desk = java.awt.Desktop.getDesktop();
		try {
			desk.browse(new java.net.URI("http://www.google.com"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
