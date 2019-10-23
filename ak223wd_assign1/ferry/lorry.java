package ak223wd_assign1.ferry;

public class lorry extends Vehicle {

    private boolean embarkedLorry;

    public lorry() {

    }
    public lorry (int nbrPass) throws Exception {

        if (nbrPass >0 && nbrPass<=2) {

            setNumberOfPass(nbrPass);
        }
        else{
            throw new Exception("Enter a number of passenger that is between 1 and 2");
        }

    }


    public boolean getEmbarkedLorry() {

        return embarkedLorry;
    }

    public void setEmbarkedLorry(boolean b) {

        embarkedLorry = b;
    }

    public void setNbrPassLorry (int passenger) throws Exception {

        if (passenger>0 && passenger<=2) {
            setNumberOfPass(passenger);
        }
        else {
            throw new Exception("Enter a number of passenger that is between 1 and ");
        }

    }
}
