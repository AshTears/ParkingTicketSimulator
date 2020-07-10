
package parkingticketsimulator;

/**
 * The ParkingTicket class simulates a parking ticket.
 * @author Ashika Shallow
 */
public class ParkingTicket {
    
    private ParkedCar car;      // A ParkedCar object
    private ParkingMetre metre; // A ParkingMetre object
    private PoliceOfficer officer;  // A PoliceOfficer object
    
    /**
     * This constructor initialises the officer, car, and metre objects.
     * @param off The officer object
     * @param car The car object
     * @param m The metre object
     */
    ParkingTicket(PoliceOfficer off, ParkedCar car, ParkingMetre m){
        
        officer = new PoliceOfficer(off.getName(), off.getBadgeNum());
        this.car = new ParkedCar(car.getCarMake(), car.getCarModel(), car.getCarColour(), car.getCarLicense(), car.getMinsParked());
        metre = new ParkingMetre(m.getMinsBought());
    }
    
    /**
     * getCarDetails method
     * @return A String with the car's details.
     */
    public String getCarDetails(){
        return "\nCar's make: " + car.getCarMake() + 
        "\nCar's model: " + car.getCarModel() + 
        "\nCar's colour: " + car.getCarColour() + 
        "\nCar's license number: " + car.getCarLicense();
    }
    
    /**
     * fineAmount method
     * @return The amount of the fine
     */
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
    
    /**
     * toString method
     * @return A fine detailing the amount to pay, car's details, and the officer
     * issuing the ticket.
     */
    @Override
    public String toString(){
        return "The car's info: " + getCarDetails() + "\nAmount of fine: " + fineAmount() +
                "\nOfficer who issued the ticket: " + officer.toString();
    }
}
