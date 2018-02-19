/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SheepModel;

import java.time.LocalDate;

/**
 *
 * @author Użytkownik
 */
public class Sheep {
    private String Id;
    private Sheep Mother;
    private LocalDate BirthDate;
    private LocalDate LeaveDate;
    private String ArrivePlaceInfo;
    private char ArriveCode;
    private char LeaveCode;
    private String Sex;
    private int BreedCode;
    private String LeavePlaceInfo;
    private String LeaveConveyor;
    private String Note;
    
    
    
    
   /* public void setDate()
    {
        BirthDate = LocalDate.of(2015, 11, 8);
      
    }*/

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the Mother
     */
    public Sheep getMother() {
        return Mother;
    }

    /**
     * @param Mother the Mother to set
     */
    public void setMother(Sheep Mother) {
        this.Mother = Mother;
    }

    /**
     * @return the BirthDate
     */
    public LocalDate getBirthDate() {
        return BirthDate;
    }

    /**
     * @param BirthDate the BirthDate to set
     */
    public void setBirthDate(LocalDate BirthDate) {
        this.BirthDate = BirthDate;
    }

    /**
     * @return the LeaveDate
     */
    public LocalDate getLeaveDate() {
        return LeaveDate;
    }

    /**
     * @param LeaveDate the LeaveDate to set
     */
    public void setLeaveDate(LocalDate LeaveDate) {
        this.LeaveDate = LeaveDate;
    }

    /**
     * @return the ArrivePlaceInfo
     */
    public String getArrivePlaceInfo() {
        return ArrivePlaceInfo;
    }

    /**
     * @param ArrivePlaceInfo the ArrivePlaceInfo to set
     */
    public void setArrivePlaceInfo(String ArrivePlaceInfo) {
        this.ArrivePlaceInfo = ArrivePlaceInfo;
    }

    /**
     * @return the ArriveCode
     */
    public char getArriveCode() {
        return ArriveCode;
    }

    /**
     * @param ArriveCode the ArriveCode to set
     */
    public void setArriveCode(char ArriveCode) {
        this.ArriveCode = ArriveCode;
    }

    /**
     * @return the LeaveCode
     */
    public char getLeaveCode() {
        return LeaveCode;
    }

    /**
     * @param LeaveCode the LeaveCode to set
     */
    public void setLeaveCode(char LeaveCode) {
        this.LeaveCode = LeaveCode;
    }

    /**
     * @return the Sex
     */
    public String getSex() {
        return Sex;
    }

    /**
     * @param Sex the Sex to set
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * @return the BreedCode
     */
    public int getBreedCode() {
        return BreedCode;
    }

    /**
     * @param BreedCode the BreedCode to set
     */
    public void setBreedCode(int BreedCode) {
        this.BreedCode = BreedCode;
    }

    /**
     * @return the LeavePlaceInfo
     */
    public String getLeavePlaceInfo() {
        return LeavePlaceInfo;
    }

    /**
     * @param LeavePlaceInfo the LeavePlaceInfo to set
     */
    public void setLeavePlaceInfo(String LeavePlaceInfo) {
        this.LeavePlaceInfo = LeavePlaceInfo;
    }

    /**
     * @return the LeaveConveyor
     */
    public String getLeaveConveyor() {
        return LeaveConveyor;
    }

    /**
     * @param LeaveConveyor the LeaveConveyor to set
     */
    public void setLeaveConveyor(String LeaveConveyor) {
        this.LeaveConveyor = LeaveConveyor;
    }

    /**
     * @return the Note
     */
    public String getNote() {
        return Note;
    }

    /**
     * @param Note the Note to set
     */
    public void setNote(String Note) {
        this.Note = Note;
    }
    
}
