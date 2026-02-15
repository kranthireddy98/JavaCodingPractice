package map;

import java.util.Objects;

public class MapEx {

    private int id;
    private String name;
    private String email;


    public boolean equals(Object ob){

        if(this == ob) return true; // same reference
        if(ob == null) return false;

        if(getClass() != ob.getClass()) return false; // check class

        MapEx o = (MapEx) ob;
        return o.id==this.id && o.name.equals(this.name) && o.email.equals(this.email);

        /*
        equals() Contract
        1. reflexive
        2. Symmetric
        3. Transitive
        4. Consistent
        5. X.equals(null) must return false
         */
    }

    public int hashCode(){
        return Objects.hash(this.id,this.name,this.email);
    }

}

class  ex extends MapEx{

}