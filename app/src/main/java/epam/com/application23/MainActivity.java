package epam.com.application23;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;


import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onMyButtonClick(View view) throws IOException
    {


        EditText editText = (EditText)findViewById(R.id.address);
        EditText editText1 = (EditText) findViewById(R.id.topic);
        EditText editText2 = (EditText) findViewById(R.id.massage);


        String address = editText.getText().toString();
        String topic   = editText1.getText().toString();
        String massage = editText2.getText().toString();


        Intent intent = new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto",address, null));

        intent.putExtra(Intent.EXTRA_SUBJECT, topic);
        intent.putExtra(Intent.EXTRA_TEXT, massage);
        startActivity(Intent.createChooser(intent, "Send email..."));


    }


}
