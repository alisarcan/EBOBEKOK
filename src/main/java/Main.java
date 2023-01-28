import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();
        int n, ebob=0,ekok;

        if(n1>n2)
            n=n2;
        else
            n=n1;
        int i=1;
        while (i<n){
            if (n1%i==0 && n2%i==0){
                ebob=i;
            }
            i++;
        }

        ekok = (n1 * n2) / ebob;

        System.out.print("EBOB : "+ebob);
        System.out.print("EKOK : "+ekok);


    }
}
