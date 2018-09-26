import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class NumberFormatTest {
	
	NumberFormat instance;
	
	@Test
	void shouldFormat() {
		String a = "123";
		String b = "876";
		instance = new NumberFormat(Integer.parseInt(a),Integer.parseInt(b));
		int result = instance.format();
		assertThat(result, equalTo(182736));
	}

	@Test
	void shouldFormatWithBBiggerThanA() {
		String a = "12";
		String b = "8765";
		instance = new NumberFormat(Integer.parseInt(a),Integer.parseInt(b));
		int result = instance.format();
		assertThat(result, equalTo(182765));
	}
	
	@Test
	void shouldFormatWithABiggerThanB() {
		String a = "8765";
		String b = "12";
		instance = new NumberFormat(Integer.parseInt(a),Integer.parseInt(b));
		int result = instance.format();
		assertThat(result, equalTo(817265));
	}
	
	@Test
	void shouldReturnMaxCharacters() {
		String a = "12";
		String b = "8765";
		instance = new NumberFormat(Integer.parseInt(a),Integer.parseInt(b));
		int result = instance.maxCharacters();
		assertThat(result, equalTo(4));
	}
	
	@Test
	void shouldReturnNegativeIfBiggerThanAMillion() {
		String a = "123";
		String b = "87654";
		instance = new NumberFormat(Integer.parseInt(a),Integer.parseInt(b));
		int result = instance.format();
		assertThat(result, equalTo(-1));
	}

}
