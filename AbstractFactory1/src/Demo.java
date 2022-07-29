public class Demo {
    public static void main(String[] args){
        IAbstractFactory myFactory = new WorldFactory();
        myFactory.createLevel();

        IWorld myWorld = myFactory.getWorld();

        myWorld.run();

        System.out.println("Mundo compilado " + myWorld.getData());

        IAbstractFactory myFactory1 = new ObjectFactory();
        myFactory1.createLevel();

        IObject myObject = myFactory1.getObject();

        myObject.gets();

        System.out.println("Objeto insertado " + myObject.info());
    }
}
