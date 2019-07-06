import java.util.ArrayList;

public class Question implements OB{

    private ArrayList<Observer> observers;

    public Question(){
        this.observers = new ArrayList<>();
    }

    @Override
    public boolean addObserver(Observer o) {
       try{
           this.observers.add(o);
           return true;
       }catch (Exception e){
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean removeObserver(Observer o) {
        try{
            this.observers.remove(o);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void changeInfo() {
        for (Observer observer : this.observers) {
            observer.update(1);
        }
    }
}
