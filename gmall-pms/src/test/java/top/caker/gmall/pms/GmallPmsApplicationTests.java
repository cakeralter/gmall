package top.caker.gmall.pms;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.caker.gmall.pms.service.ProductCategoryService;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    private ProductCategoryService productCategoryService;

    @Test
    void contextLoads() {
        System.out.println(productCategoryService.getById(19));
    }
}
