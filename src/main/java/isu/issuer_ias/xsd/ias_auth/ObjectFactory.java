//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.11 at 06:45:25 PM IST 
//


package isu.issuer_ias.xsd.ias_auth;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the isu.issuer_ias.xsd.ias_auth package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: isu.issuer_ias.xsd.ias_auth
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Paysecure }
     * 
     */
    public Paysecure createPaysecure() {
        return new Paysecure();
    }

    /**
     * Create an instance of {@link CallPaySecure }
     * 
     */
    public CallPaySecure createCallPaySecure() {
        return new CallPaySecure();
    }

    /**
     * Create an instance of {@link RequestorCredentials }
     * 
     */
    public RequestorCredentials createRequestorCredentials() {
        return new RequestorCredentials();
    }

    /**
     * Create an instance of {@link UserCredentials }
     * 
     */
    public UserCredentials createUserCredentials() {
        return new UserCredentials();
    }

    /**
     * Create an instance of {@link CallPaySecureResponse }
     * 
     */
    public CallPaySecureResponse createCallPaySecureResponse() {
        return new CallPaySecureResponse();
    }

}
