package compugame.objects;

import processing.core.*;
import compugame.main.*;

public class Player extends GameObject {

    public Player() {
        super(ObjectId.Player, 0, 0);
    }

    public void draw(Game g) {

        g.fill(255, 0, 0);
        g.rect(16, 0, 32, 16);
        g.rect(0, 16, 64, 16);

        g.fill(0, 255, 255);
        g.rect(16, 32, 32, 16);
        g.rect(0, 48, 16, 16);
        g.rect(48, 48, 16, 16);

    }

}
