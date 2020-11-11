package ie.filippolak.registrationform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class OwnerController {


    private OwnerRepository ownerRepository;

    @Autowired
    public OwnerController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;

    }





    @GetMapping("/registration")
    public String showForm(Model model){
        Dupa dupa = new Dupa();
        model.addAttribute("dupa", dupa);

        ListOfProfessions listOfProfessions = new ListOfProfessions();
        model.addAttribute("listOfProfessions", listOfProfessions.showProfession());

        return "registration_form";
    }
    @PostMapping("/registration")
    public String save(@ModelAttribute("dupa") Dupa dupa) {
        ownerRepository.save(dupa);
        return "/registration_success";
    }

  //  @RequestMapping("/registration")
  // public String submitForm(@ModelAttribute("owner") Owner owner){

    //   ownerRepository.save(owner);
     //   return "registration_success";
   //}


}
