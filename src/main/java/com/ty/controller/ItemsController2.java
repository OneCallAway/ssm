package com.ty.controller;

import com.ty.po.Items;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author OneCallAway
 * @create 2018-05-02 下午12:22
 * @desc 实现controller接口的处理器
 **/

public class ItemsController2 implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        //调用service查找数据库,查询商品列表,使用静态数据模拟
        List<Items> itemsList = new ArrayList<>();
        //向list中填充静态数据

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

        //设置模型数据
        httpServletRequest.setAttribute("itemsList",itemsList);

        //设置转发shitu
        httpServletRequest.getRequestDispatcher("itemsList.jsp").forward(httpServletRequest,httpServletResponse);
    }
}
