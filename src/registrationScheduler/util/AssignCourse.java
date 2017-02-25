package registrationScheduler.util;
import java.io.*;
import registrationScheduler.store.*;
import registrationScheduler.threadMgmt.*;
import registrationScheduler.driver.*;

public class AssignCourse {

	int i=1, total_preference_score=0,countA=0,countB=0,countC=0,countD=0,countE=0,countF=0,countG=0;
	String ttl_pref_score;
	float average_preference_score=0;
	static FileWriter fw;
	static BufferedWriter bw;
	File outputFile;
	//WorkerThread wThread = new WorkerThread();
	public void creatFileWriterInstance()
	{
		/**
		 * creates file writer instance
		 */
		try{
			outputFile=new File(Driver.outFile);
			if(!outputFile.exists())
				outputFile.createNewFile();
			fw=new FileWriter(outputFile.getAbsoluteFile());
			bw=new BufferedWriter(fw);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}	
	
	public void schedule(String line)
	{
		/**
		 * schedules student preferences
		 */
		//System.out.println(line);
		try{
		String[] studentPreference=line.split("\\s+");
	
		bw.write("Student_"+i+" ");
		if(Driver.DEBUG_VALUE==1)
		{
			System.out.print("Student_"+i+" ");
		}
		
		Integer a = Integer.parseInt(studentPreference[1]);
		Integer b = Integer.parseInt(studentPreference[2]);
		Integer c = Integer.parseInt(studentPreference[3]);
		Integer d = Integer.parseInt(studentPreference[4]);
		Integer e = Integer.parseInt(studentPreference[5]);
		Integer f = Integer.parseInt(studentPreference[6]);
		Integer g = Integer.parseInt(studentPreference[7]);
		
		if(a<6)
		{
			countA++;
			bw.write("A ");
			if(Driver.DEBUG_VALUE==1)
			{
				System.out.print("A ");
			}
			total_preference_score += a;
		}
		if(b<6)
		{
			countB++;
			bw.write("B ");
			if(Driver.DEBUG_VALUE==1)
			{
				System.out.print("B ");
			}
			total_preference_score += b;
		}
		if(c<6)
		{
			countC++;
			bw.write("C ");
			if(Driver.DEBUG_VALUE==1)
			{
				System.out.print("C ");
			}
			total_preference_score += c;
		}
		if(d<6)
		{
			countD++;
			bw.write("D ");
			if(Driver.DEBUG_VALUE==1)
			{
				System.out.print("D ");
			}
			total_preference_score += d;
		}
		if(e<6)
		{
			countE++;
			bw.write("E ");
			if(Driver.DEBUG_VALUE==1)
			{
				System.out.print("E ");
			}
			total_preference_score += e;
		}
		if(f<6)
		{
			countF++;
			bw.write("F ");
			if(Driver.DEBUG_VALUE==1)
			{
				System.out.print("F ");
			}
			total_preference_score += f;
		}
		if(g<6)
		{
			countG++;
			bw.write("G ");
			if(Driver.DEBUG_VALUE==1)
			{
				System.out.print("G ");
			}
			total_preference_score += g;
		}
		
		if(Driver.DEBUG_VALUE==1)
		{
			System.out.println(" ");
		}
		
		ttl_pref_score = Integer.toString(total_preference_score);
		
		if(Driver.DEBUG_VALUE==2)
		{
			System.out.println("Entry added to the Result data structure");
		}
		
		bw.write(ttl_pref_score);
		bw.newLine();
		average_preference_score += total_preference_score;
		total_preference_score=0;
		i++;
		//bw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		finally{
			
		}
				
	}
	
	public void finalMethod() throws IOException
	{
		/**
		 * method to write average preference score
		 */
		average_preference_score/=80;
		String avg_pref_score = Float.toString(average_preference_score);
		bw.newLine();
		WorkerThread.done=1;
		bw.write("Average preference_score is: "+ avg_pref_score);
		
		if(Driver.DEBUG_VALUE==0)
		{
			System.out.println("Average preference_score is: "+ avg_pref_score);
		}
		
		//bw.close();
		//br.close();
	}
	public void bwClose()
	{
		/**
		 * method to close BufferedWriter
		 */
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
