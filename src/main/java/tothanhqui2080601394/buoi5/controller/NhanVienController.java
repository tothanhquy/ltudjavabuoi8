package tothanhqui2080601394.buoi5.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import tothanhqui2080601394.buoi5.model.NhanVien;
import tothanhqui2080601394.buoi5.model.PhongBan;
import tothanhqui2080601394.buoi5.service.NhanVienService;
import tothanhqui2080601394.buoi5.service.PhongBanService;

import java.util.List;

@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {

    @Autowired
    private NhanVienService service;
    @Autowired
    private PhongBanService phongBanService;

    @GetMapping("")
    public String viewHomePage(Model model) {
        List<NhanVien> listNhanViens = service.listAll();
        model.addAttribute("listNhanvien", listNhanViens);

        return "nhanvien/index";
    }

    @GetMapping("/new")
    public String showNewNhanVienPage(Model model) {
        NhanVien nhanVien = new NhanVien();
        model.addAttribute("nhanvien", nhanVien);
        model.addAttribute("pbs", phongBanService.listAll());

        return "nhanvien/new_nhanvien";
    }

    @PostMapping("/save")
    public String saveNhanVien(@ModelAttribute("nhanvien") NhanVien nhanVien) {
        service.save(nhanVien);
        return "redirect:/nhanvien";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditNhanVienPage(@PathVariable(name = "id") String id) {
        ModelAndView mav = new ModelAndView("nhanVien/new_nhanvien");
        NhanVien nhanVien = service.get(id);
        mav.addObject("nhanvien", nhanVien);
        mav.addObject("pbs", phongBanService.listAll());
        return mav;
    }

    @GetMapping("/delete/{id}")
    public String deleteNhanVien(@PathVariable(name = "id") String id) {
        service.delete(id);
        return "redirect:/nhanvien";
    }

    // handler methods...
}
