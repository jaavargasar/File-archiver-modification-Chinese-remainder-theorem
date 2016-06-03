import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;


public class Split{
	public static int sum (Vector<Integer>t){
		int total=0;
		for(int i =0;i<t.size();i++){
			total=total+t.get(i);
			
			}
		
	return total;}
	public static Vector<Integer>reader(String s){
		
		char[]x=s.toCharArray();
			TreeMap<Character,Integer> tree = new TreeMap<Character,Integer>();
	   for(int i =0;i<x.length;i++){
		   if(!tree.containsKey(x[i])){
			   tree.put(x[i],0);
		   }
		   tree.put(x[i], tree.get(x[i])+1);
	   }  
	   
			//System.out.println(tree.toString());
			Vector<Integer> array=new Vector<Integer>();
			Vector<Character> array2=new Vector<Character>();
		for(Map.Entry<Character, Integer> entry:tree.entrySet()){
			array.add(entry.getValue());
			array2.add(entry.getKey());
			
		}
		return array;
		
		
	}
	public static Vector<Character>reader2(String s){
	
		char[]x=s.toCharArray();
			TreeMap<Character,Integer> tree = new TreeMap<Character,Integer>();
	   for(int i =0;i<x.length;i++){
		   if(!tree.containsKey(x[i])){
			   tree.put(x[i],0);
		   }
		   tree.put(x[i], tree.get(x[i])+1);
	   }  
			//System.out.println(tree.toString());
			Vector<Integer> array=new Vector<Integer>();
			Vector<Character> array2=new Vector<Character>();
		for(Map.Entry<Character, Integer> entry:tree.entrySet()){
			array.add(entry.getValue());
			array2.add(entry.getKey());
			
		}
		return array2;
		
		
	}
	public static void	divide(Vector<Integer>t,Vector<Character>y){
		int sum=0,d=0;
		int  count=1;
		
		for(int i =0;i<t.size();i++){
			sum=sum+t.get(i);
			
			}
		if(t.size()==1){
			return;
		}
		int totalbits=0,remenber=0,totalbits2=0;
	
		
        
		d=Split.SmartSplit(sum, t);
		StringBuilder str=new StringBuilder();
		StringBuilder str2=new StringBuilder();
		Vector<Integer>s1=new Vector<Integer>();
		Vector<Integer>s2=new Vector<Integer>();
		Vector <Character> s3=new	Vector <Character>();
		Vector <Character> s4=new	Vector <Character>();
		
		 s1.addAll(t.subList(0, d));
		 s2.addAll(t.subList(d,t.size()));
		 s3.addAll(y.subList(0, d));
		 s4.addAll(y.subList(d, y.size()));
		totalbits=Split.howmanybits(s4,s3);
		 
		str.append(str+"0");
		str2.append(str2+"1");
		Vector<Integer>finalbit=new Vector<Integer>();
		
		finalbit=Split.finalbits(totalbits);
		 System.out.println(totalbits);
		//System.out.println(finalbit+"final");
		
		//	System.out.println(s3);//ealidad es s2 ya q el Collectio.sort cambia
		 //	System.out.println(s4);//en realidad es s1 ya q el collection.sort cambia
		//System.out.println("particion");
		 
			
		
		
		Split.divide(s1,s3);
		
		
		Split.divide(s2,s4);
		
		
		
		count++;
		int gg=0;
		for(int i=0;i<count;i++){
			gg=gg+totalbits;
		}

			
		
		
		
	return ;}
	public static int SmartSplit(int sum,Vector<Integer>t){
		int min=0,p=0,k=0,q=0,b=0,a=0;
		Vector<Integer>check=new Vector<Integer>();
		for (int i=0;i<=Math.ceil((t.size())/2);i++){
			a=a+t.get(i);
			b=sum-a;
			min=Math.abs(a-b);
			check.add(min);
			
		}
		
		int minimum=0;
		for(int j=0;j<check.size();j++){
		
			k=check.get(0);
			q=check.get(j);
			
			if(q<k||k==q){
				minimum=q;
				p=check.indexOf(minimum)+1;
			}
			
			else{
				minimum=k;
				p=check.indexOf(minimum)+1;
			}
		}
		
	
	return p;
	}
	public static	int	howmanybits(Vector<Character>j,Vector<Character>k){
		
		int q=0,total=0,x1=0,z1=0;
		x1=x1+j.size();
		z1=z1+k.size();
		q=x1+z1;
		
	
	
	
		
	total=q;
		return total;
		
	}
	public static Vector<Integer>finalbits(int u){
		
		int total=0,p=0;
		Vector<Integer>total2=new Vector<Integer>();
		total2.add(u);
		total=u+total;
			
		return total2;
	}

	
}