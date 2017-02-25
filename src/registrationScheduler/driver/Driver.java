package registrationScheduler.driver;

import java.io.BufferedReader;
import registrationScheduler.store.*;
import registrationScheduler.threadMgmt.*;
import registrationScheduler.util.*;
import java.io.File;
import java.io.*;
import java.io.FileReader;

public class Driver {

	public static int NUM_THREADS;
	public static int DEBUG_VALUE;
	public static String inputFile;
	public static String outFile;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int argsCount=args.length;
		if(argsCount!=4)
		{
			System.out.println("Please enter valid number of arguments.");
			System.exit(0);
		}
		inputFile=args[0];
		outFile=args[1];
				
		NUM_THREADS=Integer.parseInt(args[2]);
		if(!(NUM_THREADS < 4 && NUM_THREADS >0))
		{
			System.out.println("Please enter valid arguments.");
			System.exit(0);
		}
		
		DEBUG_VALUE=Integer.parseInt(args[3]);
		if(!(DEBUG_VALUE <= 4 && DEBUG_VALUE >=0))
		{
			System.out.println("Please enter valid arguments.");
			System.exit(0);
		}
		
		//FileProcessor fileProcessor = new FileProcessor();
		Result result = new Result();
		Driver driver=new Driver();
		
		FileProcessor.getInstance(inputFile);
		
		AssignCourse ac=new AssignCourse();
		ac.creatFileWriterInstance();
		
		CreateWorkers createWorkers = new CreateWorkers(result, driver);
		try {
			createWorkers.startWorkers(NUM_THREADS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		result.writeSchedulesToFile();
		result.writeSchedulesToScreen();
	}

}
