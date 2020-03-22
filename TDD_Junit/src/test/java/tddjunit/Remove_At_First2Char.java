package tddjunit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Remove_At_First2Char {
	/*
	 * "ABCD" => "BCD"
	 * "AA" => ""
	 * "BACD" => "BCD"
	 * "" => ""
	 * "AABAA => "BAA"
	 */
	@Test
	void testRemove2Chars(){
		Remove_A_atFirst2Char obj = new Remove_A_atFirst2Char();
		
		String actual;
		actual = obj.delete_A("AA");
		assertEquals("",actual);
		
		actual = obj.delete_A("ABCD");
		assertEquals("BCD",actual);
		
		actual = obj.delete_A("AACD");
		assertEquals("CD",actual);
		
		actual = obj.delete_A("BACD");
		assertEquals("BCD",actual);
		
		actual = obj.delete_A("BBAA");
		assertEquals("BBAA",actual);
		
		actual = obj.delete_A("AABAA");
		assertEquals("BAA",actual);
	}

}
