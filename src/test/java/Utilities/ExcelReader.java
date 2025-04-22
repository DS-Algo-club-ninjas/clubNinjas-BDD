package Utilities;


public static void readExcelSheet() throws IOException {
	
	String path = System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xlsx";
	File Excelfile = new File(path);
	
	FileInputStream Fis = new FileInputStream(Excelfile);
	XSSFWorkbook workbook = new XSSFWorkbook(Fis);
	XSSFSheet sheet = workbook.getSheet("Sheet 1");
	
	Iterator<Row> row = sheet.rowIterator();
	
	while(row.hasNext()) {
		Row currRow = row.next();
		Iterator<Cell> cell = currRow.cellIterator();
		
		while(cell.hasNext()) {
			Cell currCell = cell.next();
			
			System.out.print(currCell.getStringCellValue()+" ~ ");
		}
		System.out.println();
		
	}
	
	Row newRow = sheet.createRow(12);
	Cell newCell = newRow.createCell(13);
	newCell.setCellValue("Vijayabharathi");
	FileOutputStream Fos = new FileOutputStream(Excelfile);
	workbook.write(Fos);
	workbook.close();
	
	
	
}

public static void main(String[] args) throws IOException {
	//writeExcelSheet();
	readExcelSheet();
}

