public class MusicLast implements Command{

    private MusicPlayer musicPlayer;

    public MusicLast(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }
    @Override
    public String execute() {
        return musicPlayer.previousMusic();
    }
}