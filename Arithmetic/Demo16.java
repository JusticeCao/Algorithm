public class Demo16{
	public static void main(String[] args){
		for(int i =1;i <=5;i++){
			for(int j = i;j<=5;j++){
			System.out.println(" ");	
			}
			for(int k = 1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}