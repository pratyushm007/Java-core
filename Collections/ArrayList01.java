package Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList Basics
 * Learning: Dynamic arrays in Java
 */
public class ArrayList01 {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<Integer> list= new ArrayList<>();
        //to add something
        list.add(1);//o
        list.add(5);//1
        list.add(80);//2
        /*lets insert 50 inn between 5 and 80
        list.add(2,50);
        for(int x: list){
            System.out.println(x);
        }   */
        list.set(2,40);
        System.out.println(list);//it  replace the elemnt do not shift



















//       //to get something
//        System.out.println(list.get(0));
//        //to get size
       System.out.println("size is:"+list.size());
//        //to print everything
//        for(int i=0;i< list.size();i++){
//            System.out.println(list.get(i));
//
//        }
////        for(int x:list){
////            System.out.println(x);
////        }
//        //check for existance
//        System.out.println(list.contains(50));//true/false
//        list.remove(2);//removes  item in the index 2
//        for(int x:list){
//            System.out.println(x);
//        }
    }
}