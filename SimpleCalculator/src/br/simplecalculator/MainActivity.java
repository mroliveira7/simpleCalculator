package br.simplecalculator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
         }
    }
	
	final Calculadora calculadora = new Calculadora();
	public char Operacao;
    
	public void clicar1(View view){		
		
		calculadora.entraValorDisplay('1');
		atualizaDisplay();
	}
	public void clicar2(View view){
		
		calculadora.entraValorDisplay('2');
		atualizaDisplay();
	}
	public void clicar3(View view){
		
		calculadora.entraValorDisplay('3');
		atualizaDisplay();
	}
	public void clicar4(View view){
		
		calculadora.entraValorDisplay('4');
		atualizaDisplay();
	}
	public void clicar5(View view){
		
		calculadora.entraValorDisplay('5');
		atualizaDisplay();
	}
	public void clicar6(View view){
		
		calculadora.entraValorDisplay('6');
		atualizaDisplay();
	}
	public void clicar7(View view)
	{
		calculadora.entraValorDisplay('7');
		atualizaDisplay();
	}
	public void clicar8(View view)
		{
			calculadora.entraValorDisplay('8');
			atualizaDisplay();
		}
	public void clicar9(View view)
	{
		calculadora.entraValorDisplay('9');
		atualizaDisplay();
	}
	public void clicar0(View view)
	{
		calculadora.entraValorDisplay('0');
		atualizaDisplay();
	}
	public void clicarponto(View view)
	{
		if(!(calculadora.getStringDisplay().contains("."))){
			calculadora.entraValorDisplay('.');
			atualizaDisplay();
		}
	}
	public void clicarSoma(View view)
	{
		calculadora.setDisplayAnterior(calculadora.getDisplayAtual());
		calculadora.setDisplayAtual(0);
		calculadora.setStringDisplay("0");
		Operacao = '+';
		atualizaDisplay();
	}
	public void clicarSub(View view)
	{
		calculadora.setDisplayAnterior(calculadora.getDisplayAtual());
		calculadora.setDisplayAtual(0);
		calculadora.setStringDisplay("0");
		Operacao = '-';
		atualizaDisplay();
	}
	public void clicarDiv(View view)
	{
		calculadora.setDisplayAnterior(calculadora.getDisplayAtual());
		calculadora.setDisplayAtual(0);
		calculadora.setStringDisplay("0");
		Operacao = '/';
		atualizaDisplay();
	}
	public void clicarMul(View view)
	{
		calculadora.setDisplayAnterior(calculadora.getDisplayAtual());
		calculadora.setDisplayAtual(0);
		calculadora.setStringDisplay("0");
		Operacao = 'X';
		atualizaDisplay();
	}
	public void clicarIgual(View view)
	{
		calculadora.realizaOperacoes(Operacao);
		atualizaDisplay();
	}
	public void atualizaDisplay()
    {
    	 TextView tv = (TextView)findViewById(R.id.display);
    	 tv.setText(calculadora.getStringDisplay());
    	 
    }
	
	public void imprime(View view){
		Log.i("TAG", calculadora.getStringDisplay());
	}

    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
