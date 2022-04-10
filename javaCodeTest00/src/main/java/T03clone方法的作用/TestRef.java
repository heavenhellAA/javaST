package T03clone方法的作用;

public class TestRef {

    private Obj aObject = new Obj();
    private int anRefInt = 0;

    public Obj getaObject() {
        return aObject;
    }

    public int getAnRefInt() {
        return anRefInt;
    }

    public void changeObj(Obj inObj) {
        inObj.setStr("changed value 改变后值");
    }

    public void changeInt(int inInt) {
        inInt = 1;
    }


    public static void main(String[] args) {
        /*
        java在处理基本数据类型，
        例如char int double 等时，都是按照值传递，传递的是输入参数的复制，
        其他方式都是以引用传递，
        也就是说传递的是对象的一个引用
         */
        TestRef oRef = new TestRef();
        System.out.println("=================引用类型================");
        System.out.println("调用changeObj()前：" + oRef.getaObject());
        oRef.changeObj(oRef.getaObject());
        System.out.println("调用changeObj()后：" + oRef.getaObject());

        System.out.println("=================基本数据类型================");
        System.out.println("changeInt()前：" + oRef.getAnRefInt());
        oRef.changeInt(oRef.getAnRefInt());
        System.out.println("changeInt()后：" + oRef.getAnRefInt());
        /*
          对象除了在函数调用时是引用传递，在使用=赋值时也采用引用传递
         */
        System.out.println("==============通过“=”符号的方法克隆===============");
        Obj a = new Obj();
        Obj b = a;
        b.changeInt();
        System.out.println("a：" + a.getAnInt());
        System.out.println("b：" + b.getAnInt());
    }
}
