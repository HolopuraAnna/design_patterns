public class StatePlaying implements State {

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Already playing: " + player.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Paused: " + player.getCurrentTrack());
        player.setState(new StatePaused());
    }

    @Override
    public void next(MediaPlayer player) {

        int nextTrack =
                (player.getCurrentTrackNum() + 1)
                        % player.getTracks().size();

        player.setTrackNum(nextTrack);

        System.out.println("Playing next: " + player.getCurrentTrack());
    }

    @Override
    public void prev(MediaPlayer player) {

        int prevTrack =
                (player.getCurrentTrackNum() - 1
                        + player.getTracks().size())
                        % player.getTracks().size();

        player.setTrackNum(prevTrack);

        System.out.println("Playing previous: " + player.getCurrentTrack());
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopped");
        player.setState(new StateStopped());
    }
}