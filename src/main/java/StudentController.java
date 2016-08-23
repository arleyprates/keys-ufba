package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @RequestMapping(value="/student", method=RequestMethod.GET)
    public String studentForm(Model model) {
        model.addAttribute("student", new Student());
        return "student";
    }

    @RequestMapping(value="/student", method=RequestMethod.POST)
    public String studentSubmit(@ModelAttribute Student student, Model model) {
        model.addAttribute("student", student);
        return "result";
    }

}