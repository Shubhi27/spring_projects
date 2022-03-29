package com.fileReader;

import java.io.*;
import java.util.Scanner;
public class FileReaderDemo {
	 public static void main(String[] args) throws IOException{
		 MyBean bean;
			try(Scanner sc=new Scanner(new File("data.txt"))){
			
				bean= new MyBean(sc.nextLine(),sc.nextLine());
				System.out.println(bean);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	 }
}
