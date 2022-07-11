public class Programa {
    public static void main(String[] args) {
        Koordinate k1 = new Koordinate(5, 9);
        Koordinate k2 = new Koordinate();
        k2.setX(10);
        k2.setY(8);


        System.out.println("k2 = " + k2);
        System.out.println("k1 = " + k1);


        double atstumas = Koordinate.atstumasTarpDviejuKoordinaciu(k1, k2);
        System.out.println("atstumas = " + atstumas);


        double kitasAtstumas = Koordinate.atstumasTarpDviejuKoordinaciu(5, 10, 0, 7);
        System.out.println("kitasAtstumas = " + kitasAtstumas);
    }
}
