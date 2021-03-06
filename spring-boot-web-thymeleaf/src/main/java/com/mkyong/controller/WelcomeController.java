

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mkyong.dao.PerSionDao;

@Controller
public class WelcomeController {
	@Autowired
	private PerSionDao perSionDao;
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		perSionDao.removeStudent(2);
		model.put("message", 5);
		return "welcome";
	}

}