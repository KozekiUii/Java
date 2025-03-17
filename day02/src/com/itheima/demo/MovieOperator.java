package com.itheima.demo;
// 电影操作类
public class MovieOperator {
    private Movie[] movies;
    /**
     * 构造函数，用于初始化 MovieOperator对象。
     *
     * @param movies 一个 Movie对象数组，表示要操作的电影列表。
     *              该数组将被赋值给类的成员变量 movies。
     */
    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }
    public void printMovies() {
        for (int i = 0; i < movies.length; i++) {
//          直接打印 m 对象，会调用 m 的 toString 方法，会输出 m 在堆内存中的地址
            Movie m = movies[i];
            System.out.println(m.getId()+"---"+m.getName()+"---"+m.getActor()+"---"+m.getPrice());
        }
    }
    public void searchMovie(int id) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id) {
                System.out.println(movies[i].getName()+"---"+movies[i].getActor()+"---"+movies[i].getPrice()+"\n");
            }
        }
    }
}
