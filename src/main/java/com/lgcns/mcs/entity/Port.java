package com.lgcns.mcs.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lgcns.mcs.constant.McsConstant.Direction;

@Entity
@Table(name="TB_PORT")
public class Port extends Unit {
	private static final Logger logger = LoggerFactory.getLogger(Port.class);
	
	
    @Enumerated(EnumType.STRING)
    private Direction portDirection = Direction.NONE;

}
