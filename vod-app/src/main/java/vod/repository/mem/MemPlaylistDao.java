package vod.repository.mem;

import org.springframework.stereotype.Component;
import vod.model.Playlist;
import vod.repository.PlaylistDao;
import vod.model.Song;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MemPlaylistDao implements PlaylistDao {

    @Override
    public List<Playlist> findAll() {
        return SampleData.playlists;
    }

    @Override
    public Playlist findById(int id) {
        return SampleData.playlists.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }



    @Override
    public List<Playlist> findBySong(Song m) {
        return SampleData.playlists.stream().filter(c -> c.getSongs().contains(m)).collect(Collectors.toList());
    }
}
