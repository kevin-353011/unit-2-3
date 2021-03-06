package org.java.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class bayiba {
	public static void main(String[] args) {
		int[][] m = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };
		shuffle(m);
	}
	public static void shuffle(int m[][]) {
		 // 判断是否为空
		 if (m == null) {
	    		return;
		 }
		 // 获取原数组信息 n*m 以及 length
		int N = m.length;
		int M = m[0].length;
		int len = N * M;
		// 生成一个和原来二维数组规格一样的数组
		int[][] copy = new int[N][M];
		// 生成随机数下标，存放到数组中	
		// 存放行坐标
		List indexI = new ArrayList();
		// 存放列坐标
		List indexJ = new ArrayList();
		Random random = new Random();
		while (indexI.size() != N) {
			int ran = random.nextInt(N);
			if (!indexI.contains(ran)) {
				indexI.add(ran);
			}
		}
		while (indexJ.size() != M) {
			int ran = random.nextInt(M);
			if (!indexJ.contains(ran)) {	
				indexJ.add(ran);
			}
		}
		// 使用原数组为新数组赋值
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int p = (int) indexI.get(i);
				int q = (int) indexJ.get(j);
				copy[i][j] = m[p][q];
			}
		}
		// print
		m = copy;
		for (int i = 0; i < N; i++) {
			System.out.print("(");
			for (int j = 0; j < M; j++) {
				System.out.printf(" %d ", m[i][j]);
			}
			System.out.println(")");
		}
	}
}
