package com.lgcns.mcs.constant;

import org.springframework.stereotype.Service;

@Service("MCSConstants")
public class McsConstant {

	public enum State
	{
		Run,
		idle,
		Down
	}
	
	public enum Direction
	{
		In,
		Out,
		BiDirection
	}
	
	public enum InlineStatus
	{
		LR,
		UR,
		WAIT
	}


}
