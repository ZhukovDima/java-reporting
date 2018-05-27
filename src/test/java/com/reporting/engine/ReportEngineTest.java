package com.reporting.engine;

import com.reporting.source.DataSource;
import com.reporting.source.XMLReportDataSource;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReportEngineTest {

    private ReportEngine reportEngine;

    private ReportProvider provider;

    private DataSource dataSource;

    @Before
    public void before() throws Exception {
        provider = new ReportProvider("autopark.jrxml", "autopark.pdf");
        dataSource = new XMLReportDataSource("autopark.xml");
        reportEngine = new ReportEngine(provider, dataSource);
    }

    @Test
    public void generateFile() throws Exception {
        reportEngine.generate();
        assertTrue(Files.exists(Paths.get(provider.getOutputFileName())));
        assertTrue(Files.size(Paths.get(provider.getOutputFileName())) > 0);
    }
}