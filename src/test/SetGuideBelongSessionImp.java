//package test;
//
//import com.lmfun.common.constant.Constants;
//import com.lmfun.pojo.dto.guide.UserGuideInfoDTO;
//import com.lmfun.pojo.dto.user.LoginRoleDTO;
//import com.lmfun.pojo.dto.user.LoginUserDTO;
//import com.lmfun.service.guide.GuideService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.servlet.http.HttpSession;
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * @author 小武 on 2018/7/7.
// */
//@Service
//public class SetGuideBelongSessionImp implements SetGuideBelongSession {
//
//    private static final String GUIDE_ROLE_KEY ="role02";
//
//    @Autowired
//    private GuideService guideService;
//
//    @Override
//    public void setGuideBelongInfoSession(LoginUserDTO loginUser, HttpSession session) {
//        List<LoginRoleDTO> roleInfo = loginUser.getRoleInfo();
//        List<String> roleKeyCollects = roleInfo.stream().map(LoginRoleDTO::getRoleKey).collect(Collectors.toList());
//
//        if (roleKeyCollects.isEmpty()) {
//            return;
//        }
//
//        if (!roleKeyCollects.contains(GUIDE_ROLE_KEY)) {
//            return;
//        }
//
//        SetSeesionTOGuide(loginUser.getMallUserUid(), session);
//    }
//
//    private void SetSeesionTOGuide(String mallUserUid, HttpSession session) {
//        UserGuideInfoDTO guideInfo = guideService.getGuideInfoByUserUid(mallUserUid);
//        if (guideInfo!= null) {
//            session.setAttribute(Constants.BELONGED_VENDOR_UID,guideInfo.getVendorUid());
//            session.setAttribute(Constants.BELONGED_VENDOR_SHOP_UID,guideInfo.getShopUid());
//        }
//    }
//
//
//}
