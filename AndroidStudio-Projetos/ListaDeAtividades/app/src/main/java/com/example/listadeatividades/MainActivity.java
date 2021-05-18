package com.example.listadeatividades;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private List<String> tarefas;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tarefas = new ArrayList<String>();
        ListView lista = (ListView) findViewById(R.id.listaTarefas);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, tarefas);
        lista.setAdapter(adapter);
    }

    public void adicionarTarefa(View view) {
        EditText descricao = (EditText) findViewById(R.id.tarefa);
        if(descricao.getText().toString().trim().length() > 0) {
            tarefas.add(descricao.getText().toString());
            adapter.notifyDataSetChanged();
            descricao.setText("");
            } else {
            Toast.makeText(this, "Campo vazio!", Toast.LENGTH_SHORT).show();
            }
        }
}