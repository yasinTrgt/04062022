package com.mehmetnuri.kapbul.converter;

import com.mehmetnuri.kapbul.dto.KapDto;
import com.mehmetnuri.kapbul.entity.Kap;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class KapConverter  {

    public KapDto convertToKapDto(Kap kap) {
        KapDto kapDto = new KapDto();
        kapDto.setId(kap.getId());
        kapDto.setKapAdi(kap.getKapAdi());
        kapDto.setKapDurumu(kap.getKapDurumu());
        kapDto.setTuru(kap.getTuru());
        kap.setDurum(kap.getDurum());
        return kapDto;
    }


    public List<KapDto> convertToKapDtoList(List<Kap> kapList) {
        List<KapDto> kapDtoList = new ArrayList<>();
        for (Kap kap : kapList) {
            KapDto kapDto = this.convertToKapDto(kap);
            kapDtoList.add(kapDto);
        }
        return kapDtoList;
    }
}
