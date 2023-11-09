public class Bird extends Animal {
    String area;
    boolean winterFly;
    public Bird(){
        super();
        super.type = "Птица";
        super.isFly = true;
        this.area = "No area";
        this.winterFly = false;

    }

    public void setName(String name){
        super.name = name;
    }

    public void setArea(String area){

        this.area = area;
    }

    public String getArea(){

        return "Зона обитания :" +area+".";
    }

    public void setWinterFly(boolean winterFly){

        this.winterFly = winterFly;
    }

    public String  isWinterFly(){

        return "Улетают зимовать:" + (winterFly ? "ДА" : "НЕТ" )+".";
    }


    public void chirik_chirik(){
        System.out.println("Chirik-Chirik");
    }
}

