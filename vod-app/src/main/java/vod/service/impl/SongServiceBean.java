package vod.service.impl;

import org.springframework.stereotype.Component;
import vod.model.Artist;
import vod.model.Playlist;
import vod.model.Song;
import vod.repository.PlaylistDao;
import vod.repository.ArtistDao;
import vod.repository.SongDao;
import vod.service.SongService;

import java.util.List;
import java.util.logging.Logger;

@Component
public class SongServiceBean implements SongService {

    private static final Logger log = Logger.getLogger(SongService.class.getName());

    private ArtistDao artistDao;
    private PlaylistDao playlistDao;
    private SongDao songDao;

    public SongServiceBean(ArtistDao artistDao, PlaylistDao playlistDao, SongDao songDao) {
        this.artistDao = artistDao;
        this.playlistDao = playlistDao;
        this.songDao = songDao;
    }

    public List<Song> getAllSongs() {
        log.info("searching all songs...");
        return songDao.findAll();
    }

    public List<Song> getSongsByArtist(Artist d) {
        log.info("serching songs by artist " + d.getId());
        return songDao.findByArtist(d);
    }

    public List<Song> getSongsInPlaylist(Playlist c) {
        log.info("searching songs played in playtlists " + c.getId());
        return songDao.findByPlaylist(c);
    }

    public Song getSongById(int id) {
        log.info("searching movie by id " + id);
        return songDao.findById(id);
    }

    public List<Playlist> getAllPlaylists() {
        log.info("searching all playlists...");
        return playlistDao.findAll();
    }

    public List<Playlist> getPlaylistsBySong(Song m) {
        log.info("searching playlists by song " + m.getId());
        return playlistDao.findBySong(m);
    }

    public Playlist getCinemaById(int id) {
        log.info("searching playlist by id " + id);
        return playlistDao.findById(id);
    }

    public List<Artist> getAllArtists() {
        log.info("searching all artists");
        return artistDao.findAll();
    }

    public Artist getArtistById(int id) {
        log.info("searching artist by id " + id);
        return artistDao.findById(id);
    }

    @Override
    public Song addSong(Song m) {
        log.info("about to add song " + m);
        return songDao.add(m);
    }

    @Override
    public Artist addArtist(Artist d) {
        log.info("about to add artist " + d);
        return artistDao.add(d);
    }

}
