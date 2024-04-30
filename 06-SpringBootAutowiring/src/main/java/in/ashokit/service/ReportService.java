package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.ashokit.dao.ReportDao;

@Service
public class ReportService {

	ReportDao reportDao;
	
    @Autowired
//    @Qualifier("oracle")
	public void setReportDao(ReportDao reportDao) {
		this.reportDao = reportDao;
	}

	public void generateReport() {
		reportDao.findData();
		System.out.println("Generating report ...");
	}
}
