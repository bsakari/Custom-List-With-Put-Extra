package com.king.kingcustomlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView titleNames,email, amount;

    int[] images = {R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,
            R.drawable.img_5,R.drawable.img_6,R.drawable.img_7,R.drawable.img_8,
            R.drawable.img_9,R.drawable.img_10,R.drawable.img_11};
    String[] titles = {"King Wanyama","Benjamin Wanyama","Sakari B Wanyama","B Sakari Wanyama",
            "S B Wanyama","Benjamin Sakari","Sakari Wanyama","Wanyama King","Wanyama Sakari","Wanyama Benjamin","King Benjamin Wanyama"};
    String[] emails = {"kingwanyama@gmail.com","benjaminwanyama@gmail.com","swanyama@gmail.com","bswanyama@gmail.com",
            "sbwanyama@gmail.com","kingbenjamin@gmail.com","sakariwanyama@gmail.com","wanyamaking@gmail.com",
            "kingwanyamasakari@gmail.com","wanyamaben@gmail.com","kingbenjaminwanyama@gmail.com"};
    int[] amounts = {300000,600000,900000,1200000,
            1600000,1900000,2200000,2500000,
            2800000,3100000,3400000};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imageView = (ImageView) findViewById(R.id.imageView);
        titleNames = (TextView) findViewById(R.id.tvTitleName);
        email = (TextView) findViewById(R.id.tvEmail);
        amount = (TextView) findViewById(R.id.tvAmount);
        final int position = getIntent().getIntExtra("position",0);

        imageView.setImageResource(images[position]);
        titleNames.setText(titles[position]);
        email.setText(emails[position]);
        amount.setText(String.valueOf(amounts[position]));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailsActivity.this, titles[position]+" Clicked", Toast.LENGTH_LONG).show();
            }
        });

    }
}
