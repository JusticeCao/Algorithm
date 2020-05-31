import java.util.Scanner;
public class Demo17{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个四位数");
		int number = input.nextInt();
			int ge = number/1%10;
			int shi = number/10%10;
			int bai = number/100%10;
			int qian = number/1000%10;
		System.out.println("个位："+ge+"十位: "+shi+"百位: "+bai+"千位: "+qian);
		int sum = ge+shi+bai+qian;
		System.out.println(sum);
		
	}
	
}