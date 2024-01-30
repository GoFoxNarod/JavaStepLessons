public class Main {
    public static void main(String[] args) {
                Animal.StringDescription();
                Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
                System.out.println(duck);

                Bird b = new Bird();
                b.setName("Bob");
                b.setArea("На югах");
                b.setWinterFly(false);
                System.out.println(b);
                b.chirik_chirik();

                Fish f = new Fish();
                f.setName("Сельд");
                f.setSquama("Крупная");
                f.setUpStreamSwim(true);
                System.out.println(f);
                f.bul_bul();

                Insect i = new Insect();
                i.setName("Жук Жукыч");
                i.setWingCount(4);
                i.setLikeJesus(true);
                System.out.println(i);
                i.gggggg();
                System.out.println("Количество животных: " +Animal.counter);

            }
        }





