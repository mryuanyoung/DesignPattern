public class BigFactory implements AbstractFactory {

    private static BigFactory bigFactory;

    private BigFactory(){}

    @Override
    public AbstractHeart getHeart(){
        return new YellowHeart();
    }

    @Override
    public AbstractHead getHead(){
        return new BigHead();
    }

    public static BigFactory getBigFactory(){
        if(bigFactory == null){
            bigFactory = new BigFactory();
        }
        return bigFactory;
    }
}
