public class Koordinate {
    private double x;
    private double y;

    public Koordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Koordinate() {
    }




    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Koordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
