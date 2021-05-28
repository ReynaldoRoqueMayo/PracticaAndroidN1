package com.example.practicaandroidn1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.example.practicaandroidn1.Adapters.AnimeAdapter;
import com.example.practicaandroidn1.Entidades.Anime;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buscamos el recycler view en nuestro layout
        RecyclerView rv=findViewById(R.id.rvList);
        //al recivler view le agragamos un layour manager
        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));



        AnimeAdapter animeAdapter =new AnimeAdapter(obtenerAnime());

        rv.setAdapter(animeAdapter);

    }

    public List<Anime> obtenerAnime(){

        List<Anime> listaAnime=new ArrayList<>();

        Anime anim1=new Anime("Naruto", "La obra narra la historia de un ninja adolescente llamado Naruto Uzumaki, quien aspira a convertirse en Hokage, líder de su aldea.","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQvoWXsgR8wXPNK4zO-SOPX1sKrLIIwE46gAQ&usqp=CAU");
        Anime anim2=new Anime("Pokemon","Ash Ketchum es uno de ellos, un niño de 10 años que sueña con llegar a ser el mejor entrenador Pokémon del mundo.","https://i2.wp.com/islademonos.com/wp-content/uploads/2020/03/pokemon-primera-genreacion.png?resize=870%2C600&ssl=1");

        Anime anim3=new Anime("7pecados","El Anime cuenta la historia de una reino con guerreros incomparables, entre ellos los 7 pecados capitales","https://pm1.narvii.com/6126/57a83a89664eeaebfa90459794b6fc9c42a20c2b_hq.jpg");

        Anime anim5=new Anime("OnePunch","Saitama es un poderoso superhéroe calvo que derrota fácilmente a los monstruos u otros villanos.","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDusbsiMV34I8Bjvrs7hkM0sBNIhDBuJ_Fjg&usqp=CAU");
        Anime anim6=new Anime("YuGiOH","La obra trata sobre la historia de un joven llamado Yugi Muto, el cual es un Duelista aficionado que porta el Rompecabezas del Milenio","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7whGn9m6DOsUWAaq8AzbqYIemALWQvEHw9jAMNuy13erZy5zFuSR15SF9jy5qucNy2aE&usqp=CAU");


        Log.i("INICIO", "INICIASTE ");
        listaAnime.add(anim1);
        listaAnime.add(anim2);

        listaAnime.add(anim3);

        listaAnime.add(anim5);
        listaAnime.add(anim6);
        return listaAnime;
    }

}