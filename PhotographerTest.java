import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {

Photographer photographer;
// Camera camera;


@Before
public void before(){
  photographer = new Photographer("Charlie");
  // camera = new Camera();
}

@Test
public void hasName(){
  assertEquals("Charlie", photographer.getName() );
}



}