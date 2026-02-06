import java.util.Scanner;
public class exfun10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre del qual et tornaré la seva taula de multiplicar: ");
        int n = sc.nextInt();
        taula(n);
    }
    public static void taula(int n){
        for(int i=0;i<=10;i++){
            System.out.println(n + "x" + i + "=" + n*i);
        }
    } 
}