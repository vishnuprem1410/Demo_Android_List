package sg.edu.rp.c346.id18015059.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroid;
    ArrayList<AndroidVersion> androidList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroid = findViewById(R.id.listViewAndroid);
        androidList = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");
        AndroidVersion item4 = new AndroidVersion("Marshmallow", "6.0 - 6.0.1");
        AndroidVersion item5 = new AndroidVersion("Lollipop", "5.0 - 5.1.1");
        AndroidVersion item6 = new AndroidVersion("KitKat", "4.4 - 4.4.4");
        AndroidVersion item7 = new AndroidVersion("Jelly Bean", "4.1 - 4.3.1");



        androidList.add(item1);
        androidList.add(item2);
        androidList.add(item3);
        androidList.add(item4);
        androidList.add(item5);
        androidList.add(item6);
        androidList.add(item7);

       CustomAdapter adapter;
       adapter = new CustomAdapter(this, R.layout.row, androidList);
        lvAndroid.setAdapter(adapter);

    }
}
