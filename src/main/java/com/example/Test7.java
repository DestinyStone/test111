package com.example;

import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.math3.geometry.spherical.oned.S1Point;

import java.awt.*;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;

public class Test7 {
    private static String template =
            "1630400776902JIYQZX84\t1\n" +
                    "1630400776902JIYQZX84\t1\n" +
                    "1630400776902JIYQZX84\t1\n" +
                    "1630400776902JIYQZX84\t1\n" +
                    "1630400776902JIYQZX84\t1\n" +
                    "1630400776902JIYQZX84\t1\n" +
                    "1630400776902JIYQZX84\t1\n" +
                    "1630400776902JIYQZX84\t1\n" +
                    "1630400776902JIYQZX84\t1\n" +
                    "1630400776902JIYQZX84\t1\n" +
                    "1630400776902JIYQZX84\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1685756328403OICOKD12\t1\n" +
                    "1634120069703OZDVMP40\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1685756328403OICOKD12\t1\n" +
                    "1630400776902JIYQZX84\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1685756328403OICOKD12\t1\n" +
                    "1685756328403OICOKD12\t1\n" +
                    "1685756328403OICOKD12\t1\n" +
                    "1685756328403OICOKD12\t1\n" +
                    "1605691782538RYKXQJ95\t2\n" +
                    "1698818278883TBIGNZ61\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1677468672358FXGYIJ90\t1\n" +
                    "1677469231521TDZMZQ30\t1\n" +
                    "1685756328403OICOKD12\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1685756328403OICOKD12\t1\n" +
                    "1670550755181PTIWAS30\t6\n" +
                    "1670550755181PTIWAS30\t6\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1670551144911FAVNMJ0\t2\n" +
                    "1670549933747SADGNH39\t2\n" +
                    "1670549820979CTEVPI85\t1\n" +
                    "1685756328403OICOKD12\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1690793336556CBOSLU3\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1685756328403OICOKD12\t1\n" +
                    "1583595052559XQBNPX73\t10\n" +
                    "1690793336556CBOSLU3\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1588848947726XVYAKP67\t6\n" +
                    "1690793336556CBOSLU3\t1\n" +
                    "1690793336556CBOSLU3\t1\n" +
                    "1696987927404OXHIWR74\t5\n" +
                    "1696987927404OXHIWR74\t5\n" +
                    "1696987927404OXHIWR74\t2\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1675936509892AICHZL77\t1\n" +
                    "1696987927404OXHIWR74\t5\n" +
                    "1670549820979CTEVPI85\t2\n" +
                    "1666082409517WRKNAJ84\t2\n" +
                    "1588848947726XVYAKP67\t4\n" +
                    "1630400800387NFDXHT34\t1\n" +
                    "1588848947726XVYAKP67\t8\n" +
                    "1624249344539OKCGFQ34\t4\n" +
                    "1630400800387NFDXHT34\t1\n" +
                    "1605691782538RYKXQJ95\t3\n" +
                    "1669688191446YBZZQM53\t1\n" +
                    "1698818737022RBSGML46\t1\n" +
                    "1698818581501LBJEQB73\t1\n" +
                    "1684807513323URYOGT81\t2\n" +
                    "1666082565008SFZCZD47\t1\n" +
                    "1698818800565LHZWFV91\t1\n" +
                    "1624249344539OKCGFQ34\t3\n" +
                    "1696987927404OXHIWR74\t1\n" +
                    "1666082565008SFZCZD47\t1\n" +
                    "1696987927404OXHIWR74\t2\n" +
                    "1670550755181PTIWAS30\t2\n" +
                    "1666082409517WRKNAJ84\t1\n" +
                    "1666082492928RLVZEF12\t1\n" +
                    "1696987927404OXHIWR74\t2\n" +
                    "1666082409517WRKNAJ84\t2\n" +
                    "1666082565008SFZCZD47\t2\n" +
                    "1673229411837FSYKUO38\t1\n" +
                    "1670550755181PTIWAS30\t1\n" +
                    "1670550588350SMCFRZ47\t1\n" +
                    "1673229411837FSYKUO38\t1\n" +
                    "1670550755181PTIWAS30\t1\n" +
                    "1670550588350SMCFRZ47\t1\n" +
                    "1696987927404OXHIWR74\t1\n" +
                    "1665649160365WYPEQL94\t2\n" +
                    "1665649160365WYPEQL94\t1\n" +
                    "1684807513323URYOGT81\t15\n" +
                    "1696987927404OXHIWR74\t2\n" +
                    "1670549933747SADGNH39\t1\n" +
                    "1665649160365WYPEQL94\t1\n" +
                    "1698393328164UUSEUN9\t1\n" +
                    "1630291823703NIPTDZ68\t1\n" +
                    "1635745737297FOERSI77\t1\n" +
                    "1610351215159SDOGII2\t1\n" +
                    "1635745854889NCZCEE30\t1\n" +
                    "1684807513323URYOGT81\t15\n" +
                    "1630291823703NIPTDZ68\t1\n" +
                    "1610351215159SDOGII2\t1\n" +
                    "1698825774796KSHFEZ18\t1\n" +
                    "1596776869447IOBSIQ93\t1\n" +
                    "1684807513323URYOGT81\t6\n" +
                    "1670549933747SADGNH39\t2\n" +
                    "1630291823703NIPTDZ68\t1\n" +
                    "1635743569042RHNTSO0\t1\n" +
                    "1698393328164UUSEUN9\t1\n" +
                    "1698393328164UUSEUN9\t1\n" +
                    "1635746147144AJHQOY43\t1\n" +
                    "1630291823703NIPTDZ68\t1\n" +
                    "1678348985071GOMYXG66\t1\n" +
                    "1630291823703NIPTDZ68\t1\n" +
                    "1596776869447IOBSIQ93\t5\n" +
                    "1656580989680BBSSBX87\t2\n" +
                    "1635746147144AJHQOY43\t1\n" +
                    "1596776869447IOBSIQ93\t10\n" +
                    "1684807513323URYOGT81\t10\n" +
                    "1670550755181PTIWAS30\t5\n" +
                    "1698825774796KSHFEZ18\t1\n" +
                    "1635745737297FOERSI77\t1\n" +
                    "1635745737297FOERSI77\t1\n" +
                    "1635743354421BLWZUU43\t1\n" +
                    "1678348985071GOMYXG66\t1\n" +
                    "1630291823703NIPTDZ68\t2\n" +
                    "1630291823703NIPTDZ68\t1\n" +
                    "1678348985071GOMYXG66\t1\n" +
                    "1685421298362DTIEAJ53\t1\n";

    static class SimpleThread extends Thread {
        public SimpleThread(String name) {
            setName(name);
        }

        public void run() {
            int i = 0;
            while (i++ < 2) {
                try {
                    System.out.println(getName());
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void downloadPDF(String fileUrl, String savePath) {
        try {
            URL url = new URL(fileUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStream inputStream = connection.getInputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            FileOutputStream fileOutputStream = new FileOutputStream(savePath);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            fileOutputStream.close();
            bufferedInputStream.close();
            inputStream.close();

            System.out.println("PDF 文件下载成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {

        }catch (Exception e) {

        }
        downloadPDF("http://www.its-china.org.cn/TTBZ/20210727/0002.pdf", "D://text.pdf");

    }
}
