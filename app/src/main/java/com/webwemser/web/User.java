package com.webwemser.web;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 5/25/2016 8:30:04 PM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class user implements KvmSerializable {
    
    public String description;
    public Vectormeet meetsCreated;
    public String password;
    public String userName;
    
    public user(){}
    
    public user(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("description"))
        {
            Object obj = soapObject.getProperty("description");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                description = j.toString();
            }else if (obj!= null && obj instanceof String){
                description = (String) obj;
            }
        }
        if (soapObject.hasProperty("meetsCreated"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("meetsCreated");
            meetsCreated = new Vectormeet(j);
        }
        if (soapObject.hasProperty("password"))
        {
            Object obj = soapObject.getProperty("password");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                password = j.toString();
            }else if (obj!= null && obj instanceof String){
                password = (String) obj;
            }
        }
        if (soapObject.hasProperty("userName"))
        {
            Object obj = soapObject.getProperty("userName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                userName = j.toString();
            }else if (obj!= null && obj instanceof String){
                userName = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return description;
            case 1:
                return meetsCreated;
            case 2:
                return password;
            case 3:
                return userName;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 4;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "description";
                break;
            case 1:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "meetsCreated";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "password";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "userName";
                break;
        }
    }
    

    public String getInnerText() {
        return null;
    }
    
    

    public void setInnerText(String s) {
    }
    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
