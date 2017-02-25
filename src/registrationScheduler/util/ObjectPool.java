package registrationScheduler.util;

public class ObjectPool {

	ObjectPool A=new ObjectPool();
	ObjectPool B=new ObjectPool();
	ObjectPool C=new ObjectPool();
	ObjectPool D=new ObjectPool();
	ObjectPool E=new ObjectPool();
	ObjectPool F=new ObjectPool();
	ObjectPool G=new ObjectPool();
	
	public synchronized ObjectPool requestSpot()
	{
		/**
		 * synchronized method to request object from object pool
		 * @return object from object pool
		 */
		ObjectPool spot=new ObjectPool();
		
		return spot;
	}
	
	public int checkAvailability()
	{
		/**
		 * checks availability of objects
		 * @return 1 if available
		 */
		int available=0;
		
		return available;
	}
	
	public void returnSpot()
	{
		/**
		 * return spot to object pool
		 */
	}
	
	
}
