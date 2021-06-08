package compugame.main;

public abstract class GameObject {

    protected ObjectId id;
    protected float x, y;
    public boolean visible = true;

    public GameObject(ObjectId id) {
        this.id = id;
        this.x = 0;
        this.y = 0;
    }

    public GameObject(ObjectId id, float x, float y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public abstract void draw();

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void show() {
        this.visible = true;
    }

    public void hide() {
        this.visible = false;
    }

    public boolean isVisible() {
        return this.visible;
    }

}
