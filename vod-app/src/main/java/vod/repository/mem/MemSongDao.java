package vod.repository.mem;

import org.springframework.stereotype.Component;
import vod.model.Song;
import vod.repository.SongDao;
import vod.model.Playlist;
import vod.model.Artist;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MemSongDao implements SongDao {
    @Override
    public List<Song> findAll() {
        return SampleData.songs;
    }

    @Override
    public Song findById(int id) {
        return SampleData.songs.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Song> findByArtist(Artist d) {
        return List.of();
    }





    @Override
    public List<Song> findByPlaylist(Playlist c) {
        return SampleData.songs.stream().filter(m -> m.getPlaylists().contains(c)).collect(Collectors.toList());
    }

    @Override
    public Song add(Song m) {
        int max = SampleData.songs.stream().max((m1, m2) -> m1.getId() - m2.getId()).get().getId();
        m.setId(++max);
        SampleData.songs.add(m);
        return m;
    }
}
