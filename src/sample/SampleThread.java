package sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SampleThread implements Runnable {
	
	private int no;
	private int time;
	
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	SampleThread(int no, int time) {
		this.no = no;
		this.time = time;
	}

	@Override
	public void run() {
		System.out.println(" No." + no + " start  id:" + Thread.currentThread().getId() + "  生存時間:" + time + " 現在時刻:" + sdf.format(Calendar.getInstance().getTime()));
		try {
			// 何かの処理が行われていると見せかけるため、スリープさせる。
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" No." + no + " end    id:" + Thread.currentThread().getId() + "  生存時間:" + time + " 現在時刻:" + sdf.format(Calendar.getInstance().getTime()));
	}
}
