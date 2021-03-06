package com.fileReader;

import java.io.File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class UserFileReader {

	public static MyBean getMyBean() {
		return new MyBean();
	}

	public static void main(String[] args) {
		File file = new File("src/user_data.xml");

		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(file);
			document.getDocumentElement().normalize();
			NodeList nodeList = document.getElementsByTagName("name");
			Element element = (Element) nodeList.item(0);
			MyBean bean = getMyBean();
			bean.setFirstName(element.getElementsByTagName("first_name").item(0).getTextContent().trim());
			bean.setLastName(element.getElementsByTagName("last_name").item(0).getTextContent().trim());
			System.out.println(bean);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
