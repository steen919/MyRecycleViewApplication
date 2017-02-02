package se.engvalls.myrecycleviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MyActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        ArrayList<String> test = new ArrayList<>();
        test.add("Kalle");
        test.add("Anna");
        test.add("Viggo");
        test.add("Nisse");
        test.add("Lisa");
        test.add("Kalle");
        test.add("Anna");
        test.add("Viggo");
        test.add("Nisse");
        test.add("Lisa");
        test.add("Kalle");
        test.add("Anna");
        test.add("Viggo");
        test.add("Nisse");
        test.add("Lisa");
        test.add("Kalle");
        test.add("Anna");
        test.add("Viggo");
        test.add("Nisse");
        test.add("Lisa");

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView's items
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(test);
        mRecyclerView.setAdapter(mAdapter);
    }
}
