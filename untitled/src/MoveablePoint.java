public class MoveablePoint extends Point{
    float xSpeed;
    float ySpeed;
    public MoveablePoint(){}
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x,float y,float xSpeed, float ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }
    public float[] getSpeed(){
        float[] speed = {xSpeed,ySpeed};
        return speed;
    }
    public Point move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
    @Override
    public String toString() {
        return "("+ x +"," + y+"),speed= (" + xSpeed +","+ ySpeed+")";
    }
}
