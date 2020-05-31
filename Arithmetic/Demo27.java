import java.util.Scanner;
public class Demo27{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;
		for(int i =1;i<=10;i++){
			System.out.println("请输入第"+i+"个数字");
			num = input.nextInt();
			if(num == 886){
			System.out.println("很遗憾886不能参与本次运算，以后就可以了");
			break;
			}
			sum +=num;
		}
		System.out.println(sum);	
	}
}