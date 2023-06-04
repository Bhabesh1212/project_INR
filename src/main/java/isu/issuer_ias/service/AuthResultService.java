package isu.issuer_ias.service;
//package isu.issuerIAS.service;
//
//import org.springframework.stereotype.Service;
//import org.springframework.web.util.HtmlUtils;
//
//import isu.issuerIAS.xsd.ias_auth.CallPaySecure;
//
//@Service
//public class AuthResultService {
//	
//	public void authResult(CallPaySecure callPaySecureReq) {
//		
//		if(callPaySecureReq.getStrCommand().equals("00")) {
//			
//			String htmlUnescape = HtmlUtils.htmlUnescape(callPaySecureReq.getStrXML());
//			if(htmlUnescape.contains("<card_no>")) {
//				String card_no = htmlUnescape.substring(htmlUnescape.indexOf("<card_no>")+9, htmlUnescape.indexOf("</card_no>"));
//			}
//			
//			//callPaySecureReq.getStrXML();
//		}
//	}
//	
//}
