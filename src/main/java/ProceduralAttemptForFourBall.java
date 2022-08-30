import processing.core.PApplet;

public class ProceduralAttemptForFourBall extends PApplet{
    public static final int WIDTH = 850;
    public static final int HEIGHT = 700;
    public static final int DIAMETER = 15;
    public int x=0,x1=0,x2=0,x3=0;
   public static void main(String[] args) {
        PApplet.main(ProceduralAttemptForFourBall.class,args);
   }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
       draw();
    }

    @Override
    public void draw() {
       //paintWhite();
        int y = HEIGHT/5;
       drawCircle(x1,y);
       x1+=1;
       drawCircle(x2,y*2);
       x2+=2;
       drawCircle(x3,y*3);
      x3+=3;
       drawCircle(x,y*4);
       x=x+4;
    }
    public void drawCircle(int x, int y){
       ellipse(x,y,DIAMETER,DIAMETER);
    }
}
