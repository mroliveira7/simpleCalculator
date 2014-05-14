package br.simplecalculator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
    	
        Button botao = (Button) findViewById(R.id.botao1);
    	botao.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
		//		calculadora.entraValorDisplay('1');
		//		atualizaDisplay();
			}
		});
    }
	
	final Calculadora calculadora = new Calculadora();
    
	public void atualizaDisplay()
    {
    	 TextView tv = (TextView)findViewById(R.id.display);
    	 tv.setText(calculadora.getStringDisplay());
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
