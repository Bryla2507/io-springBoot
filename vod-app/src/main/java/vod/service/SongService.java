package vod.service;

import vod.model.Artist;
import vod.model.Song;

import java.util.List;

public interface SongService {


    List<Song> getAllSongs();

    List<Song> getSongsByArtist(Artist d);

    Song getSongById(int id);

    Song addSong(Song m);


    List<Artist> getAllArtists();

    Artist getArtistById(int id);

    Artist addArtist(Artist d);
}
