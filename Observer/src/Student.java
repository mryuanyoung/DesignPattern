public class Student implements Observer{

    private int info;

    public Student(){
        this.info = 0;
    }

    @Override
    public void update(int info) {
        setInfo(info);
    }

    public void setInfo(int info) {
        this.info = info;
    }
}
