package cn.org.faster.framework.web.spring.boot.autoconfigure.version;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhangbowen
 * @since 2019/1/8
 */
@ConfigurationProperties(prefix = "faster.version")
@Data
public class VersionProperties {
    /**
     * 最小版本号，小于该版本号返回版本过时。
     */
    private int minimumVersion;
}