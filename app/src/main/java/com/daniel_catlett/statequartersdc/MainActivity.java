package com.daniel_catlett.statequartersdc;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        String[] years = {"1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.money, years));
    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        switch(position)
        {
            case 0:
                startActivity(new Intent(MainActivity.this, year99.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, year00.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, year01.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, year02.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, year03.class));
                break;
            case 5:
                startActivity(new Intent(MainActivity.this, year04.class));
                break;
            case 6:
                startActivity(new Intent(MainActivity.this, year05.class));
                break;
            case 7:
                startActivity(new Intent(MainActivity.this, year06.class));
                break;
            case 8:
                startActivity(new Intent(MainActivity.this, year07.class));
                break;
            case 9:
                startActivity(new Intent(MainActivity.this, year08.class));
                break;
        }
    }
}
