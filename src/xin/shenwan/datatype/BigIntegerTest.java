package xin.shenwan.datatype;

import java.math.BigInteger;

/**
 * Created by 12450 on 2019/2/13.
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("60");
        BigInteger b = new BigInteger("16");
        BigInteger c = new BigInteger(new byte[]{2,1});
        System.out.println(a.add(b));
        System.out.println(c);

    }
    public void run(String a,int b){}
    public void run(int a,String b){}
}
