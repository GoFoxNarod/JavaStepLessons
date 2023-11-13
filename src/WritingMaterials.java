public class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean draw;

    WritingMaterials(){

    }
    WritingMaterials(String name, String color, int price,double length, boolean draw){
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }

    public void display(){
        System.out.println("Название:"+ name +". Цвет:"+ color +". Длина:"+ price+ ". Умеет рисовать:"+ (draw ?"ДА":"НЕТ"));
    }
    public void replace_rod(String color){
        this.color = color;
    }
    public void priceUp(int price){
        this.price = price;
    }
}

