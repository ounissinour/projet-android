package com.example.autorent;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class acceuilActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil); // Assure-toi que ce fichier XML est bien lié

        RecyclerView recyclerView = findViewById(R.id.carsRecyclerView); // RecyclerView pour afficher les voitures
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Créer une liste de voitures avec des données d'exemple
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Tesla Model 3", "200DT/jour", "Sfax", R.drawable.imgg1)); // R.drawable.imgg1 représente une image
        carList.add(new Car("BMW X5", "300DT/jour", "Tunis", R.drawable.imgg2));
        carList.add(new Car("Tesla Model 2", "450DT/jour", "Tunis", R.drawable.imgg3));
        // Ajoute ici d'autres voitures selon ton besoin

        // Créer un adaptateur pour lier les données de la liste de voitures au RecyclerView
        CarAdapter adapter = new CarAdapter(carList);
        recyclerView.setAdapter(adapter); // Relier l'adaptateur au RecyclerView

    }
}