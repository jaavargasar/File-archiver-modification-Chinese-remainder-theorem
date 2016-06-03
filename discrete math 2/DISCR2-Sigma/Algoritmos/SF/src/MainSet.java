import java.util.TreeMap;


public class MainSet {
	public static void main(String[] args)
	{
		
		int a[] = {9,9,23,12,23,9,23,12,11,11,23,9};
		/*
			 * 9 = ****
			 * 11 = **
			 * 12 = **
			 * 23 = ****
		 */
		
		TreeMap<Integer,Integer> m = new TreeMap<Integer,Integer>();
		for (int i : a)
		{
			if( m.containsKey(i))
			{
				m.put(i, m.get(i)+1);
				//System.out.println(m);
			}
			else
			{
				m.put(i,1);
				//System.out.println(m);
			}
		}
		
		System.out.println(m.keySet());
		for (int k : m.keySet())
		{
			System.out.print(k+" = ");
			for (int i = 0; i < m.get(k); i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//example3();
		//example2();
		//example1();
}
}