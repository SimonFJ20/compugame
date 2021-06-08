package compugame.main;

public abstract class GameObject {

    protected ObjectId id;
    protected float x = 0, y = 0;
    private boolean visible = true;

    public GameObject(ObjectId id) {
        this.id = id;
    }

    public GameObject(ObjectId id, float x, float y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Game game);

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
