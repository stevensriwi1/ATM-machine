/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reader;

import Model.Account;
import Model.ChequeAccount;
import Model.FixedAccount;
import Model.NetSaverAccount;
import Model.SavingsAccount;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 7208
 */
public class AccountReader {
    
    public static Account[] getAccounts() throws FileNotFoundException, IOException{
        BufferedReader buffReader =null;
        Account[] accounts=new Account[4];
        try
        {
            File file= new File("src/BankAccountDetails.txt");
            
            FileReader reader= new FileReader(file);
            buffReader = new BufferedReader(reader);
            
            String fileLine=null;
            int i=0;
            while((fileLine=buffReader.readLine())!=null)
            {
                //single line from file
                String[] fileLineValues=fileLine.split(",");
                if(fileLineValues[0].equals("accountNumber"))
                {
                    //Ignore header line with account number on it
                    continue;
                }
                //this is for the teacher to know what values do they need to put
                //inside the loginCard, makes their life easier
                System.out.println("account number: "+ fileLineValues[0]);
                System.out.println("account password: "+ fileLineValues[1]);
                System.out.println("account type: "+ fileLineValues[2]);
                System.out.println(" ");
                //Create Accounts
                
                
                //checking whether the second column is equals to savings, then 
                //populate data from txt file to Savings account with the whole
                //row.
                if(fileLineValues[2].equals("savings"))
                {
                    SavingsAccount savingsAcc= new SavingsAccount();
                    savingsAcc.setAccNum(fileLineValues[0]);
                    savingsAcc.setPassword(fileLineValues[1]);
                    savingsAcc.setAccType(fileLineValues[2]);
                    //set the withdrawLimit to whatever is inside the txt file column 4
                    savingsAcc.setWithdrawalLimit(Integer.parseInt(fileLineValues[3]));
                    //set the balance to whatever is inside the txt file column 5
                    savingsAcc.setAccBalance(Float.parseFloat(fileLineValues[4]));
                    //calculated daily
                    savingsAcc.setInterestRate(Float.parseFloat(fileLineValues[5]));
                    accounts[i]=savingsAcc;
                }
                //checking whether the second column is equals to cheque, then 
                //populate data from txt file to Cheque account with the whole
                //row.
                else if(fileLineValues[2].equals("cheque"))
                {
                    ChequeAccount chequeAcc= new ChequeAccount();
                    chequeAcc.setAccNum(fileLineValues[0]);
                    chequeAcc.setPassword(fileLineValues[1]);
                    chequeAcc.setAccType(fileLineValues[2]);
                    //withdraw limit will be not useful for the assignment
                    chequeAcc.setWithdrawalLimit(Integer.parseInt(fileLineValues[3]));
                    chequeAcc.setAccBalance(Float.parseFloat(fileLineValues[4]));
                    //Cheque acount does not give any interest
                    chequeAcc.setInterestRate(Float.parseFloat(fileLineValues[5]));
                    accounts[i]=chequeAcc;
                }
                //checking whether the second column is equals to netsaver, then 
                //populate data from txt file to NetSaver account with the whole
                //row.
                else if(fileLineValues[2].equals("netsaver"))
                {
                    NetSaverAccount netSaverAcc= new NetSaverAccount();
                    netSaverAcc.setAccNum(fileLineValues[0]);
                    netSaverAcc.setPassword(fileLineValues[1]);
                    netSaverAcc.setAccType(fileLineValues[2]);
                    //set the balance to whatever is inside the txt file column 5
                    netSaverAcc.setAccBalance(Float.parseFloat(fileLineValues[4]));
                    //calculated monthly
                    netSaverAcc.setInterestRate(Float.parseFloat(fileLineValues[5]));
                    accounts[i]=netSaverAcc;
                }
                //checking whether the second column is equals to fixed, then 
                //populate data from txt file to Fixed account with the whole
                //row.
                else if(fileLineValues[2].equals("fixed"))
                { 
                    //creating new instance, just like other accounts
                    FixedAccount fixedAcc= new FixedAccount();
                    fixedAcc.setAccNum(fileLineValues[0]);
                    fixedAcc.setPassword(fileLineValues[1]);
                    fixedAcc.setAccType(fileLineValues[2]);
                    //withdraw limit will be not useful for the assignment
                    fixedAcc.setWithdrawalLimit(Integer.parseInt(fileLineValues[3]));
                    fixedAcc.setAccBalance(Float.parseFloat(fileLineValues[4]));
                    fixedAcc.setInterestRate(Float.parseFloat(fileLineValues[5]));
                    accounts[i]=fixedAcc;
                }
                
                i++;
                
            }
        }
        //Whatever happens, if the buff reader is not null, close the reader
        finally
        {
            if(buffReader!=null)
            {
                buffReader.close();
            }
            
        }
        return accounts;
    }
    
    public static void main(String[] args) throws IOException {
        AccountReader.getAccounts();
    }
}
