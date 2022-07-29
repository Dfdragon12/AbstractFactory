import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorldFactory implements IAbstractFactory{

    private IObject object;
    private IWorld world;

    @Override
    public void createLevel() {
        String selectW;

        System.out.println("Se esta creando el nivel");
        System.out.println("1) Mundo 2D, 2) Mundo 3D" );
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.print("Ingresa seleccion: ");
            selectW = br.readLine();
            if("1".equals(selectW)){
                world = new World2D();
            } else {
                world = new World3D();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public IWorld getWorld() {
        return world;
    }

    @Override
    public IObject getObject() {
        return null;
    }
}
