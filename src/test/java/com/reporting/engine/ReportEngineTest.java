package com.reporting.engine;

import com.reporting.source.DataSource;
import com.reporting.source.XMLReportDataSource;
import org.junit.Before;
import org.junit.Test;

public class ReportEngineTest {

    private ReportEngine reportEngine;

    @Before
    public void before() throws Exception {
        ReportProvider provider = new ReportProvider("autopark.jrxml", "autopark.pdf");
        DataSource dataSource = new XMLReportDataSource("autopark.xml");
        reportEngine = new ReportEngine(provider, dataSource);
    }

    @Test
    public void generate() throws Exception {
        reportEngine.generate();
    }
}