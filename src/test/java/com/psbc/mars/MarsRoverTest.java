package com.psbc.mars;

import static org.fest.assertions.api.Assertions.assertThat;
import org.junit.Test;

/**
 * 火星车测试
 * 
 * @ClassName MarsRoverTest
 * @Description: TODO
 * @author suzq
 * @date 2019年12月28日 下午2:38:46
 */
public class MarsRoverTest {

	@Test
	public void test1() {
		Area area = Area.getArea(10, 10);
		Rover rover = new Rover(area, "N", 3, 5);
		rover.move(1);
		rover.move(2);
		rover.move(3);
		rover.move(3);
		rover.turn("R");
		rover.move(1);
		rover.turn("L");
		rover.move(3);
		String space = rover.getSpace();
		System.out.println(space); 
		assertThat(space).isEqualTo("410N");
	}
	
	@Test
	public void test2() {
		String instruct = "10,10,5,5,E,M,L,M,R";
		Rover rover = new Rover();
		String space = rover.excute(instruct);
		assertThat(space).isEqualTo("66E");
	}

}
