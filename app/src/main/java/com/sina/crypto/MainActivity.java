package com.sina.crypto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.customview.widget.Openable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.Menu;
import android.widget.PopupMenu;

import com.sina.crypto.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public DrawerLayout drawerLayout;
    ActivityMainBinding binding;
    NavHostFragment navHostFragment;
    NavController navController;

    AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        navController = navHostFragment.getNavController();
        drawerLayout = binding.drawerLayout;
        appBarConfiguration = new AppBarConfiguration.Builder(R.id.homeFragment, R.id.marketFragment, R.id.watchlistFragment).setOpenableLayout(binding.drawerLayout).build();
        NavigationUI.setupWithNavController(binding.navigationView, navController);
        setupBottomNavMenu();

    }

    private void setupBottomNavMenu() {
        PopupMenu popupMenu = new PopupMenu(this, null);
        popupMenu.inflate(R.menu.home_menu);
        Menu menu = popupMenu.getMenu();

        binding.smoothBottomBar.setupWithNavController(menu, navController);
    }
}