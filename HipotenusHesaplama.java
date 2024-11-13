import java.util.Scanner;

public class HipotenusHesaplama {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        System.out.print("1.Kenarı Giriniz : ");
        int a=sc.nextInt();
        
        System.out.print("2.Kenarı Giriniz : ");
        int b=sc.nextInt();
        
        double c = Math.sqrt((a*a) + (b*b));
        
        System.out.println("Hipotenüs : " + c);
	}

}
