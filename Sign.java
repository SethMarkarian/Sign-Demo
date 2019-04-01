
public class Sign
{
    private String message;
    private int distance;
    
    public Sign(String message, int distance) {
        this.message = message;
        this.distance = distance;
    }
    
    public void display() {
        System.out.println(message);
    }
    
    public final int getMile() {
        return distance;
    }
}
