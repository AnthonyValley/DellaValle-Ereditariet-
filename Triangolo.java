class Triangolo extends Poligono {
    protected double base;
    protected double altezza;
    protected double lato1, lato2, lato3;

    public Triangolo(double base, double altezza, double lato1, double lato2, double lato3) {
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    @Override
    public double area() {
        return (base * altezza) / 2;
    }

    @Override
    public double perimetro() {
        return lato1 + lato2 + lato3;
    }
}
