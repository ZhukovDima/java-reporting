package com.reporting.source;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRXmlDataSource;

import java.io.InputStream;

public class XMLReportDataSource implements DataSource {

    private final JRDataSource dataSource;

    public XMLReportDataSource(String xmlFileName) throws JRException {
        this.dataSource = new JRXmlDataSource(getClass().getResourceAsStream("/" + xmlFileName), "vehicles");
    }

    public XMLReportDataSource(InputStream is) throws JRException {
        this.dataSource = new JRXmlDataSource(is);
    }

    public JRDataSource getDataSource() {
        return dataSource;
    }
}
