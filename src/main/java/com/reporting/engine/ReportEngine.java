package com.reporting.engine;

import com.reporting.exporter.Exporter;
import com.reporting.exporter.PDFExporter;
import com.reporting.source.DataSource;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

import java.util.HashMap;
import java.util.Map;

public class ReportEngine {

    private final ReportProvider reportProvider;

    private final DataSource dataSource;

    public ReportEngine(ReportProvider reportProvider, DataSource dataSource) {
        this.reportProvider = reportProvider;
        this.dataSource = dataSource;
    }

    public void generate() throws JRException  {
        final Map<String, Object> parameters = new HashMap<>();
        JasperPrint jasperPrint = JasperFillManager.fillReport(reportProvider.getReport(), parameters,
                dataSource.getDataSource());
        Exporter exporter =
                new PDFExporter(new SimpleOutputStreamExporterOutput(reportProvider.getOutputFileName()), jasperPrint);
        exporter.exportReport();
    }
}
