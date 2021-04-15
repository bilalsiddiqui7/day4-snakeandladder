//Done till UC-6
public class Demo
{
	static final int noplay=0;
	static final int ladder=1;
	static final int snake=2;
	static int sum=0;
	static int c=0;
	public static void main(String[] args) 
	{
		System.out.println("Start position is zero");
		while(sum<100)
		{
			int die = (int) (Math.random()*6)+1;
			System.out.println("The dice number is "+die);
			int opt = (int) (Math.random()*3);
			if(opt == ladder)
			{
				if(sum<=100 && (sum+die <= 100))
				{
					sum=sum+die;
					System.out.println("ladder");
				}
			}
			else if(opt == snake)
			{
				if(sum>0 && (sum-die)>=0)
				{
					sum=sum-die;
					System.out.println("snake");
				}
			}
			else
			{
				System.out.println("no play");
			}
			System.out.println("Position of dice is "+sum);
			c++;
		}
		System.out.println("The number of times the dice was played "+c);
	}
}
