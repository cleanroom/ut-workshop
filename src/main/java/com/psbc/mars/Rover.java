package com.psbc.mars;

/**
 * 探测器
 * 
 * @ClassName Rover
 * @Description: TODO
 * @author suzq
 * @date 2019年12月28日 下午1:58:54
 */
public class Rover {

//	/** 北 */
//	public static final String "N" = "N";
//	/** 南 */
//	public static final String "S" = "S";
//	/** 东 */
//	public static final String "E" = "E ";
//	/** 西 */
//	public static final String "W" = "W";
	/** 移动 */
	public static final String MOVE = "M";
	/** 左转 */
	public static final String TURN_LEFT = "L";
	/** 右转 */
	public static final String TURN_RIGHT = "R";

	/**
	 * 着陆方向 N S E W
	 */
	private String position;
	/** 所在地 x轴线 */
	private int L_X;
	/** 所在地y轴线 */
	private int L_Y;
	/** 活动区域 */
	private Area area;

	public Rover() {
	}

	public Rover(Area area, String landPosition, int X, int Y) {
		validators(area, landPosition, X, Y);

		this.area = area;
		this.position = landPosition;
		this.L_X = X;
		this.L_Y = Y;
		System.out.println("落地点：" + X + " : " + Y + " 朝向：" + position);
	}

	/**
	 *  执行指令
	 * @Title: excute
	 * @Description: TODO
	 * @author suzq
	 * @param s
	 * @return void
	 */
	public String excute(String s) {
		String[] split = s.split(",");
		
		int x = Integer.valueOf(split[0].trim());
		int y = Integer.valueOf(split[1].trim());
		
		Area area = Area.getArea(x, y);
		
		int l_x = Integer.valueOf(split[2].trim());
		int l_y = Integer.valueOf(split[3].trim());
		
		String position = split[4].trim();
		
		 validators( area,  position,  l_x,  l_y);

		this.area = area;
		this.position = position;
		this.L_X = l_x;
		this.L_Y = l_y;
		System.out.println("落地点：" + L_X + " : " + L_Y + " 朝向：" + position);
		
		
		for(int i = 5 ; i < split.length; i++) {
			String instruct = split[i].trim();
			
			if(MOVE.equals(instruct)) {
				move(1);
				continue;
			}
			
			if(TURN_LEFT.equals(instruct) || TURN_RIGHT.equals(instruct)) {
				turn(instruct);
				continue;
			}
			
			System.out.println("非法指令："+instruct);
		}
		
		return  getSpace();
	}

	/**
	 * 移动长度
	 * 
	 * @Title: move
	 * @Description: TODO
	 * @author suzq
	 * @param length
	 * @return void
	 */
	public void move(int length) {
		switch (position) {
		case "N": // 北方 Y+length
			L_Y = (L_Y + length) > area.getY() ? area.getY() : L_Y + length;
			System.out.println("朝向北移动:" + length + "到 ：" + L_X + " : " + L_Y);
			return;
		case "S":
			L_Y = (L_Y - length) < 0 ? 0 : L_Y - length;
			System.out.println("朝向南移动:" + length + "到 ：" + L_X + " : " + L_Y);
			return;
		case "W":
			L_X = (L_X - length < 0) ? 0 : L_X - length;
			System.out.println("朝向西移动:" + length + "到 ：" + L_X + " : " + L_Y);
			return;
		case "E":
			L_X = (L_X + length > area.getX()) ? area.getX() : L_X + length;
			System.out.println("朝向西移动:" + length + "到 ：" + L_X + " : " + L_Y);
			return;
		default:
			break;
		}
	}

	/**
	 * 转向
	 * 
	 * @Title: turn
	 * @Description: TODO
	 * @author suzq
	 * @return void
	 */
	public void turn(String turn) {
		if (turn == null) {
			System.out.println("错误转向指令！");
			return;
		}

		if ("L".equals(turn)) {
			System.out.print("左转：");
			switch (position) {
			case "N":
				position = "W";
				System.out.println("北方->西方");
				return;
			case "S":
				position = "E";
				System.out.println("南方->东方");
				return;
			case "E":
				position = "N";
				System.out.println("东方->北方");
				return;
			case "W":
				position = "S";
				System.out.println("西方->南方");
				return;
			default:
				break;
			}
		}

		if ("R".equals(turn)) {
			System.out.print("右转：");
			switch (position) {
			case "N":
				position = "E";
				System.out.println("北方->东方");
				return;
			case "S":
				position = "W";
				System.out.println("南方->西方");
				return;
			case "E":
				position = "S";
				System.out.println("东方->南方");
				return;
			case "W":
				position = "N";
				System.out.println("西方->北方");
				return;
			default:
				break;
			}
		}

		System.out.println("转向错误指令：" + turn);
	}

	/**
	 * 验证方位
	 * 
	 * @Title: validationPosition
	 * @Description: TODO
	 * @author suzq
	 * @return
	 * @return boolean
	 */
	private boolean validationPosition(String p) {
		switch (p) {
		case "N":
			return true;
		case "S":
			return true;
		case "E":
			return true;
		case "W":
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * 验证初始化参数
	 * 
	 * @Title: validators
	 * @Description: TODO
	 * @author suzq
	 * @return
	 * @return boolean
	 */
	private void validators(Area area, String landPosition, int X, int Y) {
		if (landPosition == null) {
			throw new RuntimeException("未指定朝向!");
		}

		if (!validationPosition(landPosition)) {
			throw new RuntimeException("方向制定错误!");
		}

		if (X < 0 || Y < 0 || X > area.getX() || Y > area.getY()) {
			throw new IllegalArgumentException(" 降落点在区域之外");
		}

	}

	public String getSpace() {
		String space = L_X + "" + L_Y + position;
		System.out.println("所在地："+space);
		return space;
	}

}
