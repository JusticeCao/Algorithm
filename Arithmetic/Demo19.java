import java.util.Scanner;
public class Demo19{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入你的分数");
	int score = input.nextInt();
	switch(score/10){
	case 10:
	case 9:
	System.out.println("优秀");
	break;
	case 8:
	System.out.println("良好");
	break;
	case 6:
	case 7:
	System.out.println("中等");
	break;
	default:
	System.out.println("不及格");
	break;
		}	
	}
}