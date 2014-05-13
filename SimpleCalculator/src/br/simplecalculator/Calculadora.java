package br.simplecalculator;

public class Calculadora {

	private float displayAtual;
	private float displayAnterior;

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
	
	public void entraValorDisplay()
	{
		
	}
	
	public float getDisplayAtual() {
		return displayAtual;
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
