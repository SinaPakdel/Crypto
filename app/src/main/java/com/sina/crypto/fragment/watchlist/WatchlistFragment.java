package com.sina.crypto.fragment.watchlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sina.crypto.R;
import com.sina.crypto.databinding.FragmentWatchlistBinding;

public class WatchlistFragment extends Fragment {
    FragmentWatchlistBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentWatchlistBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}