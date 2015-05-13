package es.hol.danirb.listview2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

    private ListView list;//el listview
    String[] listaString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        listaString = new String[]{"Messi", "Pedrito", "Neymar Jr."};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=(ListView)findViewById(R.id.listview);//inicializamos el listview
        /*Creamos un adaptador para crear el listview*/
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listaString);
        //seteamos el listview con este adaptador
        list.setAdapter(adapter);
    }


}
