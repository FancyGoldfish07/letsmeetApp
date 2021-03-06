package com.webwemser.web;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.5.5.2
//
// Created by Quasar Development at 29/05/2016
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class KILsessionData extends AttributeContainer implements KvmSerializable
{

    
    public Boolean hasEnded=false;
    
    public String identifier;
    
    public KILuserData user;

    public KILsessionData ()
    {
    }

    public KILsessionData (java.lang.Object paramObj,KILExtendedSoapSerializationEnvelope __envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                //if you have compilation error here, please use a ksoap2.jar and ExKsoap2.jar from libs folder (in the generated zip file)
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                java.lang.Object obj = info.getValue(); 
                if (info.name.equals("hasEnded"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.hasEnded = new Boolean(j.toString());
                            }
                        }
                        else if (obj instanceof Boolean){
                            this.hasEnded = (Boolean)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("identifier"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.identifier = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.identifier = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("user"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.user = (KILuserData)__envelope.get(j,KILuserData.class);
                    }
                    continue;
                }

            }

        }



    }

    public KILuserData getUserData(){
        return user;
    }

    public String getSessionID(){
        return identifier;
    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return hasEnded;
        }
        if(propertyIndex==1)
        {
            return this.identifier!=null?this.identifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.user!=null?this.user:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "hasEnded";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "identifier";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = KILuserData.class;
            info.name = "user";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
