package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewapp.Models.githubUser;
import com.example.recyclerviewapp.Models.githubUserAdapter;

import java.util.ArrayList;
import java.util.List;

public class github_repositories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RecyclerView recyclerView;
        setContentView(R.layout.activity_github_repositories);
        List<githubUser> repositoryList = new ArrayList<>();

        repositoryList.add(new githubUser("Marco Chavez", "Expreciones_PostFijas", "TypeScript ", 10));
        repositoryList.add(new githubUser("Marco Chavez", "Android_TicTacToe ", "Java", 20));
        repositoryList.add(new githubUser("Marco Chavez", "Arreglos_Ordenamiento  ", "Java", 20));
        repositoryList.add(new githubUser("Marco Chavez", "Android_Conversion  ", "Java", 20));
        repositoryList.add(new githubUser("Marco Chavez", "ApiAndroid  ", "Java", 10));
        repositoryList.add(new githubUser("Marco Chavez", "Estructura_de_datos_Automata1  ", "Java", 40));
        repositoryList.add(new githubUser("Marco Chavez", "Adonis_CRUD  ", "TypeScript", 20));
        repositoryList.add(new githubUser("Marco Chavez", "Android_Intent  ", "Java", 270));
        repositoryList.add(new githubUser("Marco Chavez", "Android-Calculadora  ", "Java", 20));
        repositoryList.add(new githubUser("Marco Chavez", "Practica_LinearLayout_Bandera  ", "Java", 20));
        repositoryList.add(new githubUser("Marco Chavez", "Android_Practica1  ", "Java ", 20));
        repositoryList.add(new githubUser("Marco Chavez", "Proyecto_veterinaria  ", "Vue", 50));
        repositoryList.add(new githubUser("Marco Chavez", "VeterinariaBackend ", "PHP", 20));


        githubUserAdapter githubUserAdapter = new githubUserAdapter(repositoryList);
        recyclerView = findViewById(R.id.repositories);

        recyclerView.setAdapter(githubUserAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

    }
}