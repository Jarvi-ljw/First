package Day3.movieSys;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieService {

    //4.准备一个集合容器：存储全部上架的电影数据
    private static  ArrayList<Movie> movies = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public void start() {
        //3.准备操作界面：GUI界面//cmd命令做
        while (true) {
            //初始化菜单
            menu();
        }
    }

    /**
     * 菜单
     */
    public void menu() {
        System.out.println("======电影管理系统======");
        System.out.println("1.上架电影");
        System.out.println("2.下架某个电影");
        System.out.println("3.查询某个电影");
        System.out.println("4.封杀电影明星");
        System.out.println("5.显示全部电影信息");
        System.out.println("6.退出系统");
        System.out.println("=======================");
        System.out.println("请输入您的选择：");
        String choice = sc.next();
        switch (choice) {
            case "1":
                //上架
                addMovie();
                break;
            case "2":
                //下架
                removeMovie();
                break;
            case "3":
                //查询
                findMovie();
                break;
            case "4":
                //封杀
                killMovie();
                break;
            case "5":
                //显示全部电影信息
                showAllMovies();
                break;
            case "6":
                //退出
                System.out.println("感谢您的使用，欢迎下次使用！");
                System.exit(0);
                break;
            default:
                System.out.println("您的输入有误，请重新输入！");
        }
    }

    /**
     * 根据电影明星查询电影对象返回
     */
   /* private Movie findMovieByActor(String actor){
        //由于会存一个电影明星出演多个电影，增强for遍历和lambda表达式都无法成功遍历出所有的电影对象
        for (Movie movie : movies) {
            if ((movie.getActor().contains(actor))){
                return movie;
            }
        }
        return null;
    }
*/

    /**
     * 根据电影名称查询电影对象返回，展示对象数据
     */
    private Movie findMovieByName(String name){
        for (Movie movie : movies){
            if ((movie.getName().equals(name))){
                return movie;
            }
        }
        return null;
    }

    /**
     * 显示电影信息
     */
    private void showMoviesInfo(Movie movie) {
        //分析:想要获得电影信息，需要创建电影对象，利用findMovieByName得到需要的电影对象得到所有信息
        System.out.println("======电影信息======");
            System.out.println("电影名称：" + movie.getName());
            System.out.println("电影评分：" + movie.getScore());
            System.out.println("电影演员：" + movie.getActor());
            System.out.println("电影价格：" + movie.getPrice());
    }
    /**
     * 显示全部电影信息
     */
    private void showAllMovies() {
        System.out.println("======全部电影信息======");
        for (Movie movie : movies){
            System.out.println("系统中的第"+(movies.indexOf(movie)+1)+"部的"+"电影名称：" + movie.getName());
            System.out.println("系统中的第"+(movies.indexOf(movie)+1)+"部的"+"电影评分：" + movie.getScore());
            System.out.println("系统中的第"+(movies.indexOf(movie)+1)+"部的"+"电影演员：" + movie.getActor());
            System.out.println("系统中的第"+(movies.indexOf(movie)+1)+"部的"+"电影价格：" + movie.getPrice());
        }
    }

    /**
     * 封杀电影明星
     */
    private void killMovie() {
        System.out.println("======封杀电影明星======");
        System.out.println("请输入电影明星的名称");
        String MovieActor = sc.next();
        for (int i=movies.size()-1;i>=0;i--){
            //遍历电影集合来判断是否有该电影明星
            Movie movie = movies.get(i);
            if (movie.getActor().contains(MovieActor)){
                movies.remove(movie);
                System.out.println("封杀成功");
            }else {
                System.out.println("没有该电影明星或该电影明星的作品已被封杀");
            }

            //下面这种方法不好，将问题复杂化了
//            Movie movie =findMovieByActor(MovieActor);//原理是利用findMovieByActor方法遍历集合，返回电影对象，再利用for循环来处理并发异常的问题（存在一个演员出演多部电影）
//            if (movie!=null){
//                movies.remove(movie);
//                System.out.println("封杀成功");
//            }
        }
    }

    /**
     * 查询电影
     */
    private void findMovie() {
        System.out.println("======查询电影======");
        System.out.println("请输入要查询的电影名称：");
        String MovieName = sc.next();
        //查询要查询的电影名称与上架的电影名称是否存在相同的
        Movie movie =findMovieByName(MovieName);
        if (movie!=null){
            System.out.println("查询成功！");
            System.out.println("该电影的所有信息为:");
            showMoviesInfo(movie);
        }else {
            System.out.println("查询失败，没有该电影");
        }
    }

    /**
     * 下架电影
     */
    private void removeMovie() {
        System.out.println("======下架电影======");
        System.out.println("请输入要下架的电影名称：");
        String MovieName = sc.next();
        //查询下架的电影名称与上架的电影名称是否存在相同的
        Movie movie =findMovieByName(MovieName);
        //下架电影
        if (movie!=null){
            movies.remove(movie);
            System.out.println("下架成功");
        }else {
            System.out.println("下架失败，没有该电影");
        }
    }

    /**
     * 上架电影
     */
    private void addMovie() {
        System.out.println("======上架电影======");
        //创建新的电影对象来存储电影信息
        Movie movie = new Movie();

        //录入电影信息
        System.out.println("请输入电影名称：");
        String MovieName = sc.next();
        movie.setName(MovieName);
        System.out.println("请输入电影评分：");
        double MovieScore = sc.nextDouble();
        movie.setScore(MovieScore);
        System.out.println("请输入电影演员：");
        String MovieActor = sc.next();
        movie.setActor(MovieActor);
        System.out.println("请输入电影价格：");
        double MoviePrice = sc.nextDouble();
        movie.setPrice(MoviePrice);

        //添加电影对象到集合中
        movies.add(movie);
        System.out.println("上架成功！");
    }
}
