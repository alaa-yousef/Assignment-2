package com.example.tornado_001.assignment_2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;


import java.util.Random;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x=r.nextInt(2);
    }


    int x=0;
    int c1,c2=0;
    Random r=new Random();
    int[] arr={2,2,2,2,2,2,2,2,2};



    public void restart(View view)
    {
        x=0;
        c1=0;
        c2=0;
        Button b;

        for(int i=0;i<9;i++)
        {
            arr[i]=2;
        }
        x=r.nextInt(2);

        b=(Button) findViewById(R.id.b1);
        b.setText("");
        b=(Button) findViewById(R.id.b2);
        b.setText("");
        b=(Button) findViewById(R.id.b3);
        b.setText("");
        b=(Button) findViewById(R.id.b4);
        b.setText("");
        b=(Button) findViewById(R.id.b5);
        b.setText("");
        b=(Button) findViewById(R.id.b6);
        b.setText("");
        b=(Button) findViewById(R.id.b7);
        b.setText("");
        b=(Button) findViewById(R.id.b8);
        b.setText("");
        b=(Button) findViewById(R.id.b9);
        b.setText("");

        Toast tost = Toast.makeText(getApplicationContext(), "The Game Is Resart" ,Toast.LENGTH_SHORT);
        tost.show();








    }

    public  void click(View v)
    {


        if(x==0)
        {
            Change_text(v,'O');
            x=1;
            c1++;
        } else
        {
            Change_text(v,'X');
            x=0;
            c2++;
        }
        if((c1+c2)>=9)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You lost" ,Toast.LENGTH_LONG);
            tost.show();




        }
        else
        {

            test(v);

        }





    }




    public void Change_text(View v,char c) {
        Button b;
        switch (v.getId()) {
            case R.id.b1:
                b=(Button) findViewById(R.id.b1);
                if(x==0)
                {
                    b.setTextColor(Color.parseColor("red"));
                }
                else {
                    b.setTextColor(Color.parseColor("black"));
                }

                b.setText(c+"");
                break;
            case R.id.b2:
                b=(Button) findViewById(R.id.b2);
                if(x==0)
                {
                    b.setTextColor(Color.parseColor("red"));
                }
                else {
                    b.setTextColor(Color.parseColor("black"));
                }

                b.setText(c+"");
                break;
            case R.id.b3:
                b=(Button) findViewById(R.id.b3);
                if(x==0)
                {
                    b.setTextColor(Color.parseColor("red"));
                }
                else {
                    b.setTextColor(Color.parseColor("black"));
                }

                b.setText(c+"");
                break;
            case R.id.b4:
                b=(Button) findViewById(R.id.b4);
                if(x==0)
                {
                    b.setTextColor(Color.parseColor("red"));
                }
                else {
                    b.setTextColor(Color.parseColor("black"));
                }

                b.setText(c+"");
                break;
            case R.id.b5:
                b=(Button) findViewById(R.id.b5);
                if(x==0)
                {
                    b.setTextColor(Color.parseColor("red"));
                }
                else {
                    b.setTextColor(Color.parseColor("black"));
                }

                b.setText(c+"");
                break;
            case R.id.b6:
                b=(Button) findViewById(R.id.b6);
                if(x==0)
                {
                    b.setTextColor(Color.parseColor("red"));
                }
                else {
                    b.setTextColor(Color.parseColor("black"));
                }

                b.setText(c+"");
                break;
            case R.id.b7:
                b=(Button) findViewById(R.id.b7);
                if(x==0)
                {
                    b.setTextColor(Color.parseColor("red"));
                }
                else {
                    b.setTextColor(Color.parseColor("black"));
                }

                b.setText(c+"");
                break;
            case R.id.b8:
                b=(Button) findViewById(R.id.b8);
                if(x==0)
                {
                    b.setTextColor(Color.parseColor("red"));
                }
                else {
                    b.setTextColor(Color.parseColor("black"));
                }

                b.setText(c+"");
                break;
            case R.id.b9:
                b=(Button) findViewById(R.id.b9);
                if(x==0)
                {
                    b.setTextColor(Color.parseColor("red"));
                }
                else {
                    b.setTextColor(Color.parseColor("black"));
                }

                b.setText(c+"");
                break;

        }
    }

    public void test(View v) {

        switch (v.getId()) {
            case R.id.b1:
                if(x==0)
                {
                    arr[0]=0;
                }
                else
                {
                    arr[0]=1;
                }
                break;
            case R.id.b2:
                if(x==0)
                {
                    arr[1]=0;
                }
                else
                {
                    arr[1]=1;
                }
                break;
            case R.id.b3:
                if(x==0)
                {
                    arr[2]=0;
                }
                else
                {
                    arr[2]=1;
                }
                break;
            case R.id.b4:
                if(x==0)
                {
                    arr[3]=0;
                }
                else
                {
                    arr[3]=1;
                }
                break;
            case R.id.b5:
                if(x==0)
                {
                    arr[4]=0;
                }
                else
                {
                    arr[4]=1;
                }
                break;
            case R.id.b6:
                if(x==0)
                {
                    arr[5]=0;
                }
                else
                {
                    arr[5]=1;
                }
                break;
            case R.id.b7:
                if(x==0)
                {
                    arr[6]=0;
                }
                else
                {
                    arr[6]=1;
                }
                break;
            case R.id.b8:
                if(x==0)
                {
                    arr[7]=0;
                }
                else
                {
                    arr[7]=1;
                }
                break;
            case R.id.b9:
                if(x==0)
                {
                    arr[8]=0;
                }
                else
                {
                    arr[8]=1;
                }
                break;


        }

        if(arr[0]==0 && arr[1]==0 && arr[2]==0)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[0]==0 && arr[3]==0 && arr[6]==0)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[0]==0 && arr[4]==0 && arr[8]==0)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[2]==0 && arr[5]==0 && arr[8]==0)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[6]==0 && arr[7]==0 && arr[8]==0)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[2]==0 && arr[4]==0 && arr[6]==0)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[1]==0 && arr[4]==0 && arr[7]==0)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[3]==0 && arr[4]==0 && arr[5]==0)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        //////////////
        if(arr[0]==1 && arr[1]==1 && arr[2]==1)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[0]==1 && arr[3]==1 && arr[6]==1)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[0]==1 && arr[4]==1 && arr[8]==1)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[2]==1 && arr[5]==1 && arr[8]==1)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[6]==1 && arr[7]==1 && arr[8]==1)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[2]==1 && arr[4]==1 && arr[6]==1)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[1]==1 && arr[4]==1 && arr[7]==1)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }
        if(arr[3]==1 && arr[4]==1 && arr[5]==1)
        {
            Toast tost = Toast.makeText(getApplicationContext(), "You Win" ,Toast.LENGTH_LONG);
            tost.show();
        }


    }
}
