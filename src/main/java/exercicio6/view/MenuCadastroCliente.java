package exercicio6.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuCadastroCliente extends JInternalFrame {
	private JTextField textFieldNome;
	private JTextField textFieldCEP;
	private JTextField textFieldDtNasc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuCadastroCliente frame = new MenuCadastroCliente();
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
	public MenuCadastroCliente() {
		setBounds(100, 100, 244, 270);
		getContentPane().setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 54, 108, 23);
		getContentPane().add(lblNome);
		// TESTE
		textFieldNome = new JTextField();
		textFieldNome.setBounds(10, 79, 132, 20);
		getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(10, 110, 49, 14);
		getContentPane().add(lblCep);

		textFieldCEP = new JTextField();
		textFieldCEP.setBounds(10, 128, 96, 20);
		getContentPane().add(textFieldCEP);
		textFieldCEP.setColumns(10);

		JLabel lblDataNascimento = new JLabel("Data Nascimento:");
		lblDataNascimento.setBounds(10, 159, 96, 14);
		getContentPane().add(lblDataNascimento);

		textFieldDtNasc = new JTextField();
		textFieldDtNasc.setBounds(10, 180, 96, 20);
		getContentPane().add(textFieldDtNasc);
		textFieldDtNasc.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSalvar.setBounds(135, 207, 89, 23);
		getContentPane().add(btnSalvar);

		JLabel lblCadastroDeCliente = new JLabel("Cadastro de Cliente");
		lblCadastroDeCliente.setBounds(61, 11, 108, 14);
		getContentPane().add(lblCadastroDeCliente);

	}
}
