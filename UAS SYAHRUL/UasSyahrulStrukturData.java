/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uassyahrulstrukturdata;

/**
 *
 * @author ardin
 */
public class UasSyahrulStrukturData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayStack stack = new ArrayStack(5);

                System.out.println("Is Stack empty => " + stack.isEmpty() + "\n");

                System.out.println("Adding Data to Stack");
                System.out.println("=============================================================================================================================================");
                stack.push(new Employee("Puan", "Dragoon", 1));
                stack.push(new Employee("Sasuke", "Hidayat", 2));
                stack.push(new Employee("Zilong", "Hidayat", 3));
                stack.push(new Employee("Naruto", "Uzumaki", 4));
                stack.push(new Employee("Hyuga ", "Goku", 5));
                stack.printStack();
                System.out.println("Size of Stack => " + stack.size());
                System.out.println("=============================================================================================================================================");
                System.out.println("See First Data From Stack => " + stack.peek());
                System.out.println("Remove Data From Stack => " + stack.pop());

                System.out.println("=============================================================================================================================================");
                System.out.println("Last After All Remove");
                stack.printStack();
                System.out.println("=============================================================================================================================================");
    }
    
}
