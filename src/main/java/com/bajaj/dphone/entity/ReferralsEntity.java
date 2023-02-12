package com.bajaj.dphone.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "referrals")
public class ReferralsEntity {
    @Column(name = "referral_id")
    private int referralId;
    @Column(name = "user_id")
    private int userId;
    @Column(name="referred_by")
    private int referredBy;
    @Column(name = "referral_date")
    private Date referralDate;
    @Override
    public String toString() {
        return "ReferralEntity [referralId=" + referralId + ", userId=" + userId + ", referredBy=" + referredBy
                + ", referralDate=" + referralDate + "]";
    }
    public ReferralsEntity(int referralId, int userId, int referredBy, Date referralDate) {
        this.referralId = referralId;
        this.userId = userId;
        this.referredBy = referredBy;
        this.referralDate = referralDate;
    }
    public ReferralsEntity() {
    }
    public int getReferralId() {
        return referralId;
    }
    public void setReferralId(int referralId) {
        this.referralId = referralId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getReferredBy() {
        return referredBy;
    }
    public void setReferredBy(int referredBy) {
        this.referredBy = referredBy;
    }
    public Date getReferralDate() {
        return referralDate;
    }
    public void setReferralDate(Date referralDate) {
        this.referralDate = referralDate;
    }
    
}