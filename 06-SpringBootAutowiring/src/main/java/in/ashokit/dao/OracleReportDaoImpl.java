package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleReportDaoImpl implements ReportDao {

	public OracleReportDaoImpl() {
		System.out.println("ReportImpl :: constructor");
	}
	
	@Override
	public String findData() {
		System.out.println("Fetching data from oracle db..");
		return "report data";

	}
	
}
