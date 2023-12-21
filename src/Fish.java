public class Fish extends Animal{
    String squama;
    boolean upStreamSwim;
    {
        super.type = "РЫБЫ";
        super.isSwim = true;
        this.squama = "No";
        this.upStreamSwim = false;
    }

    Fish(){
    }

    public void setName(String name){
        super.name = name;
    }

    public void setSquama(String squama){
        this.squama = squama;
    }

    public String getSquama(){
        return "Размер чешуи:"+squama+".";
    }
    public void setUpStreamSwim(boolean upStreamSwim){
        this.upStreamSwim = upStreamSwim;
    }

    public String isUpStreamSwim(){
        return "Умеет ли плавать против течения:"+(upStreamSwim ? "ДА":"НЕТ");
    }
    public void bul_bul(){
        System.out.println("BUL-BUL");
    }
    @Override
    public void display(){
        System.out.println(("I am Fish" +" "+ "Тип: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + weight +
                ", Умеет летать: " + (isFly ? "Да" : "Нет") + ", Умеет ходить: "
                + (isWalk ? "Да" : "Нет") + ", Умеет плавать: " + (isSwim ? "Да" : "Нет") + ", " + getSquama() +
                "Умеет ли плавать против течения:" + (isSwim ? "ДА" : "НЕТ" )+"."));

    }
}

