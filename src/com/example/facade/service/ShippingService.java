package com.example.facade.service;
import com.example.facade.model.GiftInfo;

// 物流系統
public class ShippingService {
	public String dellivery(GiftInfo giftInfo)
	{
		System.out.println(giftInfo.getName() + "進入物流系統");
		String shippingOrderNo = "666";
		return shippingOrderNo;
	}
}
