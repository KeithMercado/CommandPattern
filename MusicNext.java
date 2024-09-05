public class MusicNext implements Command{

    private MusicPlayer musicPlayer;

    public MusicNext(MusicPlayer musicPlayer){

        this.musicPlayer = musicPlayer;
    }
    @Override
    public String execute() {

        return musicPlayer.nextMusic();
    }
}