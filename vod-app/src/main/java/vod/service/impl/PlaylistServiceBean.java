package vod.service.impl;

import org.springframework.stereotype.Component;
import vod.model.Playlist;
import vod.model.Song;
import vod.repository.PlaylistDao;
import vod.repository.SongDao;
import vod.service.PlaylistService;

import java.util.List;
import java.util.logging.Logger;

@Component
public class PlaylistServiceBean implements PlaylistService {

    private static final Logger log = Logger.getLogger(PlaylistService.class.getName());

    private PlaylistDao playlistDao;
    private SongDao songDao;

    public PlaylistServiceBean(PlaylistDao playlistDao, SongDao songDao) {
        log.info("creating playlist service bean");
        this.playlistDao = playlistDao;
        this.songDao = songDao;
    }

    @Override
    public Playlist getPlaylistById(int id) {
        log.info("searching playlist by id " + id);
        return playlistDao.findById(id);
    }

    @Override
    public List<Song> getSongsInPlaylist(Playlist c) {
        log.info("searching song played on playlist " + c.getId());
        return songDao.findByPlaylist(c);
    }

    @Override
    public List<Playlist> getAllPlaylists() {
        log.info("searching all playlists");
        return playlistDao.findAll();
    }

    @Override
    public List<Playlist> getPlaylistsBySong(Song m) {
        log.info("searching playlists by song " + m.getId());
        return playlistDao.findBySong(m);
    }

}
