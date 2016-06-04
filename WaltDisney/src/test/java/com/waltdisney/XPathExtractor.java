package com.waltdisney;

import javax.xml.xpath.*;
import java.io.*;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.apache.xpath.NodeSet;
public class XPathExtractor{

    public void evaluateDocument(File xmlDocument){

    try
    {
        XPathFactory factory=XPathFactory.newInstance();
        XPath xPath=factory.newXPath();
        InputSource inputSource=new InputSource(new FileInputStream(xmlDocument));
        XPathExpression xPathExpression=xPath.compile(".//*[@id='content']");

        String expression = ".//*[@id='content']";
        inputSource=new InputSource(new FileInputStream(xmlDocument));
        NodeList shows = (NodeList) xPath.evaluate(expression, inputSource, XPathConstants.NODESET);
        
        System.out.println("shows length"+shows.getLength());
        for (int i = 0; i < shows.getLength(); i++)
        {
            Element show = (Element) shows.item(i);
            // Obtain xpaths for objects on the page and save them to file.
        }
    }
    catch(IOException  e){}
    catch(XPathExpressionException e){}
    }

    public static void main(String[] argv) 
    {
    	XPathExtractor extract = new XPathExtractor();
        File xmlDocument = new File("path:\\home.htm");
        extract.evaluateDocument(xmlDocument);
    }
}