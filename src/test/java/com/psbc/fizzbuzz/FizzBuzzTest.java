package com.psbc.fizzbuzz;

import static org.fest.assertions.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 测试用例
 * 
 * @ClassName MusicalTest
 * @Description: 用于测试
 * @author suzq
 * @date 2019年12月28日 上午9:56:37
 */
@SuppressWarnings("rawtypes")
@RunWith(Parameterized.class)
public class FizzBuzzTest {
	private FizzBuzz musical;

	private int req;
	private String res;

	public FizzBuzzTest(int req, String res) {
		super();
		this.req = req;
		this.res = res;
	}

	@Parameters
	public static Collection prepareData() {
		return Arrays.asList(
				new Object[][] { 
					{ 3, FizzBuzz.FIZZ } ,
					{ 5, FizzBuzz.BUZZ } ,
					{ 7, FizzBuzz.WHIZZ } ,
					{ 3*5, FizzBuzz.FIZZ_BUZZ } , 
					{ 3*7, FizzBuzz.FIZZ_WHIZZ } ,
					{ 3*5*7, FizzBuzz.FIZZ_BUZZ_WHIZZ } ,
					{ 5*7, FizzBuzz.BUZZ_WHIZZ } ,
				});
	}

	@Before
	public void init() {
		musical = new FizzBuzz();
	}

	@Test
	public void game() {
		assertThat(musical.game(req)).isEqualTo(res);
	}
}
