package OnlineIntegrationService;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 5/24/2016 5:51:24 PM
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

public class returnCodeResponse implements KvmSerializable {
    
    public int returnCodeField;
    
    public returnCodeResponse(){}
    
    public returnCodeResponse(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("returnCode"))
        {
            Object obj = soapObject.getProperty("returnCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                returnCodeField = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                returnCodeField = (Integer) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return returnCodeField;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 1;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "returnCode";
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
