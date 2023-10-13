package com.alberto.tienda.controller;

import com.alberto.tienda.data.Rol;
import com.alberto.tienda.data.dto.RolDto;
import com.alberto.tienda.service.RolService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol")
@Validated
public class RolController {
    @Autowired
    RolService rolService;

    @GetMapping("/obtenerRoles")
    public List<RolDto> getRol(){
        return rolService.getRoles();
    }

    @PostMapping("/guardarRol")
    public RolDto saveRol(@Valid @RequestBody RolDto dto){
        return rolService.guardarRol(dto);
    }
}
