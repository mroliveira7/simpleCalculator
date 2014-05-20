
/*Classe criada para fluxo de operaçãoes da calculadora e controle das operações*/
package br.simplecalculator;

public class Calculadora {

	private float displayAtual;
	private float displayAnterior;
	private String stringDisplay = "";

	//Método que realiza e controla o fluco das operações
	public void realizaOperacoes(char Simbolo)
	{
		if (Simbolo == '+')
		{
			this.displayAtual = this.displayAnterior + this.displayAtual;
			this.stringDisplay = String.valueOf(displayAtual);
		}
		if (Simbolo == '-')
		{
			this.displayAtual = this.displayAnterior - this.displayAtual;
			this.stringDisplay = String.valueOf(displayAtual);
		}
		if (Simbolo == 'X')
		{
			this.displayAtual = this.displayAnterior * this.displayAtual;
			this.stringDisplay = String.valueOf(displayAtual);
		}
		if (Simbolo == '/')
		{
			this.displayAtual = this.displayAnterior/this.displayAtual;
			this.stringDisplay = String.valueOf(displayAtual);
		}
	}
	
	//Método que adiciona os números no display e o converte para float para
	//realização de operações
	public void entraValorDisplay(char simbolo)
	{
		if (this.stringDisplay.startsWith("0"))
		{
			this.stringDisplay = "" + simbolo;
			this.displayAtual = Float.parseFloat(this.stringDisplay);
		}
		else
		{
			this.stringDisplay = this.stringDisplay + simbolo;
			this.displayAtual = Float.parseFloat(this.stringDisplay);
		}
	}
	
	
	//Getters e Setters para melhor controle dos valores e melhor entendimento do 
	//algoritmo
	public float getDisplayAtual() {
		return displayAtual;
	}

	public String getStringDisplay() {
		return stringDisplay;
	}

	public void setStringDisplay(String stringDisplay) {
		this.stringDisplay = stringDisplay;
	}

	public void setDisplayAtual(float displayAtual) {
		this.displayAtual = displayAtual;
	}

	public float getDisplayAnterior() {
		return displayAnterior;
	}

	public void setDisplayAnterior(float displayAnterior) {
		this.displayAnterior = displayAnterior;
	}
}
