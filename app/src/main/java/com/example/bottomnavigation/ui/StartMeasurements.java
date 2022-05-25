package com.example.bottomnavigation.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.app.Dialog;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.example.bottomnavigation.R;

import org.jetbrains.annotations.Nullable;

public class StartMeasurements extends DialogFragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater  inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.start_measurements, container, false);
    }
}
