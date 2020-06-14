package com.springexample.ioc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTimeService implements TimeService {
	
	//날짜를 특정한 형식의 문자열로 변환하는 객체
	private SimpleDateFormat formatter; 
			//= new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
	public void setFormatter(SimpleDateFormat formatter) {
		this.formatter = formatter;
	}
	
	@Override
	public String getTimeString() {
		String timeString = formatter.format(new Date());
		return timeString;	
		

	}

}
