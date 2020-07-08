
package parkingticketsimulator;

/**
 * The ParkingTicket class simulates a parking ticket.
 * @author Ashika Shallow
 */
public class ParkingTicket {
    
    private ParkedCar car;      // A ParkedCar object
    private ParkingMetre metre; // A ParkingMetre object
    private PoliceOfficer officer;  // A PoliceOfficer object
    
    ParkingTicket(ParkedCar car, ParkingMetre metre, PoliceOfficer off){
        this.car = new ParkedCar(car.getCarMake(), car.getCarModel(),car.getCarColour(),
        car.getCarLicense(),car.getMinsParked());
        
        this.metre = new ParkingMetre(metre.getMinsBought());
        
        officer = new PoliceOfficer();
    }
}
