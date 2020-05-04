package com.example.nethealth;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.example.nethealth.ui.control.ControlFragment;
import com.example.nethealth.ui.gallery.GalleryFragment;
import com.example.nethealth.ui.historial.HistorialFFragment;
import com.example.nethealth.ui.indicadores.IndicadoresFragment;
import com.example.nethealth.ui.registro.RegistroFragment;
import com.example.nethealth.ui.vacunacion.VacunasFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Principal extends AppCompatActivity {

    String usuario,password;


    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        final DrawerLayout drawer = findViewById(R.id.drawer_layout);
        final NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        navigationView.bringToFront();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                // Toast.makeText(PantallaPrincipal.this,"Error: "+menuItem.toString(),Toast.LENGTH_LONG).show();
                FragmentManager fm = getSupportFragmentManager();

                if(menuItem.toString().equals("Indicadores")){

                    Fragment newFragment = new IndicadoresFragment(usuario,password);

                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack
                    transaction.replace(R.id.frhome, newFragment);
                    // transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    transaction.addToBackStack(null);

// Commit the transaction
                    transaction.commit();

                }

                if(menuItem.toString().equals("Control")){

                    Fragment newFragment = new ControlFragment(usuario,password);

                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack
                    transaction.replace(R.id.frhome, newFragment);
                    // transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    transaction.addToBackStack(null);

// Commit the transaction
                    transaction.commit();

                }


                if(menuItem.toString().equals("Vacunación")){

                    Fragment newFragment = new VacunasFragment(usuario,password);

                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack
                    transaction.replace(R.id.frhome, newFragment);
                    // transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    transaction.addToBackStack(null);

// Commit the transaction
                    transaction.commit();

                }

                if(menuItem.toString().equals("Registro")){

                    Fragment newFragment = new RegistroFragment(usuario,password);

                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack
                    transaction.replace(R.id.frhome, newFragment);
                    // transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    transaction.addToBackStack(null);

// Commit the transaction
                    transaction.commit();

                }

                if(menuItem.toString().equals("Inicio")){

                    Fragment newFragment = new GalleryFragment(usuario,password);

                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack
                    transaction.replace(R.id.frhome, newFragment);
                    // transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    transaction.addToBackStack(null);

// Commit the transaction
                    transaction.commit();
                }

                if(menuItem.toString().equals("Historial")){

                    // Create new fragment and transaction
                    Fragment newFragment = new HistorialFFragment(usuario,password);

                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack
                    transaction.replace(R.id.frhome, newFragment);
                    // transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    transaction.addToBackStack(null);

// Commit the transaction
                    transaction.commit();

                }

                navigationView.setCheckedItem(menuItem);
                drawer.closeDrawer(navigationView);
                return false;
            }
        });

        Fragment frm1 = new GalleryFragment(usuario,password);
        getSupportFragmentManager().beginTransaction().add(R.id.frhome,frm1).commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
