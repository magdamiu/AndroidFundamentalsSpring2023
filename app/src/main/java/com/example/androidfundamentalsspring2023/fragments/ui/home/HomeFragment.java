package com.example.androidfundamentalsspring2023.fragments.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.androidfundamentalsspring2023.R;
import com.example.androidfundamentalsspring2023.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        // here you get the reference to the RecyclerView
        // getActivity() - get access to the parent activity
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}