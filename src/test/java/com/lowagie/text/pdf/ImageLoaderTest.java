package com.lowagie.text.pdf;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import junit.framework.Assert;

import org.junit.Test;

import util.ResourceLoader;


public class ImageLoaderTest {

	@Test
	public void urlFromClassPath(){
		URL url=ResourceLoader.urlFromClassPath("otsoe.jpg");
		Assert.assertNotNull(url.getFile());
	}
	@Test
	public void inputStreamFromClassPath() throws IOException{
		InputStream in=ResourceLoader.inputStreamFromClassPath("otsoe.jpg");
		Assert.assertNotNull(in.available()>0);
	}
	@Test
	public void  fileFromClassPath(){
		String fileFullPath=ResourceLoader.fileFromClassPath("playRomeoJuliet.xml");
		Assert.assertNotNull(fileFullPath);
	}
}
