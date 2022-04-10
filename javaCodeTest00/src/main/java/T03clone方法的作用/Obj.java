package T03clone方法的作用;

public class Obj {

    private String str = "default value 默认值";

    private  int anInt = 0;

    public String getStr() {
        return str;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public void changeInt() {
        this.anInt = 1;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "str='" + str + '\'' +
                '}';
    }

    public void setStr(String str) {
        this.str = str;
    }
}
