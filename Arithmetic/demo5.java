public class demo5{
public static void main(String[] Args){
 findFile(new File("C:/"),".png");
}
public static void findFile(file target,String png){
if(target=null)return;
if(target.isDirectory()){
File[]files=target.listFiles;
if(files != null){
	for(File f:files){
	findFile(f,png);
				}
			}
		}else{
	String name	= target.getName().toUpperCase();
	if(name.endsWith(png)){
	System.out.println(target.getAbsolutePath());
			}
		}
	}
}