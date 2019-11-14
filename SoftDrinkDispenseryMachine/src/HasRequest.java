public class HasRequest implements DespenseryState {
    SoftDrinksDespensery softDrinksDespensery;
    public HasRequest(SoftDrinksDespensery newSoftDrinksDespensery){
        softDrinksDespensery = newSoftDrinksDespensery;
    }

    @Override
    public void insertCoin(float coin) {
        System.out.println("You can inset only one 50 cent coin at a time.");
        System.out.println("Your coin is ejected.");
    }

    @Override
    public void ejectPepsiCan() {

            if (softDrinksDespensery.numPepsiInMachine == 0){
                System.out.println("No Pepsi in dispensary...ejecting coin");
                softDrinksDespensery.setDespenserystate(softDrinksDespensery.getNoCoin());
            }
            else{
                System.out.println("A Single  Pepsi can ejected. ");
                softDrinksDespensery.setNumPepsiInMachine(softDrinksDespensery.numPepsiInMachine - 1);
                softDrinksDespensery.setDespenserystate(softDrinksDespensery.getNoCoin());
            }
    }

    @Override
    public void ejectCocaCan() {
        if (softDrinksDespensery.numCocaInMachine == 0){
            System.out.println("No Coca in dispensary...ejecting coin");
            softDrinksDespensery.setDespenserystate(softDrinksDespensery.getNoCoin());
        }
        else{
            System.out.println("A Single Coca can ejected. ");
            softDrinksDespensery.setNumCocaInMachine(softDrinksDespensery.numCocaInMachine - 1);
            softDrinksDespensery.setDespenserystate(softDrinksDespensery.getNoCoin());
        }

    }
}
