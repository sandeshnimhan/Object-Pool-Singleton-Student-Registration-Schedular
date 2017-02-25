package registrationScheduler.util;

public class Logger{


    public static enum DebugLevel { 
    	CONSTRUCTOR,
    	THREAD_RUN,
    	ENTRY_TO_RESULT_DATA_STRUCTURE,
    	CONTENTS_OF_DATA_STRUCTURE,
    	OUTPUT_AVG_PREF_SCORE
                                   };

    private static DebugLevel debugLevel;


    public static void setDebugValue (int levelIn) {
	switch (levelIn) {
	  case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
	  case 3: debugLevel = DebugLevel.THREAD_RUN; break;
	  case 2: debugLevel = DebugLevel.ENTRY_TO_RESULT_DATA_STRUCTURE; break;
	  case 1: debugLevel = DebugLevel.CONTENTS_OF_DATA_STRUCTURE; break;
	  case 0: debugLevel = DebugLevel.OUTPUT_AVG_PREF_SCORE; break;
	}
    }

    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

    // @return None
    public static void writeMessage (String     message  ,
                                     DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    public static void writeOutput()
    {
    	
    }
    
    public String toString() {
	return "Debug Level is " + debugLevel;
    }
}
