import java.util.Scanner;
public class Demo31{
	public static void main(String[] args){
		//求最大公约数和最小公倍数
		Scanner input = new Scanner(System.in);
		System .out.println("请输入两整数");
		int m1 = input.nextInt();
		int n1 = input.nextInt();
		int m = m1>n1? m1:n1;
		int n = n1>m1? n1:m1;
		int ji = m*n;
		while(n!=0){
			int tempt = m%n;
			m = n;
			n = tempt;
		}
		System.out.println("最大公约数为"+m);
		System.out.println("最小公倍数为"+(ji/m));
	}
	
}