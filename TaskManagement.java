package com.algorithmprograms.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<TaskInfo> arraylist = new ArrayList<>();
		TaskInfo task = null;
		
		System.out.println("Enter number of tasks to do:");
		int no_of_task = sc.nextInt();
		
		for(int i = 0; i < no_of_task; i++) {
			System.out.println("Enter task name:");
			String taskName = sc.next();
			
			System.out.println("Enter the deadline for the task:");
			Long deadline = sc.nextLong();
			
			task = new TaskInfo(taskName, deadline);
			arraylist.add(task);

		}
		
		int count = 0;
		boolean flag = true;
		while(flag) {
            for (int i = 0; i < arraylist.size(); i++) {
                System.out.println("Press " + (i + 1) + " to " + arraylist.get(i).taskName);
            }
            System.out.println("Press " +(no_of_task+1)+ " when the total task completes");

            int choice = sc.nextInt();
            if(choice != 0 && choice <= no_of_task) {
                if (arraylist.get(choice-1).getDeadline() > 0) {
                    System.out.print("Enter the time limit you want to continue the task: ");
                    long limit = sc.nextLong();
                    arraylist.get(choice-1).setDeadline(arraylist.get(choice-1).getDeadline() - limit);
                    System.out.println("New DeadLine for " + arraylist.get(choice-1).getTaskName() + " is: " + arraylist.get(choice-1).getDeadline());
                    count++;
                    flag = true;
                }
                else
                    System.out.println("Maximum DeadLine reached for " + arraylist.get(choice-1).getTaskName());
            }
            else if(choice == (no_of_task+1)) {
                System.out.println("All tasks completed!");
                flag = false;
            }
        }
        System.out.println("The task scheduling ran for " +count+ " times to complete all the task");
    }
}
