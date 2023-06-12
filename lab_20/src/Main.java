public class Main {
    public static void main(String[] args) {
        TransportationFactory airplaneFactory = new AirplaneFactory();
        Transportation airplane = airplaneFactory.createTransportation();
        airplane.shipping();

        TransportationFactory trucksFactory = new TrucksFactory();
        Transportation trucks = trucksFactory.createTransportation();
        trucks.shipping();

        TransportationFactory courtFactory = new CourtFactory();
        Transportation court = courtFactory.createTransportation();
        court.shipping();
    }
}
