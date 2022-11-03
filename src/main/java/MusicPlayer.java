import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MusicPlayer {
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private List<Music> musicList;

    private int volume;

    public void play(){
        for (Music music : musicList) {
            System.out.println(music.playSong());
        }
    }
}
