package org.prgrms.application.service;

import org.prgrms.application.domain.Voucher;
import org.prgrms.application.repository.VoucherRepository;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Map;
import java.util.UUID;

@Service
public class VoucherService {

    private VoucherRepository voucherRepository;

    public void createVoucher(){
        switch ()
    }

    public Voucher getVoucher(UUID voucherId){
        return voucherRepository
                .findById(voucherId)
                .orElseThrow(()-> new RuntimeException(MessageFormat.format("cannot find a voucher for {0}", voucherId)));
    }

    public Map<UUID, Voucher> getVoucherList(){
        return voucherRepository.findAll();
    }

}
