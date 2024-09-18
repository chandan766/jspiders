
import java.util.Scanner;
public class Bill{
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the electricity consuption(In Unit): ");
		int consuption = sc.nextInt();
		System.out.print("Enter the Pending electricity Bill(In Rs.) if any otherwise enter 0 : ");
		float arrears = sc.nextFloat();
		System.out.println();
		System.out.println(" ".repeat(12)+"Electricity Bill");
		System.out.println("-".repeat(50));
		System.out.println("Rate of Units(Per Unit)");
		System.out.println("20 Units"+" ".repeat(27)+"0.0");
		System.out.println("20-70 Units"+" ".repeat(24)+"2.0");
		System.out.println("70-100 Units"+" ".repeat(23)+"4.0");
		System.out.println("100-130 Units"+" ".repeat(22)+"7.0");
		System.out.println("Above 130 Units"+" ".repeat(20)+"15.0");
		System.out.println("-".repeat(50));
		System.out.println("Consuption(Units)"+" ".repeat(18)+consuption);
		float amt = 0;
		if(consuption>130){
			float t = consuption - 130;
			amt+= t*15;
			consuption = 130;
		}
		if(consuption>100){
			float t = consuption - 100;
			amt+= t*7;
			consuption = 100;
		}
		if(consuption>70){
			float t = consuption - 70;
			amt+= t*4;
			consuption = 70;
		}
		if(consuption>20){
			float t = consuption - 20;
			amt+= t*2;
		}
		if(arrears>0){
			float interest = arrears*10/100;
			System.out.println("Energy Charges(Amt)"+" ".repeat(16)+amt);
			amt+=arrears+interest;
			System.out.println("Arrears(Due Amt)"+" ".repeat(19)+arrears);
			System.out.println("Interest(10% Of Arrears)"+" ".repeat(11)+interest);
		}else{
			float discount = amt*5/100;
			System.out.println("Energy Charges(Amt)"+" ".repeat(16)+amt);
			amt-=discount;
			System.out.println("Discount(5% of Amt)"+" ".repeat(16)+discount);
		}
		System.out.println("-".repeat(50));
		System.out.println("Net Payable(Amt)"+" ".repeat(19)+amt);
		System.out.println("-".repeat(50));
		
	}

}
