
class Employee(private val emopoyeeId:String){
    private var employeeName:String="unknown"
    private var salary:Double=0.0
    fun getEmployeeId():String {
        return emopoyeeId
    }

    var name:String
        get() = employeeName
        set(value) {
            if (value.isNotBlank()){
                employeeName=value
            }else{
                println("Employee name cannot be blank")
            }
        }

    fun getSalary():Double{
        return salary
    }
    fun setSalary(amount:Double){
        if (amount>0){
            salary=amount
            println("Salary updated to $ $salary")
        }else{
            println("Salary must be a positive value")
        }
    }
}