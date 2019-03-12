package xin.shenwan.extend;

/**
 * Created by 12450 on 2019/2/20.
 */
public class Outer {
    protected static class Inner{

    }
    public void eat(){

        class Inner2{

        }
    }
    public class Inner1{

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner1 inner1 = outer.new Inner1();
        Inner inner = new Inner();
    }
}
