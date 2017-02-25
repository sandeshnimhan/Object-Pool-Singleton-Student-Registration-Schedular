package registrationScheduler.store;
import java.io.*;
import registrationScheduler.store.*;
import registrationScheduler.threadMgmt.*;
import registrationScheduler.driver.*;

public class Result implements StdoutDisplayInterface, FileDisplayInterface{

	public Result()
	{
		if(Driver.DEBUG_VALUE==4)
		{
			System.out.println("Call to Result Constructor");
		}
	}
	@Override
	public void writeSchedulesToFile() {
		// TODO Auto-generated method stub
		/**
		 * writes schedules to file
		 */
	}

	@Override
	public void writeSchedulesToScreen() {
		// TODO Auto-generated method stub
		/**
		 * writes schedules to screen
		 */
		if(Driver.DEBUG_VALUE==1)
		{
			try {
				FileReader fr=new FileReader(Driver.inputFile);
				BufferedReader br = new BufferedReader(fr);
				String str;
				while((str=br.readLine())!= null)
					//System.out.println(str);
				br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally{
				
			}
			
		}
	}

}
