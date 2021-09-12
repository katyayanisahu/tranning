package com.techment.assign1;

public class TotalStock {
	static void total_number_of_products(int[] product) {
		int sum = 0;
		for(int i=0; i<product.length; i++) {
			sum += product[i];
		}
		System.out.println("Total number of products: "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] products = {21, 34, 17, 57, 23, 45, 38, 67, 15, 34, 65, 78};
		total_number_of_products(products);
	}

}
