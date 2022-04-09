package 程序初始化的顺序;

public class Base {
    static {
        System.out.println("Base static block 基础静态块-静态对象");
    }

    {
        System.out.println("Base block 基础块-对象1");
    }

    {
        System.out.println("Base block 基础块-对象2");
    }

    public Base() {
        System.out.println("Base constructor 基础构造对象");
    }
}
