import java.util.List;

/**
 * The constructor creates a null List of ISFs.
 *  b. IOC.countNSFs() determines how many NSFs are in all of the IOC’s ISFs.
 *  c. IOC.countPlayersinISFNSFs() determines how many players are registered across all of this
 * IOC’s ISF’s NSFs. Note: players listed in more than one NSF will be counted multiple times
 */
public class IOC {
    private String name;
    private List<ISF> iList;

    public IOC(String name){
        this.name = name;
        iList = null;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){

    }
    public List<ISF> getISF(){
        return iList;
    }
    public List<ISF> setISF(List<ISF> ISFs){
        return iList;
    }
    public int countNSFs(){
        return 0;
    }
    public int countPlayersInISFNSFs(){
        return 0;
    }

}