package gaurav.convertbinary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by kunwar on 6/25/16.
 */
public class tobinary extends AppCompatActivity {

    long n,binaryNumber,remainder,i;
    TextView t1;
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tobinary);

        t1=(TextView) findViewById(R.id.textview_tobinary);
        e1=(EditText)findViewById(R.id.decimal_value);
        b1=(Button)findViewById(R.id.toBinary_btn2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n= Integer.parseInt(e1.getText().toString());
                binaryNumber=0;
                i=1;

//              conversion occurs here

                while (n!=0){
                    remainder=n%2;
                    n/=2;
                    binaryNumber+=remainder*i;
                    i*=10;
                }

                t1.setText("In Binary : "+binaryNumber);

            }
        });

    }

    // making of menu on top left of the app
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu2,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int name=item.getItemId();
        if(name==R.id.about_us){
            Toast.makeText(tobinary.this, "© Aayush Kunwar",Toast.LENGTH_LONG).show();
        }

        if (name==R.id.back){
            tobinary.this.finish();
        }
        return true;
    }
}
