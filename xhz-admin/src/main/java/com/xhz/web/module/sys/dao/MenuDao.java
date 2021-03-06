package com.xhz.web.module.sys.dao;


import java.util.List;
import java.util.Map;

import com.xhz.web.module.sys.entity.MenuDO;
import com.xhz.web.module.sys.entity.MenuDTO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


/**
 * <p>
 *  Dao 接口
 * </p>
 *
 * @author zhangzm
 * @since 2019-01-23
 */
public interface MenuDao extends BaseMapper<MenuDO> {
	
	List<MenuDTO> selectMenuDTOPage(Map<String, Object> query);
	
	MenuDTO selectMenuDTOById(String menuId);
	
	List<MenuDTO> selectMenuDTOList(Map<String, Object> params);
	
	List<MenuDO> selectByParentId(String parentId);

	List<MenuDO> selectEnableMemu();
}
