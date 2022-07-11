public class Koordinate {
    // Kintamieji
    private double x;
    private double y;

    // Konstruktoriai
    public Koordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Koordinate() {
    }


    //----------------------Klasės funkcijos / metodai ------------------------

    /**
     * Apskaičiuoja atstumą tarp dviejų koordinačių
     * @param koord1 pirma kordinatė
     * @param koord2 antra kordinatė
     * @return realųjį skaičių (atstumą)
     */
    public static double atstumasTarpDviejuKoordinaciu(Koordinate koord1, Koordinate koord2) {
        double x1 = koord1.getX();
        double x2 = koord2.getX();
        double y1 = koord1.getY();
        double y2 = koord2.getY();
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    /**
     * Overloadinta atstumo tarp dviejų koordinačių funcija
     * @param x1 pirmos koordinatės x
     * @param y1 pirmos koordinatės y
     * @param x2 antros koordinatės x
     * @param y2 antros koordinatės y
     * @return
     */
    public static double atstumasTarpDviejuKoordinaciu(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    /**
     * Overloadinta atstumo funkcija, kuri NĖRA static, kadangi lygina ŠITĄ koordinatę, su ta kurią gauna
     * @param koord iki kurios koordinatės
     * @return realųjų skaičių - atstumą
     */
    public double atstumasTarpDviejuKoordinaciu(Koordinate koord) {
        double x1 = this.x;
        double x2 = koord.getX();
        double y1 = this.y;
        double y2 = koord.getY();
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    // getteriai-setteriai
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
