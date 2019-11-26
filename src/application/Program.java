package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A?");
		int n = sc.nextInt();
	
		Set<Aluno> set = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			set.add(new Aluno(number));
		}
		
		System.out.print("How many students for course B?");
		n = sc.nextInt();
			
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			set.add(new Aluno(number));
		}
		
		System.out.print("How many students for course C?");
		n = sc.nextInt();
			
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			set.add(new Aluno(number));
		}
		System.out.println("Total Students: " + set.size());
		sc.close();
	}
}
