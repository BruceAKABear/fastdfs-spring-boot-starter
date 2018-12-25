package pro.dengyi.fastdfsspringbootstarter.utils;

/**
 * ip端口工具类
 *
 * @author 邓艺
 * @version v1.0
 * @date 2018-12-25 13:12
 */
public class IpAndPortUtil {
    /**
     * 通过标准单地址获取ip
     *
     * @param stdSingleAddress 标准单个地址ip:port
     * @return java.lang.String 字符串形式ip
     * @author 邓艺
     * @date 2018/12/25 13:20
     */
    public static String getIp(String stdSingleAddress) {
        return stdSingleAddress.split(":")[0];
    }

    /**
     * 通过标准单地址获取port
     *
     * @param stdSingleAddress 标准单个地址ip:port
     * @return java.lang.String 字符串形式port
     * @author 邓艺
     * @date 2018/12/25 13:21
     */
    public static String getPort(String stdSingleAddress) {
        return stdSingleAddress.split(":")[1];
    }

}
