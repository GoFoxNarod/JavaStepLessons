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
        System.out.println("Новый цвет:"+color);
    }
    public void priceUp(int price){
        this.price = price;
        System.out.println("Увеличивает цену на это число. Новая цена:" + (price+price));
    }
    public void priceDown(int price){
        this.price = price;
        System.out.println("Уменьшает цену на это число. Новая цена:" + (price-price));
    }
    public void draw(boolean draw){
        System.out.println(draw? name +" провел линию. Её цвет - "+color+".": name+" не может ничего рисовать!");
    }
}

