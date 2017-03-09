package com.example.shashikant.bhuconnect;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import static android.R.layout.simple_dropdown_item_1line;
import static android.R.layout.simple_spinner_dropdown_item;

public class WriteComplain extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_complain);
        MySpinner();

    }

    public void MySpinner() {

      final Spinner spinner1 = (Spinner) findViewById(R.id.spinnerComplaintType);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.complaint_type_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parentView,
                                       View selectedItemView, int position, long id) {
                // Object item = parentView.getItemAtPosition(position);
                LinearLayout place = (LinearLayout)findViewById(R.id.place_of_complaint);
                if(spinner1.getSelectedItemPosition()==1){

                    place.setVisibility(View.GONE);
                }
                else if(spinner1.getSelectedItemPosition()==0){
                    place.setVisibility(View.VISIBLE);
                }

            }

            public void onNothingSelected(AdapterView<?> arg0) {// do nothing
                Toast.makeText(getApplicationContext(),"select a value",Toast.LENGTH_SHORT).show();
            }

        });

    }
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
        if(parent.getSelectedItemPosition()==1){
            LinearLayout place = (LinearLayout)findViewById(R.id.place_of_complaint);
            place.setVisibility(View.VISIBLE);
        }
    }
    public void onNothingSelected(AdapterView<?>parent){

    }

}
