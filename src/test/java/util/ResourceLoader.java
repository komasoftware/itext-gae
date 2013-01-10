package util;
import java.io.InputStream;
import java.net.URL;


public class ResourceLoader {

	public static URL urlFromClassPath(String fileName){
		return ResourceLoader.class.getClassLoader().getResource(fileName);
	}
	
	public static String fileFromClassPath(String fileName){
		return urlFromClassPath(fileName).getFile();
	}
	
	public static InputStream inputStreamFromClassPath(String filename){
		return ResourceLoader.class.getClassLoader().getResourceAsStream(filename);
	}
}
