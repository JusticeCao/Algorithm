import java.util.Scanner;
public class demo11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入需要查的指定月份");
		int month = input.nextInt();
		if(month != 0){
			switch(month){
				case 3:
				//System.out.println("春季");
				//break;
				case 4:
				//System.out.println("春季");
				//break;
				case 5:
				System.out.println("春季");
				break;
				case 6:
				//System.out.println("夏季");
				//break;
				case 7:
				//System.out.println("夏季");
				//break;
				case 8:
				System.out.println("夏季");
				break;
				case 9:
				//System.out.println("秋季");
				//break;
				case 10:
				//System.out.println("秋季");
				//break;
				case 11:
				System.out.println("秋季");
				break;
				case 12:
				//System.out.println("冬季");
				//break;
				case 1:
				//System.out.println("冬季");
				//break;
				case 2:
				System.out.println("冬季");
				break;
			}
		} else {
			System.out.println("您输入的不是一个月份");	
		}
	}
}