package com.example.smartparking;
import java.io.IOException;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;
public class Callservice {
private static String NAMESPACE="http://New/";
private static String URL="http://192.168.42.47:8080/Parking_service/Parkingservice?WSDL";
public static String loginService(String s1, String s2, String method) {
// TODO Auto-generated method stub
String restex=null
SoapObject soap=new SoapObject(NAMESPACE, method);
soap.addProperty("user_name",s1);
soap.addProperty("password",s2);
SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
envelope.setOutputSoapObject(soap);
HttpTransportSE http=new HttpTransportSE(URL);
try {
http.call(NAMESPACE+method, envelope);
SoapPrimitive primitive =(SoapPrimitive)
envelope.getResponse();
restex=primitive.toString();
} catch (IOException e) {
e.printStackTrace();
return "error";
}
catch (XmlPullParserException e) {
e.printStackTrace();
return "error”
}
return restex;
}
public static String registerService(String user, String pass, String mail,
String mobile, String method) {
String restex=null;
SoapObject soap=new SoapObject(NAMESPACE, method);
soap.addProperty("username",user);
soap.addProperty("password",pass);
soap.addProperty("mail",mail);
soap.addProperty("mobile",mobile);
SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
envelope.setOutputSoapObject(soap);
HttpTransportSE http=new HttpTransportSE(URL);
try {
http.call(NAMESPACE+method, envelope);
SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
restex=primitive.toString();
} 
catch (IOException e) {
e.printStackTrace();
return "error";
}
catch (XmlPullParserException e) {
e.printStackTrace();
return "error";
}
return restex;
}
public static String getDeviceList1(String from, String method) {
String restex=null;
SoapObject soap=new SoapObject(NAMESPACE, method);
soap.addProperty("from",from);
soap.addProperty("password",password);
SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
envelope.setOutputSoapObject(soap);
HttpTransportSE http=new HttpTransportSE(URL);
try {
http.call(NAMESPACE+method, envelope);
SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
restex=primitive.toString();
} 
catch (IOException e) {
e.printStackTrace();
return "error";
}
catch (XmlPullParserException e) {
e.printStackTrace();
return "error";
}
return restex;
}
public static String BankDetailsService(String s1, String s2, String s3,
String s4, String s5, String method) {
// TODO Auto-generated method stub
String restex=null;
SoapObject soap=new SoapObject(NAMESPACE, method);
soap.addProperty("name",s1);
soap.addProperty("accountno",s2);
soap.addProperty("cvv",s3);
soap.addProperty("expirydate",s4);
soap.addProperty("password",s5);
SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
envelope.setOutputSoapObject(soap);HttpTransportSE http=new HttpTransportSE(URL);
try {
http.call(NAMESPACE+method, envelope);
SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
restex=primitive.toString();
}
catch (IOException e) {
e.printStackTrace();
return "error";
} 
catch (XmlPullParserException e) {
e.printStackTrace();
return "error";
}
return restex;
}
public static String bankloginService(String s1, String s2, String method) {
// TODO Auto-generated method stub
String restex=null;
SoapObject soap=new SoapObject(NAMESPACE, method);
soap.addProperty("user_name",s1);
soap.addProperty("password",s2);
SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
envelope.setOutputSoapObject(soap);
HttpTransportSE http=new HttpTransportSE(URL);
try {
http.call(NAMESPACE+method, envelope);
SoapPrimitive primitive =(SoapPrimitive)envelope.getResponse();
restex=primitive.toString();
} 
catch (IOException e) {
e.printStackTrace();
return "error";
}
catch (XmlPullParserException e) {
e.printStackTrace();
return "error";
}
return restex;
}
/*public static String bookService(String qrvalue, String price, String cvv,String method) {
// TODO Auto-generated method stub
String restex=null;
SoapObject soap=new SoapObject(NAMESPACE, method);
soap.addProperty("qrvalue",qrvalue);
soap.addProperty("price",price);
soap.addProperty("cvv",cvv);
SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
envelope.setOutputSoapObject(soap);
HttpTransportSE http=new HttpTransportSE(URL);
try {
http.call(NAMESPACE+method, envelope);
SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
restex=primitive.toString();
} 
catch (IOException e) {
e.printStackTrace();
return "error";} 
catch (XmlPullParserException e) {
e.printStackTrace();
return "error";
}
return restex;
}*/
public static String bookService(String phno, String method) {
// TODO Auto-generated method stub
String restex=null;
SoapObject soap=new SoapObject(NAMESPACE, method);
soap.addProperty("phone",phno);
SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
envelope.setOutputSoapObject(soap);
HttpTransportSE http=new HttpTransportSE(URL);
try{
http.call(NAMESPACE+method, envelope);
SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
restex=primitive.toString();
} 
catch (IOException e) {
e.printStackTrace();
return "error";
} 
catch (XmlPullParserException e) {
e.printStackTrace();
return "error";
}
return restex;
}}
