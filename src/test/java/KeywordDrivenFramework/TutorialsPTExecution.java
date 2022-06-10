package KeywordDrivenFramework;

import java.io.IOException;

import org.testng.annotations.Test;

public class TutorialsPTExecution {
	
	@Test
	public void execute() throws IOException
	{
		for(int i=1;i<=13;i++)
		{
		String key=TutorialsPTExcel.getExcel(i,0);
		
		if(key.equals("openbrowser"))
		{
			TutorialsPTAction.openbrowser();
		}
		else if(key.equals("navigate"))
		{
			TutorialsPTAction.navigate();
		}
		else if(key.equals("enterfirstname"))
		{
			TutorialsPTAction.enterfirstname();
		}
		else if(key.equals("enterlastname"))
		{
			TutorialsPTAction.enterlastname();
		}
		else if(key.equals("selectgender"))
		{
			TutorialsPTAction.selectgender();
		}
		else if(key.equals("selectexp"))
		{
			TutorialsPTAction.selectexp();
		}
		else if(key.equals("enterdate"))
		{
			TutorialsPTAction.enterdate();
		}
		else if(key.equals("selectprofession"))
		{
			TutorialsPTAction.selectprofession();
		}
		else if(key.equals("selectprofile"))
		{
			TutorialsPTAction.selectprofile();
		}
		else if(key.equals("selectflavour"))
		{
			TutorialsPTAction.selectflavour();
		}
		else if(key.equals("selectcontinent"))
		{
			TutorialsPTAction.selectcontinent();
		}
		else if(key.equals("selectcommands"))
		{
			TutorialsPTAction.selectcommands();
		}
		else if(key.equals("clickonsubmit"))
		{
			TutorialsPTAction.clickonsubmit();
		}
		}
	}

}
