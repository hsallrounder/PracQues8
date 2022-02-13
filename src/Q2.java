import Pre_Requisites.*;

import java.util.Scanner;

public class Q2 {
    public void reverseStack(StackBySinglyLinkedList s1,StackBySinglyLinkedList s2){
        while (!s1.isEmpty()){
            try {
                s2.push(s1.pop());
            }
            catch (MyStackException e){}
        }
    }
    public static void main(String[] args) {
        StackBySinglyLinkedList st=new StackBySinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0) st.push(sc.nextInt());
        sc.close();
        StackBySinglyLinkedList res=new StackBySinglyLinkedList();
        Q2 obj=new Q2();
        obj.reverseStack(st,res);
        while (!res.isEmpty()){
            try {
                System.out.print(res.pop() + " ");
            }
            catch (MyStackException e){}
        }
    }
}
