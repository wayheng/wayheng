package com.wayheng.processor;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * 处理器-百度热搜1
 * @author wayheng
 *
 */
public class BaiDuReSouProcessor implements PageProcessor {

	@Override
	public void process(Page page) {
		page.putField("titles", page.getHtml().xpath("//div[@class='c-single-text-ellipsis']/allText()").all());
	}

	@Override
	public Site getSite() {
		return Site.me().setRetryTimes(3).setSleepTime(1000).setUseGzip(false);
	}

}