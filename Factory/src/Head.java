public class Head implements AbstractHead{

    private int size;

    public Head(){
        this.size = 100;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public String getHead(){
        return "size: " + getSize();
    }
}
