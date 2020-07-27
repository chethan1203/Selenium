package com.datadriven.test;

import com.excel.utility.Xls_Reader1;

public class ExcelOperations {

	public static void main(String[] args) {
		
		Xls_Reader1 xlrd = new Xls_Reader1("D:\\Selenium\\MyWorkSpace2018\\SeleniumPractice\\src\\com\\testdata\\TestData.xlsx");
	
		if(!xlrd.isSheetExist("HomePage")) {
			xlrd.addSheet("HomePage");
		}
	
	
	}

}
