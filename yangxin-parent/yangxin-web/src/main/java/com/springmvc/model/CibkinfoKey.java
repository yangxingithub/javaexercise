package com.springmvc.model;

public class CibkinfoKey {
    private String insttuCde;

    private Long inBankCd;

    public String getInsttuCde() {
        return insttuCde;
    }

    public void setInsttuCde(String insttuCde) {
        this.insttuCde = insttuCde == null ? null : insttuCde.trim();
    }

    public Long getInBankCd() {
        return inBankCd;
    }

    public void setInBankCd(Long inBankCd) {
        this.inBankCd = inBankCd;
    }
}