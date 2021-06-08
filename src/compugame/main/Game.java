package compugame.main;

import compugame.objects.Player;
import processing.core.PApplet;

public class Game extends PApplet {

    private ObjectHandler objectHandler;

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        this.objectHandler = new ObjectHandler();

        objectHandler.add(new Player());
    }

    public void draw() {
        noStroke();
        noStroke();
        fill(0);
        background(0);

        this.objectHandler.draw(this);
    }

    public static void main(String[] args) {
        String[] processingArgs = {"Game"};
        Game game = new Game();
        PApplet.runSketch(processingArgs, game);
    }

}
