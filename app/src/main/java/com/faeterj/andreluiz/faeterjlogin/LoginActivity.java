package com.faeterj.andreluiz.faeterjlogin;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.faeterj.andreluiz.faeterjlogin.convert.AlunoConverter;
import com.faeterj.andreluiz.faeterjlogin.modelo.Aluno;
import com.faeterj.andreluiz.faeterjlogin.modelo.AlunoDAO;
import com.faeterj.andreluiz.faeterjlogin.modelo.LoginHelper;

public class LoginActivity extends AppCompatActivity {

    private LoginHelper helper;
    private Aluno aluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //CLASSE PARA TRANSFORMAR AS INFORMAÇÕES DO CONTEXT EM OBJETO ALUNO
        helper = new LoginHelper(LoginActivity.this);
        aluno = helper.pegaAluno();

       new EnviaAlunoTask(this).execute(aluno);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
