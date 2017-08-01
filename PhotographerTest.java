import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {

Photographer photographer;
Digital digital;
Analogue analogue;


@Before
public void before(){
  photographer = new Photographer("Charlie");
  digital = new Digital();
  analogue = new Analogue();
}

@Test
public void hasName(){
  assertEquals("Charlie", photographer.getName() );
}

@Test
public void canAddCamera(){
  photographer.addCamera(digital);
  photographer.addCamera(analogue);
  assertEquals(2, photographer.cameraCount());
}



}