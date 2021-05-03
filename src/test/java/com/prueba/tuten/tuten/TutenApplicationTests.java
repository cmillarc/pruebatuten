package com.prueba.tuten.tuten;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.validateMockitoUsage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.prueba.tuten.tuten.dto.Request;
import com.prueba.tuten.tuten.service.TutenServiceImpl;

class TutenApplicationTests {

	@InjectMocks
	private TutenServiceImpl tutenServiceImpl;

	private Request request;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
		request = new Request();

	}

	@AfterEach
	void tearDown() {
		validateMockitoUsage();
		request = null;

	}

	@Test
	void getDateTest() {
		request.setInputHour(0);
		request.setInputTime("01:01:58");

		assertNotNull(tutenServiceImpl.getUtcDate(request));
	}

}
