package talentrover.service;

import org.apache.ibatis.session.SqlSession;
import talentrover.mapper.CompanyMapper;
import talentrover.model.Company;

public class CompanyService {
	 
	    public Company getCompanyByName(String companyName)
	    {
	        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
	        try
	        {
	            CompanyMapper companyMapper = sqlSession.getMapper(CompanyMapper.class);
	            return companyMapper.getCompanyByName(companyName);
	        } finally
	        {
	            sqlSession.close();
	        }
	    }
	 
}
