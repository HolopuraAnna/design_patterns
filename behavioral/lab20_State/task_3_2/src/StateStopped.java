public class StateStopped implements State {

    @Override
    public void play(MediaPlayer player) {

        if (player.getTracks().isEmpty()) {
            System.out.println("No tracks");
            return;
        }

        System.out.println("Playing: " + player.getCurrentTrack());
        player.setState(new StatePlaying());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Can't pause. Player is stopped.");
    }

    @Override
    public void next(MediaPlayer player) {
        System.out.println("Can't switch track. Player is stopped.");
    }

    @Override
    public void prev(MediaPlayer player) {
        System.out.println("Can't switch track. Player is stopped.");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Already stopped");
    }
}