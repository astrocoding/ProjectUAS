package com.belajar.projectuas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailProjekAdapter extends AppCompatActivity {
    TextView name, detail, desc, link;
    String n_name, n_detail, n_desc, n_link;
    int n_photo;
    ImageView photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_projek_adapter);

        TextView textView = findViewById(R.id.detail_link);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        Bundle bundle = getIntent().getExtras();
        n_name = bundle.getString("name");
        n_detail = bundle.getString("detail");
        n_desc = bundle.getString("desc");
        n_link = bundle.getString("link");
        n_photo = bundle.getInt("photo");


        name = (TextView) findViewById(R.id.detail_name);
        detail = (TextView) findViewById(R.id.detail_detail);
        desc = (TextView) findViewById(R.id.detail_desc);
        link = (TextView) findViewById(R.id.detail_link);
        photo = (ImageView) findViewById(R.id.detail_photo);

        name.setText(""+n_name);
        detail.setText(""+n_detail);
        desc.setText(""+n_desc);

        Glide.with(DetailProjekAdapter.this).load(n_photo).apply(new RequestOptions().override(370,370)).into(photo);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setTitle("Marvel Characters");
        }
    }
}