package org.prgrms.application.domain.voucher;

public class Voucher {
    private final Long voucherId;
    private final VoucherType voucherType;
    private double discountAmount;

    public Voucher(Long voucherId, VoucherType voucherType, double discountAmount) {
        this.voucherId = voucherId;
        this.voucherType = voucherType;
        this.discountAmount = discountAmount;
    }

    public static Voucher of(Long voucherId, String voucherType, String discountAmount) {
        return new Voucher(voucherId, VoucherType.findBySelection(voucherType), Double.parseDouble(discountAmount));
    }

    public Long getVoucherId() {
        return voucherId;
    }

    public VoucherType getVoucherType() {
        return voucherType;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }
}
