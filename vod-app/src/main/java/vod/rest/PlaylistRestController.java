package vod.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vod.model.Playlist;
import vod.service.PlaylistService;
import java.util.List;

@RestController // Automatycznie serializuje wynik do JSON w ciele odpowiedzi [cite: 1659]
@RequiredArgsConstructor
public class PlaylistRestController {

    private final PlaylistService playlistService;

    @GetMapping("/playlists") // Mapuje żądanie GET na adres localhost:8080/playlists [cite: 1660]
    public List<Playlist> getPlaylists() {
        return playlistService.getAllPlaylists();
    }
}