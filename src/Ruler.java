public class Ruler extends WritingMaterials{
    double length;
    boolean wood;
    public Ruler(){
        super();
        super.setDraw(false);
    }

    public Ruler(String name, String color, int price, double length, boolean draw, double length1, boolean wood) {
        super(name, color, price, length, draw);
        this.length = length1;
        this.wood = wood;
    }

    public Ruler(String name, int price, double length, boolean draw, double length1, boolean wood) {
        super(name, price, length, draw);
        this.length = length1;
        this.wood = wood;
    }

    public Ruler(String name, int price, double length, boolean wood) {
        super(name, price);
        this.length = length;
        this.wood = wood;
    }
    public void measure(){
        System.out.println("Сейчас померяем длину");
    }
}
