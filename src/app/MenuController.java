//DIREITOS RESERVADOS PARA PATRICK HUBNER

package app;

import java.io.IOException;

import javax.swing.JOptionPane;

public class MenuController {
		private int op; //VARIAVEL DO TIPO INTEIRO

		public void rodaMenu(){
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog("Você possui um curriculo?\n" + "1 - SIM\n" + "2 - NAO\n" + "0 - SAIR\n"));
			switch(op) {
			
			case 1: 
				Links l1 = new Links(); //INSTANCIANDO A CLASSE QUE CONTEM LINKS DE HACKATON
				l1.showLinks(); // CHAMANDO O METODO QUE MOSTRA E ABRE LINKS NO NAVEGADOR
				break;
			
			case 2: 
				Person p2 = new Person(); // INSTANCIANDO A CLASSE PERSON PARA CADASTRO DE CURRICULO
				int confirm; // CRIANDO UMA VARIAVEL DE CONFIRMAÇÃO DE CADASTRO
				confirm = JOptionPane.showConfirmDialog(null, "Você deseja criar um curriculo? ", null, JOptionPane.YES_NO_OPTION);
				if(confirm == 0) { // 0 = SIM, 1 = NÃO
					p2.Cadastro();
				try {
					p2.showCadastro();//CHAMANDO O METODO QUE MOSTRA O CADASTRO E CRIA UM ARQUIVO NO SISTEMA PARA GUARDAR AS INFORMAÇÕES
				} catch (IOException e) {
					e.printStackTrace(); // CASO NÃO CONSIGA APRESENTAR UM ERRO
				}
				}
				break;
			
			case 0:
				cancel();//CHAMANDO METODO DE CANCELAMENTO CASO O USUARIO NÃO QUEIRA SAIR DO SISTEMA
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida!!!", null, JOptionPane.ERROR_MESSAGE);//APRESENTA DIALOGO DE ERRO CASO COLOQUE UMA OPÇÃO INVALIDA
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
				rodaMenu();//CASO NÃO QUEIRA SAIR DO SISTEMA, RECOMEÇA-LO.
			}
		}
		
		
		
		}

