package com.ty.po;

/**
 * @author OneCallAway
 * @create 2018-05-08 下午5:58
 * @desc items包装对象
 **/

public class ItemsQueryVo {

    //商品信息
    private Items items;

    //对原始信息进行扩展
    private ItemsCustom itemsCustom;

    //对用户信息扩展
//    private UserCustom userCustom;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }

}
