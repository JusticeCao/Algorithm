import java.util.Scanner;
public class demo12{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入任意年份");
		int year =input.nextInt();
		if(year%4 ==0&&year%100 !=0&&year%400 ==0){
			System.out.println("闰年");
		} else {
			System.out.println("平年");
		}
	}
}