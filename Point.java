package src;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((getX()*getX()) + (getY()*getY()));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x-getX())*(x-getX()) + (y-getY())*(y-getY()));
    }

    public double distance(Point point) {
        return distance(point.x, point.y);
    }
    
}
