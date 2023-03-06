package com.est7.refoctor.影片出租.pre;

/**
 * 租赁
 * @author: est7
 * @date: 2023/3/6
 */
public class Rental {
    private Movie _movie; // 影片
    private int _daysRented; // 租期

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int get_daysRented() {
        return _daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }
}