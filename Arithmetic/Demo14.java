public class Demo14{
	public static void main(String[] args){
		double deposite = 520000;
	if(deposite>=5000000){
		System.out.println("-------我可以买辆凯迪拉--------");	
		} else if(deposite>=1000000&&deposite<5000000){
		System.out.println("-------我可以买辆帕萨特-------");
		} else if(deposite>=100000&&deposite<1000000){
		System.out.println("-------我可以买辆奥拓--------");	
		} else {
		System.out.println("-------只能买捷安特---------");	
		}	
	}
	
}