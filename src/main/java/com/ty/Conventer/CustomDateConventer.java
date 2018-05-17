package com.ty.Conventer;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author OneCallAway
 * @create 2018-05-14 下午9:13
 * @desc 自定义日期参数绑定
 **/

public class CustomDateConventer implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        //实现日期串转换成日期类型
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try{
            //转成直接返回
            return simpleDateFormat.parse(source);
        }catch (ParseException e){
            e.printStackTrace();
        }
        //如果参数绑定失败返回null
        return null;
    }
}
