package cn.chen.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.io.*;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Date;

public class HttpUtils {
//    private static Logger log = LoggerFactory.getLogger(HttpUtils.class);
//
//    /**
//     * 发送https请求
//     *
//     * @param requestUrl    请求地址
//     * @param requestMethod 请求方式（GET、POST）
//     * @param outputStr     提交的数据
//     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
//     */
//    public static JSONObject httpsRequest(String requestUrl, String requestMethod, String outputStr) {
//        JSONObject jsonObject = null;
//        try {
//            // 创建SSLContext对象，并使用我们指定的信任管理器初始化
//            TrustManager[] tm = {new MyX509TrustManager()};
//            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
//            sslContext.init(null, tm, new java.security.SecureRandom());
//            // 从上述SSLContext对象中得到SSLSocketFactory对象
//            SSLSocketFactory ssf = sslContext.getSocketFactory();
//
//            URL url = new URL(requestUrl);
//            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
//            conn.setSSLSocketFactory(ssf);
//
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            conn.setUseCaches(false);
//            // 设置请求方式（GET/POST）
//            conn.setRequestMethod(requestMethod);
//
//            // 当outputStr不为null时向输出流写数据
//            if (null != outputStr) {
//                OutputStream outputStream = conn.getOutputStream();
//                // 注意编码格式
//                outputStream.write(outputStr.getBytes("UTF-8"));
//                outputStream.close();
//            }
//
//            // 从输入流读取返回内容
//            InputStream inputStream = conn.getInputStream();
//            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//            String str = null;
//            StringBuffer buffer = new StringBuffer();
//            while ((str = bufferedReader.readLine()) != null) {
//                buffer.append(str);
//            }
//
//            // 释放资源
//            bufferedReader.close();
//            inputStreamReader.close();
//            inputStream.close();
//            inputStream = null;
//            conn.disconnect();
//            jsonObject = JSONObject.parseObject(buffer.toString());
//        } catch (ConnectException ce) {
//            log.error("连接超时：{}", ce);
//        } catch (Exception e) {
//            log.error("https请求异常：{}", e);
//        }
//        return jsonObject;
//    }
//
//    public static JSONObject httpRequest(String requestUrl, String requestMethod, String outputStr) {
//        JSONObject jsonObject = null;
//        try {
//            URL url = new URL(requestUrl);
//            //打开和url之间的连接
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            PrintWriter out = null;
//            //请求方式
////          conn.setRequestMethod("POST");
////           //设置通用的请求属性
//            conn.setRequestProperty("accept", "*/*");
//            conn.setRequestProperty("connection", "Keep-Alive");
//            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
//            //设置是否向httpUrlConnection输出，设置是否从httpUrlConnection读入，此外发送post请求必须设置这两个
//            //最常用的Http请求无非是get和post，get请求可以获取静态页面，也可以把参数放在URL字串后面，传递给servlet，
//            //post与get的 不同之处在于post的参数不是放在URL字串里面，而是放在http请求的正文内。
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            //获取URLConnection对象对应的输出流
//            out = new PrintWriter(conn.getOutputStream());
//            //发送请求参数即数据
//            out.print(outputStr);
//            //缓冲数据
//            out.flush();
//            //获取URLConnection对象对应的输入流
//            InputStream is = conn.getInputStream();
//            //构造一个字符流缓存
//            BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
//            String str = "";
//            StringBuffer buffer = new StringBuffer();
//            while ((str = br.readLine()) != null) {
//                buffer.append(str);
//            }
//            //关闭流
//            is.close();
//            //断开连接，最好写上，disconnect是在底层tcp socket链接空闲时才切断。如果正在被其他线程使用就不切断。
//            //固定多线程的话，如果不disconnect，链接会增多，直到收发不出信息。写上disconnect后正常一些。
//            conn.disconnect();
//            jsonObject = JSONObject.parseObject(buffer.toString());
//        } catch (ConnectException ce) {
//            log.error("连接超时：{}", ce);
//        } catch (Exception e) {
//            log.error("https请求异常：{}", e);
//        }
//        return jsonObject;
//    }
//
//    /**
//     * 发送http请求
//     *
//     * @param requestUrl    请求地址
//     * @param requestMethod 请求方式（GET、POST）
//     * @param outputStr     提交的数据
//     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
//     */
//    public static JSONObject httpReq(String requestUrl, String requestMethod, String outputStr) {
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("errno", 1);
//        jsonObject.put("errmsg", "其他异常");
//
//        try {
//            URL url = new URL(requestUrl);
//            //打开和url之间的连接
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
////            PrintWriter out = null;
//            DataOutputStream out = null;
//            //请求方式
//            conn.setRequestMethod(requestMethod);
////           //设置通用的请求属性
//            conn.setRequestProperty("accept", "*/*");
//            conn.setRequestProperty("connection", "Keep-Alive");
//            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
//            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
//            //设置是否向httpUrlConnection输出，设置是否从httpUrlConnection读入，此外发送post请求必须设置这两个
//            //最常用的Http请求无非是get和post，get请求可以获取静态页面，也可以把参数放在URL字串后面，传递给servlet，
//            //post与get的 不同之处在于post的参数不是放在URL字串里面，而是放在http请求的正文内。
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            //获取URLConnection对象对应的输出流
////            out = new PrintWriter(conn.getOutputStream());
//            out = new DataOutputStream(conn.getOutputStream());
//            //发送请求参数即数据
////            out.print(outputStr);
//            out.write(outputStr.getBytes("utf-8"));
//            //缓冲数据
//            out.flush();
//            //获取URLConnection对象对应的输入流
//            InputStream is = conn.getInputStream();
//            //构造一个字符流缓存
//            BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
//            String str = "";
//            StringBuffer buffer = new StringBuffer();
//            while ((str = br.readLine()) != null) {
//                buffer.append(str);
//            }
//            //关闭流
//            is.close();
//            //断开连接，最好写上，disconnect是在底层tcp socket链接空闲时才切断。如果正在被其他线程使用就不切断。
//            //固定多线程的话，如果不disconnect，链接会增多，直到收发不出信息。写上disconnect后正常一些。
//            conn.disconnect();
//            jsonObject = JSONObject.parseObject(buffer.toString());
//        } catch (ConnectException ce) {
//            log.error("连接超时：{}", ce);
//            jsonObject.put("errno", 1);
//            jsonObject.put("errmsg", String.format("连接超时：{%s}", ce.getMessage()));
//        } catch (Exception e) {
//            log.error("https请求异常：{}", e);
//            jsonObject.put("errno", 1);
//            jsonObject.put("errmsg", String.format("https请求异常：{%s}", e.getMessage()));
//        }
//        return jsonObject;
//    }
//    /**
//     * 生成订单的编号order_sn
//     */
//    public static String generateOrderNumber() {
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(new Date());
//        String timeStr = DateUtils.format(cal.getTime(), DateUtils.DATE_TIME_PATTERN_YYYY_MM_DD_HH_MM_SS_SSS);
//        return timeStr + CharUtil.getRandomNum(6);
//    }
//
//    /**
//     * 商品订单的编号，命名规则为下单平台（1）+年月日时分秒（14）+用户ID（8）+3位流水号（3）
//     * @param platform
//     * @param userId
//     * @return
//     */
//    public static String generateOrderNumber(String platform,Long userId) {
//        String timeStr = DateUtils.format(new Date(), DateUtils.DATE_TIME_PATTERN_YYYY_MM_DD_HH_MM_SS);
//        return platform+ userId + timeStr + CharUtil.getRandomNum(3);
//    }
//
//    public static String generatePickUpCode() {
//        String timeStr = DateUtils.format(new Date(), "dd");
//        return timeStr + CharUtil.getRandomNum(4);
//    }
//
//    public static String getSha1(String str) {
//        if (str == null || str.length() == 0) {
//            return null;
//        }
//        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
//                'a', 'b', 'c', 'd', 'e', 'f'};
//        try {
//            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
//            mdTemp.update(str.getBytes("UTF-8"));
//
//            byte[] md = mdTemp.digest();
//            int j = md.length;
//            char buf[] = new char[j * 2];
//            int k = 0;
//            /*for (int i = 0; i < j; i++) {
//                byte byte0 = md[i];
//                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
//                buf[k++] = hexDigits[byte0 & 0xf];
//            }
//            return new String(buf);
//        } catch (Exception e) {
//            // TODO: handle exception
//            return null;
//        }
//    }*/
//
//    public static void main(String[] args) {
//        JSONObject js = httpRequest("http://114.116.83.190/seller/public/api/order/updateStatus", "POST", "number="+"12564893");
//        System.out.println(js.toJSONString());
//    }
}
