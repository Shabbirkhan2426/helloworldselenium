package com.selenium.exceltestdata.utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {

    public static String[][] exclReader() throws IOException {

        String filePath = "/Users/shabbirkhan/Desktop/ExcelRead.xlsx";
        File file = new File(filePath);

        FileInputStream fi = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fi);
        XSSFSheet sheet0 = workbook.getSheetAt(0);
        int rowNum = sheet0.getLastRowNum();
        int cellNum = sheet0.getRow(0).getLastCellNum();

        String[][] excelArray = new String[rowNum][cellNum];

        for (int i = 1; i <= rowNum; i++) {

            Row row = sheet0.getRow(i);

            for (int j = 0; j < cellNum; j++) {

                Cell cell = row.getCell(j);

                excelArray[i - 1][j] = cell.getStringCellValue();
            }
        }
        return excelArray;

    }



        public static String [][] excelReader1() throws IOException {


        String filePath = "/Users/shabbirkhan/Desktop/ExcelRead.xlsx";
        File file = new File(filePath);

        FileInputStream fi = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fi);
        XSSFSheet sheet1 = workbook.getSheetAt(1);
        int rowNum1 = sheet1.getLastRowNum();
        int cellNum1 = sheet1.getRow(0).getLastCellNum();

        String[][] excelArray1 = new String[rowNum1][cellNum1];

        for (int i = 1; i <= rowNum1; i++) {

            Row row = sheet1.getRow(i);

            for (int j = 0; j < cellNum1; j++) {

                Cell cell = row.getCell(j);

                excelArray1[i - 1][j] = cell.getStringCellValue();
            }
        }

        return excelArray1;

        }

}

        /*XSSFSheet sheet1 = workbook.getSheetAt(1);
        int rowNum1 = sheet0.getLastRowNum();
        int cellNum1 = sheet0.getRow(0).getLastCellNum();

        String[][] excelArray1 = new String[rowNum][cellNum];

        for (int i = 1; i <= rowNum; i++) {

            Row row = sheet0.getRow(i);

            for (int j = 0; j < cellNum; j++) {

                Cell cell = row.getCell(j);

                excelArray[i - 1][j] = cell.getStringCellValue();
            }
        }

        return excelArray;*/







   /* public static void main(String[] args) throws IOException {

        String filePath ="/Users/shabbirkhan/Desktop/Testdata.xlsx";
        File file = new File(filePath);

        FileInputStream fi = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet0 =  workbook.createSheet("firstSheet");

        Row row0 = sheet0.createRow(0);

        Cell cell0 = row0.createCell(0);
        Cell cell1 = row0.createCell(1);

        cell0 .setCellValue("firstcell");
        cell1.setCellValue("sceondcell");

        Row row1 = sheet0.createRow(1);

        Cell cellfirstcell = row1.createCell(0);
        Cell cellsceondcell = row1.createCell(1);

        cellfirstcell .setCellValue("khanshabb111@gmail.com");
        cellsceondcell.setCellValue("Agustina2426");

        int rowCount = sheet0.getPhysicalNumberOfRows();
        System.out.println(rowCount);

        int cellCount = sheet0.getRow(0).getPhysicalNumberOfCells();
        System.out.println(cellCount);



    }*/

