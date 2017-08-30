package com.solverpeng.mybatis.mapper;

import com.solverpeng.mybatis.model.CircleUser;
import com.solverpeng.mybatis.util.ImportExcel;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * @author solverpeng
 */
public class CircleUserMapperTest extends BaseMapperTest {

    @Test
    public void batchImport() {
        SqlSession sqlSession = getSqlSession();
        try {
            InputStream is = new FileInputStream("D:\\用户.xlsx");
            ImportExcel importExcel = new ImportExcel("用户.xlsx", is, 0, 0);
            List<CircleUser> dataList = importExcel.getDataList(CircleUser.class);
            if (dataList != null && dataList.size() > 0) {
                CircleUserMapper countryMapper = sqlSession.getMapper(CircleUserMapper.class);
                int affectRows = countryMapper.insertList(dataList);
                sqlSession.commit();
                System.out.println(affectRows);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

}