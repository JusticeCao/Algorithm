public class demo7{
	public static void main(String[] args){
		scanner input = new scanner(system.in);
		System.out.println("请输入你的年龄");
		int age=input.nextInt();
		if(age>=16){
		System.out.println("成人票");
		} else {
			System.out.println("免费");
		}
	}
}