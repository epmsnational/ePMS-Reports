/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

/**
 *
 * @author Mohcc-ATP
 */
public class StiReportModel {
    
    private float age;
    private String gender;
    private boolean isNew;
    private boolean isRepeat;
    private boolean isSyphilisTested;//opp of preTestCounselling
    private boolean isSyphilisPositive;
    private boolean hivTested;
    private boolean hivPositive; //opp of newTest
    private boolean knownHivStatus;
    private boolean condomInfo;
    private boolean isContactTreated;

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public boolean isIsRepeat() {
        return isRepeat;
    }

    public void setIsRepeat(boolean isRepeat) {
        this.isRepeat = isRepeat;
    }

    

    public boolean isIsSyphilisTested() {
        return isSyphilisTested;
    }

    public void setIsSyphilisTested(boolean isSyphilisTested) {
        this.isSyphilisTested = isSyphilisTested;
    }

    public boolean isIsSyphilisPositive() {
        return isSyphilisPositive;
    }

    public void setIsSyphilisPositive(boolean isSyphilisPositive) {
        this.isSyphilisPositive = isSyphilisPositive;
    }

    public boolean isHivTested() {
        return hivTested;
    }

    public void setHivTested(boolean hivTested) {
        this.hivTested = hivTested;
    }

    public boolean isHivPositive() {
        return hivPositive;
    }

    public void setHivPositive(boolean hivPositive) {
        this.hivPositive = hivPositive;
    }

    public boolean isKnownHivStatus() {
        return knownHivStatus;
    }

    public void setKnownHivStatus(boolean knownHivStatus) {
        this.knownHivStatus = knownHivStatus;
    }

    public boolean isCondomInfo() {
        return condomInfo;
    }

    public void setCondomInfo(boolean condomInfo) {
        this.condomInfo = condomInfo;
    }

    public boolean isIsContactTreated() {
        return isContactTreated;
    }

    public void setIsContactTreated(boolean isContactTreated) {
        this.isContactTreated = isContactTreated;
    }
    
}
