
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("abc,def,ghi,gkl");
		String[] newstr=str.split(",");
		for(int i=0;i<newstr.length;i++)
		{
			System.out.println(newstr[i]);
		}
		System.out.println("第二次拆分结果：");
		String[] newstr2=str.split(",|b", 2);
		for(int i=0;i<newstr2.length;i++)
		{
			System.out.println(newstr2[i]);
		}
	}

}
