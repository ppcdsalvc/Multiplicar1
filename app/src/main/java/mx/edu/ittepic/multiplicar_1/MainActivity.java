package mx.edu.ittepic.multiplicar_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num;
    Button boton;
    TextView salida;
    int res,n1;
    String n,total,total2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = findViewById(R.id.edt1);
        boton = findViewById(R.id.button);
        salida = findViewById(R.id.txtres);
        total ="";
        total2="";

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=num.getText().toString();
                n1 = Integer.parseInt(n);
                for (int i=0;i<=20;i++){
                    res=n1*i;
                    total=n+"X"+i+"="+res;
                    total2=total2+"\n"+total;
                    res=0;
                }
                salida.setText(total2);

            }
        });


    }
}
