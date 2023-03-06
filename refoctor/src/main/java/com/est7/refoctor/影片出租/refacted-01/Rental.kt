package com.est7.refoctor.影片出租.`refacted-01`

/**
 * 租赁
 * @author: est7
 * @date: 2023/3/6
 */
class Rental(// 影片
    private val _movie: Movie, // 租期
    private val _daysRented: Int
) {
    fun get_daysRented(): Int {
        return _daysRented
    }

    fun get_movie(): Movie {
        return _movie
    }
}