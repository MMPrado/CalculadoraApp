package mx.edu.utng.mmacias.calculadoraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View;
import android.widget.AdapterView;


public class MainActivity extends AppCompatActivity {
    EditText txtNum1;
    EditText txtNum2;
    EditText txtResultado;
    Spinner cmbTipoCalculadora;
    Button btnSumar;
    Button btnRestar;
    Button btnFactorial;
    Button btnLimpiar;

    int op; //calculadora seleccionoada
   Contexto contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacionar los controles con las vistas

        txtNum1 = (EditText) findViewById(R.id.txt_num1);
        txtNum2 = (EditText) findViewById(R.id.txt_num2);
        txtResultado = (EditText) findViewById(R.id.txt_Resultado);
        cmbTipoCalculadora = (Spinner) findViewById(R.id.cmb_tipoCalculadora);
        btnSumar = (Button) findViewById(R.id.btn_sumar);
        btnRestar = (Button) findViewById(R.id.btn_restar);
        btnFactorial = (Button) findViewById(R.id.btn_factorial);
        btnLimpiar = (Button) findViewById(R.id.btn_limpiar);

        cmbTipoCalculadora.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                op= adapterView.getSelectedItemPosition();
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        btnSumar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                double num1;
                double num2;
                double resultado;

                num1=Integer.parseInt(txtNum1.getText().toString());
                 num2=Integer.parseInt(txtNum2.getText().toString());

                resultado = num1+num2;

                txtResultado.setText(""+resultado);
            }
        });
        btnRestar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                double num1;
                double num2;
                double resultado;

                num1=Integer.parseInt(txtNum1.getText().toString());
                num2=Integer.parseInt(txtNum2.getText().toString());

                resultado = num1-num2;

                txtResultado.setText(""+resultado);
            }
        });
        btnSumar.setOnClickListener(new View.OnClickListener(){


            public void onClick(View v) {
                double num1;
                double num2;
                double resultado;

                num1=Integer.parseInt(txtNum1.getText().toString());
                num2=Integer.parseInt(txtNum2.getText().toString());

                resultado = num1*num2;

                txtResultado.setText(""+resultado);
            }
        });
    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        op= (int)cmbTipoCalculadora.getSelectedItemId();
        switch (op){
            case 1:
                contexto = new Contexto (new CalculadoraNormal());
                break;
            case 2:
                contexto = new Contexto(new CalculadoraCientifica());
                break;

        }
    }

    public void onNothingSelected(AdapterView<?> parent) {
        op= 1;
    }


public int factorial (int numero ){
    if (numero ==0) {
        return 1;

    }else{
        return numero*factorial(numero-1);
    }


}
}

