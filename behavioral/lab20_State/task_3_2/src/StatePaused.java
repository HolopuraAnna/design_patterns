public class StatePaused implements State {

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Resuming: " + player.getCurrentTrack());
        player.setState(new StatePlaying());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already paused");
    }

    @Override
    public void next(MediaPlayer player) {

        int nextTrack =
                (player.getCurrentTrackNum() + 1)
                        % player.getTracks().size();

        player.setTrackNum(nextTrack);

        System.out.println("Switched to: " + player.getCurrentTrack());
    }

    @Override
    public void prev(MediaPlayer player) {

        int prevTrack =
                (player.getCurrentTrackNum() - 1
                        + player.getTracks().size())
                        % player.getTracks().size();

        player.setTrackNum(prevTrack);

        System.out.println("Switched to: " + player.getCurrentTrack());
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopped");
        player.setState(new StateStopped());
    }
}