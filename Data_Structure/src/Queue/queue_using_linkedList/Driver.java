package Queue.queue_using_linkedList;

import Array.Ques1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Queue queue = new Queue();
        boolean flag = true;
        Scanner scan = new Scanner(System.in);

        while (flag){
            System.out.println("Enter 1 for enque\nEnter 2 for deque\nEnter 3 for peek" +
                    "\nEnter 4 for display\nEnter 5 to check if queue is Empty\n" +
                    "Enter 6 for for delete");
            int choice = scan.nextInt();
            switch (choice){
                case 1 :{
                    System.out.println("Enter Data");
                    int data = scan.nextInt();
                    queue.enque(data);
                    break;
                }

                case 2: {
                    try {
                        int data = queue.deque();
                        System.out.println(data);
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 3:{
                    try {
                        int data = queue.deque();
                        System.out.println("data");
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 4:
                {
                    try{
                        queue.display();
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 5:
                {
                    System.out.println(queue.isEmpty());
                    break;
                }
                case 6:{
                    flag = false;
                    System.out.println("Program terminated");
                }

            }
        }

    }
}
