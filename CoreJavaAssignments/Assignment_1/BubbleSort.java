
public class BubbleSort {

	public static void main(String[] args) {
				int c=0 , temp;
				int a[]= {5,12,14,6,78,19,1,23,26,35,7,52,86,47};
				for(c=0;c<14;c++) 
				{
					for(int d=1;d<(14-c);d++)
					{
						if (a[d-1]>a[d])
						{
							temp=a[d-1];
							a[d-1]=a[d];
							a[d]=temp;
						}
						
					}
				}
				for(c=0;c<14;c++) {
					System.out.print(a[c]+" ");
				}
			

		


	}

}
