public class EmptyDespensery implements DespenseryState {
    SoftDrinksDespensery softDrinksDespensery;
    public EmptyDespensery(SoftDrinksDespensery newSoftDrinksDespensery){
        softDrinksDespensery = newSoftDrinksDespensery;
    }
    @Override
    public void insertCoin(float coin) {
        System.out.println("We don't have any Soft Drinks...ejecting coin");
        softDrinksDespensery.setDespenserystate(softDrinksDespensery.getNoCoin());
    }
    @Override
    public void ejectPepsiCan() {
        System.out.println("We don't have any Soft Drinks...");
    }
    @Override
    public void ejectCocaCan() {
        System.out.println("We don't have any Soft Drinks...");
    }
}
