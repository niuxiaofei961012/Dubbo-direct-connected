package com.nxf.math.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.nxf.math.service.MathService;
@Service
public class MathServiceImpl implements MathService {

	@Override
	public int jia(int x, int y) {
		// TODO Auto-generated method mathb
		return x+y;
	}

	@Override
	public int jian(int x, int y) {
		// TODO Auto-generated method mathb
		return x-y;
	}

	@Override
	public int cheng(int x, int y) {
		// TODO Auto-generated method mathb
		return x*y;
	}

	@Override
	public int chu(int x, int y) {
		// TODO Auto-generated method mathb
		return x/y;
	}
	
}
