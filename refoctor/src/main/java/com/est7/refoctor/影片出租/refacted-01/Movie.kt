package com.est7.refoctor.影片出租.`refacted-01`

/**
 * @author: est7
 * @date: 2023/3/6
 * 影片
 */
class Movie(// 名称
    private val _title: String, //类型代号
    private var _priceCode: Int
) {
    fun get_priceCode(): Int {
        return _priceCode
    }

    fun set_priceCode(code: Int) {
        _priceCode = code
    }

    fun get_title(): String {
        return _title
    }

    companion object {
        const val REGULAR = 0 // 普通片
        const val NEW_RELEASE = 1 // 新片
        const val CHILDRENS = 2 // 儿童片
    }
}