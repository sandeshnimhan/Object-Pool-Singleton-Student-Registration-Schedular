package registrationScheduler.threadMgmt;
import java.io.*;
import registrationScheduler.store.*;
import registrationScheduler.driver.*;
import registrationScheduler.util.*;

public class CreateWorkers {
	
	Result result;
	Driver driver;

	
	public CreateWorkers(Result rslt,Driver drivr)
	{
		result=rslt;
		driver=drivr;
		
		if(Driver.DEBUG_VALUE==4)
		{
			System.out.println("Call to CresteWorkers Constructor");
		}
		
	}
	
	WorkerThread wrkrThrd = new WorkerThread(result,driver);
	
	public void startWorkers(int NUM_THREADS) throws InterruptedException
	{
	/**
	 * Create NUM_THREADS number of threads.
	 * Via the Threaded class WorkerThread.	
	 */
		for(int i=1;i<=NUM_THREADS;i++)
		{
			WorkerThread workerThread = new WorkerThread("Thread #" + i);
			//Thread t=Thread.currentThread();
			workerThread.start();
			//workerThread.join();
		}
		//for(int i=1;i<=NUM_THREADS;i++)
		{
			//WorkerThread workerThread = new WorkerThread("Thread #" + i);
			//workerThread.join();
			//Thread t=Thread.currentThread();
			//workerThread.start();
			//t.join();
		}
	}
}
