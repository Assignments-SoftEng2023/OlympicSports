import java.util.List;

public class OlympicSports {

    /**
     * Create 5 NSFs and 15 players.
     *  b. For each of the 5 NSFs, add at least 3 players to them.
     *  c. Take 3 players and add at least 2 national sports federations to each of them.
     *  d. Create 2 ISFs. The first ISF has 3 national sports federations and the second ISF has the
     * remaining 2 national sports federations.
     *  e. Create an IOC that contains the 2 ISFs.
     *
     *  f. Display the players for the NSFs.
     *  g. For two players, display the NSFs they are in. Make sure at they are each registered for more
     * than one NSF.
     *  h. Display the total number of players registered with NSFs in each ISF, and in the IOC
     *  i. Display the total number of NSFs in each ISF and in the IOC
     *
     * @param args
     */

    public static void main(String[] args) {

        IOC ioc1 = new IOC("North American IOC");
            ISF isf1 = new ISF("Baseball sport federation");
                NSF nsf1 = new NSF("Baseball", "United States");
                    Player plr1 = new Player("Laurie", "Leshin");
                NSF nsf2 = new NSF("Baseball", "Argentina");
                    Player plr2 = new Player("Ian", "Wright");
                NSF nsf3 = new NSF("Baseball", "New Mexico");
                    Player plr3 = new Player("Wilson", "Wong");
            ISF isf2 = new ISF("Basketball sport federation");
                NSF nsf4 = new NSF("Basketball", "United States");
                    //plr1 add under here too
                    //plr2 add under here too
                NSF nsf5 = new NSF("Basketball", "Canada");
                    //plr3 add under here too

        //set and get in right places

        //display
    }


}