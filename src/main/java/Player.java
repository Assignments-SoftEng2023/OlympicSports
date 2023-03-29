import java.util.List;


/**
 * The Player() constructor creates a null ArrayList of NSFs.
 *  b. Create the toString() method for just the player’s name (first name and last name with a space
 * in between).
 *  c. You do not have to write removeNSF().
 *  d. listPlayerNSFs() displays the player’s list of NSFs in text in the following format:
 * Player name: NSF1, NSF2, NSF3
 * For example, Amy Tam: Spain Soccer, Spain Swimming, Spain Curling
 * Do not include a comma at the end of the lists.
 */
public class Player {
    private String firstName;
    private String lastName;
    private List<NSF> nList;

    public Player(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){

    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){

    }
    public List<NSF> getNSF(){
        return nList;
    }
    public void setNSF(List<NSF> NSFs){

    }
    public String toString(){
        return "";
    }
    public void listPlayerNSFs(){

    }
    public void addNSF(NSF nsf){

    }
}