import java.util.Arrays;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]=new String[]{"���","��","������","Kylin.C","Ҳ���Խ���","Laura.C"};
		System.out.println("�滻ǰ������Ԫ��Ϊ��");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		Arrays.fill(arr,2,3,"bb");
		System.out.println("�滻�������Ԫ��Ϊ��");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
