package com.reporting.engine;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;

import java.io.InputStream;

public class ReportProvider {

    private final JasperReport report;

    private final String outputFileName;

    public ReportProvider(String templateName, String outputFileName) throws JRException {
        report = JasperCompileManager.compileReport(getClass().getResourceAsStream("/" + templateName));
        this.outputFileName = outputFileName;
    }

    public ReportProvider(InputStream is, String outputFileName) throws JRException {
        report = JasperCompileManager.compileReport(is);
        this.outputFileName = outputFileName;
    }

    public JasperReport getReport() {
        return report;
    }

    public String getOutputFileName() {
        return outputFileName;
    }
}
