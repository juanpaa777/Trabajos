package mx.utng.s05;

public class Primitivos {
    public static void main(String[] args) {
        byte valorByte=1;
        short valorShort=1;
        int valorInt=1;
        long valorLong=1;
        float valorFloat=1.5F;
        double valorDouble=1.5;
        System.out.println("byte: "+valorByte  );
        System.out.println("short: "+valorShort  );
        System.out.println("Int: "+valorInt  );
        System.out.println("Long: "+valorLong  );
        System.out.println("Float: "+valorFloat  );
        System.out.println("Double: "+valorDouble  );

        boolean valorBooleano=true;
        char valorChar='a';
        System.out.println("Booleano: "+ valorBooleano);
        System.out.println("Char: "+valorChar);

        int numInt=(int)valorFloat;
        System.out.println("De entero a float (Cast int) "+numInt);

        int letra=(int)valorChar;
        System.out.println(letra);

        char numChar='M';
        int numInt2=(int)numChar;
        System.out.println(numInt2);

        String cadena1="20";
        int numInt3=Integer.parseInt(cadena1);
        System.out.println(numInt3);

        numInt3=numInt3+1;
        
        numInt3++;
        System.out.println(numInt3);

        char valorChar2=(char)numInt2;
        System.out.println(valorChar2);



    }
}
