public class Point {
    protected float x;
    protected float y;
    public Point(){
        this.x = 1.0f;
        this.y = 1.0f;
    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] xy = {x,y};
        return xy;
    }

    @Override
    public String toString() {
        return "("+ x + "," + y +")";
    }
}
