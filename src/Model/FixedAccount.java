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
public class FixedAccount extends Account{
    
    private int contractPeriod;

    public int getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(int contractPeriod) {
        this.contractPeriod = 30;//set the contract period to 30 days
        
    }
    
    @Override //Overiding the method from super class just for this class.
    public void setInterestRate(float interestRate) {
        super.setInterestRate(0.20f); //This is to set the interest rate to 20%
    }

    @Override
    public float getInterestRate() {
        return super.getInterestRate(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public float getAccBalance() { //this is to overide the getAccBalance() function just in the SavingsAccount class
        return super.getAccBalance()+(super.getAccBalance()*super.getInterestRate()); /*the "super" is to get the exact
        amount from the original parent class. The whole thing is to add the amount you have set and the extra interest rate that you have
        multiplied from the original balance*/
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
