package com.example.facade.service;
import com.example.facade.model.GiftInfo;

// 積分系統
public class QualifyService {
	public boolean isAvaailable(GiftInfo giftInfo) 
	{
		System.out.println("校驗" + giftInfo.getName() + "積分資格通過，庫存通過");
		return true;
	}
}
