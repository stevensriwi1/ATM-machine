/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass2test;

import Model.Account;
import Model.ChequeAccount;
import Model.FixedAccount;
import Model.NetSaverAccount;
import Model.SavingsAccount;
import Reader.AccountReader;
import java.io.IOException;

/**
 *
 * @author 7208
 */
public class Ass2Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //running a new screen where the reader will be called
        new MainScreen(AccountReader.getAccounts()).setVisible(true);
        
    }
    
}
