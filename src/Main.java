public class Main {
    public static void main(String[] args) {
        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        wm.display();

        Pen p = new Pen();
        p.setName("Паркер");
        p.display();
        p.setCountColor(2);
        p.setAuto(true);
        System.out.println("Количество цветов:"+p.getCountColor());
        System.out.println("Автоматическая:"+(p.isAuto()?"ДА":"НЕТ"));
        p.writeMyName();

    }
}
