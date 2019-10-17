package com.example.time.Utils;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;

/*txt转换为pdf
 *@author jiafeng
 *@date 2019/8/27 0027 09:22
 */
public class Txt2PDF {
    private static final String FONT = "C:\\Windows\\Fonts\\simhei.ttf";
    public static void text2pdf(String text, String pdf) throws DocumentException, IOException, com.itextpdf.text.DocumentException {
        Document document = new Document();
        OutputStream os = new FileOutputStream(new File(pdf));
        PdfWriter.getInstance(document, os);
        document.open();
        //方法一：使用Windows系统字体(TrueType)
        BaseFont baseFont = BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        Font font = new Font(baseFont);
        InputStreamReader isr = new InputStreamReader(new FileInputStream(new File(text)), "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(isr);
        String str = "";
        while ((str = bufferedReader.readLine()) != null) {
            document.add(new Paragraph(str, font));
        }
        document.close();
    }
    public static void main(String[] args) throws Exception {
        String PDFTIMEDIR = "C:/Users/Administrator/Desktop/html/";
        String text = PDFTIMEDIR + "武神天下.txt";
        String pdf = PDFTIMEDIR + "2.pdf";
        text2pdf(text, pdf);
    }
}
