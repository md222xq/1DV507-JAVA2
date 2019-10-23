package ak223wd_assign1.ferry;

public class FerryMain  {
    public static void main(String[] args) throws Exception {

        FerryT ferry1 = new FerryT();
        car audi = new car(2);
        bus mercedes = new bus(16);
        lorry tesla = new lorry(1);
        bicycle bmx = new bicycle();

        ferry1.embark(audi);
        ferry1.embark(mercedes);
        ferry1.embark(tesla);
        ferry1.embark(bmx);

        System.out.println("Passenger on board      : "+ferry1.countPassengers());
        System.out.println("Vehicles on board       : "+ferry1.countVehicleSpace());
        System.out.println("Money made by the ferry : "+ferry1.countMoney());
        System.out.println(ferry1.toString());
        ferry1.disembark();
        System.out.println("\nArrived to destination. Everyone is disembarking.");
        System.out.println(ferry1.toString());
    }
}
