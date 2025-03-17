package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//    面向对象的综合小个例
//    1.设计电影类，以便创建电影对象，封装电影数据
//    2.封装电影中的全部电影数据。（自己选一些数据）
        Movie[] movies = new Movie[6];
//  movies = [null,null,null,null,null,null]
//              0    1   2   3   4   5
        movies[0] = new Movie("大话西游", "吴孟达", 9.5, 1);
        movies[1] = new Movie("盗梦空间", "克里斯托弗·诺兰", 9.0, 2);
        movies[2] = new Movie("战狼","吴京", 9.5, 3);
        movies[3] = new Movie("速度与激情7", "布克·罗伯茨", 9.2, 4);
        movies[4] = new Movie("让子弹飞", "姜文", 9.2, 5);
        movies[5] = new Movie("速度与激情8", "布克·罗伯茨", 9.2, 6);
//     3.创建电影操作对象，专门负责电影数据的业务操作
        MovieOperator mo = new MovieOperator(movies);
        mo.printMovies();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要查询电影的id:");
            int id = sc.nextInt();
            if (id == 0) {
                break;
            }
            else mo.searchMovie(id);
        }
        sc.close();
        System.out.println("程序结束");
    }



}
