import com.example.facade.model.GiftInfo;
import com.example.facade.service.GiftFacadeService;

// facade(門面模式)
// 模擬一個積分兌換禮物的系統
// 模擬客戶要求，要求會往facade送，由facade決定往它內部那些service處理
public class ClientRequest {

	public static void main(String[] args) {
		GiftInfo giftInfo = new GiftInfo();
		giftInfo.setName("Facade 核心原理");
		GiftFacadeService giftFacadeService = new GiftFacadeService();
		giftFacadeService.exchange(giftInfo);
	}

}
