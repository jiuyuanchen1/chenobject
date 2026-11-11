package cn.chen.errey;

import java.math.BigDecimal;

public class ErpFinanceAccountDetails {

    /**贷方金额*/

    private java.math.BigDecimal creditAmount;
    /**借方金额*/

    private java.math.BigDecimal debitAmount;



    /**总账科目*/
    private String ledgerAccount;

    /**总账科目id*/
    private String ledgerAccountid;

    public ErpFinanceAccountDetails(BigDecimal creditAmount, BigDecimal debitAmount, String ledgerAccount, String ledgerAccountid) {
        this.creditAmount = creditAmount;
        this.debitAmount = debitAmount;
        this.ledgerAccount = ledgerAccount;
        this.ledgerAccountid = ledgerAccountid;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public BigDecimal getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(BigDecimal debitAmount) {
        this.debitAmount = debitAmount;
    }

    public String getLedgerAccount() {
        return ledgerAccount;
    }

    public void setLedgerAccount(String ledgerAccount) {
        this.ledgerAccount = ledgerAccount;
    }

    public String getLedgerAccountid() {
        return ledgerAccountid;
    }

    public void setLedgerAccountid(String ledgerAccountid) {
        this.ledgerAccountid = ledgerAccountid;
    }
}
