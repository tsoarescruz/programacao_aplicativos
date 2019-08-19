package com.example.consumoelet;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class ConsumoEletActivity extends Activity {

	RadioButton radioampla;
	RadioButton radioligth;
	EditText edttensao;
	EditText edttempuso;
	EditText edtpotencia;
	
	EditText  edtquantpotencia;
	EditText  edtquantcusto;
	EditText  edtquantdisjuntor;
	EditText  edtquantcorrente;
	EditText  edtquantconsumo;

	Button buttoncalcular;

	;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_consumo_elet);
	
		edttensao = (EditText) findViewById(R.id.edttensao);
		edttempuso = (EditText) findViewById(R.id.edttempuso);
		edtpotencia = (EditText) findViewById(R.id.edtpotencia);
		edtquantpotencia = (EditText) findViewById(R.id.edtquantpotencia);
		edtquantcusto = (EditText) findViewById(R.id.edtquantcusto);
		edtquantdisjuntor = (EditText) findViewById(R.id.edtquantdisjuntor);
		edtquantcorrente = (EditText) findViewById(R.id.edtquantcorrente);
		edtquantconsumo = (EditText) findViewById(R.id.edtquantconsumo);
		radioligth = (RadioButton) findViewById(R.id.radioligth);
		radioampla = (RadioButton) findViewById(R.id.radioampla);
		buttoncalcular=(Button) findViewById(R.id.buttoncalcular);

		buttoncalcular.setOnClickListener(new OnClickListener(){
			public void onClick (View arg0){				
				
				//
				
		        int qtd, i, conces;
		        String conces_str;
		        double potencia, tempo, Eel, custo, tensao, valconces, amperes;

		        potencia = 0;
		        tempo = 0;
		        custo=0;
		      
		        potencia = Double.parseDouble(edtpotencia.getText().toString());
		        tempo = Double.parseDouble(edttempuso.getText().toString());
		        tensao = Double.parseDouble(edttensao.getText().toString());

		        tempo = tempo/60;
		        potencia = (potencia)*(0.001);
		        Eel = potencia * tempo;
		        
		        if (radioligth.isChecked()){
		             conces_str = "Ligth";
		             valconces  = 0.30;
		             custo = Eel*valconces;
		        }else{
		        		conces_str = "Ampla";
		        		valconces = 0.50;
		        		custo = Eel*valconces;
		        }

		        amperes = potencia/tensao;
		        
		        edtquantpotencia.setText(String.valueOf(potencia));
		        edtquantcusto.setText(String.valueOf(custo*30)); 
		        edtquantconsumo.setText(String.valueOf(custo));
		        edtquantcorrente.setText(String.valueOf(amperes));
		        edtquantdisjuntor.setText(String.valueOf(amperes));
		        
		 				
				//
				
			}

			
		});
		
	}
		
}
