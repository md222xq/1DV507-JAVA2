package ak223wd_assign1.ferry;

public class bus extends Vehicle {

    private boolean embarkedBus;

    public bus(){

    }

    public bus(int nbrPass) throws Exception {
        if(nbrPass>0 && nbrPass<=20){
            setNumberOfPass(nbrPass);
        } else {
            throw new Exception("Provide a number that is between 1 and 20!");
        }
    }

    public void setNbrPassBus(int nbrPass) throws Exception{
        if(nbrPass>0&&nbrPass<=20){
            setNumberOfPass(nbrPass);
        } else {
            throw new Exception("Provide a number that is between 1 and 20. Thanks");
        }
    }

    public boolean getEmbarkedBus(){
        return embarkedBus;
    }

    public void setEmbarkedBus(boolean b ){
        embarkedBus = b;
    }


}
