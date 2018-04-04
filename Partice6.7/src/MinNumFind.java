
public class MinNumFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{3,5,9,6,3,1,0,7,-1};
		int min=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("数组中最小的数为："+min);

	}

}
