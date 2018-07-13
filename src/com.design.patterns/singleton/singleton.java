package singleton;

/**
 * Created by wxy on 2017/8/9 0009.
 * 单例模式
 */
public class singleton {

    private static singleton singleton;

    public singleton getSingleton(){
        if (singleton==null){
            singleton=new singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println("ssss");
    }
}
