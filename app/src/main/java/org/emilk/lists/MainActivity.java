package org.emilk.lists;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.listView)
    ListView listView;

//    private static final String[] Items ={"Gerry","Fer","Sebas","Angel","Chava","Emilio"};
    ArrayList<Item> itemList = new ArrayList<Item>();
    Item Gerry = new Item(R.drawable.minion1,"Gerry","Esta es la descripción de Gerry");
    Item Fer = new Item(R.drawable.minion2,"Fer","Esta es la descripción de Fer");
    Item Sebas = new Item(R.drawable.minion3,"Sebas","Esta es la descripción de Sebs");
    Item Angel = new Item(R.drawable.minion4,"Angel","Esta es la descripción de Angel");
    Item Chava = new Item(R.drawable.minion6,"Chava","Esta es la descripción de Chava");
    Item Emilio = new Item(R.drawable.minion5,"Emilio","Esta es la descripción de Emilio");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setUpListView();

    }



    private void setUpListView() {
      //  ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Items);

        MyAdapter myAdapter =new MyAdapter(this,0, itemList);
        listView.setAdapter(myAdapter);
        myAdapter.addAll(Gerry,Fer,Sebas,Angel,Chava,Emilio);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Le has dado un toque a " + itemList.get(position).getmName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
