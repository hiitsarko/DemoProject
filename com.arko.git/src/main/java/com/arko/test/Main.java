package com.arko.test;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class Main {

	public static void main(String argv[]) throws Exception {
		HashMap<String , ArrayList<String>> invoces = new HashMap<>();
		LinkedHashMap<String , ArrayList<String>> invoceslines = new LinkedHashMap<>();
		
		//File file = new File(System.getProperty("user.dir") + "\\invoice_lines.xml");
		File file = new File("invoice_lines.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(file);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName("invoice_line");
		for (int itr = 0; itr < nodeList.getLength(); itr++) {
			Node node = nodeList.item(itr);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				ArrayList temp = new ArrayList<>();
				temp.add(eElement.getElementsByTagName("invoice_id").item(0).getTextContent());
				temp.add(eElement.getElementsByTagName("quantity").item(0).getTextContent());
				temp.add(eElement.getElementsByTagName("price").item(0).getTextContent());
				temp.add(eElement.getElementsByTagName("amount").item(0).getTextContent());
				invoceslines.put(eElement.getElementsByTagName("items_shipped").item(0).getTextContent(), temp);
			}
		}
		//=====
		//file = new File(System.getProperty("user.dir") + "\\invoices.xml");
		file = new File("invoices.xml");
		dbf = DocumentBuilderFactory.newInstance();
		db = dbf.newDocumentBuilder();
		doc = db.parse(file);
		doc.getDocumentElement().normalize();
		nodeList = doc.getElementsByTagName("invoice");
		for (int itr = 0; itr < nodeList.getLength(); itr++) {
			Node node = nodeList.item(itr);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				ArrayList temp = new ArrayList<>();
				Element eElement = (Element) node;
				temp.add(eElement.getElementsByTagName("date_of_invoice").item(0).getTextContent());
				temp.add(eElement.getElementsByTagName("customer_name").item(0).getTextContent());
				temp.add(eElement.getElementsByTagName("total_amount").item(0).getTextContent());
				temp.add(eElement.getElementsByTagName("description").item(0).getTextContent());
				invoces.put(eElement.getAttribute("id"), temp);
				
			}
		}
		//=====
		int num =0;
		while(num!=3) {
			BufferedReader br = null;
			System.out.println("\n1. Display invoice information for all invoices");
			System.out.println("2. Display invoice information for specified invoice");
			System.out.println("3. Exit");
			br = new BufferedReader(new InputStreamReader(System.in));
			num = Integer.parseInt(br.readLine());
			if(num==1) {
				System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Invoice Id", "Customer Name", "Invoice Date", "Item Name", "Quantity", "Rate", "Amount");
				for(Entry<String, ArrayList<String>> en1:invoceslines.entrySet()) {
					System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",en1.getValue().get(0),invoces.get(en1.getValue().get(0)).get(1),invoces.get(en1.getValue().get(0)).get(0),en1.getKey(),en1.getValue().get(1),en1.getValue().get(2),en1.getValue().get(3));
				}
			}else if(num==2) {
				System.out.println("Enter Date of Invoice(dd/MM/yyyy)");
				br = new BufferedReader(new InputStreamReader(System.in));
				String date = br.readLine().trim();
				System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Invoice Id", "Customer Name", "Invoice Date", "Item Name", "Quantity", "Rate", "Amount");
				for(Entry<String, ArrayList<String>> en1:invoceslines.entrySet()) {
					if(invoces.get(en1.getValue().get(0)).get(0).trim().equals(date)) {
						System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",en1.getValue().get(0),invoces.get(en1.getValue().get(0)).get(1),invoces.get(en1.getValue().get(0)).get(0),en1.getKey(),en1.getValue().get(1),en1.getValue().get(2),en1.getValue().get(3));
					}
				}
			}else if(num==3) {
				System.exit(0);
			}
		}
		
		

	}

}
