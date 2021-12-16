package com.wayheng.spider;

import java.util.List;

import com.wayheng.processor.BaiDuReSouProcessor;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Spider;

/**
 * 
 * @author wayheng
 *
 */
public class BaiduReSouSpider {

	public static void main(String[] args) {
		//single download
        Spider spider = Spider.create(new BaiDuReSouProcessor()).thread(1);
        String urlTemplate = "https://top.baidu.com/board?tab=realtime";
        ResultItems resultItems = spider.<ResultItems>get(urlTemplate);
        List<String> titles = resultItems.get("titles");
        int size = titles.size();
        for (int i = 0; i < size; i++) {
			System.out.println(titles.get(i));
		}
        spider.close();
	}
	
}