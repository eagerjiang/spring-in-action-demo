package soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author jiangqw
 * @date 2019/12/2 14:48
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + "by " + artist);
    }
}