package vod.repository;

import vod.model.Playlist;
import vod.model.Song;

import java.util.List;

public interface PlaylistDao {

    List<Playlist> findAll();

    Playlist findById(int id);

    List<Playlist> findBySong(Song m);


}
