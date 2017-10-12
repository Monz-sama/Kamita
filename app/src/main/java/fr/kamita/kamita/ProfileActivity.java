package fr.kamita.kamita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        final EditText inputEmail = (EditText) findViewById(R.id.input_email);
        final EditText inputPassword = (EditText) findViewById(R.id.input_password);
        final Button btnLogin = (Button) findViewById(R.id.btn_login);
        final TextView registerLink = (TextView) findViewById(R.id.link_signup);

        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(ProfileActivity.this,RegisterActivity.class);
                startActivity(registerIntent);
            }
        });

    }
}
