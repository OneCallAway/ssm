package com.ty.controller;

import com.ty.dao.ItemsCustom;
import com.ty.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author OneCallAway
 * @create 2018-05-14 上午11:22
 * @desc 商品管理
 **/
@Controller
//窄化请求映射,根路径
//商品查询:/items/queryItems
@RequestMapping("items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    //商品查询
    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception{

        //调用service查询数据库,查询商品列表
        List<ItemsCustom> itemsList = itemsService.findItemsList(null);

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();

        //相当于request的setAttribut,在jsp页面中通过itemsList取数据
        modelAndView.addObject("itemsList",itemsList);


        //指定视图
        //配置了视图解析器
        modelAndView.setViewName("itemsList");

        return modelAndView;
    }

    //商品信息修改页面显示
    @RequestMapping(value="/editItems",method = {RequestMethod.GET,RequestMethod.POST})
    //@RequestParam里指定request传入参数名称和形参进行绑定
    //通过required属性指定参数是否需要传入
    public String editItems(Model model, @RequestParam(value = "id",required = true) Integer items_id) throws Exception{

        //调用servlce根据id查询商品信息
        ItemsCustom itemsCustom = itemsService.findItemsById(items_id);

        //通过形参中的model将model传到页面
        model.addAttribute("itemsCustom",itemsCustom);

        return "editItems";
    }


    //商品信息修改
    @RequestMapping("editItemsSubmit")
    public String editItemsSubmit(Model model) throws Exception{


        //重定向到商品查询列表
//        return "redirect:queryItems.action";

        //页面转发
        return "forward:queryItems.action";
//        return "success";
    }


}
