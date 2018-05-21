package Exercise2;

import javax.swing.JOptionPane;

public class bankaccount
{
    private String
            account_number,
            name;

    private double
            balance;

    public bankaccount(String account_number, String name, double balance)
    {
        this.account_number = account_number;
        this.name = name;
        this.balance = balance;
    }
    public String getAccountNumber()
    {
        return account_number;
    }
    public String getName()
    {
        return name;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double deposit_amount)
    {
            balance += deposit_amount;
    }

    public void withdraw(double withdraw_amount)
    {
            balance -= withdraw_amount;
    }

    public String getAccountInfo()
    {
        return "account number:" + account_number + "\n" +
                "name: " + name + "\n" +
                "new balance: $" + String.format("%.1f", balance);
    }
}

class bank_account_test
{

    public static void main(String[] args)
    {

        String account_number = JOptionPane.showInputDialog("enter account number --> ");
        String client_name = JOptionPane.showInputDialog("enter client name -->");
        String action = JOptionPane.showInputDialog("if u wnat to withdraw enter W and D for deposite");

        bankaccount customer = new bankaccount(account_number, client_name, 1000);

        if (action.equals("W"))
        {
            String amount_entered = JOptionPane.showInputDialog("withdraw amount");
            double amount = Double.parseDouble(amount_entered);
            customer.withdraw(amount);
            customer.getAccountInfo();
        }


        if (action.equals("D"))
        {
            String deposit_amount = JOptionPane.showInputDialog("deposit amount?");
            double amount_deposite = Double.parseDouble(deposit_amount);

            customer.deposit(amount_deposite);
            customer.getAccountInfo();
        }

        String message = customer.getAccountInfo();
        JOptionPane.showMessageDialog(null, message );


    }
}