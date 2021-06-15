/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

/**
 *
 * @author Developer
 */
public class MohccVmmcRptModel {

    public void setIsHivPositive(String isHivPositive) {
        this.isHivPositive = isHivPositive;
    }

    public void setIsHivNegative(String isHivNegative) {
        this.isHivNegative = isHivNegative;
    }

    public void setIsInvalid(String isInvalid) {
        this.isInvalid = isInvalid;
    }

    public String getIsHivPositive() {
        return isHivPositive;
    }

    public String getIsHivNegative() {
        return isHivNegative;
    }

    public String getIsInvalid() {
        return isInvalid;
    }
    

    public MohccVmmcRptModel(String isHivPositive, boolean isHivStatusKnown, boolean isSurgicalDorsalSlit, boolean isSurgicalFg, boolean isSurgicalOther, boolean isPrepex, boolean isModerateServere, boolean isSevere, boolean hasReturned,float age) {
        this.isHivPositive = isHivPositive;
        this.isHivStatusKnown = isHivStatusKnown;
        this.isSurgicalDorsalSlit = isSurgicalDorsalSlit;
        this.isSurgicalFg = isSurgicalFg;
        this.isSurgicalOther = isSurgicalOther;
        this.isPrepex = isPrepex;
        this.isModerateServere = isModerateServere;
        this.isSevere = isSevere;
        this.hasReturned = hasReturned;
        this.age=age;
    }
    public MohccVmmcRptModel()
    {
        
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }
    

   
    public boolean isIsHivStatusKnown() {
        return isHivStatusKnown;
    }

    public void setIsHivStatusKnown(boolean isHivStatusKnown) {
        this.isHivStatusKnown = isHivStatusKnown;
    }

    public boolean isIsSurgicalDorsalSlit() {
        return isSurgicalDorsalSlit;
    }

    public void setIsSurgicalDorsalSlit(boolean isSurgicalDorsalSlit) {
        this.isSurgicalDorsalSlit = isSurgicalDorsalSlit;
    }

    public boolean isIsSurgicalFg() {
        return isSurgicalFg;
    }

    public void setIsSurgicalFg(boolean isSurgicalFg) {
        this.isSurgicalFg = isSurgicalFg;
    }

    public boolean isIsSurgicalOther() {
        return isSurgicalOther;
    }

    public void setIsSurgicalOther(boolean isSurgicalOther) {
        this.isSurgicalOther = isSurgicalOther;
    }

    public boolean isIsPrepex() {
        return isPrepex;
    }

    public void setIsPrepex(boolean isPrepex) {
        this.isPrepex = isPrepex;
    }

    public boolean isIsModerateServere() {
        return isModerateServere;
    }

    public void setIsModerateServere(boolean isModerateServere) {
        this.isModerateServere = isModerateServere;
    }

    public boolean isIsSevere() {
        return isSevere;
    }

    public void setIsSevere(boolean isSevere) {
        this.isSevere = isSevere;
    }

    public boolean isHasReturned() {
        return hasReturned;
    }

    public void setHasReturned(boolean hasReturned) {
        this.hasReturned = hasReturned;
    }
    private String isHivPositive;//report G1 and G2
    private String isHivNegative;//report G1 and G2
    private String isInvalid;//report G1 and G2
    private boolean isHivStatusKnown;//report G3
    private boolean isSurgicalDorsalSlit;//report G4(i)
    private boolean isSurgicalFg;//refer to report G4(ii)
    private boolean isSurgicalOther;//report G4(iii)
    private boolean isPrepex;//refer to report G6
    private boolean isModerateServere;//refer to report G6
    private boolean isSevere;//refer to report G7
    private boolean hasReturned;//refer to report G8
    private float age;
}
