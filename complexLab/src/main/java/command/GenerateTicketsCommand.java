package command;

import data.TouristAttractionsData;
import touristAttraction.TouristTicket;

import java.util.List;

public class GenerateTicketsCommand implements Command{
    public GenerateTicketsCommand(TouristAttractionsData touristTickets) {
        this.touristTickets = touristTickets;
    }

    TouristAttractionsData touristTickets;

    @Override
    public void execute() {
        touristTickets.touristTicketGenerator();
    }
}
