package vod.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vod.model.Playlist;

import java.util.List;


public class VodServiceMain {

    public static void main(String[] args) {
        System.out.println("Let's find playlists!");

        // service preparation przygotowanie serwisu który używa repo jednego cinemaservice
        //chcemy wyswielic lisę kin, repo dają dostęp do nich, ale z punktu widzenia apliakcji
        //powiinismy komunikowac sie przez serwis
        //serwis jest taka fasadą ponad repozytoriami - architektura wielowarstwowa

        ApplicationContext context = new
                AnnotationConfigApplicationContext("vod");
        PlaylistService service = context.getBean(PlaylistService.class);
        //przygotowanie serwisu ma jedna impelemntacja, moze byc ich wiecej
        //ta impelemntacja potrzebuje w swoim konstruktorze dostarczyc obiekty dao
        //tu mamy znowu dwa intefejsy i trzeba sie zastanowic z których impelemntacji skorzystać


        // service use
        //cinemaservice ma api zwraca wsyzstkie kina
      //  tylko że ten serwis trzeba przygotowac, trzeba pozyskać tą usługe.
        List<Playlist> playlists = service.getAllPlaylists();
        System.out.println(playlists.size() + " playlists found:");
        playlists.forEach(System.out::println);
    }
}
