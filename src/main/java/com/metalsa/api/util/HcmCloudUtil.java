package com.metalsa.api.util;



import com.metalsa.api.model.hcm.DataDs;

import javax.xml.bind.JAXBContext;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

public class HcmCloudUtil {

	public DataDs desglosarXmlHcmResponse (String xmlResponse) {
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance(DataDs.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
	        StreamSource streamSource = new StreamSource(new StringReader(xmlResponse));
	        JAXBElement<DataDs> je = unmarshaller.unmarshal(streamSource, DataDs.class);
	        DataDs dataDs = (DataDs) je.getValue();
	        
	        return dataDs;
	        
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
}
