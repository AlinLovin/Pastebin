package com.pastebin.pastebin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PastebinController {

    @Autowired
    private PastebinService service;

    @GetMapping("/paste")
    public String viewHomePage(Model model) {
        List<Pastebin> listPastebin = service.listAll();
        model.addAttribute("listPastebin", listPastebin);
        return "index";
    }

    @GetMapping("/paste/create")
    public String add(Model model) {
        model.addAttribute("pastebin", new Pastebin());
        return "create";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePastebin(@ModelAttribute("pastebin") Pastebin pas) {
        service.save(pas);
        return "redirect:/paste";
    }

    @RequestMapping("paste/create/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("create");
        Pastebin pas = service.get(id);
        mav.addObject("pastebin", pas);
        return mav;
    }

    @RequestMapping("/paste/delete/{id}")
    public String deleteStudent(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/paste ";
    }
}
