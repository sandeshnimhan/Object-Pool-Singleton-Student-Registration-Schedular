package registrationScheduler.util;
import java.io.*;
import registrationScheduler.store.*;
import registrationScheduler.threadMgmt.*;
import registrationScheduler.driver.*;

public class FileProcessor {
	/**
	 * Singleton class
	 */
	static String str=" ";
	private static FileProcessor fp=null;
	static FileReader fr;
	static BufferedReader br;
	static FileWriter fw;
	static BufferedWriter bw;
	static String inptFile;
	
	private FileProcessor(String inFile){
		inptFile=inFile;
		
		if(Driver.DEBUG_VALUE==4)
		{
			System.out.println("Call to FileProcessor Private Constructor");
		}
	}
	
	public static FileProcessor getInstance(String inpFile)
	{
		/**
		 * getInstance method for Singleton class
		 * @return FileProcessor object
		 */
		//inptFile=inpFile;
		try{
			//File inputFile=new File(Driver.inputFile);
		fr=new FileReader(Driver.inputFile);
		br=new BufferedReader(fr);
		
		
		
		//fw=new FileWriter(outputFile);
		//BufferedWriter bw=new BufferedWriter(fw);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally{
			
		}
		
		if(fp==null)
			fp=new FileProcessor(inpFile);
		return fp;
	}
	
	public static synchronized String readOneLine()
	{
		/**
		 * synchronized method to read one line at a time
		 * @return read string
		 */
		
		try{
			
			//if((str=br.readLine())!=null)
			str=br.readLine();
				return str;
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally{
			
		}
		return str;
	}
	
	public static void brClose()
	{
		/**
		 * method to close BufferedReader
		 */
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

