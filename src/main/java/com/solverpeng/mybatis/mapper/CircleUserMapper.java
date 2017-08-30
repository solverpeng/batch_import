package com.solverpeng.mybatis.mapper;

import com.solverpeng.mybatis.model.CircleUser;

import java.util.List;

/**
 * @author solverpeng
 */
public interface CircleUserMapper {
    int insertList(List<CircleUser> circleUserList);
}
