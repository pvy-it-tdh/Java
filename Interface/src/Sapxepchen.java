
public class Sapxepchen implements Sapxep{

	@Override
	public void sapxepTang(double[] arr) {
		int n=arr.length;
		int i,j;
		double key;
		for ( i=1;i<n;i++)
		{
			key=arr[i];
			j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
						j=j-1;
			}
			arr[j+1]=key;
		}
	}

}
