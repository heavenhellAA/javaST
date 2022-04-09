package 程序初始化的顺序;

public class Derived extends Base {
    static {
        System.out.println("Derived static block 子类-静态块-静态对象1");
    }

    static {
        System.out.println("Derived static block 子类-静态块-静态对象2");
    }

    {
        System.out.println("Derived block 子类-对象1");
    }

    {
        System.out.println("Derived block 子类-对象2");
    }

    {
        System.out.println("Derived block 子类-对象3");
    }
    public Derived() {
        System.out.println("Derived constructor 子类-构造对象");
    }

    //    程序入口
    public static void main(String[] args) {
        new Derived();
        /*
          执行优先顺序的原则：
          1.静态对象优先于非静态对象
          2.父类优先于子类
          3.成员变量的构造顺序
          */
    }
}
