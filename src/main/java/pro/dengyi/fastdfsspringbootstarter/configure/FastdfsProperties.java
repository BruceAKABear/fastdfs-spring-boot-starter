package pro.dengyi.fastdfsspringbootstarter.configure;

/**
 * fastdfs配置类
 *
 * @author 邓艺
 * @version v1.0
 * @date 2018-12-25 12:54
 */
public class FastdfsProperties {
    /**
     * tracker地址集合，多个必须以英语逗号连接
     */
    private String trackerList;
    /**
     * 编码
     */
    private String charSet;
    /**
     * 连接超时时间
     */
    private Integer connectTimeout;
    /**
     * 网络超时时间
     */
    private Integer networkTimeout;

}
