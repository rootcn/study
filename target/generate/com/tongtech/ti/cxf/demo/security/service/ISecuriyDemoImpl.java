
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.tongtech.ti.cxf.demo.security.service;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-08-28T11:43:39.089+08:00
 * Generated source version: 2.7.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "ISecuriyService",
                      portName = "ISecuriyServicePort",
                      targetNamespace = "http://demo.ti.tongtech.com/security/",
                      wsdlLocation = "file:/G:/github/data/study/src/main/java/com/tongtech/ti/cxf/demo/security/security.wsdl",
                      endpointInterface = "com.tongtech.ti.cxf.demo.security.service.ISecuriyDemo")
                      
public class ISecuriyDemoImpl implements ISecuriyDemo {

    private static final Logger LOG = Logger.getLogger(ISecuriyDemoImpl.class.getName());

    /* (non-Javadoc)
     * @see com.tongtech.ti.cxf.demo.security.service.ISecuriyDemo#input(java.lang.String  in )*
     */
    public java.lang.String input(java.lang.String in) { 
        LOG.info("Executing operation input");
        System.out.println(in);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
