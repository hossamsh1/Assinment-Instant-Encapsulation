//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val account = BankAccount("123456789")

    account.holderName = "Hossam shaban"
    account.deposit(1000.0)
    account.withdraw(500.0)
    account.checkBalance()

    println("Account Number: ${account.accountNumber}")
    println("Account Holder Name: ${account.holderName}")
    println("Balance: ${account.checkBalance()}")

    ///////////////// employee ////////////////

    val employee = Employee("E4567")
    employee.name = "Hossam shaban"
    println("Employee Name: ${employee.name}")

    employee.setSalary(5000.0)
    employee.setSalary(-1000.0)

    println("Employee ID: ${employee.getEmployeeId()}")
    println("Employee Salary: ${employee.getSalary()}")

}

