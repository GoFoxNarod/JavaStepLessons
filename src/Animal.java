public class Animal {
    String type;
    String name;
    int age;
     double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;
    {
        type = "undifined";
        name = "undifined";
        age = 0;
    }

    public static void StringDescription(){
        System.out.println("Класс животные");

    }
    public Animal(){

    }

    public Animal(String type,String name, int age, double weight, boolean isFly, boolean isSwim, boolean isWalk){
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isSwim = isSwim;
        this.isWalk = isWalk;

    }

    public void setName(String name){
        this.name = name;
    }

    public void display() {
        System.out.println("Тип: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + weight +
                ", Умеет летать: " + (isFly ? "Да" : "Нет") + ", Умеет ходить: "
                + (isWalk ? "Да" : "Нет") + ", Умеет плавать: " + (isSwim ? "Да" : "Нет"));
    }


    public void holiday(int n) {
        weight += n * 0.1;
    }
    public void holiday(double m, int n) {
        weight += n * m;
        weight = Math.ceil(weight * 10) / 10;
    }
    public void holiday(double m) {
        holiday(m, 1);
    }
    public void holiday() {
        holiday(0.1);
    }

    
}
