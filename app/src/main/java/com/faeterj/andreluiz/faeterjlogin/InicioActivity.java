package com.faeterj.andreluiz.faeterjlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.faeterj.andreluiz.faeterjlogin.modelo.Aluno;
import com.faeterj.andreluiz.faeterjlogin.modelo.AlunoDAO;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Aluno aluno = new Aluno();

        AlunoDAO dao = new AlunoDAO(this);

        aluno=dao.pegaAluno();

        if(aluno.getLogado()==0){
            Intent intent = new Intent(InicioActivity.this,LoginActivity.class);
        }else{
            Intent intent = new Intent(InicioActivity.this,MenuActivity.class);
        }
    }

}
