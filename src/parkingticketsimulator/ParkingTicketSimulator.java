
package parkingticketsimulator;

/**
 * This program simulates a police officer issuing a parking ticket.
 * @author Ashika Shallow
 */
public class ParkingTicketSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ParkedCar car = new ParkedCar("Hyundai", "Sonata", "black", "F9U 3E0", 180);
        ParkingMetre  metre = new ParkingMetre(90);
        PoliceOfficer jack = new PoliceOfficer("Jack Dorsey", "3956");
        
        jack.setCarDetails(car);
        jack.setMetreDetails(metre);
        
        System.out.println(jack.issueTicket());
    }
    
}
