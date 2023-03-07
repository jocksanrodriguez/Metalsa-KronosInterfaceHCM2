package com.metalsa.api.util;

import com.metalsa.api.model.kronos.KronosResponse;
import com.metalsa.api.model.kronos.KronosWFC;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class SendDataKronosUtil {

	private final String strUrl;

    public SendDataKronosUtil(String strUrl) {
        this.strUrl = strUrl;
    }
    
    public String formatoFechaKronos(Date fecha) {
        if (fecha != null) {
            SimpleDateFormat formateador = new SimpleDateFormat("MM'/'dd'/'yyyy");
            return formateador.format(fecha);
        } else {
            return null;
        }
    }
    
    public Date decodeFechaKronos(String fechaString) {
    	Date fecha = null;
    	Date fechaFmt = null;
    	
    	if(fechaString != null && !fechaString.isEmpty()) {
    		SimpleDateFormat formateador = new SimpleDateFormat("dd'/'MM'/'yyyy");
    		try {
    			fecha = formateador.parse(fechaString);
    			
    			String fechaStr = formateador.format(fecha);
    			
    			fechaFmt = formateador.parse(fechaStr);
				
			} catch (ParseException e) {
				e.printStackTrace();
				return null;
			}
    	}
    	return fechaFmt;
    	
    }
    
    public String crearXmlRequest(Map<String, String> params, String nameTemplate) throws Exception{
    	Configuration cfg = new Configuration(new Version("2.3.23"));

        cfg.setClassForTemplateLoading(SendDataKronosUtil.class, "/");
        cfg.setDefaultEncoding("UTF-8");

        Template template = cfg.getTemplate(nameTemplate);

        String requestXml;
        try (StringWriter out = new StringWriter()) {
            template.process(params, out);
            requestXml = out.getBuffer().toString();
            out.flush();
        }
        return requestXml;
    }
    
    public String sendKronosRequest(String xmlRequest) {
    	String result = null;
    	
    	try {
			@SuppressWarnings("restriction")
			URL url = new URL(null, strUrl, new sun.net.www.protocol.https.Handler());
            HttpsURLConnection urlConn = (HttpsURLConnection) url.openConnection();

            // specify that we will send output and accept input
            urlConn.setDoInput(true);
            urlConn.setDoOutput(true);
            urlConn.setConnectTimeout(20000);  // long timeout, but not infinite
            urlConn.setReadTimeout(20000);
            urlConn.setUseCaches(false);
            urlConn.setDefaultUseCaches(false);
            urlConn.setRequestProperty("Content-Type", "text/xml");
            try (OutputStreamWriter outStrWriter = new OutputStreamWriter(urlConn.getOutputStream())) {
                outStrWriter.write(xmlRequest);
                outStrWriter.flush();
            }
            // reading the response
            InputStreamReader reader = new InputStreamReader(urlConn.getInputStream());
            StringBuilder buf = new StringBuilder();
            char[] cbuf = new char[2048];
            int num;
            while (-1 != (num = reader.read(cbuf))) {
                buf.append(cbuf, 0, num);
            }
            result = buf.toString();
        } catch (Exception e) {
            //Logger.getLogger(SendDataKronosUtil.class.getName()).log(Level.SEVERE, null, e);
        }
        return result;
    }
    
    public String sendKronosRequest(Map<String, String> params, String nameTemplate) throws Exception {
        Configuration cfg = new Configuration(new Version("2.3.23"));

        cfg.setClassForTemplateLoading(SendDataKronosUtil.class, "/");
        cfg.setDefaultEncoding("UTF-8");

        Template template = cfg.getTemplate(nameTemplate);

        String requestXml;
        try (StringWriter out = new StringWriter()) {
            template.process(params, out);
            requestXml = out.getBuffer().toString();
            out.flush();
        }
        String result = null;
        try {
			@SuppressWarnings("restriction")
			URL url = new URL(null, strUrl, new sun.net.www.protocol.https.Handler());
            HttpsURLConnection urlConn = (HttpsURLConnection) url.openConnection();

            // specify that we will send output and accept input
            urlConn.setDoInput(true);
            urlConn.setDoOutput(true);
            urlConn.setConnectTimeout(20000);  // long timeout, but not infinite
            urlConn.setReadTimeout(20000);
            urlConn.setUseCaches(false);
            urlConn.setDefaultUseCaches(false);
            urlConn.setRequestProperty("Content-Type", "text/xml");
            try (OutputStreamWriter outStrWriter = new OutputStreamWriter(urlConn.getOutputStream())) {
                outStrWriter.write(requestXml);
                outStrWriter.flush();
            }
            // reading the response
            InputStreamReader reader = new InputStreamReader(urlConn.getInputStream());
            StringBuilder buf = new StringBuilder();
            char[] cbuf = new char[2048];
            int num;
            while (-1 != (num = reader.read(cbuf))) {
                buf.append(cbuf, 0, num);
            }
            result = buf.toString();
        } catch (Exception e) {
            //Logger.getLogger(SendDataKronosUtil.class.getName()).log(Level.SEVERE, null, e);
        }
        return result;
    }
    
    public KronosWFC desglosarXmlKronosResponse(String xmlResponse, Map<String, String> params) {
    	JAXBContext jc;
		try {
			jc = JAXBContext.newInstance(KronosWFC.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
	        StreamSource streamSource = new StreamSource(new StringReader(xmlResponse));
	        JAXBElement<KronosWFC> je = unmarshaller.unmarshal(streamSource, KronosWFC.class);
	        KronosWFC kronosResponse = (KronosWFC) je.getValue();
	        return kronosResponse;
		        
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
       
    	
    }
    
    public KronosWFC desglosarXmlKronosResponse(String xmlResponse) {
    	JAXBContext jc;
		try {
			jc = JAXBContext.newInstance(KronosWFC.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
	        StreamSource streamSource = new StreamSource(new StringReader(xmlResponse));
	        JAXBElement<KronosWFC> je = unmarshaller.unmarshal(streamSource, KronosWFC.class);
	        KronosWFC kronosResponse = (KronosWFC) je.getValue();
	        
	        if(this.responseSuccess(kronosResponse)) {
	        	kronosResponse.setXmlResponseStatus(Constants.KR_XMLRESPONSESTATUSSUCCESS);
	        }else {
	        	kronosResponse.setXmlResponseStatus(Constants.KR_XMLRESPONSESTATUSFAILURE);
	        }
	        
	        return kronosResponse;
		        
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
       
    	
    }
    
    private boolean responseSuccess(KronosWFC response) {
    	
    	try{
    		for(KronosResponse resp:response.getResponse()) {
        		if(resp.getStatus().equals(Constants.KR_XMLRESPONSESTATUSFAILURE)) {
        			return false;
        		}
        	}
        	return true;
    	}catch(Exception e) {
    		return false;
    	}
    }

}
