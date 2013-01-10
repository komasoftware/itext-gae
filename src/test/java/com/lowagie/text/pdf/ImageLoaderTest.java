package com.lowagie.text.pdf;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import junit.framework.Assert;

import org.junit.Test;

import util.ImageLoader;


public class ImageLoaderTest {

	@Test
	public void urlFromClassPath(){
		URL url=ImageLoader.urlFromClassPath("otsoe.jpg");
		Assert.assertNotNull(url.getFile());
	}
	@Test
	public void inputStreamFromClassPath() throws IOException{
		InputStream in=ImageLoader.inputStreamFromClassPath("otsoe.jpg");
		Assert.assertNotNull(in.available()>0);
	}
	@Test
	public void  fileFromClassPath(){
		String fileFullPath=ImageLoader.fileFromClassPath("playRomeoJuliet.xml");
		Assert.assertNotNull(fileFullPath);
	}
}
