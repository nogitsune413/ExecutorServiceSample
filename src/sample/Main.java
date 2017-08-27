package sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		// スレッドプールの最大値を3スレッドに設定。
		final int MAX_THREADS = 3;
		
		// ファクトリメソッド「newFixedThreadPool」を使って、スレッドプールを持つExecutorServiceを生成。
		ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);

		// スレッドを10本立ててみる
		for (int i = 0; i < 10; i++) {
			
			// スレッドに番号を振る。
			int no = i;
			
			// スレッドの生存時間を1〜10秒でランダムに決める。
			int lifeTime = (int)(Math.random() * 9 + 1);
			
			// スレッドを起動する。
			executor.submit(new SampleThread(no, lifeTime));
		}
		// ExecutorServiceを閉じる。
		System.out.println("executor.shutdown();");
		executor.shutdown();
	}
}
