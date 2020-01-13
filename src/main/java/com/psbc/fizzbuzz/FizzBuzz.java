package com.psbc.fizzbuzz;

import java.lang.reflect.WildcardType;

/**
 * 测试
 * 
 * @ClassName Musical
 * @Description: TODO
 * @author suzq
 * @date 2019年12月28日 上午9:55:44
 */
public class FizzBuzz {
	/** 被3整除打印文字 */
	public static final String FIZZ = "Fizz";
	/** 被5整除打印文字 */
	public static final String BUZZ = "Buzz";
	/** 被7整除打印文字 */
	public static final String WHIZZ = "Whizz";
	/** 被15整除打印文字 */
	public static final String FIZZ_BUZZ = "FizzBuzz";
	/** 被21整除打印文字 */
	public static final String FIZZ_WHIZZ = "FizzWhizz";
	/** 被35整除打印文字 */
	public static final String BUZZ_WHIZZ = "BuzzWhizz";
	/** 被105整除打印文字 */
	public static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";
	/** 空格 */
	public static final char BLANK = ' ';

	/**
	 * 获取100内字符串
	 * @Title: game
	 * @Description: TODO
	 * @author suzq
	 * @return
	 * @return String
	 */
	public String game() {
		StringBuilder builder = new StringBuilder();

		for (int i = 1; i <= 100; i++) {
			builder.append(BLANK);
			boolean remainder3 = (i % 3) == 0;
			boolean remainder5 = (i % 5) == 0;
			if (remainder3) {
				if (remainder5) {
					builder.append(FIZZ_BUZZ);
					continue;
				}
				builder.append(FIZZ);
				continue;
			}

			if (remainder5) {
				builder.append(BUZZ);
				continue;
			}

			builder.append(i);
		}

		return builder.toString();
	}

	/**
	 * 获取倍数字符串
	 * @Title: game
	 * @Description: TODO
	 * @author suzq
	 * @param num
	 * @return
	 * @return String
	 */
	public String game(int num) {
		if(num <= 0) {
			throw new RuntimeException("invalid input");
		}
		
		boolean remainder3 = (num % 3) == 0;
		boolean remainder5 = (num % 5) == 0;
		boolean remainder7 = (num % 7) == 0;
		
		if (remainder3) {
			if (remainder5) {
				if(remainder7) {
					return FIZZ_BUZZ_WHIZZ;
				}
				return FIZZ_BUZZ;
			}
			
			if(remainder7) {
				return FIZZ_WHIZZ;
			}
			
			return FIZZ;
		}

		
		if (remainder5) {
			if(remainder7) {
				return BUZZ_WHIZZ;
			}
			return BUZZ;
		}
		
		
		if(remainder7) {
			return WHIZZ;
		}

		return null;
	}
}
