package com.reporting.exporter;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.OutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimplePdfReportConfiguration;

public class PDFExporter implements Exporter {

    private final JRPdfExporter exporter;

    public PDFExporter(OutputStreamExporterOutput exporterOutput, JasperPrint jasperPrint) {
        exporter = new JRPdfExporter();
        exporter.setExporterOutput(exporterOutput);
        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        SimplePdfReportConfiguration reportConfig = new SimplePdfReportConfiguration();
        reportConfig.setSizePageToContent(true);
        exporter.setConfiguration(reportConfig);
    }

    @Override
    public void exportReport() throws JRException {
        exporter.exportReport();
    }
}
