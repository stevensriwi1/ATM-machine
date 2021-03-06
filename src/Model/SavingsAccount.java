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
public class SavingsAccount extends Account{

    
    @Override
    public float getAccBalance() {
        
        //returns the bank account funds added by the amount of money that is generated by interest rate
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
