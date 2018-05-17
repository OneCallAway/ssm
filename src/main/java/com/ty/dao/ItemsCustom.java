package com.ty.dao;

import com.ty.po.Items;
import com.ty.po.ItemsQueryVo;

import java.util.List;

/**
 * @author OneCallAway
 * @create 2018-05-08 下午8:38
 * @desc 商品查询
 **/


public interface ItemsCustom {
    //商品查询列表
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
