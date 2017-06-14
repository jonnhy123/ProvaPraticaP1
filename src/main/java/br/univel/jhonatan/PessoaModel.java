package br.univel.jhonatan;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class PessoaModel extends AbstractTableModel{

	List<Pessoa> lista;
	
	public PessoaModel() {
		this(null);
	}
	
	public PessoaModel(List<Pessoa> _lista) {
		if (_lista == null) {
			this.lista = new ArrayList<Pessoa>();
		}else{
			this.lista = _lista;
		}
	}
	
	public int getColumnCount() {
		return 4;
	}

	public int getRowCount() {
		return lista.size();
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "ID";
		case 1:
			return "Idade";
		case 2:
			return "Nome";
		case 3:
			return "Telefone";
		}
		return super.getColumnName(column);
	}

	public Object getValueAt(int linha, int coluna) {
		
		Pessoa p = lista.get(linha);
		
		switch (coluna) {
		case 0:
			return p.getId();
		case 1:
			return p.getIdade();
		case 2:
			return p.getNome();
		case 3:
			return p.getTelefone();
		}
		
		return "Hellow";
	}

}
