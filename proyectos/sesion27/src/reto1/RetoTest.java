package reto1;

public class RetoTest {

  Hilo1 h1 = new Hilo1();
  Hilo2 h2 = new Hilo2();
  
  h2.setDaemon(true);

  h1.start();
  h2.start();

  try {
    h1.join();
    h2.join();
  } catch (InterruptedException e) {
    e.printStackTrace();
  }
  
}