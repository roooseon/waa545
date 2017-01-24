package com.waa.w1d5lab2.junit;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.waa.w1d5lab2.controller.AppConfig;
import com.waa.w1d5lab2.domain.Order;
import com.waa.w1d5lab2.service.SampleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class JUnitSpringExample {
	
	@Autowired
	private SampleService sampleService;
	
	@BeforeClass
	public static void setUp() {
		System.out.println("-----> SETUP <------");
	}
	
	@Test
	public void testSampleService() {
		assertEquals("class com.waa.w1d5lab2.service.SampleServiceImpl", this.sampleService.getClass().toString());;
	}
	
	@Test
	public void testSampleServiceGetAccountDescription() {
		assertEquals("Description: Order for XYZ in units", this.sampleService.getOrderDescription());
	}
	
	@Test
	public void testSampleServiceGetAccountStringCode() {
		assertTrue(this.sampleService.getOrderStringCode().contains("Code"));
	}
	
	@Test
	public void testSampleServiceCreateNewOrder() {
		Order newOrder = new Order();
		newOrder.setDescription("Description");
		newOrder.setSecurityCode("XYZ");
		
		if (newOrder != null) {
			assertThat(sampleService.CreateOrder(newOrder),instanceOf(Order.class));
			assertEquals("Description", newOrder.getDescription());
		}
	}
	
	@Test
	public void testSampleServiceGetOrder() {
		Order existingOrder = sampleService.getOrder(0);
		
		if (existingOrder != null) {
			assertThat(sampleService.getOrder(0), instanceOf(Order.class));
			assertEquals("This is the new XYZ order", existingOrder.getDescription());
			assertEquals("XYZ", existingOrder.getSecurityCode());
		}
	}
	
	@AfterClass
	public static void afterTest() {
		System.out.print("----> DESTROY <----");
	}
}
