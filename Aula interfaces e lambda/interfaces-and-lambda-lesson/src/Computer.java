public class Computer implements VideoPlayer, MusicPlayer {
    
    @Override
    public void playVideo() {
        System.out.println("The Computer is playing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("The Computer is stopping video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("The Computer is pausing video");
    }

    @Override
    public void playMusic() {
        System.out.println("The Computer is playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("The Computer is stopping music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("The Computer is pausing music");
    }

}
