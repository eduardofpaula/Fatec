package com.company.champsLol.champs.api.dto.facade;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping(value = "/champs", produces = MediaType.APPLICATION_JSON_VALUE)
public class ChampsAPI {
    @Autowired
    private ChampsFacade champsFacade;

    @PostMapping
    @ResponseBody
    public ChampsDTO criar(@RequestBody ChampsDTO champsDTO){
        return champsFacade.criar(champsDTO);
    }

    @PutMapping("/{champId}")
    @ResponseBody
    public ChampsDTO atualizar(@PathVariable("champId") Long champId,
    @RequestBody ChampsDTO champsDTO) {
        return champsFacade.atualizar(champsDTO, champId);
    }

    @GetMapping
    @ResponseBody
    public List<ChampsDTO> getAll(){
        return champsFacade.getAll();
    }

    @DeleteMapping("/{champId}")
    @ResponseBody
    public String deletar(@PathVariable("champId") Long champId) {
        return champsFacade.delete(champId);
    }

}
