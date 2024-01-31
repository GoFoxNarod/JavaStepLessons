public class WritingMaterials {
    private  String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;
    private static String description;

    static int count = 1;

    static {
        description = "Класс письменной принадлежности";
    }


    WritingMaterials(){
        count++;
        color = "Undefined";

    }
    WritingMaterials(String name, String color, int price,double length, boolean draw){
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }
    WritingMaterials(String name, int price,double length, boolean draw){
        this.name = name;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }
    WritingMaterials(String name,int price){
        this.name = name;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public boolean setDraw(boolean draw){
        this.draw = draw;
        return draw;
    }

    public boolean isDraw() {
        return draw;
    }

    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Номер объекта: "+count +"Название:"+ name +". Цвет:"+ color +". Цена:"+ price+ ".Длина:" +length+
                ". Умеет рисовать:"+ (draw ?"ДА":"НЕТ");

    }
    public void display(){
        System.out.println("Название:"+ name +". Цвет:"+ color +". Цена:"+ price+ ".Длина:" +length+
                ". Умеет рисовать:"+ (draw ?"ДА":"НЕТ"));
    }
    public void replace_rod(String color){
        this.color = color;
        System.out.println("Новый цвет:"+color);
    }
    public void priceUp(int price2){
        this.price = price;
        System.out.println("Увеличивает цену на это число. Новая цена:" + (price+price2));
    }
    public void priceDown(int price2){
        this.price = price;
        System.out.println("Уменьшает цену на это число. Новая цена:" + (price-price2));

    }
    public void draw(){
        System.out.println(draw? name +" провел линий: 1. Их цвет - "+color+".": name+" не может ничего рисовать!");
    }
    public void draw(int n){
        System.out.println(draw? name +" провел линий:"+ n +". Их цвет:"+ color+".": name +" не может ничего рисовать!");
    }
    public void draw(String color){
        System.out.println(draw? name +" провел линий:1.Их цвет:"+ color+".": name +" не может ничего рисовать!");
    }
    public void draw(String color, int n){
        System.out.println(draw? name +" провел линий:"+ n +". Их цвет:"+color+".": name +" не может ничего рисовать!");
    }
    public static void info(){
        System.out.println(description);
    }


}

