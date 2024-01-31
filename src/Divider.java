public class Divider extends WritingMaterials {
    String dividerType;
    boolean metal;
    public Divider(){
        super();
        super.setDraw(true);

    }
    public Divider(String dividerType, boolean metal) {
        this.dividerType = dividerType;
        this.metal = metal;
    }

    public Divider(String name, String color, int price, double length, boolean draw, String dividerType, boolean metal) {
        super(name, color, price, length, draw);
        this.dividerType = dividerType;
        this.metal = metal;
    }

    public Divider(String name, int price, double length, boolean draw, String dividerType, boolean metal) {
        super(name, price, length, draw);
        this.dividerType = dividerType;
        this.metal = metal;
    }

    public Divider(String name, int price, String dividerType, boolean metal) {
        super(name, price);
        this.dividerType = dividerType;
        this.metal = metal;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public String getDividerType() {
        return dividerType;
    }

    public boolean isMetal() {
        return metal;
    }
    public final void draw_circle(){
        System.out.println("Нарисован круг");
    }
    @Override
    public void display() {
        System.out.println("Имя:" + super.getName()+".Умеет рисовать:"+ (super.isDraw()?"Да":"НЕТ"));
    }
}
