package mr.leo.algorithm;

public class Main {

	public static void main(String[] args)
	{
		Integer [] randomArray = {1, 0, 3, 12, 0, 0, 1, 5, 9};
		for(int i = 0; i < randomArray.length; i++)
		{
			if(randomArray[i] == 0)
			{
				for(int j = i; j > 0; j--)	
				{
					if(randomArray[j - 1] == 0)
					{
						break;
					}
					randomArray[j] = randomArray[j - 1];
					randomArray[j - 1] = 0;
				}
			}
		}
		for(int i = 0; i < randomArray.length; i++)
		{
			System.out.print(randomArray[i] + " ");
		}
	}
}
