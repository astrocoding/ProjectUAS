package com.belajar.projectuas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private RecyclerView rvProjek;
    private ArrayList<Projek> list = new ArrayList<>();
    private String title = "Mode List";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setActionBarTitle(title);

        rvProjek = findViewById(R.id.rv_projek);
        rvProjek.setHasFixedSize(true);
        list.addAll(ProjekData.getListData());

        showRecyclerList();
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreatePanelMenu(featureId, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.about_page:
                startActivity(new Intent(MainActivity.this, AboutPage.class));
                break;
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;
            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle(title);
    }

    private void showRecyclerList() {
        rvProjek.setLayoutManager(new LinearLayoutManager(this));
        ListProjekAdapter listProjekAdapter = new ListProjekAdapter(list);
        rvProjek.setAdapter(listProjekAdapter);

        listProjekAdapter.setOnItemClickCallback(new ListProjekAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Projek data) {
                showSelectedProjek(data);
            }
        });
    }

    private void showRecyclerGrid() {
        rvProjek.setLayoutManager(new GridLayoutManager(this, 2));
        GridProjekAdapter gridProjekAdapter = new GridProjekAdapter(list);
        rvProjek.setAdapter(gridProjekAdapter);

        gridProjekAdapter.setOnItemClickCallback(new GridProjekAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Projek data) {
                showSelectedProjek(data);
            }
        });
    }

    private void showRecyclerCardView() {
        rvProjek.setLayoutManager(new LinearLayoutManager(this));
        CardViewProjekAdapter cardViewProjekAdapter = new CardViewProjekAdapter(list);
        rvProjek.setAdapter(cardViewProjekAdapter);
    }

    private void setActionBarTitle(String title) {
        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
    private void showSelectedProjek(Projek projek) {
        Toast.makeText(this, "Kamu memilih " + projek.getName(), Toast.LENGTH_SHORT).show();
    }
}