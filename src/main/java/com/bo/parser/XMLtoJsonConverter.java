package com.bo.parser;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.apache.commons.io.IOUtils;
import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

public class XMLtoJsonConverter {
		 private static URL url = null;
	        private static InputStream input = null;
	        
	        public static JSON convertJOSN() throws IOException {
	        	JSON json=null;
	            try{
	                url = XMLtoJsonConverter.class.getClassLoader().getResource("p1862514225.xml");
	                input = url.openStream();
	                String xmlData = IOUtils.toString(input);
	                XMLSerializer xmlSerializer = new XMLSerializer();  
	                json = xmlSerializer.read(xmlData);
	                System.out.println("JSON format : " + json);
	            }catch(Exception e){
	                e.printStackTrace();
	            }finally{
	                    input.close();
	            }
	            	return json;
	            }
	
	
}
