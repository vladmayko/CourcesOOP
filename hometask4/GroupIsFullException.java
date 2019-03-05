package hometask4;

/**
 * Created by MacUser on 25.02.19.
 */
public class GroupIsFullException extends Exception{

    @Override
    public String getMessage() {
        return "Group is full already";
    }
}
