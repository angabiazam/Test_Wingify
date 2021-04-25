package com.wingify.pageObjects;


public interface ObjectRepository {
	
	public static final String heatmap_label = "//h1[@class='notranslate text--heatmap-test page-heading']";
	public static final String heatmap_picture = "//div[@class='W(100%) Mih(180px) screenshot-thumb ng-isolate-scope']";
	public static final String heatmap_btn = "//div[@class='screenshot-thumb__click-msg show-on-hover' and contains(text(),'View heatmap')]";
	public static final String elementlist_btn = "//div[@id='heatmap-player']//span[text()='Element List']";
	public static final String elementlist_hdr = "//div[@id='element-list']//div[@class='element-list--heading' and contains(text(),'Element List')]";
	public static final String freetrial_link = "//table[@id='element-list--content']//td[@class='col-name  ellipsis' and text()='Try VWO For Free']";
	public static final String freetrial_btn = "//button[@class='Or(1) Or(0)--sm Py(17px) Px(30px) Fz($font-size-14) button--purple-light button btn-modal-form-submit  Z(2)']";
	

}
