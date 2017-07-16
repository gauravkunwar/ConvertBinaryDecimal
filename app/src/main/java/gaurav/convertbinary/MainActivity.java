package gaurav.convertbinary;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button toBinary, toDecimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toBinary=(Button) findViewById(R.id.toBinary_btn); //Typecating
        toDecimal=(Button)findViewById(R.id.toDecimal_btn);

        toBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(MainActivity.this,tobinary.class);
                startActivity(intent1);
           }
        });

        toDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(MainActivity.this,todecimal.class);
                startActivity(intent2);
            }
        });
    }


    // making of menu on top left of the app
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int name=item.getItemId();
        if(name==R.id.about_us){
            Toast.makeText(MainActivity.this, "© Aayush Kunwar",Toast.LENGTH_LONG).show();
        }

        if (name==R.id.exit){
           // Intent intent = new Intent(getApplicationContext(),NewClass.class);
            //startActivity(intent);
            MainActivity.this.finish(); // main activity is terminated.
        }
        return true;
    }
}
