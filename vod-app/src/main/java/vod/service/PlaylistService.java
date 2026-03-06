package vod.service;

import vod.model.Playlist;
import vod.model.Song;

import java.util.List;

public interface PlaylistService {
//api zwraca nam wszystkie kina
    Playlist getPlaylistById(int id);

    List<Playlist> getAllPlaylists();

    List<Playlist> getPlaylistsBySong(Song m);

    List<Song> getSongsInPlaylist(Playlist c);

}
