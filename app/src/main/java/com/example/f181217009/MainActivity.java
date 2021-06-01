package com.example.f181217009;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText m_EditText;
    private Button m_Button;
    private ListView m_List;
    private ArrayAdapter<String> m_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.m_Button=(Button)this.findViewById(R.id.button);
        this.m_EditText=(EditText)this.findViewById(R.id.editTextTextPersonName);
        this.m_List=(ListView)this.findViewById((R.id.list));
        this.m_adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        this.m_List.setAdapter(m_adapter);
    }
    public void onClick(View v){
        String item=this.m_EditText.getText().toString();
        this.m_EditText.setText("");
        if(!item.equals("")){
            this.m_adapter.add(item);
        }
    }
    public boolean onKey(View v, int keyCode, KeyEvent event){
        if(keyCode!=23&&keyCode!=66){
            return false;
        } else {
            if(event.getAction()==1){
                String item=this.m_EditText.getText().toString();
                this.m_EditText.setText("");
                if(!item.equals("")){
                    this.m_adapter.add(item);
                }
            }
            return true;
        }
    }
}