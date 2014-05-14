package br.simplecalculator;

public class Calculadora {

	private float displayAtual;
	private float displayAnterior;
	private String stringDisplay = "";

	public void realizaOperacoes(char Simbolo)
	{
		if (Simbolo == '+')
		{
			this.displayAnterior = this.displayAtual;
			this.displayAtual =+ this.displayAnterior;
		}
		if (Simbolo == '-')
		{
			this.displayAnterior = this.displayAtual;
			this.displayAtual =- this.displayAnterior;
		}
		if (Simbolo == 'X')
		{
			this.displayAnterior = this.displayAtual;
			this.displayAtual = this.displayAtual * this.displayAnterior;
		}
		if (Simbolo == '/')
		{
			this.displayAnterior = this.displayAtual;
			this.displayAtual = this.displayAnterior/this.displayAtual;
		}
	}
	
	public void entraValorDisplay(char simbolo)
	{
		this.stringDisplay = this.stringDisplay + simbolo;
		this.displayAtual = Float.parseFloat(this.stringDisplay);
	}
	
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
