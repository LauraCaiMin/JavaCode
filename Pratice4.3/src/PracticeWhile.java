
public class PracticeWhile {
	static int max=20;
	public static void main(String []args)
	{
		float sum = 0;
		int index = 1;
		float factorial = 1;
		while(index <= max)
		{
			factorial /= index;
			sum += factorial;
			++index;
		}
		System.out.println(sum);
	}
}
