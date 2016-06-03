import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main 
{
	private static final double FLAG=10E-9;
	public static void main(String[] args)
	{
		
		ArrayList<Integer>print=new ArrayList<Integer>();
		for(int w=10;w<=1000;w=w+10)
		{
		
		//ArrayList<String> lines=FunctionIO.readFile("text.txt");
		int size=10;
		String s="!#$%&'()*+,-./0123456789:;<=>?ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^`abcdefghijklmnopqrstuvwxyz{|}~\"\\";
		char[]x=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			x[i]=s.charAt(i);
		}
		ArrayList<String> lines=new ArrayList<String>();
		lines.add(getRandomChain(w, x));
		/*for(int i=0;i<size;i++)
		{
			int p=Methods.getRandomNumber(0, 130);
			StringBuilder s=new StringBuilder();
			s.append(p);
			lines.add(s.toString());
		}*/
		
		
		TreeMap<Character,Integer>sr=new TreeMap<Character,Integer>();
		
		for(String p: lines)
		{
			for(int i=0;i<p.length();i++)
			{
				if(sr.containsKey(p.charAt(i)))
					sr.put(p.charAt(i), sr.get(p.charAt(i))+1);
				else
					sr.put(p.charAt(i), 1);
			}
			
		}
		//System.out.println(sr);
		long lenght=lenghtArray(lines);
		ArrayList<Double>value=getValues(sr, (double)lenght);
		ArrayList<Double> probabilities=getFunction(value);//value
		ArrayList<String> v=getArray(probabilities,value);
		//System.out.println(probabilities);
		//System.out.println(v);
		TreeMap<Character,String>end=new TreeMap<Character,String>();
		int n=0;
		while(n<v.size())
		{
			for(char k: sr.keySet())
			{
				end.put(k, v.get(n));
				n++;
			}
		}
		//System.out.println(end);
		
		ArrayList<Integer> number=new ArrayList<Integer>();
		for(char k: sr.keySet())
		{
			int y=sr.get(k);
			number.add(y);
		}
		
		/*ArrayList<String> string=new ArrayList<String>();
		for(String k: lines)
		{
			for(char p: end.keySet())
			{
				for(int i=0;i<lines.size();i++)
				{
					if(k.charAt(i)==p)
						string.add(end.get(p));
				}
			}
		}*/
		//System.out.println(number);
		int count=0;
		for(char k: end.keySet())
		{
			
				int p=end.get(k).length();
				int q=sr.get(k);
				int z=p*q;
				count=count+z;
			
			
		}
		int count2=0;
		ArrayList<Integer> number2=new ArrayList<Integer>();
		for(String k: lines)
		{
			int p=k.length();
			count2=count2+p;
		}
		count2=count2*8;
		
		//System.out.println(count);
		//System.out.println(count2);
		
		boolean success =writeFile("outputfile.txt",v);
		
		//System.out.println();
		//System.out.println(lines);
		
		print.add(count);
		}
		int n=10;
		for(int k: print)
		{
			System.out.println(n+"  "+(k/8));
			n=n+10;
		}
		
		
	}
	public static ArrayList<String> readFile( final String fileName )
	{
		ArrayList<String> answer = new ArrayList<String>();
		BufferedReader br;
		File file = new File(fileName);
		try
		{
			br = new BufferedReader( new FileReader( file ));			
			String str;
			while( (str = br.readLine()) != null )
			{
				answer.add(str);
			}	
			br.close();
		}
		catch( IOException e )
		{
			System.err.println("Ups, error de archivo");
			
		}		
		return answer;
	}
	
	public static boolean writeFile(String fileName, ArrayList<String> lines)
	{
		BufferedWriter wr;
		File file = new File(fileName);
		try
		{
			wr = new BufferedWriter( new FileWriter( file ));
			for (String string : lines)
			{
				wr.append(string);
				//wr.newLine();
			}
			wr.close();
		}
		catch( IOException e )
		{
			System.err.println("There is a Mistake");
			e.printStackTrace();
			return false;
		}		
		return true;
	}
	public static String binaryBits(ArrayList<Double> x,int i,ArrayList<Double>y)
	{
		int n=getLogarrithm(y,i);
		double z=x.get(i);
		StringBuilder s=new StringBuilder();
		for(int j=0;j<n;j++)
		{
			 z=z*2;
			 s=s.append((int)z);
			 if(Math.abs(z-1)<FLAG)
				 break;
			 if(z>1.0)
				 z=z-1.0;
		}
		return s.toString();
		
	} 
	
	public static String getRandomChain(int k,char[] p)
	{
		StringBuilder h=new StringBuilder();
		for(int i=0;i<k;i++)
		{
			char S=p[getRandomNumber(0, p.length-1)];
			h.append(S);
		}
		return h.toString();
	}
	
	
	public static ArrayList<String> getArray(ArrayList<Double>x,ArrayList<Double> y)
	{
		ArrayList<String> p=new ArrayList<String>();
		for(int i=0;i<x.size();i++)
		{
			p.add(binaryBits(x,i,y));
		}
		return p;
	}
	
	
	public static int getLogarrithm(ArrayList<Double> x,int i)
	{
		double n;
		n=((Math.log10((1.0)/x.get(i)))/(Math.log10(2)));
		int y=(1)+(int)Math.ceil(n);
		return y;
		
	}
	
	public static double getRandomDouble(double min, double max)
	{
		max=max-1;
		return (double)(Math.random()*(max-min+1)+min);
	}
	public static long lenghtArray(ArrayList<String> x) 
	{
		long n=0;
		for(String p: x)
		{
			n=p.length()+n;
		}
		return n;
	}
	public static ArrayList<Double> getValues(TreeMap<Character,Integer> x,double lenght)
	{
		ArrayList<Double> s=new ArrayList<Double>();
		for(char k: x.keySet())
		{
			double n=x.get(k)/lenght;
			s.add(n);
		}
		return s;
	}
	
	public static ArrayList<Double> getFunction(ArrayList<Double>x)
	{
		ArrayList<Double>p=new ArrayList<Double>();
		for(int i=0;i<x.size();i++)
		{
			double s;
			s=((0.5)*x.get(i))+recursion(x,i);
			p.add(s);
			
		}
		return p;
	}
	public static double recursion(ArrayList <Double>x,int n)
	{
		if(n==0)
			return 0;
		else
			return x.get(n-1)+recursion(x,n-1);
	}
	public static int getRandomNumber(int min, int max)//generate a random number between two terms
	{
		double num = Math.random();
		int number = (int)((num)*(max-min+1)+min);//never throws the max
		return number;
		
	}

}
