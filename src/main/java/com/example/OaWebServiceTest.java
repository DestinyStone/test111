//package com.example;
//
//import java.io.File;
//import java.net.URL;
//import java.security.MessageDigest;
//import java.util.ArrayList;
//
//import org.apache.commons.io.FileUtils;
//
//import org.codehaus.xfire.client.Client;
//
///**
// * 测试OA需求工单的WS接口
// *
// * @author T60
// *
// */
//public class OaWebServiceTest {
//	//String url = "http://130.51.11.26:8083/uflowII/services/processOaWebService";
//	String url = "http://10.242.29.244:30060/gd-bpc-extend-web/services/oaWebService";
//	String md5pass = "uflow-oa-databydata";
//
//	public OaWebServiceTest() {
//		//url = "http://ultranms.pasm.gg:8089/uflowII/services/processOaWebService";
//	}
//
//	public void createProcess() {
////		try {
////			String pass = MD5(md5pass + "2023-09-22 20:08:40");
//////			String file = getClass().getResource("").getPath() + "/data.xml";
//////			System.out.println(file);
////			String xml = FileUtils.readFileToString(
////					new File("F:\\实习\\项目\\gd-bpc-extend\\gd-bpc-extend-web\\src\\main\\java\\com\\bit\\bpc\\extend\\web\\pm\\demand\\data.xml")
////					, "UTF-8");
////
////			String cm = (String) xFireClient(url, "createProcess", new Object[] { pass, xml });
////			System.out.println("数据:" + cm);
////		} catch (Exception e) {
////			e.printStackTrace();
////		}
//	}
//
////	public void createProcessUserTemplet() {
////		System.out.println("url=" + url);
////		System.out.println("根据模板、批量生成需求工单....");
////		try {
////			Thread.sleep(2000);
////			List<String> dataXmlList = new OperateExcel().m();
////			for (String data : dataXmlList) {
////				String pass = MD5(md5pass + "2016-01-18 10:31:49");
////				String cm = (String) xFireClient(url, "createProcess", new Object[] { pass, data });
////				System.out.println("数据:" + cm);
////			}
////
////		} catch (Exception e) {
////			e.printStackTrace();
////		}
////	}
//
//	public void getBackProcess() {
//		try {
//			String pass = MD5(md5pass + "2013-18-01 18:00:01");
//			long processid = 151761071;
//			String account = "";
//			StringBuffer xml = new StringBuffer();
//			xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//			xml.append("<root>");
//			xml.append("<dates>");
//			xml.append("<systemname>OA系统</systemname>");
//			xml.append("<processcode>wb000002</processcode>");
//			xml.append("<sendtime>实际的发送时间</sendtime>");
//			xml.append("<data>");
//			xml.append("<key>processid</key>");
//			xml.append("<value>").append(processid).append("</value>");
//			xml.append("</data>");
//			xml.append("<data>");
//			xml.append("<key>account</key>");
//			xml.append("<value>").append(account).append("</value>");
//			xml.append("</data>");
//			xml.append("</dates>");
//			xml.append("</root>");
//			String cm = (String) xFireClient(url, "updateProcessInfo", new Object[] { pass, xml });
//			System.out.println("数据:" + cm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void checkProcess() {
//		try {
//			String pass = MD5(md5pass + "2013-18-01 18:00:01");
//			System.out.println(pass);
//			StringBuffer xml = new StringBuffer();
//			xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//			xml.append("<root>");
//			xml.append("<dates>");
//			xml.append("<systemname>OA系统</systemname>");
//			xml.append("<processcode>wb000002</processcode>");
//			xml.append("<sendtime>2013-18-01 18:00:01</sendtime>");
//			xml.append("<data>");
//			xml.append("<key>starttime</key>");
//			xml.append("<value>2013-01-01</value>");
//			xml.append("</data>");
//			xml.append("<data>");
//			xml.append("<key>endtime</key>");
//			xml.append("<value>2012-01-01</value>");
//			xml.append("</data>");
//			xml.append("</dates>");
//			xml.append("</root>");
//			String cm = (String) xFireClient(url, "checkProcess", new Object[] { pass, xml });
//			System.out.println("数据:" + cm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void findProcess() {
//		try {
//			String keys = "gd-20140505-0-00001";
//			String pass = MD5(md5pass + "2013-18-01 18:00:01");
//			StringBuffer xml = new StringBuffer();
//			xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//			xml.append("<root>");
//			xml.append("<dates>");
//			xml.append("<systemname>OA系统</systemname>");
//			xml.append("<processcode>wb000002</processcode>");
//			xml.append("<sendtime>2013-18-01 18:00:01</sendtime>");
//			xml.append("<data>");
//			xml.append("<key>keys</key>");
//			xml.append("<value>").append(keys).append("</value>");
//			xml.append("</data>");
//			xml.append("</dates>");
//			xml.append("</root>");
//			String cm = (String) xFireClient(url, "findProcess", new Object[] { pass, xml });
//			System.out.println("数据:" + cm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void receiveProcessFiles() {
//		try {
//			String pass = MD5(md5pass + "2015-02-10 11:22:32");
//			String file = getClass().getResource("").getPath() + "/oafiletest.xml";
//			String xml = FileUtils.readFileToString(new File(file), "UTF-8");
//
//			String cm = (String) xFireClient(url, "receiveProcessFiles", new Object[] { pass, xml });
//			System.out.println("数据:" + cm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void addBeforeHandMoney() {
//		try {
//			String pass = MD5(md5pass + "2013-18-01 18:00:01");
//			StringBuffer xml = new StringBuffer();
//			xml.append(" <?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//			xml.append(" <root>");
//			xml.append(" <datas>");
//			xml.append(" <systemname>OA系统</systemname>");
//			xml.append(" <processcode>wb000002</processcode>");
//			xml.append(" <sendtime>2013-18-01 18:00:01</sendtime> ");
//			xml.append(" <data>");
//			xml.append(" <key>sourcedept</key>");
//			xml.append(" <value>00440001800</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>oldneedsystem</key>");
//			xml.append(" <value></value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>needsystem</key>");
//			xml.append(" <value>在线计费系统</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>oakey</key>");
//			xml.append(" <value>GD-SSLD-2015-0305-0202</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>alllworks</key>");
//			xml.append(" <value>19</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>reddemand</key>");
//			xml.append(" <value>是</value>");
//			xml.append(" </data>");
//
//			xml.append(" <data>");
//			xml.append(" <key>worktimeversion</key>");
//			xml.append(" <value>1</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>expertworktime</key>");
//			xml.append(" <value>5.16</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>highworktime</key>");
//			xml.append(" <value>4.16</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>middleworktime</key>");
//			xml.append(" <value>3.16</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>lowerworktime</key>");
//			xml.append(" <value>2.16</value>");
//			xml.append(" </data>");
//
//			xml.append(" <data>");
//			xml.append(" <key>lowerworktime</key>");
//			xml.append(" <value>2.16</value>");
//			xml.append(" </data>");
//
//			xml.append(" <data>");
//			xml.append(" <key>newversion</key>");
//			xml.append(" <value>1</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>sysoaid</key>");
//			xml.append(" <value>11212121</value>");
//			xml.append(" </data>");
//
//			xml.append(" </datas>");
//			xml.append("  </root>");
//			String cm = (String) xFireClient(url, "addBeforeHandMoney", new Object[] { pass, xml });
//			System.out.println("数据:" + cm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void queryMoney() {
//		// 00440001319 销售部
//		// 00440001900 客户服务部
//		// 00440098081 营业中心
//		// 00440077255 集团客户事业部
//		// 00440001000 财务部
//		try {
//			String pass = MD5(md5pass + "2013-18-01 18:00:01");
//			StringBuffer xml = new StringBuffer();
//			xml.append(" <?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//			xml.append(" <root>");
//			xml.append(" <datas>");
//			xml.append(" <systemname>OA系统</systemname>");
//			xml.append(" <processcode>wb000002</processcode>");
//			xml.append(" <sendtime>2013-18-01 18:00:01</sendtime> ");
//			xml.append(" <data>");
//			xml.append(" <key>sourcedept</key>");
//			xml.append(" <value>00440097075</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>needsystem</key>");
//			xml.append(" <value><![CDATA[ <!DOCTYPE ]]>信息化自主开发</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>starttime</key>");
//			xml.append(" <value>2010-01-01 00:00:00</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>endtime</key>");
//			xml.append(" <value>2015-01-01 00:00:00</value>");
//			xml.append(" </data>");
//			xml.append(" </datas>");
//			xml.append("  </root>");
//			String cm = (String) xFireClient(url, "queryMoney", new Object[] { pass, xml });
//			System.out.println(cm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void queryMoneyByDeptAndSys() {
//		try {
//			String pass = MD5(md5pass + "2015-08-25 11:37:44");
//			StringBuffer xml = new StringBuffer();
//			xml.append("  <?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//			xml.append("  <root>");
//			xml.append("  <datas>");
//			xml.append("  <systemname>OA系统</systemname>");
//			xml.append("  <processcode>wb000002</processcode>");
//			xml.append("  <sendtime>2015-08-25 11:37:44</sendtime>");
//			xml.append("  <data>");
//			xml.append("  <key>sourcedept</key>");
//			xml.append("  <value>00440098540</value>");
//			xml.append("  </data>");
//			xml.append("  <data>");
//			xml.append("  <key>needsystem</key>");
//			xml.append("  <value>集客一体化</value>");
//			xml.append("  </data>");
//			xml.append("  <data>");
//			xml.append("  <key>oaid</key>");
//			xml.append("  <value>aed54d1b0f88b04ff508b170e5455f788df1</value>");
//			xml.append("  </data>");
//			xml.append("  </datas>");
//			xml.append("  </root>");
//
//			String cm = (String) xFireClient(url, "queryMoneyByDeptAndSys", new Object[] { pass, xml });
//			System.out.println(cm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void getGranUsersOfFirm() {
//		try {
//			String pass = MD5(md5pass + "2015-08-25 11:37:44");
//			StringBuffer xml = new StringBuffer();
//			xml.append("  <?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//			xml.append("  <root>");
//			xml.append("  <datas>");
//			xml.append("  <systemname>OA系统</systemname>");
//			xml.append("  <processcode>wb000002</processcode>");
//			xml.append("  <sendtime>2015-08-25 11:37:44</sendtime>");
//			xml.append("  <data>");
//			xml.append("  <key>firm</key>");
//			xml.append("  <value>中国联通广东省分公司信息化部</value>");
//			xml.append("  </data>");
//			xml.append("  <data>");
//			xml.append("  <key>grade</key>");
//			xml.append("  <value>中级</value>");
//			xml.append("  </data>");
//			xml.append("  </datas>");
//			xml.append("  </root>");
//			String cm = (String) xFireClient(url, "getGranUsersOfFirm", new Object[] { pass, xml });
//			System.out.println(cm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void createBeforeEvaluate() {
//		try {
//			String pass = MD5(md5pass + "2015-08-25 11:37:44");
//			String file = getClass().getResource("").getPath() + "/beforeEvaluate.xml";
//			String xml = FileUtils.readFileToString(new File(file), "UTF-8");
//			String cm = (String) xFireClient(url, "createBeforeEvaluate", new Object[] { pass, xml });
//			System.out.println(cm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void getExpectedRetrueDate() {
//		try {
//			String pass = MD5(md5pass + "2015-08-25 11:37:44");
//			StringBuffer xml = new StringBuffer();
//			xml.append("  <?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//			xml.append(" <root>");
//			xml.append(" <datas>");
//			xml.append(" <systemname>OA系统</systemname>");
//			xml.append(" <processcode>wb000002</processcode>");
//			xml.append(" <sendtime>2015-08-25 11:37:44</sendtime>");
//			xml.append(" <data>");
//			xml.append(" <key>expertworktime</key>");
//			xml.append(" <value>0</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>highworktime</key>");
//			xml.append(" <value>10</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>middleworktime</key>");
//			xml.append(" <value>20</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>lowerworktime</key>");
//			xml.append(" <value></value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>reachtime</key>");
//			xml.append(" <value>3</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>maxearn</key>");
//			xml.append(" <value></value>");
//			xml.append(" </data>");
//			xml.append(" </datas>");
//			xml.append(" </root>");
//			String cm = (String) xFireClient(url, "getExpectedRetrueDate", new Object[] { pass, xml });
//			System.out.println(cm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void triggerProcessAfartToOA() {
//		try {
//			String pass = MD5(md5pass + "2015-08-25 11:37:44");
//			StringBuffer xml = new StringBuffer();
//			xml.append("  <?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//			xml.append(" <root>");
//			xml.append(" <datas>");
//			xml.append(" <systemname>OA系统</systemname>");
//			xml.append(" <processcode>wb000002</processcode>");
//			xml.append(" <sendtime>实际的发送时间</sendtime>");
//			xml.append(" <data>");
//			xml.append(" <key>oaid</key>");
//			xml.append(" <value>OA工单主键</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>reachtime</key>");
//			xml.append(" <value>指标到达时间（后评价时间）</value>");
//			xml.append(" </data>");
//			xml.append(" <data>");
//			xml.append(" <key>onlinetime</key>");
//			xml.append(" <value>需求上线时间</value>");
//			xml.append(" </data>");
//			xml.append(" </datas>");
//			xml.append(" </root>");
//			String cm = (String) xFireClient(url, "triggerProcessAfartToOA", new Object[] { pass, xml });
//			System.out.println(cm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * 获取项目信息
//	 */
//	public void getProjectInfo() {
//		try {
//			System.err.println(url);
//			String pass = MD5(md5pass + "2015-08-25 11:37:44");
//			StringBuffer xml = new StringBuffer();
//			xml.append(" <?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//			xml.append(" <root>");
//			xml.append(" <datas>");
//			xml.append(" <systemname>OA系统</systemname>");
//			xml.append(" <processcode>wb000002</processcode>");
//			xml.append(" <sendtime>2015-08-25 11:37:44</sendtime>");
//			xml.append(" <data>");
//			xml.append(" <key>key</key>");
//			xml.append(" <value>网管工单编号</value>");
//			xml.append(" </data>");
//			xml.append(" </datas>");
//			xml.append(" </root>");
//			String cm = (String) xFireClient(url, "getProjectInfo", new Object[] { pass, xml });
//			System.out.println(cm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void createProcessAfart() {
//		try {
//			String pass = MD5(md5pass + "2015-08-25 11:37:44");
//			String file = getClass().getResource("").getPath() + "/processAfart.xml";
//			String xml = FileUtils.readFileToString(new File(file), "UTF-8");
//			String cm = (String) xFireClient(url, "createProcessAfart", new Object[] { pass, xml });
//			System.out.println(cm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public Object xFireClient(String url, String method, Object[] arg) throws Exception {
//		Client client = new Client(new URL(url + "?wsdl"));
////		client.setUrl("http://10.242.29.244:30060/gd-bpc-extend-web/services/oaWebService");
//		//client.setUrl("http://10.242.35.162:30060/gd-bpc-extend-web/services/oaWebService");
//		Object[] result = client.invoke(method, arg);
//		return result[0];
//	}
//
//	public void doThread() {
//		new Thread() {
//			public void run() {
//				// addBeforeHandMoney();
//				 createProcess();
//				//createProcessUserTemplet();
//				// queryMoneyByDeptAndSys();
//				// queryMoney();
//				// getGranUsersOfFirm();
//				// createBeforeEvaluate();
//				// getExpectedRetrueDate();
//				// triggerProcessAfartToOA();
//				// createProcessAfart();
//				//getProjectInfo();
//			}
//		}.start();
//
//	}
//
//	public static void main(String[] args) {
//
//		 OaWebServiceTest st = new OaWebServiceTest();
//		 st.getBackProcess();
//	}
//
//	/*
//	 * MD5加密方法
//	 */
//	public static String MD5(String inStr) {
//		MessageDigest md5 = null;
//		try {
//			md5 = MessageDigest.getInstance("MD5");
//		} catch (Exception e) {
//			System.out.println(e.toString());
//			e.printStackTrace();
//			return "";
//		}
//		char[] charArray = inStr.toCharArray();
//		byte[] byteArray = new byte[charArray.length];
//
//		for (int i = 0; i < charArray.length; i++)
//			byteArray[i] = (byte) charArray[i];
//
//		byte[] md5Bytes = md5.digest(byteArray);
//
//		StringBuffer hexValue = new StringBuffer();
//
//		for (int i = 0; i < md5Bytes.length; i++) {
//			int val = ((int) md5Bytes[i]) & 0xff;
//			if (val < 16)
//				hexValue.append("0");
//			hexValue.append(Integer.toHexString(val));
//		}
//
//		return hexValue.toString();
//	}
//
//}
