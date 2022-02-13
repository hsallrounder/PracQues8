import Pre_Requisites.*;

import java.util.Scanner;

public class Q1{
    public boolean counterPart(char a,char b){
        return (a=='(' && b==')');
    }
    public boolean balanced_brkt(String s){
        StackBySinglyLinkedList st=new StackBySinglyLinkedList();
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(t=='('){
                st.push(t);
            }
            else {
                try {
                    if (!(st.pop() == '(')) {
                        return false;
                    }
                }
                catch (MyStackException e){
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        sc.close();
        Q1 obj=new Q1();
        System.out.println(obj.balanced_brkt(s));
    }
}
