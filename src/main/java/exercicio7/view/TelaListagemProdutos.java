package exercicio7.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.github.lgooddatepicker.components.DatePicker;

import exercicio7.controller.ProdutoController;
import exercicio7.model.seletor.ProdutoSeletor;
import exercicio7.model.vo.Produto;

public class TelaListagemProdutos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private static final String COR_AZUL = "Azul";
	private static final String COR_AMARELO = "Amarelo";
	private static final String COR_PRETO = "Preto";
	private static final String COR_VERDE = "Verde";
	private static final String COR_VERMELHO = "Vermelho";

	private JPanel contentPane;
	private JTable table;
	private JTable tblProdutos;
	private JButton btnGerarXls;
	private JButton btnGerarPdf;
	private JComboBox<String> cbCor;
	private DatePicker dtInicioCadastro;
	private DatePicker dtFimCadastro;
	private int paginaAtual = 1;
	private int limitePag = 1;
	private JButton btnProximo;
	private JButton btnAnterior;

	// Esta lista de produtos � atualizada a cada nova consulta realizada com os
	// filtros.
	// Ser� a lista usada para gerar os relat�rios
	private List<Produto> produtosConsultados;
	private JTextField txtNome;
	private JTextField txtPeso;
	private JLabel lblPaginaAtual;
	private JLabel lblLimitePag;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListagemProdutos frame = new TelaListagemProdutos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @param cbCor
	 */
	public TelaListagemProdutos() {
		setTitle("Consulta de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnConsultar = new JButton("Consultar");

		btnConsultar.setBounds(160, 215, 150, 40);
		contentPane.add(btnConsultar);

		String[] cores = { "---Selecione---", TelaListagemProdutos.COR_AZUL, TelaListagemProdutos.COR_AMARELO,
				TelaListagemProdutos.COR_PRETO, TelaListagemProdutos.COR_VERDE, TelaListagemProdutos.COR_VERMELHO };

		JLabel lblFiltroNome = new JLabel("Nome:");
		lblFiltroNome.setBounds(10, 40, 50, 15);
		contentPane.add(lblFiltroNome);

		JSeparator separator = new JSeparator();
		separator.setBounds(20, 56, 404, -1);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 205, 462, 14);
		contentPane.add(separator_1);

		JLabel lblFiltrosDeConsulta = new JLabel("Filtros de consulta:");
		lblFiltrosDeConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		lblFiltrosDeConsulta.setBounds(10, 11, 448, 14);
		contentPane.add(lblFiltrosDeConsulta);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 194, 345, -100);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setBounds(30, 225, 246, -119);
		contentPane.add(table);

		tblProdutos = new JTable();
		tblProdutos.setModel(new DefaultTableModel(new String[][] { { "#", "Nome", "Marca", "Peso", "Dt. Cadastro" }, },
				new String[] { "#", "Nome", "Marca", "Peso", "Dt. Cadastro" }));
		tblProdutos.setBounds(10, 266, 462, 174);
		contentPane.add(tblProdutos);

		JLabel lblFiltroCor = new JLabel("Cor:");
		lblFiltroCor.setBounds(255, 40, 46, 14);
		contentPane.add(lblFiltroCor);

		cbCor = new JComboBox<String>(cores);
		cbCor.setBounds(300, 37, 160, 30);

		contentPane.add(cbCor);

		btnGerarXls = new JButton("Gerar XLS");
		btnGerarXls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		btnGerarXls.setBounds(100, 404, 117, 29);
		contentPane.add(btnGerarXls);

		btnGerarPdf = new JButton("Gerar PDF");
		btnGerarPdf.setBounds(248, 404, 117, 29);
		contentPane.add(btnGerarPdf);

		btnGerarXls.setEnabled(false);
		btnGerarPdf.setEnabled(false);

		JLabel lblPeriodoCadastro = new JLabel("Período de cadastro");
		lblPeriodoCadastro.setBounds(10, 110, 170, 20);
		contentPane.add(lblPeriodoCadastro);

		dtInicioCadastro = new DatePicker();
		dtInicioCadastro.setBounds(80, 130, 378, 30);
		contentPane.add(dtInicioCadastro);

		JLabel lblDataInicioCadastro = new JLabel("De:");
		lblDataInicioCadastro.setBounds(10, 140, 61, 16);
		contentPane.add(lblDataInicioCadastro);

		JLabel lblDataFimCadastro = new JLabel("Até:");
		lblDataFimCadastro.setBounds(10, 170, 61, 16);
		contentPane.add(lblDataFimCadastro);

		dtFimCadastro = new DatePicker();
		dtFimCadastro.setBounds(80, 170, 378, 30);
		contentPane.add(dtFimCadastro);

		txtNome = new JTextField();
		txtNome.setBounds(80, 35, 160, 30);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(10, 70, 61, 16);
		contentPane.add(lblPeso);

		txtPeso = new JTextField();
		txtPeso.setBounds(80, 67, 160, 30);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		btnProximo = new JButton("Próximo >");
		btnAnterior = new JButton(" < Anterior");

		btnAnterior.setEnabled(false);
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (paginaAtual > 1) {
					paginaAtual--;
				}
				consultarProdutos();

				if (paginaAtual == 1) {
					btnAnterior.setEnabled(false);
				}

				if (paginaAtual != limitePag) {
					btnProximo.setEnabled(true);
				}
			}
		});
		btnAnterior.setBounds(80, 457, 110, 23);
		contentPane.add(btnAnterior);

		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paginaAtual++;
				consultarProdutos();
				btnAnterior.setEnabled(true);
				if (paginaAtual == limitePag) {
					btnProximo.setEnabled(false);
				}
			}
		});
		btnProximo.setBounds(258, 457, 107, 23);
		contentPane.add(btnProximo);

		lblPaginaAtual = new JLabel("");
		lblPaginaAtual.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaginaAtual.setBounds(190, 461, 27, 14);
		lblPaginaAtual.setText(paginaAtual + "");
		contentPane.add(lblPaginaAtual);

		JLabel lblBarra = new JLabel("/");
		lblBarra.setHorizontalAlignment(SwingConstants.CENTER);
		lblBarra.setBounds(213, 461, 27, 14);
		contentPane.add(lblBarra);

		lblLimitePag = new JLabel("");
		lblLimitePag.setHorizontalAlignment(SwingConstants.CENTER);
		lblLimitePag.setBounds(227, 461, 27, 14);
		contentPane.add(lblLimitePag);

		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				consultarProdutos();
			}
		});
	}

	protected void consultarProdutos() {
		lblPaginaAtual.setText(paginaAtual + "");

		ProdutoController controlador = new ProdutoController();
		ProdutoSeletor seletor = new ProdutoSeletor();

		List<Produto> listaProdutos = controlador.listarProdutos(seletor);

		seletor.setLimite(2);

		int q = listaProdutos.size() / seletor.getLimite();
		int r = listaProdutos.size() % seletor.getLimite();

		if (r == 0) {
			limitePag = q;
		} else {
			limitePag = q + 1;
		}

		lblLimitePag.setText(limitePag + "");

		seletor.setPagina(paginaAtual);

		if (cbCor.getSelectedIndex() > 0) {
			seletor.setCorProduto(cbCor.getSelectedItem().toString());
		}

		seletor.setNomeProduto(txtNome.getText());

		if (txtPeso.getText() != null && !txtPeso.getText().isEmpty()) {
			seletor.setPesoProduto(Double.parseDouble(txtPeso.getText()));
		} else {
			seletor.setPesoProduto(-1.0);
		}

		seletor.setDataInicioCadastro(dtInicioCadastro.getDate());
		seletor.setDataFimCadastro(dtFimCadastro.getDate());

		listaProdutos = controlador.listarProdutos(seletor);
		atualizarTabelaProdutos(listaProdutos);

	}

	protected void atualizarTabelaProdutos(List<Produto> produtos) {
		produtosConsultados = produtos;

		tblProdutos.setModel(new DefaultTableModel(new String[][] { { "#", "Nome", "Marca", "Peso", "Dt. Cadastro" }, },
				new String[] { "#", "Nome", "Marca", "Peso", "Dt. Cadastro" }));

		DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();

		for (Produto produto : produtos) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String dataFormatada = produto.getDataCadastro().format(formatter);

			String[] novaLinha = new String[] { produto.getId() + "", produto.getNome(), produto.getFabricante(),
					produto.getPeso() + "", dataFormatada };
			modelo.addRow(novaLinha);
		}

	}
}
