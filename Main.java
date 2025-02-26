public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 3);
        Quadrato quadrato = new Quadrato(4);
        Triangolo triangolo = new Triangolo(6, 4, 6, 5, 5);
        TriangoloRettangolo triangoloRettangolo = new TriangoloRettangolo(3, 4);

        System.out.println("Rettangolo - Area: " + rettangolo.area() + ", Perimetro: " + rettangolo.perimetro());
        System.out.println("Quadrato - Area: " + quadrato.area() + ", Perimetro: " + quadrato.perimetro());
        System.out.println("Triangolo - Area: " + triangolo.area() + ", Perimetro: " + triangolo.perimetro());
        System.out.println("Triangolo Rettangolo - Area: " + triangoloRettangolo.area() + ", Perimetro: " + triangoloRettangolo.perimetro());
    }
}
