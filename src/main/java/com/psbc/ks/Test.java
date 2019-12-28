package com.psbc.ks;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	
	public int _maxNumber;
	public int _minNumber;
	
	public Test () {
		_maxNumber = 100;
		_minNumber = 0;
	}

	public Test ( int _maxNum,  int _minNum ) {
		
		if ( _minNum > _maxNum ) {
			this._maxNumber = _maxNum;
			this._minNumber = _minNum;
		}
		
		this._maxNumber = _maxNum;
		this._minNumber = _minNum;
	}
	
	public List<Integer> getBzxx () {
		List <Integer> ret = new ArrayList<Integer>();
		return ret;
	}

}
