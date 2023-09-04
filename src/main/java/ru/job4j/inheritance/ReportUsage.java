package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        HtmlReport htmlReport = new HtmlReport();
        System.out.println();
        String text1 = htmlReport.generate("Report's name", "Report's body");
        System.out.println(text1);
        System.out.println();
        JSONReport jsonReport = new JSONReport();
        String text2 = jsonReport.generate("Report's name", "Report's body");
        System.out.println(text2);
    }
}
