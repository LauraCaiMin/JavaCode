import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] =new int []{1,2,3,4,5,6};
		int arr2[] =Arrays.copyOfRange(arr1, 0, 4);
		System.out.println("数组1的元素分别是：");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("数组2的元素分别是：");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}

	}

}
