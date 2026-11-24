public class Ej36_1_PrediceExpresiones {
    public static void main (String []args){
        int a = 5;
        int b = 2;
        int c = 3;

        System.out.println("A) " + (a + b * c)); //11
        System.out.println("B) " + ((a + b) * c));//21
        System.out.println("C) " + (a * b % c));//1
        System.out.println("D) " + (a - b - c));//0
        System.out.println("E) " + (12 / b * c));//18
        System.out.println("F) " + (12 / (b * c)));//2
        System.out.println("G) " + (a + b * c / 2));//8
        System.out.println("H) " + (a + b * c > 10));//true

    }
}
