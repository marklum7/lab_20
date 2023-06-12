public class AirplaneFactory implements TransportationFactory {

    @Override
    public Transportation createTransportation() {
        return new Airplane();
    }
}
