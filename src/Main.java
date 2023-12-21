public class Main {
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.draw();
        pen.draw("Синий");
        pen.draw("Зелёный", 15);
        pen.draw(4);
        System.out.println();

        WritingMaterials ruler = new WritingMaterials("линека", 34);
        ruler.setDraw(false);
        ruler.draw("Синий");
        ruler.draw("Зелёный", 15);
        ruler.draw(4);


    }
}
