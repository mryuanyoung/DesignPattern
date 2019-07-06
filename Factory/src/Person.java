public class Person {

    private AbstractHead head;
    private AbstractHeart heart;

    public static void main(String[] args) {
        Person person = new Person();
        AbstractFactory factory1 = Factory.getFactory();
        AbstractFactory factory2 = BigFactory.getBigFactory();
        person.head = factory2.getHead();
        person.heart = factory1.getHeart();
        person.sayColor();
        person.sayHead();
    }

    private void sayHead(){
        System.out.println(this.head.getHead());
    }

    private void sayColor(){
        System.out.println(this.heart.getHeart());
    }
}
