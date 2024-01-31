public class Main {
    public static void main(String[] args) {
        WritingMaterials.info();
        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        wm.display();
        Pen p = new Pen();
        p.setName("Паркер");
        p.setCountColor(2);
        p.setAuto(false);
        System.out.println("Количество цветов:"+(p.getCountColor()));
        System.out.println("Автоматическая - "+(p.isAuto()?"ДА":"НЕТ"));
        p.writeMyName();
        System.out.println(p);

        Ruler r = new Ruler();
        r.setName("Линейка");
        r.display();
        r.setLength(25);
        r.setWood(true);
        System.out.println("Длина линейки:"+(r.getLength()));
        System.out.println("Из дерева:"+(r.isWood()?"ДА":"НЕТ"));
        r.measure();

        Divider d = new Divider();
        d.setName("Циркуль");
        d.display();
        d.setDividerType("С карандашом");
        d.setMetal(true);
        System.out.println("Тип циркуля:"+d.getDividerType());
        System.out.println("сделан ли этот циркуль из металла"+(d.isMetal()?"ДА":"НЕТ"));
        d.draw_circle();
        System.out.println("Количество созданных объектов = "+ WritingMaterials.count);
    }
}
