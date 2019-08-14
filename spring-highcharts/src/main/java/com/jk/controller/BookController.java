package com.jk.controller;

import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    //跳转线行图
    @RequestMapping("/tobinzhuang")
    public String tobinzhuang() {

        return "binzhuang.html";
    }
    //跳转树状图
    @RequestMapping("/toshuzhuang")
    public String toshuzhuang() {

        return "shuzhuang.html";
    }
    //跳转饼状图
    @RequestMapping("/toshow")
    public String toshow() {

        return "show.html";
    }
    //跳转柱形图
    @RequestMapping("/tozhuxing")
    public String tozhuxing() {

        return "zhuxin.html";
    }

    @RequestMapping("queryBook")
    @ResponseBody
    public List<Map<String,Object>> queryBook(){
        List<Map<String,Object>> list = bookService.queryBook();
        List<Map<String,Object>> list1=new ArrayList<>();
        for (Map<String,Object> map1:list) {

            Map<String,Object> map=new HashMap<>();
            int datajj = Integer.parseInt(map1.get("年份").toString());
            if(datajj==2017){
                map.put("name","1807班") ;
                int [] aa =new int[]{200,600,900};
                map.put("data",aa);
            }else if(datajj==2018){
                map.put("name","1808班") ;
                int [] aa =new int[]{300,200,700};
                map.put("data",aa);
            }
            list1.add(map);
        }
           return list1;
    }
//饼状图
@RequestMapping("queryBookBing")
@ResponseBody
public List<Map<String,Object>>  queryBookBing(){
    List<Map<String,Object>> list=bookService.queryBookBing();
    List<Map<String,Object>> list1=new ArrayList<>();
    for (Map<String,Object> map1:list) {
        Map<String,Object> map=new HashMap<>();
        map.put("name",map1.get("年份"));
        map.put("y",map1.get("数量"));
        list1.add(map);
    }
    return list1;
}
//树状图
@RequestMapping("queryBookShuzhuang")
@ResponseBody
public List<Map<String,Object>> queryBookShuzhuang(){
    List<Map<String,Object>> list=bookService.queryBookShuzhuang();
    List<Map<String,Object>> list1=new ArrayList<>();
    for (Map<String,Object> map1:list) {

        Map<String,Object> map=new HashMap<>();
        int datajj = Integer.parseInt(map1.get("年份").toString());
        if(datajj==11){
            map.put("name","1807班") ;
            int [] aa =new int[]{200,600,900};
            map.put("data",aa);
        }else if(datajj==12){
            map.put("name","1808班") ;
            int [] aa =new int[]{300,200,700};
            map.put("data",aa);
        }
        list1.add(map);
    }

    return list1;
}
@RequestMapping("queryCarZhu")
@ResponseBody
public List<Map<String, Object>> sandian()/*{

    List<Map<String,Object>> list= bookService.queryZhuxing();
    List<Map<String,Object>> list1=new ArrayList<>();
    for (Map<String,Object> map1:list){
        Map<String,Object> map=new HashMap<>();
        //String  aa = map1.get("颜色").toString();
        Integer  object = Integer.parseInt(map1.get("颜色").toString());
        //Integer  nian = Integer.parseInt(map1.get("月").toString());
        if(object==1){
            map.put("name","蓝色") ;
        }else if(object==2){
            map.put("name","白色");
        }else{
            map.put("name","黑色");
        }
        Integer count = Integer.parseInt(map1.get("个数").toString());
        //String sj = (map1.get("时间").toString());
        map.put("name",map1.get("时间"));
        int[] bb = new int[]{count};
        map.put("data",bb);

        list1.add(map);
    }
    return list1;
}*/

}
