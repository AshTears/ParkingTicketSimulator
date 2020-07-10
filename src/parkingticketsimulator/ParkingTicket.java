
package parkingticketsimulator;

/**
 * The ParkingTicket class simulates a parking ticket.
 * @author Ashika Shallow
 */
public class ParkingTicket {
    
    private ParkedCar car;      // A ParkedCar object
    private ParkingMetre metre; // A ParkingMetre object
    private PoliceOfficer officer;  // A PoliceOfficer object
    
    ParkingTicket(PoliceOfficer off, ParkedCar car, ParkingMetre m){
        
        officer = new PoliceOfficer(off.getName(), off.getBadgeNum());
        this.car = new ParkedCar(car.getCarMake(), car.getCarModel(), car.getCarColour(), car.getCarLicense(), car.getMinsParked());
        metre = new ParkingMetre(m.getMinsBought());
    }
    
    public String getCarDetails(){
        return "\nCar's make: " + car.getCarMake() + 
        "\nCar's model: " + car.getCarModel() + 
        "\nCar's colour: " + car.getCarColour() + 
        "\nCar's license number: " + car.getCarLicense();
    }
    
    public double fineAmount(){
        double total = 0.0;
        int excessMins = 0;
        
        excessMins = car.getMinsParked() - metre.getMinsBought();
        total += 25.00;
        
        
        if(excessMins > 60){
            int over60 = excessMins - 60;
            total += over60 * 10;
        }
        
        return total;
    }
    
    @Override
    public String toString(){
        return "The car's info: " + getCarDetails() + "\nAmount of fine: " + fineAmount() +
                "\nOfficer who issued the ticket: " + officer.toString();
    }
}
