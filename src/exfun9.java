import java.util.Scanner;
public class exfun9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom");
        String nom = sc.nextLine();
        System.out.println("Sou brut?");
        double soubrut = sc.nextDouble();

        double irpf = irpf(soubrut);
        double descompte = descompte(soubrut, irpf);
        double souNet = souNet(soubrut, descompte);

        System.out.println("Client: " +nom);
        System.out.println("Retencio: " +descompte);
        System.out.println("Net: " + souNet);
    }
    public static double irpf(double soubrut){
        double irpf =0;
        if (soubrut < 12000) irpf = 10;
        else if (soubrut < 50000) irpf = 25;
        else irpf = 20;
        return irpf;
    }
    public static double descompte(double soubrut, double irpf){
        return soubrut*(irpf/100);
    }
    public static double souNet(double soubrut, double descompte){
        return soubrut - descompte;
    }
}