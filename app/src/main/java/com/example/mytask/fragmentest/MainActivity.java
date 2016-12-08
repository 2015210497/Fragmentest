package com.example.mytask.fragmentest;
import java.util.ArrayList;
import java.util.List;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mvbtn,tvbtn,musbtn,newsbtn;
    private  List<Button> btnlist=new ArrayList<Button>();
    private FragmentManager fm;
    private FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       fm=getFragmentManager();
        ft=fm.beginTransaction();
        findById();
        ft.replace(R.id.fragment_content,new MovActivity());
        ft.commit();
    }
    private  void findById()
    {mvbtn=(Button) this.findViewById(R.id.button);
      tvbtn=(Button)this.findViewById(R.id.button2);
        musbtn=(Button)this.findViewById(R.id.button3);
        newsbtn=(Button)this.findViewById(R.id.button4);
        mvbtn.setOnClickListener(this);
        tvbtn.setOnClickListener(this);
        musbtn.setOnClickListener(this);
        newsbtn.setOnClickListener(this);
        btnlist.add(mvbtn);
        btnlist.add(tvbtn);
        btnlist.add(musbtn);
        btnlist.add(newsbtn);
    }
    private  void setBacgroudColorById(int btnId) {
        for (Button btn : btnlist) {
            if (btn.getId() == btnId) {
                btn.setBackgroundColor(Color.GREEN);
            } else {
                btn.setBackgroundColor(Color.BLUE);
            }
        }
    }

    public void onClick(View v){
        fm=getFragmentManager();
        ft=fm.beginTransaction();
        switch (v.getId()) {
            case R.id.button:
                setBacgroudColorById(R.id.button);
                ft.replace(R.id.fragment_content, new MovActivity());
                break;
            case R.id.button2:
                setBacgroudColorById(R.id.button2);
                ft.replace(R.id.fragment_content, new TvActivity());
                break;
            case R.id.button3:
                setBacgroudColorById(R.id.button3);
                ft.replace(R.id.fragment_content, new MusActivity());
                break;
            case R.id.button4:
                setBacgroudColorById(R.id.button4);
                ft.replace(R.id.fragment_content, new NewsActivity());
                break;
            default:
                break;

            }
        ft.commit();
        }



    }





