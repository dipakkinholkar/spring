import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class GetSalt extends TimerTask {
	
 private static	Scanner scn=new Scanner(System.in);
	
	public void run()
	{
		try {
		String salt=PasswordUtils.getOTP(5);
		
		System.out.print(salt);
		
		System.out.print("\nEnter your otp::");
		String otp=scn.next();
		
		
		if(salt.equals(otp))
		{
			System.out.print("correct");
		}
		else
		{
			System.out.print("incorrect");
			
		}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
	}


	public static void main(String[] args) throws InterruptedException {
		
		
		//String salt=PasswordUtils.getSalt(5);
		
		
		GetSalt salt=new GetSalt();
		Timer timer=new Timer();

		
		timer.schedule(salt, 30);
		
		
	
	}

}
