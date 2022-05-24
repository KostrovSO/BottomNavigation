package com.example.bottomnavigation.ui.state;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StateViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public StateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is state fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}