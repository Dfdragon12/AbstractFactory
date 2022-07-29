public interface IAbstractFactory {
    void createLevel();
    IWorld getWorld();
    IObject getObject();
}
