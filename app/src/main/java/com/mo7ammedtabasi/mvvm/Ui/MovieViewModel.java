package com.mo7ammedtabasi.mvvm.Ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mo7ammedtabasi.mvvm.pojo.MovieModel;

public class MovieViewModel extends ViewModel {

    MutableLiveData<String> movieNameMutableLiveData=new MutableLiveData<>();

    public String getMovieName(){
        String nameMovie=getMovieFromDatabase().getName();
//        movieNameMutableLiveData.setValue(nameMovie);
        return nameMovie;

    }
    public MovieModel getMovieFromDatabase(){
        return new MovieModel("cast away","5-8-2014","vary sad movie",1);
    }
}
