package app;

import java.awt.Desktop;
import java.net.URI;

import javax.swing.JOptionPane;

public class Links {
	
	
	
	public void showLinks() {
		int choseeLinks; //VARIAVEL PARA MUDAR LINKS PRE-DEFINIDOS
		choseeLinks = Integer.parseInt(JOptionPane.showInputDialog(null, "Links de Hackaton:\n" + "1 - https://chain.link/hackathon\n" + "2 - https://hackcovid-19.devpost.com/"));
		switch(choseeLinks) {
		case 1: // CODIGO PARA ABRIR O LINK DIRETAMENTE NO NAVEGADOR UTILIZANDO BIBLIOTECAS AWT, NET
			try {
				URI link = new URI("https://chain.link/hackathon");
				Desktop.getDesktop().browse(link);
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "ERRO AO ABRIR NAVEGADOR");
			}
			
		case 2:
			try {
				URI link2 = new URI("https://hackcovid-19.devpost.com/");
				Desktop.getDesktop().browse(link2);
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "ERRO AO ABRIR NAVEGADOR");
			}
		
		default:
			JOptionPane.showMessageDialog(null, "Em breve novas melhorias!");
		}
		
	}
}
