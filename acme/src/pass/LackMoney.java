package pass;

public class LackMoney {

	public long solution(int price, int money, int count) {
		
		long total = 0;
		
		for(int i=1; i<=count; i++)
		{
			total += i * price;
		}
		
        return (total - money > 0) ? total - money : 0;
    }
}
