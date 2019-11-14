public class NoCoin implements DespenseryState {
    SoftDrinksDespensery softDrinksDespensery;
    public NoCoin(SoftDrinksDespensery newSoftDrinksDespensery){
        softDrinksDespensery = newSoftDrinksDespensery;
    }
    @Override
    public void insertCoin(float coin) {
        if(softDrinksDespensery.numPepsiInMachine + softDrinksDespensery.numCocaInMachine !=0){
            if (coin == softDrinksDespensery.singCanPrice){
                System.out.println("50 cent entered");
                softDrinksDespensery.setDespenserystate(softDrinksDespensery.getHasRequest());
            }else{
                System.out.println("Wrong coin");
                System.out.println("Your coin is ejected.");
                softDrinksDespensery.setDespenserystate(softDrinksDespensery.getNoCoin());

            }
        }
        else{
            System.out.println("Sorry the dispensary is empty..ejecting coin");
            softDrinksDespensery.setDespenserystate(softDrinksDespensery.getEmptyDespensery());
        }

    }

    @Override
    public void ejectPepsiCan() {
        System.out.println("Please insert coin");
    }

    @Override
    public void ejectCocaCan() {
        System.out.println("Please insert coin");
    }
}
