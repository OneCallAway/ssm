package com.ty.controller;

import com.ty.po.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author OneCallAway
 * @create 2018-05-04 下午1:01
 * @desc 注解开发
 **/
@Controller //标识为控制器
public class ItemsController3 {
    //查询商品列表
    //@RequestMapping("queryItems") 对queryItems方法进行映射,一个方法对应一个url
    @RequestMapping("queryItems")
    public ModelAndView queryItems() throws Exception {
        //调用service查找数据库,查询商品列表,使用静态数据模拟
        List<Items> itemsList = new ArrayList<>();
        //向list中填充静态数据
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Items items_1 = new Items();
        items_1.setItemsName("撒旦所");
        items_1.setPrice(12313);
        items_1.setDetail("阿薩德");

        Items items_2 = new Items();
        items_2.setItemsName("阿薩德");
        items_2.setPrice(123);
        items_2.setDetail("正常");

        itemsList.add(items_1);
        itemsList.add(items_2);


        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();

        //相当于request的setAttribut,在jsp页面中通过itemsList取数据
        modelAndView.addObject("itemsList", itemsList);

        //指定视图
        //配置了视图解析器
        modelAndView.setViewName("itemsList");

        return modelAndView;
    }
}
