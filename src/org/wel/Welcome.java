package org.wel;

public class Welcome {
public static void main(String[] args) {
	String s1= "Welcome to Java Class";
	String s2= "Greens Adayar";
	String s3= "arolihelan@gmail.com";
	String s4=" 45-netaji nagar,pincode-628502";
	String e= s1.replace("Java", "SQL");
	System.out.println(e);
	String d= s2.replace("Adayar","omr");
	System.out.println(d);
String r= s1.replace(" ", "#");
System.out.println(r);
String t= s3.replace("gmail","Yahoo");
System.out.println(t);
String f= s4.replace("pincode"," ");
System.out.println(f);
}}
