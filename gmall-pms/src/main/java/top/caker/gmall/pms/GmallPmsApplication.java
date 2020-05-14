package top.caker.gmall.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @author cakeralter
 */
@EnableDubbo
@MapperScan(basePackages = "top.caker.gmall.pms.mapper")
@SpringBootApplication
public class GmallPmsApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(GmallPmsApplication.class, args);
    }
}
