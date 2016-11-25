package com.weikun.service;

import com.alibaba.fastjson.JSON;
import com.weikun.vo.City;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/11/25.
 */
public class CityService {
    @Test
    public String makeCity(String pro){
        List<City> list=new ArrayList<City>();
        String result="";
        if(pro.equals("hlj")){
            list= Arrays.asList(new City("哈尔滨","hrb"),new City("绥化","sh"));
        }else if(pro.equals("jl")){
            list= Arrays.asList(new City("长春","cc"),new City("四平","sp"));
        }else if(pro.equals("hb")){
            list= Arrays.asList(new City("石家庄","sjz"),new City("衡水","hs"));
        }else if(pro.equals("hn")){
            list= Arrays.asList(new City("郑州","zz"),new City("开封","kf"));
        }
        result= JSON.toJSONString(list);
        System.out.print(result);
        return result;
    }
}
