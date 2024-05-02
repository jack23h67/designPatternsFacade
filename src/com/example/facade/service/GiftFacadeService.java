package com.example.facade.service;
import com.example.facade.model.GiftInfo;

// GiftFacadeService  禮物門面模式
public class GiftFacadeService {
	private QualifyService qualifyService = new QualifyService();
	private PaymentService paymentService = new PaymentService();
	private ShippingService shippingService = new ShippingService();
	
	public void exchange(GiftInfo giftInfo)
	{
		if(qualifyService.isAvaailable(giftInfo))
		{
			if(paymentService.pay(giftInfo))
			{
				String shippingOrderNo = shippingService.dellivery(giftInfo); 
				System.out.println("物流系統下單成功，訂單號是："+ shippingOrderNo);
			}
		}
	}
}
