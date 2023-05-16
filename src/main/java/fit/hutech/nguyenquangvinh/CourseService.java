package fit.hutech.nguyenquangvinh;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class CourseService {
	private List<Course> listCourse = new ArrayList<>();
	public void add(Course newProduct) { listCourse.add(newProduct); }
	public List<Course> GetAll() {return listCourse;}
}
