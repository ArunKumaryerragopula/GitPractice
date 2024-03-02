package in.arun.service;

import in.arun.binding.DashboardResponse;
import in.arun.entity.Counsellor;

public interface CounsellorService {
	
	public String saveCounsellor(Counsellor c);
	 
	public Counsellor loginCheck(String email, String pwd);

	public boolean recoverPwd(String email);

	public DashboardResponse getDashboardInfo(Integer cid);

}
