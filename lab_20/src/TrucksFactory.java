public class TrucksFactory implements TransportationFactory {

    @Override
    public Transportation createTransportation() {
        return new Trucks();
    }
}
