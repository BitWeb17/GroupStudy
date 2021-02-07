package com.example.lecture210205;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lecture210205Application {

	public static void main(String[] args) {

		// 자바 엔진 같은 느낌?
		// 동작을 하는 와중에 이벤트가 발생하여 이벤트를 처리해주는 것
		// controller안의 getMapping은 컨트롤러 기준에서 이벤트
		// controller는 이벤트 핸들러 같은 느낌
		SpringApplication.run(Lecture210205Application.class, args);
	}

}
