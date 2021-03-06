package com.fiipractic.android.widgets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Gallery;

import com.fiipractic.android.widgets.recyclerview.CollageAdapter;
import com.fiipractic.android.widgets.recyclerview.SampleData;

/**
 * Created by dorunechifor.
 */
public class CollageActivity extends AppCompatActivity {
    private static final int GRID_COLUMNS_NUMBER = 3;
    
    private RecyclerView rvColorsList;
    private CollageAdapter collageAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram_collage);
        
        initViews();
        setUpRecyclerView();
    }
    
    private void initViews() {
        // TODO: 3/18/17 findViewById
        rvColorsList = (RecyclerView) findViewById(R.id.rv_gallery_list);
    }
    
    private void setUpRecyclerView() {
        // TODO: 3/18/17 to be completed in class
        collageAdapter = new CollageAdapter(SampleData.generateSampleColorsArray());
        rvColorsList.setLayoutManager(new LinearLayoutManager(this, 1, false));
        rvColorsList.setAdapter(collageAdapter);
    }
}
