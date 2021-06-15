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
public class HtsReportModel {

    public boolean isGroupCounselling() {
        return groupCounselling;
    }

    public void setGroupCounselling(boolean groupCounselling) {
        this.groupCounselling = groupCounselling;
    }

    public boolean isPreTestCounselling() {
        return preTestCounselling;
    }

    public void setPreTestCounselling(boolean preTestCounselling) {
        this.preTestCounselling = preTestCounselling;
    }

    public boolean isNewTest() {
        return newTest;
    }

    public void setNewTest(boolean newTest) {
        this.newTest = newTest;
    }

    public boolean isReTest() {
        return reTest;
    }

    public void setReTest(boolean reTest) {
        this.reTest = reTest;
    }

    public boolean isPostTestCounselled() {
        return postTestCounselled;
    }

    public void setPostTestCounselled(boolean postTestCounselled) {
        this.postTestCounselled = postTestCounselled;
    }

    public boolean isReceivedResults() {
        return receivedResults;
    }

    public void setReceivedResults(boolean receivedResults) {
        this.receivedResults = receivedResults;
    }

    public boolean isPositive() {
        return positive;
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }

    public boolean isPmtcReferred() {
        return pmtcReferred;
    }

    public void setPmtcReferred(boolean pmtcReferred) {
        this.pmtcReferred = pmtcReferred;
    }

    public boolean isVmmcReferred() {
        return vmmcReferred;
    }

    public void setVmmcReferred(boolean vmmcReferred) {
        this.vmmcReferred = vmmcReferred;
    }

    public boolean isMedicalCreReferred() {
        return medicalCreReferred;
    }

    public void setMedicalCreReferred(boolean medicalCreReferred) {
        this.medicalCreReferred = medicalCreReferred;
    }

    public boolean isOiartReferred() {
        return oiartReferred;
    }

    public void setOiartReferred(boolean oiartReferred) {
        this.oiartReferred = oiartReferred;
    }

    public boolean isPsReferred() {
        return psReferred;
    }

    public void setPsReferred(boolean psReferred) {
        this.psReferred = psReferred;
    }

    public boolean isNutriReferred() {
        return nutriReferred;
    }

    public void setNutriReferred(boolean nutriReferred) {
        this.nutriReferred = nutriReferred;
    }

    public boolean isTbReferred() {
        return tbReferred;
    }

    public void setTbReferred(boolean tbReferred) {
        this.tbReferred = tbReferred;
    }

    public boolean isOtherReferred() {
        return otherReferred;
    }

    public void setOtherReferred(boolean otherReferred) {
        this.otherReferred = otherReferred;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public boolean isCoupledTo() {
        return coupledTo;
    }

    public void setCoupledTo(boolean coupledTo) {
        this.coupledTo = coupledTo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    private String gender;
    private boolean coupledTo;
    private float age;
    private boolean groupCounselling;//opp of preTestCounselling
    private boolean preTestCounselling;
    private boolean newTest;
    private boolean reTest; //opp of newTest
    private boolean postTestCounselled;
    private boolean receivedResults;
    private boolean positive;
    private boolean pmtcReferred;
    private boolean vmmcReferred;
    private boolean medicalCreReferred;
    private boolean oiartReferred;
    private boolean psReferred;//psycho social support
    private boolean nutriReferred;
    private boolean tbReferred;
    private boolean otherReferred;
    
}
