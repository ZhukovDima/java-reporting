package com.reporting.source;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRXmlDataSource;

import java.io.InputStream;

public class XMLReportDataSource implements DataSource {

    private final JRDataSource dataSource;

    public XMLReportDataSource(String xmlFileName, String rootElementName) throws JRException {
        this.dataSource = new JRXmlDataSource(getClass().getResourceAsStream("/" + xmlFileName), rootElementName);
    }

    public XMLReportDataSource(InputStream is, String rootElementName) throws JRException {
        this.dataSource = new JRXmlDataSource(is, rootElementName);
    }

    public JRDataSource getDataSource() {
        return dataSource;
    }
}
