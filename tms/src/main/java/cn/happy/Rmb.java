package cn.happy;

import org.apache.ibatis.io.ResolverUtil;

/**
 * Created by lenovo on 2017/11/12.
 */
public class Rmb implements Runnable{
  /*  private static final char[] data = {'零','壹','贰','叄','肆','伍','陆','柒','捌','玖'};
    private static final char[] units = {'元','拾','佰','仟','万','拾','佰','仟','亿'};
    public static String convert(int money){
        StringBuffer sbf = new StringBuffer();
        int uint = 0;
        while(money != 0){
            sbf.insert(0,units[uint++]);
            sbf.insert(0,data[money%10]);
            money = money/10;
        }
        //去零
        return sbf.toString().replaceAll("零[拾佰仟]","零").replaceAll("零+万","万").replaceAll("零+元","元").replaceAll("零+","零");

    }


    public static void main(String[] args){
        Rmb rmb = new Rmb();
        System.out.println(rmb.convert(1012)); //输出壹仟零壹拾壹元
    }
    */

    /*    private int j;

        public static void main(String args[]) {
            ThreadTest tt = new ThreadTest();
            Inc inc = tt.new Inc();
            Dec dec = tt.new Dec();
            for (int i = 0; i < 2; i++) {
                Thread t = new Thread(inc);
                t.start();
                t = new Thread(dec);
                t.start();
            }
        }

        private synchronized void inc() {
            j++;
            System.out.println(Thread.currentThread().getName() + "-inc:" + j);
        }

        private synchronized void dec() {
            j--;
            System.out.println(Thread.currentThread().getName() + "-dec:" + j);
        }

        class Inc implements Runnable {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    inc();
                }
            }
        }

        class Dec implements Runnable {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    dec();
                }
            }
        }*/


 /*   public static void main(String[] args) {


        while (true) {
            try {
                Thread.sleep(10000);
                System.out.println("Hello World");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
*/
/*
        private static Singleton instance;
    private Singleton() {

        }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;

    }*/




    int count;
    static Object obj = new Object();
    public void run() {
        synchronized(obj){
            if(Thread.currentThread().getName().equals("a") || Thread.currentThread().getName().equals("b")){
                count++;
                System.out.println(Thread.currentThread().getName() + "_" + count);
            }else{
                count--;
                System.out.println(Thread.currentThread().getName() + "_" + count);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
       Rmb t = new Rmb();
        new Thread(t, "a").start();
        new Thread(t, "b").start();
        new Thread(t, "c").start();
        new Thread(t, "d").start();
        Thread.sleep(1000);
        System.out.println(t.count);
    }
}