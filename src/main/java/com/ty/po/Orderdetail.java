package com.ty.po;

/**
 * @author OneCallAway
 * @create 2018-03-29 下午7:51
 * @desc orderdetail实体
 **/

public class Orderdetail {
    /** 主鍵，訂單明细表Id */
    private Integer id;
    /** 訂單Id */
    private Integer ordersId;
    /** 商品id */
    private Integer itemsId;
    /** 商品购买数量 */
    private Integer itemsNum;


    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", ordersId=" + ordersId +
                ", itemsId=" + itemsId +
                ", itemsNum=" + itemsNum +
                ", items=" + items +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getItemsId() {
        return itemsId;
    }

    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    public Integer getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(Integer itemsNum) {
        this.itemsNum = itemsNum;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    // 明细对应的商品信息
    private Items items;
}