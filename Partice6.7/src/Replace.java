import java.util.Arrays;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]=new String[]{"你好","我","的名字","Kylin.C","也可以叫我","Laura.C"};
		System.out.println("替换前的数组元素为：");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		Arrays.fill(arr,2,3,"bb");
		System.out.println("替换后的数组元素为：");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
