public class Pyramid extends Shape{
    private double height;
    private double s; // площадь основания

    public Pyramid(double height, double s) {
        super(height * s * 4 / 3);
        this.height = height;
        this.s = s;
    }
}
