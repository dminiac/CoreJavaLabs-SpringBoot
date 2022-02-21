class Difference 
{
    
    static int difference(int N)
    {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i<=N; i++)
        {
            sum1 = sum1 + i;
            sum2 = sum2 + (i*i);
        }
        return sum1 * sum1 - sum2;
    }
	public static void main (String[] args) 
	{
		int N = 10;
		int answer = difference(N);
		System.out.println(answer);
	}
}