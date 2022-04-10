package T04反射机制;

/**反射机制允许程序在运行时进行自我检查，同时也允许对其内部成员进行操作*/
class Base {
    public void f() {
        System.out.println("Base");
    }
}

class Sub extends Base {
    public void f() {
        System.out.println("Sub");
    }
}

/**
 * 反射机制提供的功能主要有：
 * 1.得到一个对象所属的类
 * 2.获取一个类的所有成员变量和方法
 * 3.在运行时创建对象
 * 4.在运行时调用对象的方法
 */

public class Test {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("T04反射机制.Sub");
            Base b = (Base) c.newInstance();
            b.f();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
