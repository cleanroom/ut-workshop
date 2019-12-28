import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


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
    
    
    private Dependency mydep;
    
    @Before
    public void init () {
    	mydep = new Dependency();
    	
    }
    
    @Test
    public void mytest() {
        HelloWorld helloWorld = new HelloWorld(mydep);

        assertThat(helloWorld.beenCalled()).isEqualTo("Hello World");
    }
}
