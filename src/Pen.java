public class Pen extends WritingMaterials{
    int countColor;
    boolean auto;
    public Pen(){
        super();
        super.setDraw(true);
        this.countColor = -1;
        this.auto = false;
    }
    public void writeMyName(){
        System.out.println("Имя:"+super.getName());
    }

    public int getCountColor() {
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }
}
