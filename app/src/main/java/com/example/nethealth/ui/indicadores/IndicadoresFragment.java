package com.example.nethealth.ui.indicadores;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nethealth.R;

public class IndicadoresFragment extends Fragment {

    private IndicadoresViewModel mViewModel;
    String usuario,password;


    public  IndicadoresFragment(String us,String pas){

        usuario = us;
        password = pas;

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.indicadores_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(IndicadoresViewModel.class);
        // TODO: Use the ViewModel
    }

}
