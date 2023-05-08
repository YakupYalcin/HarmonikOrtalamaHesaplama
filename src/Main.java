import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        double[] dizi={1,2,3,4,5,6,7,8};


        double result=0.0;
        System.out.print("[");
        for (int row = 0;row <dizi.length;row++){

           double sum=1/dizi[row];
            System.out.print(+dizi[row]+",");
            result+=sum;

        }
        System.out.println("]");
        System.out.print("Dizisinin Harmonik Ortalaması : "+""+dizi.length/result);
    }
}