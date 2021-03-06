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

import java.util.List;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.ksoap2.HeaderProperty;
import org.ksoap2.serialization.SoapObject;

import android.os.AsyncTask;

public class OnlineIntegrationService {
    
    public String NAMESPACE ="http://web/";
    public String url="http://10.0.2.2:8080/software-engeneering-wildfly-archetype-ejb/OnlineIntegration";
    public int timeOut = 180;
    public IWsdl2CodeEvents eventHandler;
    public WS_Enums.SoapProtocolVersion soapVersion;

    public OnlineIntegrationService(){}
    
    public OnlineIntegrationService(IWsdl2CodeEvents eventHandler)
    {
        this.eventHandler = eventHandler;
    }
    public OnlineIntegrationService(IWsdl2CodeEvents eventHandler,String url)
    {
        this.eventHandler = eventHandler;
        this.url = url;
    }
    public OnlineIntegrationService(IWsdl2CodeEvents eventHandler,String url,int timeOutInSeconds)
    {
        this.eventHandler = eventHandler;
        this.url = url;
        this.setTimeOut(timeOutInSeconds);
    }
    public void setTimeOut(int seconds){
        this.timeOut = seconds * 1000;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public void loginAsync(String arg0,String arg1) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        loginAsync(arg0, arg1, null);
    }
    
