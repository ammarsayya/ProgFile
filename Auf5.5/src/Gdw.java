
import Prog1Tools.*;
public class Gdw {
	
	public Gdw( ) {
		
	}

	public Gdw(int r ) {
			
		}
	public Gdw(String r  ) {
		
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			Boolean f= false;
			int n=0;
			while(!f) {
				n=IOTools.readInteger();
				if(n>2&&n<10) {
					
					if(n%2!=0) {
						f=true;
						System.out.println("perfekt ");
						break;
					}
					f=false;
					System.out.println("fib ungerade");
				}
			}
//			System.out.println(n);
			int ze=(int)(n/2);
			int sp=(int)(n/2+1);
//			System.out.println(ze+",,"+sp);
			int mag[][]=new int[n][n];
			
			for(int i=1;i<=n*n;i++) {
				mag[ze][sp]=i;
//				System.out.println(i);
				sp=sp+1;
				ze=ze-1;
				if(ze<0)
					ze=n-1;
				if(sp==n)
					sp=0;
				if(mag[ze][sp]!=0) {
					ze=ze+1;
					sp=sp+1;
					if(ze==n)
						ze=0;
					if(sp==n)
						sp=0;
				}
				
			}
			for(int c=0;c<n;c++) {
				System.out.println();
				for(int j=0;j<n;j++)
					System.out.print(mag[c][j] + "  ");
			}
			
			
			/*auf 5.4 
			 * int n= IOTools.readInteger();
			
			int[] f=new int[n];
			for(int i=0;i<n;i++) {
				int a=IOTools.readInteger();
				f[i]=a;
			}
			for(int c=0;c<n;c++) {
				System.out.print(f[c]+ " -- ");
				Arrays.sort(f);
			}*/
			
		

	}

}
