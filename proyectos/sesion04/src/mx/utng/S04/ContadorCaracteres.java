package mx.utng.S04;

public class ContadorCaracteres {
    public boolean isVocal(char caracter){
        return (caracter=='a'|| caracter=='e'|| caracter=='i' || caracter=='o' || caracter=='u');
    }
    public boolean isNumero(char caracter){
    short codigoAscii=(short) caracter;
    return codigoAscii>=47 && codigoAscii<=58;
    }

    public boolean isConsonante(char caracter){
  short codigoAscii=(short) caracter;
  return codigoAscii>=97 && codigoAscii<=122 && !isVocal(caracter);  


}

public boolean isSimbolo(char caracter){
    return !(isVocal(caracter) || isConsonante(caracter) || isNumero(caracter));
}


public int cuentaVocales(String palabra){
    int vocales=0;
    for (char caracter : palabra.toLowerCase().toCharArray()) {
        if (isVocal(caracter)) {
            vocales++;
        }
    }
    return vocales;
}


public int cuentaConsonates(String palabra){
    int consonantes=0;
    for (char caracter : palabra.toLowerCase().toCharArray()) {
        if (isConsonante(caracter)) {
            consonantes++;
        }
    }
    return consonantes;
}


public int cuentaNumeros(String palabra){
    int numeros=0;
    for (char caracter : palabra.toLowerCase().toCharArray()) {
        if (isNumero(caracter)) {
            numeros++;
        }
    }
    return numeros;
}


public int cuentaSimbolos(String palabra){
    int simbolos=0;
    for (char caracter : palabra.toLowerCase().toCharArray()) {
        if (isSimbolo(caracter)) {
            simbolos++;
        }
    }
    return simbolos;
}
    
}
