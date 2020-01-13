package com.psbc.mars;

/**
 * 区域类
 * 
 * @ClassName Area
 * @Description: TODO
 * @author suzq
 * @date 2019年12月28日 下午1:56:24
 */
public class Area {
	/** 区域长度 */
	private int X;
	/** 区域宽度 */
	private int Y;

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public Area(int x, int y) {
		X = x;
		Y = y;
	}
	
	public static Area getArea(int x, int y ) {
		 return new Area(x, y);
	}
}
