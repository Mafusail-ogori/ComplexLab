package touristattraction;

import java.util.Random;


public enum TouristTicketTitleEnum {
    AzurePassion,
    GreatSunrise,
    ArrogantFruit,
    NatureBeauty,
    MoonlightShine,
    ProminentTime;

    public static TouristTicketTitleEnum getRandomTitle() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }


}
