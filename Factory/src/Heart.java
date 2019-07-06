public class Heart implements AbstractHeart{

    private String color;

    public Heart(){
        this.color = "red";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getHeart(){
        return "color: " + getColor();
    }
}
