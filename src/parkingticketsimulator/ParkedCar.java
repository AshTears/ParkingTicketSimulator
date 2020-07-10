
package parkingticketsimulator;

/**
 * The ParkedCar class simulates a parked car
 * @author Ashika Shallow
 */
public class ParkedCar {
    // Declare Variables
    private String make = "";       // The car's make
    private String model = "";      // The car's model
    private String colour = "";     // The car's colour
    private String license = "";    // The car's license number
    private int minsParked;         // The number of minutes the car was parked
    
    /**
     * This constructor initialises the car's details and the minutes it 
     * was parked.
     * @param mk The car's make
     * @param mod The car's model
     * @param col The car's colour
     * @param lic The car's licence number
     * @param mins Number of mins cars was parked
     */
    public ParkedCar(String mk, String mod, String col, String lic, int mins){
        make = mk;
        model = mod;
        colour = col;
        license = lic;
        minsParked = mins;
    }
    
    /**
     * getCarMake method
     * @return The make of the car 
     */
    public String getCarMake(){
        return make;
    }
    
    /**
     * getCarModel method
     * @return The model of the car
     */
    public String getCarModel(){
        return model;
    }
    
    /**
     * getCarColour method
     * @return The colour of the car
     */
    public String getCarColour(){
        return colour;
    }
    
    /**
     * getCarLicense method
     * @return The car's license number
     */
    public String getCarLicense(){
        return license;
    }
    
    /**
     * getMinsParked method
     * @return Number of minutes the car was parked.
     */
    public int getMinsParked(){
        return minsParked;
    }
    
    /**
     * toString method
     * @return A string detailing the car's details.
     */
    @Override
    public String toString(){
        return "\nCar's make: " + make + 
        "\nCar's model: " + model + 
        "\nCar's colour: " + colour + 
        "\nCar's license number: " + license;
    }
}
