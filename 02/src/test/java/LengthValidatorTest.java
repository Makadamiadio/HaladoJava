import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;



import org.junit.jupiter.api.Test;

public class LengthValidatorTest {

	LengthValidator lv = new LengthValidator();
	@Test
	void isUserNameIsNotLongEnouhg() {

		User user = mock(User.class);
		
		when(user.getName()).thenReturn("Asddsdfdgdsd");
		
		assertTrue(lv.isValid(user));
		
		
	}
	
	@Test
	void isUserNameIsLongEnough() {
		
				User user = mock(User.class);
				
				when(user.getName()).thenReturn("Asd");
				
				assertFalse(lv.isValid(user));
	}
}