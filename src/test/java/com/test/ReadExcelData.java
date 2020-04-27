package com.test;

import lib.ExcelDataConfig;

public class ReadExcelData {


    public static void main(String[] args) {

        ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\Sabnam Singh\\Desktop\\Regression.xlsx\\");


        System.out.println(excel.getData(0,0,1));


    }

    }


