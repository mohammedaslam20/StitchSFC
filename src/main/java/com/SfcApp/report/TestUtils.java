package com.SfcApp.report;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Element;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.SfcApp.utility.BaseClassMobile;

import akka.dispatch.AbstractBoundedNodeQueue.Node;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class TestUtils {
	public static final long WAIT = 10;
	
	public HashMap<String, String> parseStringXML(InputStream file) throws Exception{
		HashMap<String, String> stringMap = new HashMap<String, String>();
		//Get Document Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		 
		//Build Document
		Document document = builder.parse(file);
		 
		//Normalize the XML Structure; It's just too important !!
		document.getDocumentElement().normalize();
		 
		//Here comes the root node
		//Element root = document.getDocumentElement();
		 
		//Get all elements
		NodeList nList = document.getElementsByTagName("string");
		 
		for (int temp = 0; temp < nList.getLength(); temp++)
		{
		// Node node = nList.item(temp);
		// if (node.getNodeType() == Node.ELEMENT_NODE)
		 {
		   // Element eElement = (Element) node;
		    // Store each element key value in map
		    //stringMap.put(eElement.getAttribute("name"),eElement.getNodeName());
		 }
		}
		return stringMap;
	}
	
	public String dateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	public void log(String txt) {
		BaseClassMobile base = new BaseClassMobile();
//		String msg = Thread.currentThread().getId() + ":" + base.getPlatform() + ":" + base.getDeviceName() + ":"
//				+ Thread.currentThread().getStackTrace()[2].getClassName() + ":" + txt;
		String msg = Thread.currentThread().getId() + ":Web:"  + ":"
				+ Thread.currentThread().getStackTrace()[2].getClassName() + ":" + txt;
		System.out.println(msg);
		
		String strFile = "logs" + File.separator + ":Web:" + "_" 
				+ File.separator ;

		File logFile = new File(strFile);

		if (!logFile.exists()) {
			logFile.mkdirs();
		}
		
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(logFile + File.separator + "log.txt",true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    PrintWriter printWriter = new PrintWriter(fileWriter);
	    printWriter.println(msg);
	    printWriter.close();
	}

	public Logger log() {
		return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}
	
}