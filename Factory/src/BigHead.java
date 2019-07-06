public class BigHead implements AbstractHead {

    private int size;

    public BigHead(){
        this.size = 200;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String getHead(){
        return "size: " + getSize();
    }
}
