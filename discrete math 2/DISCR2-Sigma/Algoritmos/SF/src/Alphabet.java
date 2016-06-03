import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Vector;


public class Alphabet {
	
	public static void main(String[]args){
		//String s="!#$%&'()*+,-./0123456789:;<=>?ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^`abcdefghijklmnopqrstuvwxyz{|}~\"\\";
		String f="jonathlnkpqwertyuizx";
		Vector <Character> array2=new	Vector <Character>();
		Vector<Integer>array=new Vector<Integer>();
	
	array=Split.reader(f);
	Collections.sort(array);
	array2=Split.reader2(f);
	Collections.sort(array2);
	//		System.out.println(array);
	//			System.out.println(array2);
	
	//		Split.divide(array, array2);
	int total=0;
	Split.divide(array, array2);
	
				
			}
	
	
	
	
		
	
	
	
	}