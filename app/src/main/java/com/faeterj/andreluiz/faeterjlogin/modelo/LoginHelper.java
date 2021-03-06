package com.faeterj.andreluiz.faeterjlogin.modelo;

import android.widget.EditText;

import com.faeterj.andreluiz.faeterjlogin.LoginActivity;
import com.faeterj.andreluiz.faeterjlogin.R;

/**
 * Created by AndreLuiz on 12/06/2016.
 */
public class LoginHelper {
    private EditText campoMatricula;
    private EditText campoSenha;
    private Aluno aluno;

    public LoginHelper(LoginActivity activity){

        campoMatricula = (EditText) activity.findViewById(R.id.login_matricula);
        campoSenha = (EditText) activity.findViewById(R.id.login_senha);

        aluno = new Aluno();
    }

    public Aluno pegaAluno() {

        aluno.setSenha(campoSenha.getText().toString());
        aluno.setMatricula(Long.valueOf(campoMatricula.getText().toString()));

        return aluno;
    }
}
