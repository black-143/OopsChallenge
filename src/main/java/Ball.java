import processing.core.PApplet;

public class Ball extends PApplet {
    private static final int HEIGHT=480;
    private static final int WIDTH=620;
    sketchBall ball1;
    sketchBall ball2;
    sketchBall ball3;
    sketchBall ball4;
    public static void main(String args[]) {
        PApplet.main("Ball", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup(){
        ball1=new sketchBall(10,HEIGHT/5,1,this);
        ball2=new sketchBall(10,HEIGHT*2/5,2,this);
        ball3=new sketchBall(10,HEIGHT*3/5,3,this);
        ball4=new sketchBall(10,HEIGHT*4/5,4,this);
    }
    @Override
    public void draw(){
        ball1.display();
        ball2.display();
        ball3.display();
        ball4.display();
        ball1.rightMove();
        ball2.rightMove();
        ball3.rightMove();
        ball4.rightMove();
    }
}

