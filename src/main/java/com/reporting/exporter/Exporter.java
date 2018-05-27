package com.reporting.exporter;

import net.sf.jasperreports.engine.JRException;

public interface Exporter {
    void exportReport() throws JRException;
}
