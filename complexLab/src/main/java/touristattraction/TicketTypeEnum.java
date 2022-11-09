package touristattraction;

import java.util.Random;
public enum TicketTypeEnum {
    Resort,
    Excursion,
    Healing,
    Shopping,
    Cruise;
    public static TicketTypeEnum getTicketType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
