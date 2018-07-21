//package test;
//
//import com.lmfun.pojo.dto.guide.UserGuideInfoDTO;
//import com.lmfun.service.guide.GuideService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
///**
// * @author 小武 on 2018/7/6.
// */
//@Service
//public class Role02GetGuieBelongUid implements GetRoleUid{
//    @Autowired
//    private GuideService guideService;
//    @Override
//    public String getRoleBelongUid(String userUid){
//        UserGuideInfoDTO guideInfo = guideService.getGuideInfoByUserUid(userUid);
//
//        if (guideInfo != null) {
//            return guideInfo.getVendorUid();
//        }
//        return "";
//    }
//
//    @Override
//    public String getRoleBelongShopUid(String userUid){
//        UserGuideInfoDTO guideInfo = guideService.getGuideInfoByUserUid(userUid);
//
//        if (guideInfo != null) {
//            return guideInfo.getShopUid();
//        }
//        return "";
//    }
//}
