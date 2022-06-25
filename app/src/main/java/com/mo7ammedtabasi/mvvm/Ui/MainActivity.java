package com.mo7ammedtabasi.mvvm.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mo7ammedtabasi.mvvm.R;
import com.mo7ammedtabasi.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MovieViewModel movieViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        movieViewModel= ViewModelProviders.of(this).get(MovieViewModel.class);

//        binding.setViewModel(movieViewModel);
//        binding.setLifecycleOwner(this);


        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movieViewModel.getMovieName();
            }
        });

        movieViewModel.movieNameMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.textView.setText(s);
            }
        });

    }

}