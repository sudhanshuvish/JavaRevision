
class A1 implements Runnable{

    public void run(){
        for(int i=0;i<10;i++){
            if(i%2!=0){
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}

class B1 implements Runnable{

    public void run(){
        for(int i=0;i<10;i++){
            if(i%2==0){
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}

public class ThreadsCoding {
    public static void main(String[] args) {

        Runnable A1 = new A1();
        Runnable B1 = new B1();

        Thread t1 = new Thread(A1);
        Thread t2 = new Thread(B1);

        t1.start();
        t2.start();




    }
}
