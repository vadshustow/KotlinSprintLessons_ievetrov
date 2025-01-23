package org.example.lesson2

fun main() {

    val employees = 50
    val salaryEmployees = 30000
    val interns = 30
    val salaryIntern = 20000

    val employeeSalaryExpenses = employees * salaryEmployees

    val internSalaryExpenses = interns * salaryIntern

    val totalSalaryExpenses = employeeSalaryExpenses + internSalaryExpenses

    val averageSalary = totalSalaryExpenses / (employees + interns)

    println("Расходы на выплату зарплаты постоянных сотрудников: $employeeSalaryExpenses")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaryExpenses")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")
}