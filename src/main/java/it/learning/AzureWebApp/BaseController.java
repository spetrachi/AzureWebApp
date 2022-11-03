
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    @RequestMapping("/")
        public String showHome(Model model) {
            model.addAttribute("user", user);
            return "home.html";
        }
}