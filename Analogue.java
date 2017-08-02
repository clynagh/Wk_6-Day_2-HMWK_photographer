import java.util.HashMap;

public class Analogue implements Camera{


  public static void main(String[] args){

    HashMap<String, String> analogueCameraInfo = new HashMap<String, String>();
  }


analogueCameraInfo.put("Camera", "Pentax MZ10");
analogueCameraInfo.put("Filter", "Noise reduction filter");
analogueCameraInfo.put("Lens", "Hi-resolution 2");
analogueCameraInfo.put("Lens Make", "Sony ILCE5100L");
analogueCameraInfo.put("Lens Capture", "SLR");
analogueCameraInfo.put("LCD Display", "No Display")

System.out.print(analogueCameraInfo.get("Camera"));


}