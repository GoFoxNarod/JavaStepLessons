public class Fish extends Animal{
    String squama;
    boolean upStreamSwim;

    Fish(){
        super();
        super.type = "РЫБЫ";
        super.isSwim = true;
        this.squama = "No";
        this.upStreamSwim = false;

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
}

