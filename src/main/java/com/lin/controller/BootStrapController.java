package com.lin.controller;

import java.awt.print.Pageable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 功能概要：
 * 
 * @author linbingwen
 * @since  2015年10月19日 
 */
//@Controller
public class BootStrapController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * 显示首页
	 * @author linbingwen
	 * @since  2015年10月23日 
	 * @return
	 */
	@RequestMapping("/bootstrapTest1")  
	public String bootStrapTest1(){
		return "bootstrap/bootstrapTest1";
	}
	
    /**
     * 分页查询
     * @author linbingwen
     * @since  2015年10月23日 
     * @param page
     * @return
     */
    @RequestMapping(value="/list.do", method= RequestMethod.POST)
    @ResponseBody
    public String list(Pageable page) {
    	return null;
    }

}
