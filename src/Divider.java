public class Divider extends WritingMaterials {
    String dividerType;
    double metal;

    public Divider(String dividerType, double metal) {
        super.setDraw(true);
        this.dividerType = dividerType;
        this.metal = metal;
    }

    public Divider(String name, String color, int price, double length, boolean draw, String dividerType, double metal) {
        super(name, color, price, length, draw);
        this.dividerType = dividerType;
        this.metal = metal;
    }

    public Divider(String name, int price, double length, boolean draw, String dividerType, double metal) {
        super(name, price, length, draw);
        this.dividerType = dividerType;
        this.metal = metal;
    }

    public Divider(String name, int price, String dividerType, double metal) {
        super(name, price);
        this.dividerType = dividerType;
        this.metal = metal;
    }

    public String getDividerType() {
        return dividerType;
    }

    public double getMetal() {
        return metal;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public void setMetal(double metal) {
        this.metal = metal;
    }
}
