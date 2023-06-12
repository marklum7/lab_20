public class CourtFactory implements TransportationFactory {

    @Override
    public Transportation createTransportation() {
        return new Court();
    }
}

