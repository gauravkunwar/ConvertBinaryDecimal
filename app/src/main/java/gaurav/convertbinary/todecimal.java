package gaurav.convertbinary;

import android.os.Bundle;
import android.support.annotation.Nullable;
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
public class todecimal extends AppCompatActivity {

    long decimal, p, binaryNumber,temp;
    EditText e2;
    Button b2;
    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todecimal);

         e2=(EditText)findViewById(R.id.binary_value);
         b2=(Button)findViewById(R.id.toDecimal_btn2);
         t2=(TextView) findViewById(R.id.textview_todecimal);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binaryNumber= Integer.parseInt(e2.getText().toString());//takes in value from Edittext to binaryNumber
                p = 0;
                decimal=0;

//              conversion to decimal
                while (binaryNumber!=0){
                        temp = binaryNumber % 10;
                       binaryNumber = binaryNumber / 10;
                        decimal += temp * Math.pow(2, p);
                        p++;
                    }
                    t2.setText("In Decimal : " + decimal);
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
            Toast.makeText(todecimal.this, "© Aayush Kunwar",Toast.LENGTH_LONG).show();
        }

        if (name==R.id.back){
            todecimal.this.finish();
        }
        return true;
    }
}
