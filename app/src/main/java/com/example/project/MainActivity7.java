package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    EditText username, password, repassword, address;
    Button signup, signin;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        if(getSupportActionBar()!=null){

            getSupportActionBar().hide();
        }

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        repassword = (EditText) findViewById(R.id.repassword);
        signup = (Button) findViewById(R.id.btnsignup);
        signin = (Button) findViewById(R.id.btnsignin);
        address =(EditText) findViewById(R.id.add);

        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();

                String add=address.getText().toString();

                boolean order=DB.insertOrderData(1,null,add);
                if(order==true)
                    Toast.makeText(MainActivity7.this, "successfully", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity7.this, "fail", Toast.LENGTH_SHORT).show();


                if(user.equals("")||pass.equals("")||repass.equals("")||add.equals(""))

                    Toast.makeText(MainActivity7.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)){
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false){
                            Boolean insert = DB.insertData(user, pass);
                            if(insert==true){
                                Toast.makeText(MainActivity7.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),MainActivity8.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(MainActivity7.this, "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(MainActivity7.this, "User already exists! please sign in", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(MainActivity7.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                    }
                } }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity8.class);
                startActivity(intent);
            }
        });
    }
}