package util;
import java.io.InputStream;
import java.net.URL;


public class ImageLoader {

	public static URL urlFromClassPath(String fileName){
		return ImageLoader.class.getClassLoader().getResource(fileName);
	}
	
	public static String fileFromClassPath(String fileName){
		return urlFromClassPath(fileName).getFile();
	}
	
	public static InputStream inputStreamFromClassPath(String filename){
		return ImageLoader.class.getClassLoader().getResourceAsStream(filename);
	}
}
