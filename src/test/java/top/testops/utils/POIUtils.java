package top.testops.utils;

import com.jayway.jsonpath.JsonPath;
import org.apache.commons.lang3.RandomUtils;
import org.apache.http.util.TextUtils;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;

import java.io.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author carson
 * @ClassName POIUtils
 * @Description TODO
 * @date 2020/3/16
 **/
public class POIUtils {
    public static void setOrderNumber(String number) {

        File file = new File("E:\\IdeaProject\\my_api_test\\src\\main\\resources\\excel\\temp.xlsx");
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);
            Cell cell = sheet.getRow(1).getCell(0);
            replaceCellValue(cell, number);
            File xlsFile = new File("E:\\IdeaProject\\my_api_test\\src\\main\\resources\\excel\\ready.xlsx");
            workbook.write(new FileOutputStream(xlsFile));
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getOrderNumber() {
        File file = new File("E:\\IdeaProject\\my_api_test\\src\\main\\resources\\excel\\temp.xlsx");
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);
            Cell cell = sheet.getRow(1).getCell(0);
            System.out.println("投保单号： " + cell.toString());
            Reporter.log("投保单号：" + cell.toString());
            return cell.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void replaceCellValue(Cell cell, Object value) {
        String val = value != null ? String.valueOf(value) : "";
        cell.setCellValue(val);
    }

    public static void main(String[] args) {
//        System.out.println("中文测试");
//        long time = RandomUtils.nextLong(1552807590000l, 1584429990073l);
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//        System.out.println("date: " + df.format(time));// new Date()为获取当前系统时间，也可使用当前时间戳
        String startTime = JsonPath.read("{\"isBoundWeChat\":\"-1\",\"realName\":null,\"mobile\":null,\"createType\":null,\"startTime\":null,\"endTime\":null,\"channel\":null,\"pageSize\":10,\"pageNum\":1}"
                , "startTime");
        System.out.println(startTime);
        Throwable aa = new Throwable("aa");
        Throwable bb = new Throwable("aa");
//        System.out.println(aa.hashCode());
//        System.out.println(aa.hashCode());
//        System.out.println(bb.hashCode());
//        System.out.println(aa.getMessage());
        StackTraceElement[] sts = new Throwable().getStackTrace();
        // 检查是否是m1方法调用
        for (StackTraceElement st : sts) {
            System.out.println(st.getMethodName());
        }
    }
}
