
public class MainCodeTchr {

	public static int getNumberOfBitsCHR(int i){
		int c;int p;int q;
		
		p = getNumberOfBits(i%3);// at most 2 bits
		q = getNumberOfBits(i%17);// at most 4
		c = 1;//at most 1 bit
		
		return p+q+c;
			
		}
	public static int getNumberOfBits(int i){
		int p = 0;
		if (i == 1 || i == 0) return 1;
		do{
			p++;
			i = i/2;
		}while(i != 0 );
			
		return p;
			
		}
	
	
	public static int getExponential(int base, int exponent){
		
		if(1 == exponent)
			return base;
		
		return (base)*(getExponential(base,(exponent-1)));
	}
	public static int[] getRandomVector(int[] arr,int len){
		
		for(int i=0;i<len;i++){
			arr[i] = getRandomNumber(0,408);
			
		}
		return arr;
	}
	
	public static int getRandomNumber(int min, int max)//generate a random number between two terms
	{
		double num = Math.random();
		int number = (int)((num)*(max-min+1)+min);
		return number;
		
	}
	public static void main(String[] args) {
		
		int result =0;
		int a,b,c,cntTmp;

		for(int len=10;len<=1000;len=len+10){

			int []arr = new int [len];
			MainCodeTchr.getRandomVector(arr, len);
			for(int i=0;i<len;i++){
				cntTmp = arr[i];
				a = MainCodeTchr.getNumberOfBits((cntTmp%8));
				b = MainCodeTchr.getNumberOfBits((cntTmp%3));
				c = MainCodeTchr.getNumberOfBits((cntTmp%17));
				result = result + a+b+c;
			}
			int bytes = result/8;
			result = 0;
			System.out.println( bytes);
		}

		
		
		
	}
}
