class TriangoloRettangolo extends Triangolo {
    public TriangoloRettangolo(double base, double altezza) {
        super(base, altezza, base, altezza, Math.sqrt(base * base + altezza * altezza));
    }
}
