package in.ashokit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysql")
@Primary
public class MySqlReportDaoImpl implements  ReportDao {

	public MySqlReportDaoImpl() {
		System.out.println("ReportImpl :: constructor");
	}
	
	@Override
	public String findData() {
		System.out.println("Fetching data from mysql db..");
		return "report data";

	}
}
