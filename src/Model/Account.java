/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 7208
 */
public abstract class Account {

    private int withdrawalLimit; //attribute needs to have a lowercase on the start of the word, because of standard java language
    private float interestRate;
    private float accBalance;
    private float deposit;
    private float cashOut;
    private float depositBalance;
    private float cashOutBalance;
    private float newBalance; 
    private String accNum;
    private String password;
    private String accType;
    
    public float getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(float newBalance) {
        this.newBalance = newBalance;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }
    public int getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(int withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(float accBalance) {
        this.accBalance = accBalance;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public float getCashOut() {
        return cashOut;
    }

    public void setCashOut(float cashOut) {
        this.cashOut = cashOut;
    }

    public float getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(float depositBalance) {
        this.depositBalance = depositBalance;
    }

    public float getCashOutBalance() {
        return cashOutBalance;
    }

    public void setCashOutBalance(float cashOutBalance) {
        this.cashOutBalance = cashOutBalance;
    }
    

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
