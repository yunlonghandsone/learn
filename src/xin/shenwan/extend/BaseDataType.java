package xin.shenwan.extend;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by 12450 on 2019/2/20.
 */
public class BaseDataType {
    public static void main(String[] args) {
        final int a = 1;
        final List list = new ArrayList();
        list.add(1);
        final String s = "1";
        s.substring(1);
        final StringBuffer str = new StringBuffer("111");
        str.append("222");
        System.out.println(str.toString());
        String test = "1,1,1,1,1,1,1,1,1,1,1,1";
        StringTokenizer stringTokenizer = new StringTokenizer(test,",");
        String[] result = new String[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreElements()){
            result[i++] = stringTokenizer.nextToken();
        }
        for (String s1:result) {
            System.out.print(s1+" ");
        }

    }
}
