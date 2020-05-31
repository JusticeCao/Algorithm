public class Demo28{
	public static void main(String[] args){
		double h = 100;
		double sum = 0; 
		for(int i =1;i<=10;i++){
			h /=2;
			sum +=h;
		}
		System.out.println("共经过"+(sum+100)+"米");
		System.out.println("第十次落地反弹"+h+"米");
	}
}