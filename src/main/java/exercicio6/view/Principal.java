package exercicio6.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnClientes = new JMenu("Clientes");
		mnClientes.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-fila.png")));
		menuBar.add(mnClientes);

		JMenuItem mntmClientesCadastro = new JMenuItem("Cadastro");
		mntmClientesCadastro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.CTRL_MASK));
		mntmClientesCadastro.setIcon(
				new ImageIcon(Principal.class.getResource("/icones/icons8-adicionar-usu\u00E1rio-masculino.png")));
		mnClientes.add(mntmClientesCadastro);

		JMenuItem mntmListarClientes = new JMenuItem("Listar");
		mntmListarClientes.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.CTRL_MASK));
		mntmListarClientes
				.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-lista-com-marcadores.png")));
		mnClientes.add(mntmListarClientes);

		JMenuItem mntmRelatorios = new JMenuItem("Relat\u00F3rios");
		mntmRelatorios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, InputEvent.CTRL_MASK));
		mntmRelatorios.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-documento-regular.png")));
		mnClientes.add(mntmRelatorios);

		JMenu mnProdutos = new JMenu("Produtos");
		mnProdutos.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-comprar.png")));
		menuBar.add(mnProdutos);

		JMenuItem mntmListarProdutos = new JMenuItem("Listar");
		mntmListarProdutos
				.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-lista-com-marcadores.png")));
		mntmListarProdutos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.ALT_MASK));
		mnProdutos.add(mntmListarProdutos);

		JMenuItem mntmAlterar = new JMenuItem("Alterar");
		mntmAlterar.setIcon(new ImageIcon(
				Principal.class.getResource("/icones/icons8-\u00E0-esquerda-dentro-de-um-c\u00EDrculo.png")));
		mntmAlterar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.ALT_MASK));
		mnProdutos.add(mntmAlterar);

		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.setIcon(
				new ImageIcon(Principal.class.getResource("/icones/icons8-adicionar-usu\u00E1rio-masculino.png")));
		mntmExcluir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, InputEvent.ALT_MASK));
		mnProdutos.add(mntmExcluir);

		JMenu mnFuncionarios = new JMenu("Funcion\u00E1rios");
		mnFuncionarios.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-treinamento.png")));
		menuBar.add(mnFuncionarios);

		JMenu mnSobre = new JMenu("Sobre");
		mnSobre.setIcon(new ImageIcon(
				Principal.class.getResource("/icones/icons8-cart\u00E3o-de-cr\u00E9dito-sem-contato.png")));
		menuBar.add(mnSobre);

		JMenuItem mntmManual = new JMenuItem("Manual");
		mntmManual.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.SHIFT_MASK));
		mntmManual.setIcon(new ImageIcon(
				Principal.class.getResource("/icones/icons8-gerente-de-informa\u00E7\u00F5es-do-cliente.png")));
		mnSobre.add(mntmManual);

		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mntmAjuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.SHIFT_MASK));
		mntmAjuda.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-suporte-on-line-filled.png")));
		mnSobre.add(mntmAjuda);

		JMenuItem mntmAutores = new JMenuItem("Autores");
		mntmAutores.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, InputEvent.SHIFT_MASK));
		mntmAutores.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-\u0441harlie-\u0441haplin.png")));
		mnSobre.add(mntmAutores);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
