package KeywordsAndExpressions;

import jxl.*;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class KeywordMain {

    private void readExcel(String fileName) throws IOException, BiffException {
        WorkbookSettings ws = new WorkbookSettings();
        ws.setLocale(new Locale("en","EN"));
        Workbook w = Workbook.getWorkbook(new File(fileName),ws);

        Sheet s = w.getSheet(0);
    }

    public static void main(String[] args) {

    }
}
