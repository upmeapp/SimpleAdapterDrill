package assaf.zfani.simpleadapterdrill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myList = (ListView)findViewById(R.id.listView);
        ArrayList<Worker>workers = new ArrayList<Worker>();
        workers.add(new Worker("yosi",5000,25));
        workers.add(new Worker("adam",6000,27));
        workers.add(new Worker("dana",9000,29));
        MyListAdapter myListAdapter =new MyListAdapter(this,workers);
        myList.setAdapter(myListAdapter);
    }
}
