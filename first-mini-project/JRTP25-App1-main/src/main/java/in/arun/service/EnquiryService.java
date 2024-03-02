package in.arun.service;

import java.util.List;

import in.arun.binding.SearchCriteria;
import in.arun.entity.StudentEnq;

public interface EnquiryService {
	
	public boolean addEnq(StudentEnq se);

	public List<StudentEnq> getEnquiries(Integer cid, SearchCriteria s);

}
