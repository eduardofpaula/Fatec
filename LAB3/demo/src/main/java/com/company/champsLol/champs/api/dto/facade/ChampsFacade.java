package com.company.champsLol.champs.api.dto.facade;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChampsFacade {
    private static final Map<Long, ChampsDTO> champs = new HashMap<>();

    public ChampsDTO criar(ChampsDTO champsDTO) {
        Long proximoId = champs.keySet().size() + 1L;
        champsDTO.setId(proximoId);
        champs.put(proximoId, champsDTO);
        return champsDTO;
    }

    public ChampsDTO atualizar (ChampsDTO champsDTO, Long champId) {
        champs.put(champId,champsDTO);
        return champsDTO;
    }

    public ChampsDTO getById(Long champId){
        return champs.get(champId);
    }

    public List<ChampsDTO> getAll (){
        return new ArrayList<>(champs.values());
    }

    public String delete (Long champId){
        champs.remove(champId);
        return "Champion Deletado";
    }
}
