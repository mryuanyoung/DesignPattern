public class Factory implements AbstractFactory{

    private static Factory factory;

    private Factory(){}

    @Override
    public AbstractHead getHead(){
        return new Head();
    }

    @Override
    public AbstractHeart getHeart(){
        return new Heart();
    }

    public static Factory getFactory(){
        if(factory == null){
            factory = new Factory();
        }
        return factory;
    }
}
