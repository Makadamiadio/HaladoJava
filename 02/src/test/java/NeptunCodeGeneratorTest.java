import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class NeptunCodeGeneratorTest2 {

	@Test
	void testGetNextCounter() {
		
	NeptunCodeGenerator ng = new NeptunCodeGenerator();
	
	assertEquals(ng.getNextCounter(), 0);
	assertEquals(ng.getNextCounter(), 1);
	}

}