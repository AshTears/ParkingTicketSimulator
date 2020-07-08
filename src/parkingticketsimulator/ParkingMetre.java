
package parkingticketsimulator;

/**
 * The ParkingMetre class simulates a parking metre.
 * @author Ashika Shallow
 */
public class ParkingMetre {
    
    // Declare variables
    private int minsBought;     // Number of minutes of parking time bought.
    
    /**
     * This constructor sets the value of the minsBought variable.
     * @param mins Number of minutes bought.
     */
    ParkingMetre(int mins){
        minsBought = mins;
    }
    
    /**
     * getMinsBought method
     * @return The number of minutes bought.
     */
    public int getMinsBought(){
        return minsBought;
    }
    
    /**
     * toString method
     * @return A string detailing the minutes bought.
     */
    @Override
    public String toString(){
        return "Number of minutes bought: " + minsBought;
    }
}
