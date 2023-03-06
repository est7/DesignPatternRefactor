package com.est7.refoctor.影片出租.`refacted-01`

/**
 * @author: est7
 * @date: 2023/3/6
 */
object Test {
    /**
     * @param args
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val customer = Customer("ZhangSan")
        customer.addRental(Rental(Movie("aaa", Movie.REGULAR), 1))
        customer.addRental(Rental(Movie("bbb", Movie.NEW_RELEASE), 5))
        customer.addRental(Rental(Movie("ccc", Movie.CHILDRENS), 1))
        println(customer.statement())
    }
}