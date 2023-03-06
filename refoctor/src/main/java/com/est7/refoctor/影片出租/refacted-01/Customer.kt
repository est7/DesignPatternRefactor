package com.est7.refoctor.影片出租.`refacted-01`

import java.util.Vector

/**
 * @author: est7
 * @date: 2023/3/6
 */
class Customer( // 姓名
    private val _name: String
) {
    private val _rentals: Vector<Rental> = Vector<Rental>() // 租借记录
    fun addRental(obj: Rental) {
        _rentals.addElement(obj)
    }

    fun get_name(): String {
        return _name
    }

    fun statement(): String {
        var totalAmount = 0.0 // --总消费金额
        var frequentRenterPoints = 0 // --常客积点
        val rentals = _rentals.elements()
        var result = """
               Rental Record for ${get_name()}
               
               """.trimIndent()
        while (rentals.hasMoreElements()) {
            var thisAmount = 0.0
            val each = rentals.nextElement() as Rental // --取得一笔租借记录

            when (each.get_movie().get_priceCode()) {
                Movie.REGULAR -> {
                    thisAmount += 2.0
                    if (each.get_daysRented() > 2) thisAmount += (each.get_daysRented() - 2) * 1.5
                }

                Movie.NEW_RELEASE -> thisAmount += (each.get_daysRented() * 3).toDouble()
                Movie.CHILDRENS -> {
                    thisAmount += 1.5
                    if (each.get_daysRented() > 3) thisAmount += (each.get_daysRented() - 3) * 1.5
                }
            }

            // ---累加常客积点
            frequentRenterPoints++
            if (each.get_movie()
                    .get_priceCode() == Movie.NEW_RELEASE && each.get_daysRented() > 1
            ) frequentRenterPoints++
            // ---显示此笔租借数据
            result += "\t" + each.get_movie().get_title() + "\t" + thisAmount.toString() + "\n"
            totalAmount += thisAmount
        }
        // ---结尾打印
        result += "Amount owed is $totalAmount\n"
        result += "You earned $frequentRenterPoints frequent renter points"
        return result
    }
}