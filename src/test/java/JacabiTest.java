import java.util.Date;
import java.util.Random;

import org.junit.Test;

import com.jcabi.aspects.Loggable;

public class JacabiTest {

	
	@Test
	@Loggable
    public void test() throws Exception {
		Random r = new Random(10001);
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
