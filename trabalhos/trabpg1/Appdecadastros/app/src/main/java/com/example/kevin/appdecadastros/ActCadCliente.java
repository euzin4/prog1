package com.example.kevin.appdecadastros;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kevin.appdecadastros.database.DadosOpenHelper;
import com.example.kevin.appdecadastros.dominio.entidades.Cliente;
import com.example.kevin.appdecadastros.dominio.repositorio.ClienteRepositorio;

import java.util.regex.Pattern;

public class ActCadCliente extends AppCompatActivity {
    private EditText edtNome;
    private EditText edtEndereco;
    private EditText edtEmail;
    private EditText edtTelefone;
    private ConstraintLayout layoutContentActCadCliente;

    private ClienteRepositorio clienteRepositorio;

    private SQLiteDatabase conexao;
    private DadosOpenHelper dadosOpenHelper;

    private Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cad_cliente);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtNome = (EditText)findViewById(R.id.edtNome);
        edtEndereco = (EditText)findViewById(R.id.edtEndereco);
        edtEmail = (EditText)findViewById(R.id.edtEmail);
        edtTelefone = (EditText)findViewById(R.id.edtTelefone);
        layoutContentActCadCliente = (ConstraintLayout)findViewById(R.id.layoutContentActCadCliente);
        criarConexao();
    }
    private void criarConexao(){
        try{
            dadosOpenHelper = new DadosOpenHelper(this);
            conexao = dadosOpenHelper.getWritableDatabase();
            Snackbar.make(layoutContentActCadCliente, R.string.message_conexao_criada_com_sucesso, Snackbar.LENGTH_LONG)
                    .setAction(R.string.action_ok, null).show();
            clienteRepositorio = new ClienteRepositorio(conexao);
        }catch (SQLException ex){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle(R.string.title_erro);
            dlg.setMessage(ex.getMessage());
            dlg.setNeutralButton(R.string.action_ok, null);
            dlg.show();
        }
    }
    private void confirmar(){
        cliente=new Cliente();
        if(validaCampos() == false){
            try{
                clienteRepositorio.inserir(cliente);
                finish();
            }catch (SQLException ex){
                AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                dlg.setTitle(R.string.title_erro);
                dlg.setMessage(ex.getMessage());
                dlg.setNeutralButton(R.string.action_ok, null);
                dlg.show();
            }

        }
    }
    private boolean validaCampos(){
        boolean res = false;
        String nome = edtNome.getText().toString();
        String endereco = edtEndereco.getText().toString();
        String email = edtEmail.getText().toString();
        String telefone = edtTelefone.getText().toString();

        cliente.nome=nome;
        cliente.endereco=endereco;
        cliente.email=email;
        cliente.telefone=telefone;

        if(res=isCampoVazio(nome)){
            edtNome.requestFocus();
        }else if(res=isCampoVazio(endereco)){
            edtEndereco.requestFocus();
        }else if(res=!isEmailValido(email)){
            edtEmail.requestFocus();
        }else if(res=isCampoVazio(telefone)){
            edtTelefone.requestFocus();
        }
        if(res){
            AlertDialog.Builder dlg=new AlertDialog.Builder(this);
            dlg.setTitle(R.string.title_aviso);
            dlg.setMessage(R.string.message_campos_invalidos_brancos);
            dlg.setNeutralButton(R.string.action_ok,null);
            dlg.show();
        }
        return res;
    }
    private boolean isCampoVazio(String valor){
        boolean resultado=(TextUtils.isEmpty(valor) || valor.trim().isEmpty() );
        return resultado;
    }
    private boolean isEmailValido(String email){
        boolean resultado=(!isCampoVazio(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
        return resultado;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_act_cad_cliente, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.action_ok:
                confirmar();
                //Toast.makeText(this,"Botão OK Selecionado", Toast.LENGTH_SHORT).show();
            break;
            case R.id.action_cancelar:
                //Toast.makeText(this,"Botão Cancelar Selecionado", Toast.LENGTH_SHORT).show();
                finish();
            break;
        }
        return super.onOptionsItemSelected(item);
    }
}
