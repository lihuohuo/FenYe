package cn.smbms.service.impl;

import cn.smbms.dao.IUserInfoDAO;
import cn.smbms.entity.UserInfo;
import cn.smbms.service.IUserInfoService;
import cn.smbms.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Service("userService")
public class UserInfoServiceImpl implements IUserInfoService {

    //植入dao对象
    @Resource(name = "IUserInfoDAO")
    IUserInfoDAO userInfoDAO;

    public UserInfo isLogin(UserInfo info) {
        return userInfoDAO.isLogin(info);
    }

    public int getTotalCount() {
        return userInfoDAO.getTotalCount();
    }

    // 获取一页用户数据
    public PageUtil getOnePageData(int pageIndex, int pageSize) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("pageIndex", pageIndex * pageSize);
        map.put("pageSize", pageSize);

        PageUtil page = new PageUtil();
        page.setPageIndex(pageIndex);
        page.setPageSize(pageSize);
        int totalCount = userInfoDAO.getTotalCount();
        page.setTotalRecords(totalCount);
        int totalPages = page.getTotalRecords() % page.getPageSize() == 0 ? page.getTotalRecords() / page.getPageSize() : page.getTotalRecords() / page.getPageSize() + 1;
        page.setTotalPages(totalPages);
        List<UserInfo> list = userInfoDAO.getOnePageData(map);
        page.setList(list);

        return page;
    }

    public int userAdd(UserInfo userInfo) {
        return userInfoDAO.userAdd(userInfo);
    }

    public int updateUser(UserInfo userInfo) {
        return userInfoDAO.updateUser(userInfo);
    }

    public int deleteUser(int id) {
        return userInfoDAO.deleteUser(id);
    }

    public UserInfo UpdateList(int id) {
        return userInfoDAO.UpdateList(id);
    }
}
