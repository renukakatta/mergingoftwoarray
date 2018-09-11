public class mergingtwoarray {
	public static void main(String args[]){
		int []a={12,34,45,67};
		int []b={39,90,78};
		
		merging(a,b);
	}
	public static void merging(int c[],int d[])
	{
		int z=0;
		int e[]=new int[c.length+d.length];
		
		for(int i=0;i<c.length;i++){
			
			e[i]=c[i];
			z++;
		}
		for(int i=0;i<d.length;i++)
		{
			e[z]=d[i];
			z++;
			
		}
			for(int k=0;k<e.length;k++)
			{
				System.out.println(e[k]);
			}
	}

}