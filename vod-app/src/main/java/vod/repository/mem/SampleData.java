package vod.repository.mem;

import vod.model.Artist;
import vod.model.Playlist;
import vod.model.Song;

import java.util.ArrayList;
import java.util.List;

class SampleData {

    static List<Playlist> playlists = new ArrayList<>();

    static List<Artist> artists = new ArrayList<>();

    static List<Song> songs = new ArrayList<>();

    static {

        Artist pitbull = new Artist(1, "armando", "perez");
        Artist swift = new Artist(2, "taylor", "swift");
        Artist rihanna = new Artist(3, "robyn", "fenty");
        Artist avicii = new Artist(4, "tim", "bergling");

        Song globalWarming = new Song(1, "global warming", "https://ocdn.eu/pulscms-transforms/1/D0gk9kuTURBXy8zYzFhMDRhZS1jOGRiLTQxN2YtOTcwYy1iNjRjZDBkMjc4MDYuanBlZ5GTBc0DFM0BvIGhMAU", pitbull, (float) 4.1);
        Song armando = new Song(2, "armando", "https://fwcdn.pl/fpo/40/98/124098/7521214.6.jpg", pitbull, (float) 4.3);

        Song getawayCar = new Song(3, "getaway car", "https://i.iplsc.com/-/00094J03E94SMPSS-C122.jpg", swift, (float) 3.9);
        Song theFateOfOphelia = new Song(4, "the fate of ophelia", "https://bi.im-g.pl/im/5b/9b/12/z19510363V,-Pitbull--Nowe-porzadki---rez--Patryk-Vega--plakat.jpg", swift, (float) 3.1);

        Song aGirlLikeMe = new Song(5, "a girl like me", "http://www.gokmichalowo.pl/imprezy2007/katyn/plakat_maly.jpg", rihanna, (float) 4.7);
        Song goodGirlGoneBad = new Song(6, "good girl gone bad", "http://gapla.fn.org.pl/public/cache/P21829-483x700.jpg", rihanna, (float) 4.4);

        Song heyBrother = new Song(7, "hey brother", "https://m.media-amazon.com/images/M/MV5BNTE5NjAxMTEzNl5BMl5BanBnXkFtZTcwMjYzMDQ0Ng@@._V1_UX182_CR0,0,182,268_AL_.jpg", avicii, (float) 4.9);
        Song layMeDwon = new Song(8, "lay me dwon", "http://gapla.fn.org.pl/public/cache/P19423-483x700.jpg", avicii, (float) 4.3);

        bind(globalWarming, pitbull);
        bind(armando, pitbull);

        bind(getawayCar, swift);
        bind(theFateOfOphelia, swift);

        bind(aGirlLikeMe, rihanna);
        bind(goodGirlGoneBad, rihanna);

        bind(heyBrother, avicii);
        bind(layMeDwon, avicii);

        Playlist playlista1 = new Playlist(1, "fun", "https://www.kinoteka.pl/img/logo.png");
        Playlist playlista2 = new Playlist(2, "impreza2025", "http://www.festiwalfilmuniemego.pl/wp-content/uploads/2015/11/Kino-pod-Baranami.png");
        Playlist playlista3 = new Playlist(3, "hity 2015", "https://i2.wp.com/garretreza.pl/wp-content/uploads/2018/07/nh.jpg");
        Playlist playlista4 = new Playlist(4, "szybka jazda", "https://static2.s-trojmiasto.pl/zdj/c/n/19/2276/250x0/2276445.jpg");

        bind(playlista1, armando);
        bind(playlista3, armando);
        bind(playlista3, globalWarming);
        bind(playlista3, getawayCar);

        bind(playlista1, goodGirlGoneBad);
        bind(playlista4, goodGirlGoneBad);
        bind(playlista4, heyBrother);
        bind(playlista2, heyBrother);
        bind(playlista2, getawayCar);

        songs.add(globalWarming);
        songs.add(armando);
        songs.add(getawayCar);
        songs.add(theFateOfOphelia);
        songs.add(aGirlLikeMe);
        songs.add(goodGirlGoneBad);
        songs.add(heyBrother);
        songs.add(layMeDwon);

        artists.add(pitbull);
        artists.add(swift);
        artists.add(rihanna);
        artists.add(avicii);

        playlists.add(playlista1);
        playlists.add(playlista2);
        playlists.add(playlista3);
        playlists.add(playlista4);

    }

    private static void bind(Playlist c, Song m) {
        c.addSong(m);
        m.addPlaylist(c);
    }

    private static void bind(Song m, Artist d) {
        d.addSongs(m);
        m.setArtist(d);
    }

}
