package isu.issuer_ias;

import javax.xml.bind.JAXBElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Source;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.server.endpoint.PayloadEndpoint;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import isu.issuer_ias.service.JaxbService;
import isu.issuer_ias.xsd.ias_auth.CallPaySecure;
import isu.issuer_ias.xsd.ias_auth.CallPaySecureResponse;

@Endpoint
public class ControllerEndPoint implements PayloadEndpoint {

	private static final String NAMESPACE_URI = "http://issuerIAS.isu/xsd/ias-auth";
	
	private static JaxbService jaxbService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "CallPaySecure")
	@ResponsePayload
	public JAXBElement<CallPaySecureResponse> processCallPaySecureRequest(@RequestPayload JAXBElement<CallPaySecure>
	msg) {
	
		CallPaySecureResponse res = new CallPaySecureResponse();
		res.setCallPaySecureResult("fhhsgftwyjsga");
		res.setStrSignature("dgwet236737647dfh");
//		RestTemplate rest= new RestTemplate();
//		rest.postForObject(null, request, null);
		WebServiceMessage mesg = null;

		return jaxbService.createJaxbElement(res, CallPaySecureResponse.class);
	}

	@Override
	public Source invoke(Source request) throws Exception {

		// TODO Auto-generated method stub
		return null;
	}

}
