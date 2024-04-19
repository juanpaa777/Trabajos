package reto1;

public class Hilo1 {
    @Override
    public void run() {
        for (int i=0; i<=10; i++) {
            System.out.println("Hilo1 " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void join() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'join'");
    }
}