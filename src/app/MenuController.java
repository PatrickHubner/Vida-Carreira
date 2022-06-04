package app;

import javax.swing.JOptionPane;

public class MenuController {
		private int op;

		public void rodaMenu() {
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog("Você possui um curriculo?\n" + "1 - SIM\n" + "2 - NAO\n" + "0 - SAIR\n"));
			switch(op) {
			
			case 1: 
				Person p1 = new Person();
				p1.showLinks();
				break;
			
			case 2: 
				Person p2 = new Person();//instanciando a classe Person para criar um curriculo
				p2.Cadastro();//chamando o metodo cadastro da classe person
				break;
			
			case 0:
				cancel();
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida!!!", null, JOptionPane.ERROR_MESSAGE);
				break;
				
			}
		} while(op!=0);
		}

		public void cancel() {
			int confirm;
			confirm = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", null, JOptionPane.YES_NO_OPTION);
			if(confirm == 0) {
		    JOptionPane.showMessageDialog(null, "Programa encerrado!");
			}else {
				rodaMenu();
			}
		}
		
		
		
		}

