package HybridDrivenFramework;

import java.io.IOException;

import org.testng.annotations.Test;

public class PHPTravelsExecution {
	
	@Test
	public void execute() throws IOException, InterruptedException
	{
		for(int i=1;i<=17;i++)
		{
			String key=PHPTravelsExcel.Keywords(i, 0);
			
			if(key.equals("openbrowser"))
			{
				PHPTravelsAction.openbrowser();
			}
			
			else if(key.equals("navigate"))
			{
				PHPTravelsAction.navigate();
			}
			
			else if(key.equals("firstname"))
			{
				PHPTravelsAction.firstname();
			}
			
			else if(key.equals("lastname"))
			{
				PHPTravelsAction.lastname();
			}
			
			else if(key.equals("email"))
			{
				PHPTravelsAction.email();
			}
			
			else if(key.equals("phonedrp"))
			{
				PHPTravelsAction.phonedrp();
			}
			
			else if(key.equals("phone"))
			{
				PHPTravelsAction.phone();
			}
			
			else if(key.equals("street"))
			{
				PHPTravelsAction.street();
			}
			
			else if(key.equals("city"))
			{
				PHPTravelsAction.city();
			}
			
			else if(key.equals("state"))
			{
				PHPTravelsAction.state();
			}
			
			else if(key.equals("postalcode"))
			{
				PHPTravelsAction.postalcode();
			}
			
			else if(key.equals("mobile"))
			{
				PHPTravelsAction.mobile();
			}
			
			else if(key.equals("clickongeneratepwd"))
			{
				PHPTravelsAction.clickongeneratepwd();
			}
			
			else if(key.equals("pwdlength"))
			{
				PHPTravelsAction.pwdlength();
			}
			
			else if(key.equals("copy"))
			{
				PHPTravelsAction.copy();
			}

			else if(key.equals("clickonrobot"))
			{
				PHPTravelsAction.clickonrobot();
			}
			
			else if(key.equals("clickonregister"))
			{
				PHPTravelsAction.clickonregister();
			}
			
		}
	}

}
