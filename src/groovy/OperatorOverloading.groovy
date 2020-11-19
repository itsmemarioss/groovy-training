@groovy.transform.ToString
class Account{
    BigDecimal balance
    
    //it could return another type such as a BigDecimal
    Account plus(Account other){
        new Account(balance: this.balance + other.balance)
    }
}

Account savings = new Account(balance: 100.00)
Account checking = new Account(balance: 500.00)

// + operator will be overloaded by plus method
println savings + checking

