package app;


import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.net.URI;


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
	public String urlHackaton;


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

	public String getUrlHackaton() {
		return urlHackaton;
	}
	public void setUrlHackaton(String urlHackaton) {
		this.urlHackaton = urlHackaton;
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
	
	public void showLinks() {
		int choseeLinks;
		choseeLinks = Integer.parseInt(JOptionPane.showInputDialog(null, "Links de Hackaton:\n" + "1 - https://chain.link/hackathon\n" + "2 - https://hackcovid-19.devpost.com/"));
		switch(choseeLinks) {
		case 1:
			try {
				URI link = new URI("https://chain.link/hackathon");
				Desktop.getDesktop().browse(link);
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "ERRO AO ABRI NAVEGADOR");
			}
			
		case 2:
			try {
				URI link2 = new URI("https://hackcovid-19.devpost.com/");
				Desktop.getDesktop().browse(link2);
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "ERRO AO ABRI NAVEGADOR");
			}
		
		default:
			JOptionPane.showMessageDialog(null, "Em breve novas melhorias!");
		}
		
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

