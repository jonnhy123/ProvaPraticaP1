package br.univel.jhonatan;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelPessoaBase extends JPanel {
	protected JTextField txtId;
	protected JTextField txtNome;
	protected JTextField txtIdade;
	protected JTextField txtTelefone;
	protected JTable table;
	protected JButton btnNovo;
	protected JButton btnSalvar;
	protected JButton btnListarTodos;
	protected JButton btnExcluirTodos;
	protected JButton btnExcluirItem;
	protected JButton btnImprimir;
	protected JButton btnExportar;
	protected JButton btnSpeed;

	/**
	 * Create the panel.
	 */
	public PainelPessoaBase() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblId = new JLabel("ID:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		panel.add(lblId, gbc_lblId);
		
		txtId = new JTextField();
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.anchor = GridBagConstraints.WEST;
		gbc_txtId.insets = new Insets(0, 0, 5, 0);
		gbc_txtId.gridx = 1;
		gbc_txtId.gridy = 0;
		panel.add(txtId, gbc_txtId);
		txtId.setColumns(5);
		
		JLabel lblNome = new JLabel("Nome:");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		panel.add(lblNome, gbc_lblNome);
		
		txtNome = new JTextField();
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.anchor = GridBagConstraints.NORTH;
		gbc_txtNome.insets = new Insets(0, 0, 5, 0);
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.gridx = 1;
		gbc_txtNome.gridy = 1;
		panel.add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		GridBagConstraints gbc_lblIdade = new GridBagConstraints();
		gbc_lblIdade.anchor = GridBagConstraints.EAST;
		gbc_lblIdade.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdade.gridx = 0;
		gbc_lblIdade.gridy = 2;
		panel.add(lblIdade, gbc_lblIdade);
		
		txtIdade = new JTextField();
		GridBagConstraints gbc_txtIdade = new GridBagConstraints();
		gbc_txtIdade.anchor = GridBagConstraints.WEST;
		gbc_txtIdade.insets = new Insets(0, 0, 5, 0);
		gbc_txtIdade.gridx = 1;
		gbc_txtIdade.gridy = 2;
		panel.add(txtIdade, gbc_txtIdade);
		txtIdade.setColumns(5);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		GridBagConstraints gbc_lblTelefone = new GridBagConstraints();
		gbc_lblTelefone.anchor = GridBagConstraints.EAST;
		gbc_lblTelefone.insets = new Insets(0, 0, 0, 5);
		gbc_lblTelefone.gridx = 0;
		gbc_lblTelefone.gridy = 3;
		panel.add(lblTelefone, gbc_lblTelefone);
		
		txtTelefone = new JTextField();
		GridBagConstraints gbc_txtTelefone = new GridBagConstraints();
		gbc_txtTelefone.anchor = GridBagConstraints.WEST;
		gbc_txtTelefone.gridx = 1;
		gbc_txtTelefone.gridy = 3;
		panel.add(txtTelefone, gbc_txtTelefone);
		txtTelefone.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		btnNovo = new JButton("Novo");
		GridBagConstraints gbc_btnNovo = new GridBagConstraints();
		gbc_btnNovo.insets = new Insets(0, 0, 5, 5);
		gbc_btnNovo.gridx = 0;
		gbc_btnNovo.gridy = 0;
		panel_1.add(btnNovo, gbc_btnNovo);
		
		btnSalvar = new JButton("Salvar");
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.insets = new Insets(0, 0, 5, 5);
		gbc_btnSalvar.gridx = 1;
		gbc_btnSalvar.gridy = 0;
		panel_1.add(btnSalvar, gbc_btnSalvar);
		
		btnListarTodos = new JButton("Listar Todos");
		GridBagConstraints gbc_btnListarTodos = new GridBagConstraints();
		gbc_btnListarTodos.insets = new Insets(0, 0, 5, 5);
		gbc_btnListarTodos.gridx = 2;
		gbc_btnListarTodos.gridy = 0;
		panel_1.add(btnListarTodos, gbc_btnListarTodos);
		
		btnExcluirTodos = new JButton("Excluir Todos");
		GridBagConstraints gbc_btnExcluirTodos = new GridBagConstraints();
		gbc_btnExcluirTodos.insets = new Insets(0, 0, 5, 5);
		gbc_btnExcluirTodos.gridx = 3;
		gbc_btnExcluirTodos.gridy = 0;
		panel_1.add(btnExcluirTodos, gbc_btnExcluirTodos);
		
		btnExcluirItem = new JButton("Excluir Item");
		GridBagConstraints gbc_btnExcluirItem = new GridBagConstraints();
		gbc_btnExcluirItem.insets = new Insets(0, 0, 5, 0);
		gbc_btnExcluirItem.gridx = 4;
		gbc_btnExcluirItem.gridy = 0;
		panel_1.add(btnExcluirItem, gbc_btnExcluirItem);
		
		btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnImprimir = new GridBagConstraints();
		gbc_btnImprimir.insets = new Insets(0, 0, 0, 5);
		gbc_btnImprimir.gridx = 0;
		gbc_btnImprimir.gridy = 1;
		panel_1.add(btnImprimir, gbc_btnImprimir);
		
		btnExportar = new JButton("Exportar");
		GridBagConstraints gbc_btnExportar = new GridBagConstraints();
		gbc_btnExportar.insets = new Insets(0, 0, 0, 5);
		gbc_btnExportar.gridx = 1;
		gbc_btnExportar.gridy = 1;
		panel_1.add(btnExportar, gbc_btnExportar);
		
		btnSpeed = new JButton("Speed");
		GridBagConstraints gbc_btnSpeed = new GridBagConstraints();
		gbc_btnSpeed.insets = new Insets(0, 0, 0, 5);
		gbc_btnSpeed.gridx = 2;
		gbc_btnSpeed.gridy = 1;
		panel_1.add(btnSpeed, gbc_btnSpeed);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 2;
		add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel_2.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}

}
