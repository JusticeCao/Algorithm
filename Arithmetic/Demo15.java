import java.util.Scanner;
public class Demo15{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);
	System.out.println("请输入你的成绩");
	int score = input.nextInt();
	System.out.println("请输入你的性别");
	String sex = input.next();
	if(score <= 10){
		if(sex.equals("男")){
			System.out.println("进入男子组决赛");
		} else {
			System.out.println("进入女子组决赛");
				}
		}
	}	
}