/* package hu.me.krz.haladojava;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{

	@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
*/

package hu.me.krz.haladojava;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;


public class AppTest 
{
    @Test
    public void PlanetTest()
    {
    	List<Planet> wew = new LinkedList<Planet>();
    	
        Astronomer a = new Astronomer("teszt", wew);
        assertEquals("teszt", a.getName());
    }
}