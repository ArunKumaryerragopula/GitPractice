package in.arun.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arun.entity.StudentEnq;

public interface StudentEnqRepo extends JpaRepository<StudentEnq, Integer>{
	
	public List<StudentEnq> findByCid(Integer cid);
	
}
