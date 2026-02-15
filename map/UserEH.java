package map;

import java.util.Objects;

public class UserEH {
    private int id;

    private  String name;

    @Override
    public boolean equals(Object ob){
        if(this == ob) return true;

        if(ob == null) return false;

        if(getClass() != ob.getClass()) return false;

        UserEH other = (UserEH) ob;
        return this.id == other.id  && Objects.equals(this.name,other.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id,name);
    }
}
