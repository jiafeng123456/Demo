package com.example.time.Gof.Singleton.test;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/18 0018 09:32
 */
public class SingletonLazy {
    public static void main(String[] args) {
        President president = President.getInstance();
        President president2 = President.getInstance();
        Boolean flag = (president == president2);
        if (flag){
            System.out.println("president与president2为同一对象");
        }else {
            System.out.println("president与president2不为同一对象");
        }

    }

}
class President{
    private static President president = null;

    private President(){}

    public static President getInstance(){
        if (president==null){
            president = new President();
        }
        return president;
    }
}
