package isu.issuer_ias.service;

import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@Service
public class JaxbService {

    public  <T> JAXBElement<T> createJaxbElement(T object, Class<T> clazz) {
        return new JAXBElement<>(new QName(clazz.getSimpleName()), clazz, object);
    }

}
