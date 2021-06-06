package net.pjgame.Game;

import processing.core.PApplet;

public class Game extends PApplet {

    public void settings() {
        size(500, 500);
    }

    public void setup() {

    }

    public void draw() {
        background(100);
        fill(200);
        noStroke();
        rect(100, 100, 100, 100);
    }

    public static void main(String[] args) {
        String[] processingArgs = {"Game"};
        Game game = new Game();
        PApplet.runSketch(processingArgs, game);
    }

}
