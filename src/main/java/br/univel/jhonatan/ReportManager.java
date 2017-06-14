package br.univel.jhonatan;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.util.Locale;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class ReportManager {
	private String file = "C:\\Users\\TEMP.UNIVEL.005\\JaspersoftWorkspace\\MyReports\\Blank_A4.jasper";
	
	public void exportar() {
		JasperPrint print = getPrint();
		String nomePdf = "teste.pdf";
		try {
			JasperExportManager.exportReportToPdfFile(print,nomePdf);
			Desktop.getDesktop().open(new File(nomePdf));
		} catch (JRException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private JasperPrint getPrint(){
		Connection con = Conexao.newInstance().getConecao();
		try {
			return JasperFillManager.fillReport(file, null, con);
		} catch (JRException e) {
			throw new RuntimeException(e);
		}
	}

	public void imprimir() {
		JasperPrint print = getPrint();
		Locale local = Locale.getDefault();
		JasperViewer.viewReport(print,false,local);
	}
	
}

