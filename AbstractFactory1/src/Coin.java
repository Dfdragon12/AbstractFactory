public class Coin implements IObject{

    @Override
    public void gets() {
        System.out.println("Se esta transformando los graficos de la moneda");
    }

    @Override
    public String info() {
        return "Moneda transformada";
    }
}
