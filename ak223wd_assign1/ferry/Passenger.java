package ak223wd_assign1.ferry;

public class Passenger{

    private int nbrOfPassenger;

    public Passenger() {
        nbrOfPassenger=0;
    }
    public Passenger(int n) throws Exception{
        if (n>0&&n<=200) {
            nbrOfPassenger=n;
        } else {
            throw new Exception("The number of Passenger has to be more than 0 and less than 201.");
        }
    }

    public int getPass() {return nbrOfPassenger;}
    public void setPass(int passenger) {
        if (passenger>0) {
            nbrOfPassenger=passenger;
        }
    }


}