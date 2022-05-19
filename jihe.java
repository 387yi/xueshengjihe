package jihe;


import java.util.ArrayList;
import java.util.Scanner;

public class jihe {
    public static void main(String[] args) {
        ArrayList<xuesheng> array=new ArrayList<xuesheng>();
        xuesheng s1=new xuesheng("s",17);
        xuesheng s2=new xuesheng("a",18);
        xuesheng s3=new xuesheng("b",19);
        array.add(s1);
        array.add(s2);
        array.add(s3);
        for(int i=0;i<array.size();i++)
        {
            xuesheng s=array.get(i);
            System.out.println(s.getName()+","+s.getAge());

        }
    }
    public void scc(ArrayList<xuesheng> array){
        Scanner sc1=new Scanner(System.in);
        System.out.println("输入学生名字");
        String name=sc1.nextLine();
        Scanner sc2=new Scanner(System.in);
        System.out.println("输入学生年龄");
        int age=sc2.nextInt();
        xuesheng arr=new xuesheng(name,age);
        array.add(arr);
    }
}
