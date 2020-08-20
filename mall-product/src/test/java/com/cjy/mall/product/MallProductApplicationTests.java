package com.cjy.mall.product;

import com.cjy.mall.product.entity.BrandEntity;
import com.cjy.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("sss");
        System.out.println(brandService.save(brandEntity));
        System.out.println("s");
    }

}
