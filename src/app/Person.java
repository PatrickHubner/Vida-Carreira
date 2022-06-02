package app;

import java.util.Scanner;

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
    Scanner sc;

    public Person() {
        this.sc = new Scanner(System.in);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEndereço() {
        return this.endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public Double getCelular() {
        return this.celular;
    }

    public void setCelular(Double celular) {
        this.celular = celular;
    }

    public String getObjetivo() {
        return this.objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getFormacaoAcademica() {
        return this.formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getCursos() {
        return this.cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public String getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getIdiomas() {
        return this.idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getInformacoesComp() {
        return this.informacoesComp;
    }

    public void setInformacoesComp(String informacoesComp) {
        this.informacoesComp = informacoesComp;
    }

    public void Cadastro() {
        System.out.println("Por gentileza me informe seu nome: ");
        this.setNome(this.sc.nextLine());
        System.out.println("Por gentileza me informe o seu endereço: ");
        this.setEndereço(this.sc.nextLine());
        System.out.println("Por gentileza me informe seu numero de celular sem traços (00000000000): ");
        this.setCelular(this.sc.nextDouble());
        System.out.println("Por gentileza me informe sua data de nascimento(00/00/0000): ");
        this.setDataDeNascimento(this.sc.nextLine());
        System.out.println("Por gentileza me informe seu objetivo com a empresa que futuramente vai trabalhar: ");
        this.setObjetivo(this.sc.nextLine());
        System.out.println("Por gentileza me informe sua formação academica: ");
        System.out.println("Apenas a sua ultima formacao academica!!!");
        this.setFormacaoAcademica(this.sc.nextLine());
        System.out.println("Por gentileza me informe seus cursos complementares");
        this.setCursos(this.sc.nextLine());
        System.out.println("Por gentileza me informe suas experiencias profissionais: ");
        this.setExperiencia(this.sc.nextLine());
        System.out.println("Por gentileza me informe seus idiomas, caso haja mais de um favor digitar com virgula: ");
        this.setIdiomas(this.sc.nextLine());
        System.out.println("Digite suas informações complementares: ");
        this.setInformacoesComp(this.sc.nextLine());
    }
}
