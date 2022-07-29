public class World2D implements IWorld{

    @Override
    public void run() {
        System.out.println("Se esta generando el mundo");
    }

    @Override
    public String getData() {
        return "Mapa de Super Mario World generado";
    }
}
