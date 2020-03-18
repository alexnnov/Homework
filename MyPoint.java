import java.util.Objects;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint() {
    }
    public MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] ints = new int[]{x, y};
        return ints;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public double distance(int x,int y){
        return Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2));
    }
    public double distance(MyPoint another){
        return Math.sqrt(Math.pow((another.x-this.x),2)+Math.pow((another.y-this.y),2));
    }
    public double distance(){
        return Math.sqrt(x*x+y*y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPoint)) return false;
        MyPoint myPoint = (MyPoint) o;
        return getX() == myPoint.getX() &&
                getY() == myPoint.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
