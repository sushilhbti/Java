//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @RequestMapping(value= "/findById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public EmployeeModel findByID(@PathVariable("id") final String id){
        return new EmployeeModel(id, "amit, Manoj");
    }
}
