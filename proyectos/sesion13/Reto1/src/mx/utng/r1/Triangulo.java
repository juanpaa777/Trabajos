package mx.utng.r1;

    public class Triangulo implements Figura {
        private double base;
        private double altura;
        {
            base = 100;
            altura = 200;
        }
        @Override
        public double formulaCalculoArea() {
            System.out.println("El area del triangulo es: "+(base*altura)/2);
            return altura;
        }
      }

