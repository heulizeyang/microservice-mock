package net.technolords.micro.config.jaxb.resource;

import javax.xml.bind.annotation.XmlValue;

/**
 * Created by Technolords on 2016-Jul-21.
 */
public class XpathConfig {
    private String xpath;

    @XmlValue
    public String getXpath() {
        return xpath;
    }

    public void setXpath(String xpath) {
        this.xpath = xpath;
    }
}