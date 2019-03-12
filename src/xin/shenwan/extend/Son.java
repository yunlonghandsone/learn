package xin.shenwan.extend;

/**
 * Created by 12450 on 2019/2/20.
 */
public class Son extends Father{

    public void eat(){
        System.out.println("儿子在吃饭");
    }
    public void run(){
        System.out.println("儿子在跑步");
    }

    public static void main(String[] args) {
        Father father = new Son();
        //会报错，因为子类引用指向父类对象的时候只能访问父类中非private的方法
        //father.run();
    }
}
