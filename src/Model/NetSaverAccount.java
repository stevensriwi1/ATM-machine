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
public class NetSaverAccount extends Account{
    
    int intDailyLimit=2000;
    
    @Override
    public void setWithdrawalLimit(int withdrawalLimit) {
        super.setWithdrawalLimit(intDailyLimit); //this is to limit the users to only withdraw 2000
    }

    @Override
    public int getWithdrawalLimit() {
        return intDailyLimit; //returning 2000
    }
    
    @Override
    public float getAccBalance() {
        //return calculated interest rate plus original balance
        return super.getAccBalance()+(super.getAccBalance()*super.getInterestRate());
    }

    @Override
    public float getDepositBalance() {
        return getAccBalance()+ super.getDeposit(); //This is to add the current balance with deposit
    }

    @Override
    public float getCashOutBalance() {
        return getAccBalance() - super.getCashOut(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public float getNewBalance() {
        return getAccBalance()-super.getCashOut()+super.getDeposit(); //To change body of generated methods, choose Tools | Templates.
    }
}
