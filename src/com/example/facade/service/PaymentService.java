package com.example.facade.service;
import com.example.facade.model.GiftInfo;

// 支付系統
public class PaymentService {
	public boolean pay(GiftInfo pointGift)
	{
		System.out.println(""+ pointGift.getName() + "積分成功");
		return true;
	}

}
