


public class Main1 {
	public static void main(String []args ){
		String s="!#$%&'()*+,-./0123456789:;<=>?ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^`abcdefghijklmnopqrstuvwxyz{|}~\"\\";
		char[]x=new char[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			x[i]=s.charAt(i);
		}
		System.out.println(x);
	}
	

}
