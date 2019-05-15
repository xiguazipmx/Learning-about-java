package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    /**
     * 生成验证码
     */
    @RequestMapping(value = "/getVerify")
    public void getVerify(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("image/jpeg");// 设置相应类型,告诉浏览器输出的内容为图片
            response.setHeader("Pragma", "No-cache");// 设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            RandomValidateCodeUtil randomValidateCode = new RandomValidateCodeUtil();
            randomValidateCode.getRandcode(request, response);// 输出验证码图片方法
        } catch (Exception e) {
            System.out.println("shibai");
            // logger.error("获取验证码失败>>>> ", e);
        }
    }
    //登录检验
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public boolean add(HttpServletRequest request, HttpSession session){
        String name = request.getParameter("name");
        String verify = request.getParameter("verify");
        System.out.println(name);
        System.out.println(verify);
        String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
        if (random == null) {
            return false;
        }
        if (random.equals(verify)) {
            return true;
        } else {
            return false;
        }
    }
    //获得所有楼房信息
    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
    public List<Map<String,Object>> getBuildList(Integer page,Integer size){
        // Pageable p = new PageRequest(page, size, Sort.Direction.ASC, "id");  
        //Pageable p = new PageRequest(page, size, Sort.Direction.ASC, "id");
        //Page<Model> page = 


        List<Map<String,Object>> list = new ArrayList();
        Map<String,Object> map = new HashMap();
        map.put("id", 1);
        map.put("name", "一号楼");
        Map<String,Object> map2 = new HashMap();
        map2.put("id", 2);
        map2.put("name", "2号楼");
        Map<String,Object> map3 = new HashMap();
        map3.put("id", 3);
        map3.put("name", "3号楼");
        Map<String,Object> map4 = new HashMap();
        map4.put("id", 4);
        map4.put("name", "4号楼");
        list.add(map);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        return list;
    }
    //获得楼层
    //获得门牌号

    /**
     * 忘记密码页面校验验证码
     */
    @RequestMapping(value = "/checkVerify", method = RequestMethod.POST, headers = "Accept=application/json")
    public boolean checkVerify(@RequestBody Map<String, Object> requestMap, HttpSession session) {
        try {
            // 从session中获取随机数
            String inputStr = requestMap.get("inputStr").toString();
            String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
            if (random == null) {
                return false;
            }
            if (random.equals(inputStr)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            //logger.error("验证码校验失败", e);
            return false;
        }
    }
}