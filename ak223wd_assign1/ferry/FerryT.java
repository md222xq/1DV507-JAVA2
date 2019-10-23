package ak223wd_assign1.ferry;

import java.util.Iterator;
import java.util.ArrayList;


public class FerryT implements Ferry{

    private int nbrPassenger;
    private int vehSpace;
    private int countMo;
    private ArrayList<Vehicle> list;
    private int countBuses;
    private int countLorry;
    private int countCar;
    private int countBicycle;
    private int bicycleT;
    private final int MAX_PASSENGER_SPACE;
    private final int MAX_CAR_SPACE;

    public FerryT(){

        MAX_PASSENGER_SPACE = 200;
        MAX_CAR_SPACE = 40;
        countMo = 0;
        vehSpace = 0;
        nbrPassenger = 0;
        countBuses=0;
        countLorry=0;
        countCar=0;
        countBicycle=0;
        list = new ArrayList<Vehicle>();
    }

    @Override
    public String toString() {
        iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------------\n");
        sb.append("\tFerry Information : ");
        sb.append("\n--------------------------------------");
        sb.append("\nNumber of PASSENGER in the Ferry : "+nbrPassenger);
        sb.append("\nNumber of CAR in the Ferry       : "+countCar);
        sb.append("\nNumber of BUS in the Ferry       : "+countBuses);
        sb.append("\nNumber of LORRY in the ferry     : "+countLorry);
        sb.append("\nNumber of BICYCLE in the ferry   : "+countBicycle);
        sb.append("\n--------------------------------------");
        sb.append("\nEarned Money                     : "+countMo+" €");
        sb.append("\nSpace remaining                  : "+(40-vehSpace)+"/40");
        return sb.toString();
    }

    @Override
    public int countPassengers() {
        return nbrPassenger;
    }

    @Override
    public int countVehicleSpace() {
        return vehSpace;
    }

    @Override
    public int countMoney() {
        return countMo;
    }

    @Override
    public Iterator<Vehicle> iterator() {
        Iterator<Vehicle> lit = list.iterator();
        while (lit.hasNext()){
            Vehicle v = lit.next();
            if(v instanceof car){
                countCar++;
            } else if(v instanceof bicycle){
                countBicycle++;
            } else if(v instanceof lorry){
                countLorry++;
            } else if(v instanceof bus){
                countBuses++;
            }
        }

        return lit;
    }

    @Override
    public void embark(Vehicle v) {
        if(v instanceof bicycle){
            if(((bicycle) v).getembark() == false){
                if(bicycleT%5==0){
                    if(hasSpaceFor(v)){
                        int nbr = v.getNumberOfPass();
                        nbrPassenger+=nbr;
                        countMo+=40;
                        bicycleT++;
                        vehSpace++;
                        list.add(v);

                    } else {
                        System.out.println("The ferry is full, Sorry!");
                    }
                } else {
                    nbrPassenger++;
                    countMo+=40;
                    bicycleT++;
                    list.add(v);
                }
            } else {
                System.out.println("This Vehicle already embarked..");
            }
        }

        else if(v instanceof car){
            if(((car)v).getEmbarkedCar() == false){
                if(hasSpaceFor(v)){
                    int nbr = v.getNumberOfPass();
                    nbrPassenger+=nbr;
                    countMo+=100 + 20*nbr;
                    vehSpace++;
                    ((car)v).setEmbarkedCar(true);
                    list.add(v);
                } else {
                    System.out.println("This ferry is full, sorry.");
                }
            } else {
                System.out.println("This vehicle already embarked. ");
            }
        }

        else if(v instanceof lorry){
            if(((lorry)v).getEmbarkedLorry()==false){
                if (hasSpaceFor(v)){
                    int nbr = v.getNumberOfPass();
                    nbrPassenger+=nbr;
                    countMo+=300 + (20*nbr);
                    vehSpace+=8;
                    ((lorry)v).setEmbarkedLorry(true);
                    list.add(v);
                } else {
                    System.out.println("The ferry is full, sorry. ");
                }
            } else {
                System.out.println("This vehicle already embarked. ");
            }

        }

        else if(v instanceof bus){
            if(((bus)v).getEmbarkedBus() == false ){
                if(hasSpaceFor(v)){
                    int nbr = v.getNumberOfPass();
                    nbrPassenger +=nbr;
                    countMo+=200 + 15*nbr;
                    vehSpace+=4;
                    ((bus)v).setEmbarkedBus(true);
                    list.add(v);
                } else {
                    System.out.println("The ferry is full, sorry.");
                }
            } else {
                System.out.println("This vehicle already embarked.");
            }

        }
    }

    @Override
    public void embark(Passenger p) {
        if(nbrPassenger + p.getPass() <=MAX_PASSENGER_SPACE){
            nbrPassenger+=p.getPass();
        } else {
            System.out.println("Sorry, there is not enough space in the Ferry.");
        }
    }

    @Override
    public void disembark() {
        vehSpace = 0;
        nbrPassenger = 0;
        countBicycle=0;
        countBuses=0;
        countLorry=0;
        countCar=0;
        bicycleT=0;
        list.clear();

    }

    @Override
    public boolean hasSpaceFor(Vehicle v) {
        if(v instanceof bicycle){
            if(vehSpace + 1<=MAX_CAR_SPACE){
                if(nbrPassenger + v.getNumberOfPass() <=MAX_PASSENGER_SPACE){
                    return true;
                }
                else {
                    return false;
                }
            }
        }

        else if(v instanceof bus){
            if(vehSpace+4<=MAX_CAR_SPACE){
                if(nbrPassenger + v.getNumberOfPass() <=MAX_PASSENGER_SPACE){
                    return true;
                } else {
                    return false;
                }
            }
        }

        else if(v instanceof car){
            if(vehSpace + 1 <= MAX_CAR_SPACE){
                if(nbrPassenger + v.getNumberOfPass() <=MAX_PASSENGER_SPACE){
                    return true;
                } else {
                    return false;
                }
            }
        }

        else if(v instanceof lorry){
            if(vehSpace + 8<=MAX_CAR_SPACE){
                if (nbrPassenger + v.getNumberOfPass()<=MAX_PASSENGER_SPACE){
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public boolean hasRoomFor(Passenger p) {
        if(nbrPassenger + p.getPass() <=MAX_PASSENGER_SPACE){
            return true;
        }
        return false;
    }
}
