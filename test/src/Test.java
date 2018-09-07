class StaticDemo {
        static{
            System.out.println("父类的静态代码块");
        }
    {
        System.out.println("父类的普通初始化块");
    }

    public StaticDemo() {
        System.out.println("父类构造函数");
    }
}
class StaiticDemo2 extends  StaticDemo{
    static {
        System.out.println("儿子中的静态初始化块");
    }
   {
        System.out.println("儿子中的普通初始化块");
    }

    public StaiticDemo2() {
        System.out.println("儿子中的构造函数");
    }
}

class StaiticDemo3 extends  StaiticDemo2{
    static {
        System.out.println("孙子中的静态初始化块");
    }
   /* {
        System.out.println("孙子中的普通初始化块");
    }*/

    public StaiticDemo3() {
        System.out.println("孙子子中的构造函数");
    }
}




public class Test{
    public static void main(String[] args) {
            new StaiticDemo2();
            //new StaiticDemo3();
    }

}
