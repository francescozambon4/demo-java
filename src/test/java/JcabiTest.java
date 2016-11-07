import java.util.Date;
import java.util.Random;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.jcabi.aspects.Loggable;


public class JcabiTest {
	final static Logger logger = Logger.getLogger("JacabiTest.class");
	
	@Test
	@Loggable
    public void test() throws Exception {
		//logs a debug message
		if(logger.isDebugEnabled()){
		    logger.debug("This is debug");
		}
		logger.warn("This is a Warn");
		
		Random r = new Random();
		long start = new Date().getTime();
		System.out.println("Start: " + start);
		long time = r.nextInt(1000);
		System.out.println("time to wait: " + time);
		Thread.sleep(time);
		long stop = new Date().getTime();
		System.out.println("Stop: " + stop);
		System.out.println("difference: " +  (stop - start));
		
		
	}
}
 