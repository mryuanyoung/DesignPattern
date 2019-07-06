public class YellowHeart implements AbstractHeart {

    private String color;

    public YellowHeart(){
        this.color = "Yellow";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getHeart(){
        return "color: " + getColor();
    }
}
