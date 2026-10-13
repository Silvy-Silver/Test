abstract class ReportGenerator{
    final void generate(){
        prepare();
        export();
        finish();
    }

    void prepare(){
        System.out.println("Preparing report data");
    }

    abstract void export();

    void finish(){
        System.out.println("Report generation completed");
    }
}

class PDFReport extends ReportGenerator{
    void export(){
        System.out.println("Exporting report as PDF");
    }
}

class CSVReport extends ReportGenerator{
    void export(){
        System.out.println("Exporting report as CSV");
    }
}

class ExcelReport extends ReportGenerator{
    void export(){
        System.out.println("Exporting report as Excel");
    }
}

public class ReportApp{
    public static void main(String[] args){
        PDFReport p=new PDFReport();
        CSVReport c=new CSVReport();
        ExcelReport e=new ExcelReport();

        p.generate();
        System.out.println();

        c.generate();
        System.out.println();

        e.generate();
    }
}
