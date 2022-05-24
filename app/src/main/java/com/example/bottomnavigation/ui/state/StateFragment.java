package com.example.bottomnavigation.ui.state;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.bottomnavigation.databinding.FragmentStateBinding;

public class StateFragment extends Fragment {

    private FragmentStateBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        StateViewModel stateViewModel =
                new ViewModelProvider(this).get(StateViewModel.class);

        binding = FragmentStateBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textState;
        stateViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}