package compugame.main;

import java.util.LinkedList;

public class ObjectHandler {

    LinkedList<GameObject> objects = new LinkedList<GameObject>();

    public void add(GameObject object) {
        this.objects.add(object);
    }

    public void remove(GameObject object) {
        this.objects.remove(object);
    }

    public void draw(Game game) {
        for(int i = 0; i < this.objects.size(); i++) {
            GameObject object = this.objects.get(i);
            if(object.isVisible()) object.draw(game);
        }
    }

}
