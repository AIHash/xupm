package com.xuqian.admin.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 启动解压admin-common.jar到resources目录
 * Created by xuqian on 2017/4/20.
 */
public class AdminUtil implements InitializingBean, ServletContextAware {

    private static Logger _log = LoggerFactory.getLogger(AdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {

        _log.info("===== 开始解压admin-common =====");
        String version = PropertiesFileUtil.getInstance().get("admin-common.version");
        _log.info("admin-common.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/admin-common-" + version + ".jar");
        _log.info("admin-common.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/admin-common";
        _log.info("admin-common.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        _log.info("===== 解压admin-common完成 =====");
    }

}



