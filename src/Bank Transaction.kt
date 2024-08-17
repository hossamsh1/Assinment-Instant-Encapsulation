
class BankAccount(val accountNumber: String) {
    private var accountHolderName: String = "Unknown"
    private var balance: Double = 0.0
    var holderName: String
        get() = accountHolderName
        set(value) {
            if (value.isNotBlank()) {
                accountHolderName = value
            } else {
                println("Account holder name cannot be blank")
            }
        }


    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $amount. current balance: $balance")
        } else {
            println("Invalid deposit amount")
        }
    }

    fun withdraw(amount: Double) {
        when {
            amount <= 0 -> println("Invalid withdrawal amount")
            amount > balance -> println("Insufficient funds")
            else -> {
                balance -= amount
                println("Withdrew $amount. Current balance: $balance \n\n")
            }
        }
    }

    fun checkBalance(): Double {
        return balance
    }
}
