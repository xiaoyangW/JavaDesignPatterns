package com.design.patterns.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author WXY
 * @date 2018/8/3 11:22
 */

public class test {

    public static void main(String[] args) {

        //策略模式
		List<Long> numbers = new ArrayList<Long>();

		Collections.sort(numbers, new Comparator<Long>() {

			@Override
			//返回值是固定的
			//0 、-1 、1
			//0 、 >0 、<0
			public int compare(Long o1, Long o2) {

				//中间逻辑是不一样的

				return 0;
			}


		});

    }

}
