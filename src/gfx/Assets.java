package gfx;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ff on 3.11.2015 �..
 */
public class Assets {
    public static BufferedImage background;
    public static BufferedImage player;

    public static void init() {

        player = ImageLoader.loadImage("/images/bbs_spritesheet.png");
    }
}
