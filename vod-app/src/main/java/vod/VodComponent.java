package vod;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import vod.model.Playlist;
import vod.service.PlaylistService;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class VodComponent {

    private final PlaylistService playlistService;

    @PostConstruct
    public void init() {
        log.info("App started - looking for playlists...");
        List<Playlist> playlists = playlistService.getAllPlaylists();
        log.info("{} playlists found:", playlists.size());
        playlists.forEach(p -> log.info(p.toString()));
    }
}