package com.in28minutes.junit.helper;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnnotationBeforeAndAfter {
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeEach
	public void setup() {
		System.out.println("before test");
	}
	
	@Test
	void test1() {
		System.out.println("test1() executed");
	}
	
	@Test
	public void test2() {
		System.out.println("test2() executed");
	}
	
	@AfterEach
	public void shutDown() {
		System.out.println("after test");
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("After Class");
	}

}
