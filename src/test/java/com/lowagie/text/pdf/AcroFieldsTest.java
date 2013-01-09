package com.lowagie.text.pdf;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class AcroFieldsTest {
    
    @Test
    public void testSetFields() throws Exception {
        singleTest(AcroFieldsTest.class.getClassLoader().getResource("register.xfdf").getFile());
    }

    @Test
    public void testListInSetFields() throws Exception {
        singleTest(AcroFieldsTest.class.getClassLoader().getResource("list_register.xfdf").getFile());
    }
    
    private void singleTest(String xfdfFileName) throws Exception {
        // merging the FDF file
        PdfReader pdfreader = new PdfReader(AcroFieldsTest.class.getClassLoader().getResource("SimpleRegistrationForm.pdf"));
        PdfStamper stamp = new PdfStamper(pdfreader, new ByteArrayOutputStream());
        XfdfReader fdfreader = new XfdfReader(xfdfFileName);
        AcroFields form = stamp.getAcroFields();
        form.setFields(fdfreader);
        stamp.close();
    }
}
