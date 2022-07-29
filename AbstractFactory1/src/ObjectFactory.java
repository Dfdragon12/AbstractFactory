import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObjectFactory implements IAbstractFactory{

    private IWorld world;
    private IObject object;
    @Override
    public void createLevel() {
        String selectO;

        System.out.println("Seleccione objeto");
        System.out.println("1) Moneda, 2) Goomba ");
        InputStreamReader isr1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr1);

        try {
            System.out.print("Ingresa seleccion: ");
            selectO = br1.readLine();
            if("1".equals(selectO)){
                object = new Coin();
            } else {
                object = new Goomba();
            }
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public IWorld getWorld() {
        return null;
    }

    @Override
    public IObject getObject() {
        return object;
    }
}
