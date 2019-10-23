package ak223wd_assign1.ferry;

public class car extends Vehicle {

    private boolean embarked;

    public car() {

    }

    public car(int nbrPass) throws Exception {
        if (nbrPass > 0 && nbrPass <= 4)

            setNumberOfPass(nbrPass);
        else {
            throw new Exception("Enter a positive integer that is between 1 and 4 included.");
        }

    }

    //public int getAPassCar() {return AmountOfPassenger;}
    public boolean getEmbarkedCar() {

        return embarked;
    }
    public void setEmbarkedCar (boolean b) {

        embarked=b;
    }

    public void setNbrPassCar(int n) throws Exception {
        if (n > 0 && n <= 4)
            setNumberOfPass(n);
        else {
            throw new Exception("Enter a positive integer that is between 1 and 4 included.");
        }

    }
}
