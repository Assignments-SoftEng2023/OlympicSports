import java.util.List;


/**
 * The constructor creates a null List of NSFs.
 * b. countNSFs() determines how many NSFs the ISF has.
 * c. countPlayersInNSFs() determines how many players are registered in all of its National Sport
 * Federations (NSFs). Players are counted multiple times if they are registered under more than
 * one NSF
 */
public class ISF{
    private String name;
    private List<NSF> nList;
    private NSF nsf;

    public ISF(String name){
        setName(name);
        nList = null;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public List<NSF> getNSFs(){
        return nList;
    }
    public boolean addNSF(NSF nsfs){
        return true;
    }
    public int countNSFs(){
        return 0;
    }
    public int countPlayersInNSFs(){
        return 0;
    }

}