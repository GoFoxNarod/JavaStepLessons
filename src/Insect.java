public class Insect extends Animal{
    int wingCount;
    boolean likeJesus;
    Insect(){
        super();
        super.type = "Насекомое";
        super.isWalk = true;
        this.wingCount = 0;
        this.likeJesus = false;
    }

    public void setName(String name){
        super.name = name;
    }

    public void setWingCount(int wingCount){
        this.wingCount = wingCount;
    }

    public String getWingCount(){
        return "Количество крыльев:"+wingCount+".";
    }

    public void setLikeJesus(boolean likeJesus){
        this.likeJesus = likeJesus;
    }
    public String isLikeJesus(){
        return "Умеет ли ходить по воде:"+(likeJesus ?"ДА":"НЕТ");
    }
    public void gggggg(){
        System.out.println("Gggggg!!!!");
    }
    @Override
    public void display(){
        System.out.println("I am Insect"+" "+ "Тип: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + weight +
                ", Умеет летать: " + (isFly ? "Да" : "Нет") + ", Умеет ходить: "
                + (isWalk ? "Да" : "Нет") + ", Умеет плавать: " + (isSwim ? "Да" : "Нет") + ", " + getWingCount() +
                isLikeJesus() +".");
    }
}

