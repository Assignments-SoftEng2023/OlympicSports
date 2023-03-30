import java.util.List;


/**
 * The constructor creates a null List of Players.
 *  b. Create the toString() method for just the country and sport attributes. For example, “United
 * States Basketball” or “Indonesia Badminton”.
 *  c. You do not have to write removePlayer().
 *  d. listNSFPlayers() displays the NSF’s list of players in text in the following format:
 * NSF country sport’s players: player1_name, player2_name, player3_name
 *  For example: United States Tennis players: Serena Williams, Roger Federer, Martina Navratilova
 * Do not include a comma at the end of the lists
 */
public class NSF{
    public String sport;
    public String country;
    private List<Player> pList;
    Player player;


    public NSF(String sport, String country){
        this.sport = sport;
        this.country = country;
        pList = null;
    }
    public String getSport(){
        return sport;
    }
    public void setSport(String sport){

    }
    public String getCountry(){
        return sport;
    }
    public void setCountry(String country){

    }
    public List<Player> getNSF(){
        return pList;
    }
    public void setPlayers(List<Player> players){

    }
    public String toString(){
        return "";
    }
    public void listNSFPlayers(){

    }
    public void addPlayer(Player player){

    }

}