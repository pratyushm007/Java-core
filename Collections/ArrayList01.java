package Collections;

import java.util.*;


/**
 * ArrayList Basics
 * Learning: Dynamic arrays in Java
 */
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return 0;
    }
}
public class ArrayList01 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Collections.sort(list);
        System.out.println(list);
        list.sort(null);
        List<String> words=Arrays.asList("banana","hot_chocolate","avocado");













    /*    List<String> list = new ArrayList<>();
        List<String> list1= Arrays.asList("Monday","tuesday");
        String[] array={"apple","banana","cherry"};
        List<String> list2 = Arrays.asList(array);
        //if we want to add elemnets
        List<String>list3 =new ArrayList<>(list2);
       
        list3.add("peacock");
        System.out.println(list3);
        List<Integer> integers = List.of(1, 2, 3);

        //converting to array
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        Object[] array1 = arr.toArray();
        arr.toArray(arr.toArray(new Integer[0]));*/


        










    /*    // Creating ArrayList
        ArrayList<Integer> list= new ArrayList<>(1000);//it means internal array initial capacity is 1000 ther is no need to resize till 1000 elements]
        System.out.println(list.size());
        System.out.println(list.get(0));*/








        /*   //to add something
        list.add(10);//o
        list.add(20);//1
        list.add(30);//2
        list.add(40);
        list.add(50);
        System.out.println(list.size());
        list.remove(2);
        System.out.println(list.size());*/






        /*lets insert 50 inn between 5 and 80
        list.add(2,50);
        for(int x: list){
            System.out.println(x);
        }   */
//        list.set(2,40);
//        System.out.println(list);//it  replace the elemnt do not shift



















//       //to get something
//        System.out.println(list.get(0));
//        //to get size
     //  System.out.println("size is:"+list.size());
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