package com.caixiaobai.mbg.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/*mybatisplus配置文件*/
@Configuration
//添加mapper扫描，减少写注解@mapper以及漏写
@MapperScan("com.caixiaobai.mbg.mapper")
public class MybatisplusConfig {
}
