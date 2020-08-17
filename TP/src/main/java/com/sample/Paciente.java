package com.sample;

import java.util.ArrayList;

public class  Paciente{
	private String nome;
	
	//Inclusao
	private int idade; //Idade >= 18
	private int OMS; //Indicador de desempenho da Organiza��o Mundial da Sa�de (OMS) de 0 ou 1
	private boolean siewert; //Diagn�stico de carcinoma espinocelular, carcinoma indiferenciado ou adenocarcinoma da jun��o esof�gica ou es�fago-g�strica (Siewert I e II);
	private boolean doenca_ressecavel; //Doen�a cl�nica em est�gio II ou III, de acordo com a classifica��o do American Joint Committee on Cancer Staging, 7� edi��o, doen�a ressec�vel;
	private int borda_sup; //Borda superior do tumor pelo menos 3 cm abaixo do esf�ncter superior do es�fago;
	private boolean consentimento; //Consentimento = True
	
	//Exclusao
	private boolean gravida_lactante; //False
	private boolean radioterapia; //False
	private Sangue sangue;
	private boolean infecao_ativa; //False
	
	//Exames Adicionais
	private boolean broncoscopia; //efetuar uma broncoscopia, na fase de rastreio, caso o tumor esteja relacionado com a �rvore respirat�ria
	private boolean endoscopia; //efetuar uma endoscopia 6 semanas ap�s o in�cio do tratamento, caso sejam detetada	les�es endosc�picas
	private boolean estomago; //Caso o est�mago seja inclu�do no volume de tratamento, os pacientes ter�o que fazer jejum durante 6 horas antes do tratamento.
		
	//Interface
	private boolean aprovado;
	private ArrayList<String> notas;
	
	public Paciente(String nome, int idade, int OMS, boolean siewert, boolean doenca_ressecavel, int borda_sup,
			boolean consentimento, boolean gravida_lactante, boolean radioterapia, Sangue sangue, boolean infecao_ativa,
			boolean broncoscopia, boolean endoscopia, boolean estomago) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.OMS = OMS;
		this.siewert = siewert;
		this.doenca_ressecavel = doenca_ressecavel;
		this.borda_sup = borda_sup;
		this.consentimento = consentimento;
		this.gravida_lactante = gravida_lactante;
		this.radioterapia = radioterapia;
		this.sangue = sangue;
		this.infecao_ativa = infecao_ativa;
		this.broncoscopia = broncoscopia;
		this.endoscopia = endoscopia;
		this.estomago = estomago;
		notas = new ArrayList();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getOMS() {
		return OMS;
	}


	public void setOMS(int oMS) {
		OMS = oMS;
	}


	public boolean isSiewert() {
		return siewert;
	}


	public void setSiewert(boolean siewert) {
		this.siewert = siewert;
	}


	public boolean isDoenca_ressecavel() {
		return doenca_ressecavel;
	}


	public void setDoenca_ressecavel(boolean doenca_ressecavel) {
		this.doenca_ressecavel = doenca_ressecavel;
	}


	public int getBorda_sup() {
		return borda_sup;
	}


	public void setBorda_sup(int borda_sup) {
		this.borda_sup = borda_sup;
	}


	public boolean isConsentimento() {
		return consentimento;
	}


	public void setConsentimento(boolean consentimento) {
		this.consentimento = consentimento;
	}


	public boolean isGravida_lactante() {
		return gravida_lactante;
	}


	public void setGravida_lactante(boolean gravida_lactante) {
		this.gravida_lactante = gravida_lactante;
	}


	public boolean isRadioterapia() {
		return radioterapia;
	}


	public void setRadioterapia(boolean radioterapia) {
		this.radioterapia = radioterapia;
	}


	public Sangue getSangue() {
		return sangue;
	}


	public void setSangue(Sangue sangue) {
		this.sangue = sangue;
	}


	public boolean isInfecao_ativa() {
		return infecao_ativa;
	}


	public void setInfecao_ativa(boolean infecao_ativa) {
		this.infecao_ativa = infecao_ativa;
	}


	public boolean isBroncoscopia() {
		return broncoscopia;
	}


	public void setBroncoscopia(boolean broncoscopia) {
		this.broncoscopia = broncoscopia;
	}


	public boolean isEndoscopia() {
		return endoscopia;
	}


	public void setEndoscopia(boolean endoscopia) {
		this.endoscopia = endoscopia;
	}


	public boolean isEstomago() {
		return estomago;
	}


	public void setEstomago(boolean estomago) {
		this.estomago = estomago;
	}

	public void addNota(String nota) {
		notas.add(nota);
	}


	public ArrayList<String> getNotas() {
		return notas;
	}


	public void setNotas(ArrayList<String> notas) {
		this.notas = notas;
	}


	public boolean isAprovado() {
		return aprovado;
	}


	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
	
	
}
