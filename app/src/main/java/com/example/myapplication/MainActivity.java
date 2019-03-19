package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myapplication.Adapters.HistoryLogAdapter;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView _historyLogRv;
    private RecyclerView.LayoutManager _layoutManager;

    private HistoryLogAdapter hlAdapter;
    private List<String> numberList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _historyLogRv = findViewById(R.id.history_log_rv);
        _historyLogRv.setHasFixedSize(true);

        _layoutManager = new LinearLayoutManager(this);
        _historyLogRv.setLayoutManager(_layoutManager);

        //numberList = Arrays.asList(getResources().getStringArray(R.array.numbers));
        numberList = Arrays.asList("1","2","3","4","5","6");
        hlAdapter = new HistoryLogAdapter(numberList, _historyLogRv);

        _historyLogRv.setAdapter(hlAdapter);
    }
}
