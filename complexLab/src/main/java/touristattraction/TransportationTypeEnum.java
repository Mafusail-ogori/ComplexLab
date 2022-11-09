package touristattraction;

import java.util.Random;

public enum TransportationTypeEnum {
    Car,
    Bus,
    Train,
    Plane;
    public static TransportationTypeEnum getRandomTransport(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
