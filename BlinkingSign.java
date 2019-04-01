public class BlinkingSign extends Sign
{
    private String message2;
    private boolean onFirst;
    private double blinkTime;
    
    public BlinkingSign(String m1, String m2, int d, double t) {
        super(m1, d);
        message2 = m2;
        onFirst = true;
        blinkTime = t;
    }
    
    public void blink() {
        onFirst = !onFirst;
    }
    
    public void display() {
        if(onFirst) {
            super.display();
        }
        else {
            System.out.println(message2);
        }
    }
    
    public double getBlinkTime() {
        return blinkTime;
    }
}
