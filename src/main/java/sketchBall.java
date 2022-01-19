public class sketchBall {
    int xAxis;
    int yAxis;
    int speed;
    Ball movement;
    sketchBall(int xAxis,int yAxis,int speed,Ball movement){
        this.xAxis=xAxis;
        this.yAxis=yAxis;
        this.speed=speed;
        this.movement=movement;
    }
    public void display(){
        movement.ellipse(xAxis,yAxis,10,10);
    }
    public void rightMove(){
        xAxis=xAxis+speed;
    }

}
