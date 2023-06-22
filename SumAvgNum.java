
public class SumAvgNum {
	
	int a;
	int b;
	int c;
	int d;
	int e;
	int sum = 0;
	int avg;
	int Add(int a, int b, int c, int d, int e)
	{
		sum = (a + b + c + d + e);
		return sum;
		
	}
	float avg(int sum)
	{
		avg = sum/5;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumAvgNum obj = new SumAvgNum();
		int result = obj.Add(1,2,3,4,5);
		float average = obj.avg(result);
		System.out.println("Addition = " + result);
		System.out.println("Average = "+ average);
	}

}
