package com.lowagie.text.pdf;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import util.ResourceLoader;

public class AcroFieldsTest {
    
    @Test
    public void testSetFields() throws Exception {
        singleTest(ResourceLoader.fileFromClassPath("register.xfdf"));
    }

    @Test
    public void testListInSetFields() throws Exception {
        singleTest(ResourceLoader.fileFromClassPath("list_register.xfdf"));
    }
    
    private void singleTest(String xfdfFileName) throws Exception {
        // merging the FDF file
        PdfReader pdfreader = new PdfReader(ResourceLoader.fileFromClassPath("SimpleRegistrationForm.pdf"));
        PdfStamper stamp = new PdfStamper(pdfreader, new ByteArrayOutputStream());
        XfdfReader fdfreader = new XfdfReader(xfdfFileName);
        AcroFields form = stamp.getAcroFields();
        form.setFields(fdfreader);
        stamp.close();
    }
}
