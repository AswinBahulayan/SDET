package classRoom;

public class InnerClass {

    /*
    * 1.normal inner class
    * 2.anonymous inner class
    * 3.Static inner class
    * 4.inner class inside a method*/

    public static class newClass{

        public static void test(){
            System.out.println("inside inner class");
        }
    }

    public static void main(String[] args) {
        InnerClass outer=new InnerClass();
//        newClass inner=new newClass();
        newClass.test();

       Runnable runnable=new Runnable() {
           @Override
           public void run() {
               System.out.println("inside anonymous inner class");
           }
       };
       Thread thread=new Thread(runnable);
       thread.run();

        Runnable runnable1=()->{System.out.println("second runnable");};

        ExampleFunctionalInterface ex=new ExampleFunctionalInterface() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };

        ExampleFunctionalInterface ex1=( a, b)->{
            return a+b;
        };

        System.out.println(ex1.add(2,3));




    }
}
