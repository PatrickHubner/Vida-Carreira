//DIREITOS RESERVADOS PARA PATRICK HUBNER.

package app;


import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Person {
	private String nome;
	private String dataDeNascimento;
	private String endereço;
	private Double celular;
	private String objetivo;
	private String formacaoAcademica;
	private String cursos;
	private String experiencia;
	private String idiomas;
	private String informacoesComp;


	
	
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public Double getCelular() {
		return celular;
	}
	public void setCelular(Double celular) {
		this.celular = celular;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}
	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}
	public String getCursos() {
		return cursos;
	}
	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public String getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	public String getInformacoesComp() {
		return informacoesComp;
	}
	public void setInformacoesComp(String informacoesComp) {
		this.informacoesComp = informacoesComp;
	}

	
	
	//Metodo para aparecer menu de opções na escolaridade;
	public void showEscolaridade() {
		String[] escolaridade = {"Ensino médio completo", "Ensino médio incompleto", "Ensino Superior incompleto", "Ensino superior completo", "Ensino Fundamental completo", "Ensino Fundamental incompleto"};
		String SelectEscolaridade = (String) JOptionPane.showInputDialog(null, "Por gentileza me informe sua formação academica: ", null, JOptionPane.QUESTION_MESSAGE, null, escolaridade,escolaridade[0]);
		setFormacaoAcademica(SelectEscolaridade);
	}
	
	//METODO PARA CADASTRAR INFORMAÇÕES DO USUARIO
	public void Cadastro() {
		setNome(JOptionPane.showInputDialog("Por gentileza me informe seu nome: "));
		setEndereço(JOptionPane.showInputDialog("Por gentileza me informe o seu endereço: "));
		setCelular(Double.parseDouble(JOptionPane.showInputDialog("Por gentileza me informe seu numero de celular sem traços (00000000000): ")));
		setDataDeNascimento(JOptionPane.showInputDialog("Por gentileza me informe sua data de nascimento(00/00/0000): "));
		setObjetivo(JOptionPane.showInputDialog("Por gentileza me informe seu objetivo com a empresa que futuramente vai trabalhar: "));
		JOptionPane.showMessageDialog(null, "Por gentileza me informe sua formação academica: ");
		showEscolaridade();// chamando o metodo de escolaridade
		setCursos(JOptionPane.showInputDialog("Por gentileza me informe seus cursos complementares"));
		setExperiencia(JOptionPane.showInputDialog("Por gentileza me informe suas experiencias profissionais: "));
		setIdiomas(JOptionPane.showInputDialog("Por gentileza me informe seus idiomas, caso haja mais de um favor digitar com virgula: "));
		setInformacoesComp(JOptionPane.showInputDialog("Digite suas informações complementares: "));
	}

	public void showDados() { //METODO A QUAL ME MOSTRA OS DADOS DIGITADOS PELO USUARIO EM FORMA DE LISTA NO SISTEMA
		JOptionPane.showMessageDialog(null, "nome = " + nome + "\n" + "dataDeNascimento = " + dataDeNascimento + "\n" + "Endereço = " + endereço
				+ "\n" + "Celular = " + celular + "\n" + "Objetivo = " +objetivo + "\n" + "FormacaoAcademica = " + formacaoAcademica
				+ "\n" + "Cursos = " + cursos + "\n" + "Experiencias = " + experiencia + "\n" + "Idiomas = " + idiomas + "\n" + "InformacoesComp = "
				+ informacoesComp);
	}
	
	public void CreateArq() throws IOException { // METODO PARA CRIAR UM ARQUIVO
		FileWriter arq = new FileWriter("C:\\Users\\workp\\Downloads\\Curriculum.txt");//DEFININDO DIRETORIO DO ARQUIVO
		PrintWriter gravarArq = new PrintWriter(arq);// INSTANCIANDO CLASSE DE CRIAÇÃO DE TEXTO
		gravarArq.printf("-----------------Curriculo 2022-------------------\n");
		gravarArq.println("nome = " + nome + "\n" + "dataDeNascimento = " + dataDeNascimento + "\n" + "Endereço = " + endereço
				+ "\n" + "Celular = " + celular + "\n" + "Objetivo = " + objetivo + "\n" + "FormacaoAcademica = " + formacaoAcademica
				+ "\n" + "Cursos = " + cursos + "\n" + "Experiencias = " +  experiencia + "\n" + "Idiomas = " + idiomas + "\n" + "InformacoesComp = "
				+ informacoesComp);
		gravarArq.printf("----------------------------------------------------");
		arq.close();//FECHANDO E SALVANDO ARQUIVO
		
		try {
			java.awt.Desktop.getDesktop().open( new File("C:\\\\Users\\\\workp\\\\Downloads\\\\Curriculum.txt")); // METODO QUE ABRE O ARQUIVO APÓS SALVA-LO
		}
		catch(IllegalArgumentException e1) {
			System.out.println(e1);// PRINTAR ERRO CASO NÃO CONSIGA ABRIR
		}
		
	}
	
	
	public void showCadastro() throws IOException{
		int confirm = JOptionPane.showConfirmDialog(null, "Deseja conferir as informaçoes digitadas?", null, JOptionPane.YES_NO_OPTION);
		if(confirm == 0) {
			showDados();//CHAMANDO METODO DE MOSTRAR DADOS EM LISTA
			CreateArq();//CRIANDO ARQUIVO
		} else {
			CreateArq();//APENAS CRIANDO ARQUIVO
		}
	}
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

