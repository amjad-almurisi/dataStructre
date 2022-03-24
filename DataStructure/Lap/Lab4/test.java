package Lap4;

import java.util.Scanner;

public class HQ1<E> {
    public static void main ( String[] args ) {
        Scanner in = new Scanner (System.in);
        HQ1<String> t= new HQ1<String> ();
        System.out.println(" 1 add first \n"+
                " 2 add last \n"+
                " 3 remove first \n"+
                " 4 rotate  list \n");
        int choice=-1;
        while (choice!=0){
            System.out.print("your choice = ");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("input name is ");
                    t.addFirst(in.next());
                    System.out.println("first is : "+t.first()+"\tlast is: "+t.last()+"\tsize = "+t.Size());
                    break;
                case 2:
                    System.out.print("input name");
                    t.addLast(in.next());
                    System.out.println("first= "+t.first()+ "\tlast= "+t.last()+"\tsize= "+t.Size());
                    break;
                case 3:
                    System.out.println("deleted name= "+t.removeFirst());
                    System.out.println("first= "+t.first()+
                            "\tlast= "+t.last()+"\tsize= "+t.Size());
                    break;
                case 4:
                    t.rotate();
                    System.out.println("first is  "+t.first()+ "\tlast is "+t.last()+"\tsize = "+t.Size());
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

   