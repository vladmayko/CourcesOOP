package hometask8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by MacUser on 16.03.19.
 */
public class BlackList {
    private List<Class> locked = new ArrayList<Class>();

    public BlackList() {
    }

    public List<Class> getLocked() {
        return locked;
    }

    public void setLocked(List<Class> locked) {
        this.locked = locked;
    }

    public void addClassToBlackList(Class c){
        locked.add(c);
    }

    public boolean checkBlackList(Object o){
        if(locked != null) {
            for (Class s : locked) {
                if (s.equals(o.getClass()) || s.isAssignableFrom(o.getClass())) return true;
            }
        }
        return false ;
    }

    @Override
    public String toString() {
        return "BlackList{" + "locked=" + locked + '}';
    }
}
