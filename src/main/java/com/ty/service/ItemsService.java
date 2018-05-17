package com.ty.service;

import com.ty.dao.ItemsCustom;
import com.ty.po.ItemsQueryVo;

import java.util.List;

/**
 * @author OneCallAway
 * @create 2018-05-14 上午10:33
 * @desc 商品管理service
 **/


public interface ItemsService {

    //商品列表查询
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

    /**
    * @author OneCallAway 18-5-14 
    * @time 上午11:59 
    * @method
    * @param  id 查询商品的id
    * @return  
    * @version V1.0.0 
    * @description  根据id查询商品信息

     */
    public ItemsCustom findItemsById(int id) throws Exception;


    /**
    * @author OneCallAway 18-5-14
    * @time 下午12:00
    * @method
    * @param  id 修改商品的id
    * @param  itemsCustom 修改商品的信息
    * @return
    * @version V1.0.0
    * @description  修改商品信息
    */
    public void updateItems(int id,ItemsCustom itemsCustom) throws Exception;
}
