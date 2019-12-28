import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.psbc.ks.TestNumber;


public class HelloWorldTest {
    //@Test
    public void hello_world_test(){
       assertThat("333Hello Worldeeeeee").isEqualTo("Hello World");
    }

    //@Test
    public void should_be_mocked() {
    	
    	//
    	Dependency dependency = mock(Dependency.class);
        //when(dependency.say()).thenReturn("Hello ss World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        assertThat(helloWorld.beenCalled()).isEqualTo("Hello World");
    }
    
    
    private TestNumber testNumber;
    private Map<Integer,String> userCase;
    
    @Before
    public void init () {
    	testNumber = new TestNumber();
    	userCase = new HashMap<Integer, String>();

    	userCase.put(1, "1");  
    	userCase.put(2, "2"); 
    	userCase.put(3, "fizz"); 
    	userCase.put(4, "4"); 
    	userCase.put(5, "buzz"); 
    	userCase.put(15, "fizzbuzz"); 
    }
    
    @Test
    public void mytest() {

    	for ( Integer key : userCase.keySet() ) {
    		//验证是否成功
    		assertThat( testNumber.calc( key ) ).isEqualTo( userCase.get(key) );
    	}
    }
}
