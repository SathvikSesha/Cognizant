package com.cognizant.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class MyServiceTest {

	@Test
	void shouldReturnMockData() {

		// Arrange
		ExternalAPI mockApi = mock(ExternalAPI.class);

		when(mockApi.getData()).thenReturn("Mock Data");

		MyService service = new MyService(mockApi);

		// Act
		String result = service.fetchData();

		// Assert
		assertEquals("Mock Data", result);
	}
}