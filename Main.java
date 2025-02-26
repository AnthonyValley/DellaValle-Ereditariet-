public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 3);
        Quadrato quadrato = new Quadrato(4);

        System.out.println("Rettangolo - Area: " + rettangolo.area() + ", Perimetro: " + rettangolo.perimetro());
        System.out.println("Quadrato - Area: " + quadrato.area() + ", Perimetro: " + quadrato.perimetro());
    }
}