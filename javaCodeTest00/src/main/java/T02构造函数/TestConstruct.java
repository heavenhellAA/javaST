package T02构造函数;

/**
 * 构造函数的特点
 * 1.构造函数必须与类名相同，且无返回值
 * 2.每个类可以有多个构造函数
 * 3.构造函数可以有任意个数的参数，包括0个
 * 4.构造函数必须new，不可以直接调用，必须由系统调用
 * 5.构造函数不能被继承，不可以被覆盖，但可以被重载
 */
public class TestConstruct {
    //构造函数
    public TestConstruct() {
        System.out.println("construct 构造");
    }

    //方法
    //方法不需要与类名或者构造函数名称相同
    public void Test() {
        System.out.println("call TestConstruct 调用构造1");
    }

    public void TestConstruct() {
        System.out.println("call TestConstruct 调用构造2");
    }

    public static void main(String[] args) {
        TestConstruct a = new TestConstruct();
        a.Test();
        a.TestConstruct();
    }
}
