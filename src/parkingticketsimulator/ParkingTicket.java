
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
        officer = new PoliceOfficer(off.getName(), off.getBadgeNum());
        
    }
    
    public String getCarDetails(){
        return car.toString();
    }
    
    public double fineAmount(){
        double total = 0.0;
        int excessMins = 0;
        
        if(metre.getMinsBought() > officer.getMinsParked()){
            excessMins = metre.getMinsBought() - officer.getMinsParked();
            total += 25.00;
        }
        
        if(excessMins > 60){
            int over60 = excessMins - 60;
            total += over60 * 10;
        }
        
        return total;
    }
    
    public String toString(){
        return "The car's info: ";
    }
}
