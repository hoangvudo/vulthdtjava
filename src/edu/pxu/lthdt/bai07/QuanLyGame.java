/**
 * 
 */
package edu.pxu.lthdt.bai07;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class QuanLyGame {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        // Tạo danh sách để lưu trữ 5 KyBinh
		  // Tạo danh sách để lưu trữ đối tượng Person
	        List<NhanVat> personList = new ArrayList<>();

	        // Thêm 10 đối tượng Person vào danh sách
	        personList.add(new NhanVat("Alice", 30));
	        personList.add(new NhanVat("Bob", 25));
	        personList.add(new NhanVat("Charlie", 35));
	        personList.add(new NhanVat("David", 28));
	        personList.add(new NhanVat("Eva", 22));
	        personList.add(new NhanVat("Frank", 40));
	        personList.add(new NhanVat("Grace", 33));
	        personList.add(new NhanVat("Henry", 29));
	        personList.add(new NhanVat("Ivy", 27));
	        personList.add(new NhanVat("Jack", 31));

	        // In danh sách các đối tượng Person
	        for (NhanVat person : personList) {
	            System.out.println(person);
	        }
	    }
	}