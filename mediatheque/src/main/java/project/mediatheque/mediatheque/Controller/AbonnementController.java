package project.mediatheque.mediatheque.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import project.mediatheque.mediatheque.DTO.AbonnementDTO;
import project.mediatheque.mediatheque.Service.AbonnementService;

@RestController
@CrossOrigin
@RequestMapping("Mediatheque/Abonnement")
public class AbonnementController {

    @Autowired
    private AbonnementService abonnementService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody AbonnementDTO abonnementDTO)
    {
        String id = abonnementService.addAbonnement(abonnementDTO);
        return id;
    }
}
