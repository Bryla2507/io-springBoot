package vod.repository;

import vod.model.Artist;
import vod.model.Playlist;
import vod.model.Song;

import java.util.List;

public interface SongDao {

    List<Song> findAll();

    Song findById(int id);

    List<Song> findByArtist(Artist d);

    List<Song> findByPlaylist(Playlist c);

    Song add(Song m);

}
