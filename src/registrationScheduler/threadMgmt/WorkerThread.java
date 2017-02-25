package registrationScheduler.threadMgmt;
import java.io.FileReader;
import registrationScheduler.store.*;
import registrationScheduler.util.*;
import registrationScheduler.driver.*;

import java.io.*;
public class WorkerThread extends Thread {
	
	public Thread t;
	public String threadName;
	int count=0;
	Result result;
	Driver driver;
	public static int done=0;
	private static final Object lock = new Object();
	AssignCourse assignCourse=new AssignCourse();
		
	WorkerThread(String tName)
	{
		threadName=tName;
		t=new Thread(threadName);
		/**
		 * Creating Thread
		 */
		
		if(Driver.DEBUG_VALUE==4)
		{
			System.out.println("Call to WorkerThread Constructor");
		}
	}
	WorkerThread(Result rslt, Driver drivr)
	{
		result=rslt;
		driver=drivr;
		
		if(Driver.DEBUG_VALUE==4)
		{
			System.out.println("Call to WorkerThread Constructor");
		}
	}
	
	//FileProcessor fp=new FileProcessor();
	
	public void run()
	{
		/**
		 * run() method for thred
		 */
		if(Driver.DEBUG_VALUE==3)
		{
			System.out.println("Call to thread's run() method");
		}
		
		try{
			
			synchronized(lock){
				count++;
			}
			while(count<=60)
				{
					String line=FileProcessor.readOneLine();
					if(line!=null)
						assignCourse.schedule(line);
					else
					{	if(done!=1)
							assignCourse.finalMethod();
						//FileProcessor.brClose();
						assignCourse.bwClose();
					}
					Thread.sleep(50);
				}
			//assignCourse.finalMethod();
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
	}
	
	public void start()
	{
		/**
		 * start() method for thread
		 */
		run();
	}
		
		
	}

