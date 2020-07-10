
package parkingticketsimulator;

/**
 * The PoliceOfficer class simulates a police officer inspecting parked cars.
 * @author Ashika Shallow
 */
public class PoliceOfficer {
    
    private String name = "";   // The officer's name
    private String badge;      // The officer's badge number
    private ParkedCar car;  // A ParkedCar object
    private ParkingMetre metre;     // A ParkingMetre object
    private ParkingTicket ticket;   // A ParkingTicket object
    
    PoliceOfficer(String nm, String bd){
        name = nm;
        badge = bd;       
    }
    
    public void setCarDetails(ParkedCar c){
        car = new ParkedCar(c.getCarMake(), c.getCarModel(),c.getCarColour(),
        c.getCarLicense(),c.getMinsParked());        
    }
    
    public void setMetreDetails(ParkingMetre m){
        metre = new ParkingMetre(m.getMinsBought());
    }
    
    public int getMinsBought(){
        return metre.getMinsBought();
    }
    
    public String getName(){
        return name;
    }
    
    public String getBadgeNum(){
        return badge;
    }
    
    public String getCarDetails(){
        
        return car.toString();
    }
    
    public int getMinsParked(){
        return car.getMinsParked();
    }
    
    
    public String issueTicket(){
        if(getMinsBought() >= getMinsParked())
            return "No ticket";
        else{
            ticket = new ParkingTicket(new PoliceOfficer(name, badge), car, metre);
            return "Issuing a ticket:\n" + ticket;
        }
    }
    
    @Override
    public String toString(){
        return "Name: " + name + "\nBadge number: " + badge;
    }
}
