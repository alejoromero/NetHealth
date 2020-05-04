package com.example.nethealth.ui.vacunacion;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nethealth.R;

public class VacunasFragment extends Fragment {
    String usuario,password;
    private VacunasViewModel mViewModel;

    public  VacunasFragment(String us,String pas){

        usuario = us;
        password = pas;

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.vacunas_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(VacunasViewModel.class);
        // TODO: Use the ViewModel
    }

}
