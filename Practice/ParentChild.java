package Practice;

public class ParentChild {

    public static void main(String[] args) {
        Parent p;
        if(true)
        {
            p =  new Child1();
        }else {
            p = new Child2();
        }

        p.d();
    }
}

class Parent {
    void b() {
        System.out.println("I am Parent");
    }
    void d() {
        System.out.println("I am parent D");
    }
}

class Child1 extends Parent {
    void c() {
        System.out.println("I am Child1");
    }
}

class Child2 extends Parent {
    void d() {
        System.out.println("I am Child2");
    }
}