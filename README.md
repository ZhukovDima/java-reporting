# Java reporting (using Jasper Reports)

## Steps how Jasper Reports works:
1. Template file JRXML (*.jrxml)
2. Compilation (*.jasper)
3. Filling with data (*.jrprint)
4. Print and export

## Issues:
1. Template file(.jrxml) is compiled to (.jasper) every time the report is generated
2. Russian not supported
3. Hardcode  - head xml-element name "autopark" in XMLReportDataSource