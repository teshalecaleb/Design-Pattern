public class SoftDrinksDespensery {
    DespenseryState noCoin;
    DespenseryState emptyDespensery;
    DespenseryState hasRequest;


    DespenseryState despenserystate;

    double singCanPrice = 0.5d;
    int numCocaInMachine = 3;
    int numPepsiInMachine = 3;

    public SoftDrinksDespensery(){

        hasRequest = new HasRequest(this);

        noCoin = new NoCoin(this);
        emptyDespensery = new EmptyDespensery(this);
        despenserystate = noCoin;

        if (numCocaInMachine == 0 && numPepsiInMachine == 0){
            despenserystate = emptyDespensery;
        }


    }
    void setDespenserystate(DespenseryState newDespenserystate){
        despenserystate = newDespenserystate;
    }
    public void setNumCocaInMachine(int newnumCocaInMachine) {
        numCocaInMachine = newnumCocaInMachine;
    }
    public void setNumPepsiInMachine(int newnumPepsiInMachine) {
        numPepsiInMachine = newnumPepsiInMachine;
    }

    public void insertCoin(float coin){
        despenserystate.insertCoin(coin);
    }
    public void ejectCocaCan(){
        despenserystate.ejectCocaCan();
    }
    public  void  ejectPepsiCan(){
        despenserystate.ejectPepsiCan();
    }

    public DespenseryState getHasRequest(){return hasRequest;}
    public DespenseryState getNoCoin() { return noCoin; }
    public DespenseryState getEmptyDespensery(){return emptyDespensery;}



}
