package com.test;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("C:\\Users\\Sabnam Singh\\Desktop\\Regression.xlsx\\");
        XSSFWorkbook wb= new XSSFWorkbook(fis);
        XSSFSheet s=wb.getSheet("testcasessheetdata");
        Iterator<Row> rowIt=s.iterator();
       // rowIt.next();

        while (rowIt.hasNext()){
           // System.out.println(rowIt.next().getCell(1).getStringCellValue());
            System.out.println(rowIt.next().getCell(0).getStringCellValue());
        }


    }
}
