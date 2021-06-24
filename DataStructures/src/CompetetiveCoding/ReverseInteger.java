package CompetetiveCoding;

public class ReverseInteger {

	/**
	 * Asked in:  HCL , Bloomberg
	 * Reverse digits of an integer.
	 * Example1:
	 * x = 123,
	 * return 321
	 * 
	 * Return 0 if the result overflows and does not fit in a 32 bit signed integer
	 */
	
	public int reverse(int x) {
        long k = x;
        boolean isNegtive = false;        
        if(k < 0){
            k = 0 - k;
            isNegtive = true;
        }

        long result = 0;
        while(k != 0){
            result *= 10;
            result += k % 10;
            k /= 10;
        }

        if(result > Integer.MAX_VALUE) return 0;
        return isNegtive  ? 0 - ((int)result) : (int)result;
    }
	
	public static void main(String args[])
	{
		ReverseInteger ob=new ReverseInteger();
		int n=123;
		System.out.println(ob.reverse(n));
	}
}
