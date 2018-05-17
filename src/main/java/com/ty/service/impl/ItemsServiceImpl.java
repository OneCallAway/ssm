package com.ty.service.impl;

import com.ty.dao.ItemsCustom;
import com.ty.po.Items;
import com.ty.po.ItemsQueryVo;
import com.ty.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author OneCallAway
 * @create 2018-05-14 上午10:40
 * @desc 商品管理
 **/

public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsCustom itemsCustom;

    @Override
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        //通过itemsCustom查询数据库
        return itemsCustom.findItemsList(itemsQueryVo);
    }

    @Override
    public ItemsCustom findItemsById(int id) throws Exception {

        return null;
    }

    @Override
    public void updateItems(int id, ItemsCustom itemsCustom) throws Exception {

    }
}