    public void loginAsync(final String arg0,final String arg1,final List<HeaderProperty> headers) throws Exception{
        new AsyncTask<Void, Void, SessionResponse>(){
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
            @Override
            protected SessionResponse doInBackground(Void... params) {
                return login(arg0, arg1, headers);
            }
            @Override
            protected void onPostExecute(SessionResponse result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("login", result);
                }
            }
        }.execute();
    }
    
    public SessionResponse login(String arg0, String arg1){
        return login(arg0, arg1, null);
    }
    
    public SessionResponse login(String arg0, String arg1, List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://web/","login");
        soapReq.addProperty("arg0",arg0);
        soapReq.addProperty("arg1",arg1);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://web/login", soapEnvelope,headers);
            }else{
                httpTransport.call("http://web/login", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    SessionResponse resultVariable =  new SessionResponse(j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getMeetsByUserAsync(String arg0) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getMeetsByUserAsync(arg0, null);
    }
    
    public void getMeetsByUserAsync(final String arg0,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, MeetsResponse>(){
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
            @Override
            protected MeetsResponse doInBackground(Void... params) {
                return getMeetsByUser(arg0, headers);
            }
            @Override
            protected void onPostExecute(MeetsResponse result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getMeetsByUser", result);
                }
            }
        }.execute();
    }
    
    public MeetsResponse getMeetsByUser(String arg0){
        return getMeetsByUser(arg0, null);
    }
    
    public MeetsResponse getMeetsByUser(String arg0, List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://web/","getMeetsByUser");
        soapReq.addProperty("arg0",arg0);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://web/getMeetsByUser", soapEnvelope,headers);
            }else{
                httpTransport.call("http://web/getMeetsByUser", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    MeetsResponse resultVariable =  new MeetsResponse(j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getMeetsByCategoryAsync(String arg0,String arg1) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getMeetsByCategoryAsync(arg0, arg1, null);
    }
    
    public void getMeetsByCategoryAsync(final String arg0,final String arg1,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, MeetsResponse>(){
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
            @Override
            protected MeetsResponse doInBackground(Void... params) {
                return getMeetsByCategory(arg0, arg1, headers);
            }
            @Override
            protected void onPostExecute(MeetsResponse result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getMeetsByCategory", result);
                }
            }
        }.execute();
    }
    
    public MeetsResponse getMeetsByCategory(String arg0, String arg1){
        return getMeetsByCategory(arg0, arg1, null);
    }
    
    public MeetsResponse getMeetsByCategory(String arg0, String arg1, List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://web/","getMeetsByCategory");
        soapReq.addProperty("arg0",arg0);
        soapReq.addProperty("arg1",arg1);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://web/getMeetsByCategory", soapEnvelope,headers);
            }else{
                httpTransport.call("http://web/getMeetsByCategory", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    MeetsResponse resultVariable =  new MeetsResponse(j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void initAsync() throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        initAsync(null);
    }
    
    public void initAsync(final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Void>(){
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
            @Override
            protected Void doInBackground(Void... params) {
                init(headers);
                return null;
            }
            @Override
            protected void onPostExecute(Void result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("init", result);
                }
            }
        }.execute();
    }
    
    public void init(){
        init(null);
    }
    
    public void init(List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://web/","init");
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://web/init", soapEnvelope,headers);
            }else{
                httpTransport.call("http://web/init", soapEnvelope);
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
    }
    
    public void getMeetAsync(String arg0,int arg1) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getMeetAsync(arg0, arg1, null);
    }
    
    public void getMeetAsync(final String arg0,final int arg1,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, MeetResponse>(){
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
            @Override
            protected MeetResponse doInBackground(Void... params) {
                return getMeet(arg0, arg1, headers);
            }
            @Override
            protected void onPostExecute(MeetResponse result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getMeet", result);
                }
            }
        }.execute();
    }
    
    public MeetResponse getMeet(String arg0, int arg1){
        return getMeet(arg0, arg1, null);
    }
    
    public MeetResponse getMeet(String arg0, int arg1, List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://web/","getMeet");
        soapReq.addProperty("arg0",arg0);
        soapReq.addProperty("arg1",arg1);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://web/getMeet", soapEnvelope,headers);
            }else{
                httpTransport.call("http://web/getMeet", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    MeetResponse resultVariable =  new MeetResponse(j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void leaveMeetAsync(String arg0,int arg1) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        leaveMeetAsync(arg0, arg1, null);
    }
    
    public void leaveMeetAsync(final String arg0,final int arg1,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, MeetResponse>(){
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
            @Override
            protected MeetResponse doInBackground(Void... params) {
                return leaveMeet(arg0, arg1, headers);
            }
            @Override
            protected void onPostExecute(MeetResponse result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("leaveMeet", result);
                }
            }
        }.execute();
    }
    
    public MeetResponse leaveMeet(String arg0, int arg1){
        return leaveMeet(arg0, arg1, null);
    }
    
    public MeetResponse leaveMeet(String arg0, int arg1, List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://web/","leaveMeet");
        soapReq.addProperty("arg0",arg0);
        soapReq.addProperty("arg1",arg1);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://web/leaveMeet", soapEnvelope,headers);
            }else{
                httpTransport.call("http://web/leaveMeet", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    MeetResponse resultVariable =  new MeetResponse(j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void registerAsync(String arg0,String arg1,String arg2) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        registerAsync(arg0, arg1, arg2, null);
    }
    
    public void registerAsync(final String arg0,final String arg1,final String arg2,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, SessionResponse>(){
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
            @Override
            protected SessionResponse doInBackground(Void... params) {
                return register(arg0, arg1, arg2, headers);
            }
            @Override
            protected void onPostExecute(SessionResponse result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("register", result);
                }
            }
        }.execute();
    }
    
    public SessionResponse register(String arg0, String arg1, String arg2){
        return register(arg0, arg1, arg2, null);
    }
    
    public SessionResponse register(String arg0, String arg1, String arg2, List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://web/","register");
        soapReq.addProperty("arg0",arg0);
        soapReq.addProperty("arg1",arg1);
        soapReq.addProperty("arg2",arg2);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://web/register", soapEnvelope,headers);
            }else{
                httpTransport.call("http://web/register", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    SessionResponse resultVariable =  new SessionResponse(j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void joinMeetAsync(String arg0,int arg1) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        joinMeetAsync(arg0, arg1, null);
    }
    
    public void joinMeetAsync(final String arg0,final int arg1,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, MeetResponse>(){
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
            @Override
            protected MeetResponse doInBackground(Void... params) {
                return joinMeet(arg0, arg1, headers);
            }
            @Override
            protected void onPostExecute(MeetResponse result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("joinMeet", result);
                }
            }
        }.execute();
    }
    
    public MeetResponse joinMeet(String arg0, int arg1){
        return joinMeet(arg0, arg1, null);
    }
    
    public MeetResponse joinMeet(String arg0, int arg1, List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://web/","joinMeet");
        soapReq.addProperty("arg0",arg0);
        soapReq.addProperty("arg1",arg1);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://web/joinMeet", soapEnvelope,headers);
            }else{
                httpTransport.call("http://web/joinMeet", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    MeetResponse resultVariable =  new MeetResponse(j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getMeetsAsync(String arg0,String arg1,boolean arg1Specified,String arg2,boolean arg2Specified) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getMeetsAsync(arg0, arg1, arg1Specified, arg2, arg2Specified, null);
    }
    
    public void getMeetsAsync(final String arg0,final String arg1,final boolean arg1Specified,final String arg2,final boolean arg2Specified,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, MeetsResponse>(){
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
            @Override
            protected MeetsResponse doInBackground(Void... params) {
                return getMeets(arg0, arg1, arg1Specified, arg2, arg2Specified, headers);
            }
            @Override
            protected void onPostExecute(MeetsResponse result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getMeets", result);
                }
            }
        }.execute();
    }
    
    public MeetsResponse getMeets(String arg0, String arg1, boolean arg1Specified, String arg2, boolean arg2Specified){
        return getMeets(arg0, arg1, arg1Specified, arg2, arg2Specified, null);
    }
    
    public MeetsResponse getMeets(String arg0, String arg1, boolean arg1Specified, String arg2, boolean arg2Specified, List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://web/","getMeets");
        soapReq.addProperty("arg0",arg0);
        soapReq.addProperty("arg1",arg1);
        soapReq.addProperty("arg1Specified",arg1Specified);
        soapReq.addProperty("arg2",arg2);
        soapReq.addProperty("arg2Specified",arg2Specified);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://web/getMeets", soapEnvelope,headers);
            }else{
                httpTransport.call("http://web/getMeets", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    MeetsResponse resultVariable =  new MeetsResponse(j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void createMeetAsync(String arg0,String arg1,String arg2,String arg3,String arg4,String arg5,boolean arg5Specified,int arg6) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        createMeetAsync(arg0, arg1, arg2, arg3, arg4, arg5, arg5Specified, arg6, null);
    }
    
    public void createMeetAsync(final String arg0,final String arg1,final String arg2,final String arg3,final String arg4,final String arg5,final boolean arg5Specified,final int arg6,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, MeetResponse>(){
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
            @Override
            protected MeetResponse doInBackground(Void... params) {
                return createMeet(arg0, arg1, arg2, arg3, arg4, arg5, arg5Specified, arg6, headers);
            }
            @Override
            protected void onPostExecute(MeetResponse result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("createMeet", result);
                }
            }
        }.execute();
    }
    
    public MeetResponse createMeet(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, boolean arg5Specified, int arg6){
        return createMeet(arg0, arg1, arg2, arg3, arg4, arg5, arg5Specified, arg6, null);
    }
    
    public MeetResponse createMeet(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, boolean arg5Specified, int arg6, List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://web/","createMeet");
        soapReq.addProperty("arg0",arg0);
        soapReq.addProperty("arg1",arg1);
        soapReq.addProperty("arg2",arg2);
        soapReq.addProperty("arg3",arg3);
        soapReq.addProperty("arg4",arg4);
        soapReq.addProperty("arg5",arg5);
        soapReq.addProperty("arg5Specified",arg5Specified);
        soapReq.addProperty("arg6",arg6);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://web/createMeet", soapEnvelope,headers);
            }else{
                httpTransport.call("http://web/createMeet", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    MeetResponse resultVariable =  new MeetResponse(j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void getCategoriesAsync(String arg0) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        getCategoriesAsync(arg0, null);
    }
    
    public void getCategoriesAsync(final String arg0,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, CategoriesResponse>(){
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
            @Override
            protected CategoriesResponse doInBackground(Void... params) {
                return getCategories(arg0, headers);
            }
            @Override
            protected void onPostExecute(CategoriesResponse result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("getCategories", result);
                }
            }
        }.execute();
    }
    
    public CategoriesResponse getCategories(String arg0){
        return getCategories(arg0, null);
    }
    
    public CategoriesResponse getCategories(String arg0, List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://web/","getCategories");
        soapReq.addProperty("arg0",arg0);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://web/getCategories", soapEnvelope,headers);
            }else{
                httpTransport.call("http://web/getCategories", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    CategoriesResponse resultVariable =  new CategoriesResponse(j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
    public void logoutAsync(String arg0) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        logoutAsync(arg0, null);
    }
    
    public void logoutAsync(final String arg0,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, ReturnCodeResponse>(){
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            };
            @Override
            protected ReturnCodeResponse doInBackground(Void... params) {
                return logout(arg0, headers);
            }
            @Override
            protected void onPostExecute(ReturnCodeResponse result)
            {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null){
                    eventHandler.Wsdl2CodeFinished("logout", result);
                }
            }
        }.execute();
    }
    
    public ReturnCodeResponse logout(String arg0){
        return logout(arg0, null);
    }
    
    public ReturnCodeResponse logout(String arg0, List<HeaderProperty> headers){
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://web/","logout");
        soapReq.addProperty("arg0",arg0);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call("http://web/logout", soapEnvelope,headers);
            }else{
                httpTransport.call("http://web/logout", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault){
                SoapFault fault = (SoapFault)retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            }else{
                SoapObject result=(SoapObject)retObj;
                if (result.getPropertyCount() > 0){
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject)obj;
                    ReturnCodeResponse resultVariable =  new ReturnCodeResponse(j);
                    return resultVariable;
                    
                }
            }
        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }
    
}
