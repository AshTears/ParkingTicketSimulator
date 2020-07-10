
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
    
    /**
     * This constructor initialises a police officer.
     * @param nm The officer's name
     * @param bd The officer's badge number
     */
    PoliceOfficer(String nm, String bd){
        name = nm;
        badge = bd;       
    }
    
    /**
     * setCarDetails method initialises the car object.
     * @param c A car object
     */
    public void setCarDetails(ParkedCar c){
        car = new ParkedCar(c.getCarMake(), c.getCarModel(),c.getCarColour(),
        c.getCarLicense(),c.getMinsParked());        
    }
    
    /**
     * setMetreDetails method initialises the metre object.
     * @param m A metre object
     */
    public void setMetreDetails(ParkingMetre m){
        metre = new ParkingMetre(m.getMinsBought());
    }
    
    /**
     * getMinsBought method
     * @return The metre read.
     */
    public int getMinsBought(){
        return metre.getMinsBought();
    }
    
    /**
     * getName method
     * @return The officer's name.
     */
    public String getName(){
        return name;
    }
    
    /**
     * getBadgeNum method
     * @return The officer's badge number
     */
    public String getBadgeNum(){
        return badge;
    }
    
    /**
     * getCarDetails method
     * @return A String containing the car's details.
     */
    public String getCarDetails(){
        
        return car.toString();
    }
    
    /**
     * getMinsParked method
     * @return The minutes the car was parked.
     */
    public int getMinsParked(){
        return car.getMinsParked();
    }
    
    
    /**
     * issueTicket method
     * @return A ticket object detailing the fine to pay.
     */
    public String issueTicket(){
        if(getMinsBought() >= getMinsParked())
            return "No ticket";
        else{
            ticket = new ParkingTicket(new PoliceOfficer(name, badge), car, metre);
            return "Issuing a ticket:\n" + ticket;
        }
    }
    
    /**
     * toString method
     * @return A String with the officer's information.
     */
    @Override
    public String toString(){
        return "\nName: " + name + "\nBadge number: " + badge;
    }
}
