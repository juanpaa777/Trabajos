package src.mx.utng.s06;

import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrsa un numero para generar la tabla de multiplicar: ");
        int num=scanner.nextInt();
        scanner.close();
        for(int i=1;i<=10;i++){
            //System.out.println(i+"x5="+i*5);
            System.out.printf("%dx%d= %d \n",num,i,i*num);

        }

        short [] valores={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < valores.length; i++) {
        }
        for (short s : valores) {
            System.out.println(s+" ");
        }

        //while
        short i=0;
        while (++i<=10) {
            System.out.println(i);
        }

        // do while
        i=1;
        do{
            System.out.println(i);

        }while(i++<10);
}
}