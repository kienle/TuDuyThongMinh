package com.kienle.sachnoi.tuduythongminh;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.kienle.sachnoi.tuduythongminh.adapter.MucLucAdapter;

public class MainActivity extends Activity {
	
	private String[] mMucLucs = new String[] { 
			"1. Lời Giới Thiệu",
			"2. Tinh Thần Trách Nhiệm", 
			"3. Chọn Lựa Đúng Đắn",
			"4. Đừng Hỏi \"Tại Sao?\" ", 
			"5. Stress",
			"6. Bình Tĩnh Trước Mọi Hoàn...", 
			"7. Cải Thiện Mối Quan Hệ Với...",
			"8. Đừng Hỏi \"Khi Nào?\"", 
			"9. Đừng Trì Hoãn Bất Cứ Điều...",
			"10. Hãy Vận Dụng Tốt Những Nguyên...", 
			"11. Đừng Hỏi \"Ai?\" ",
			"12. Ngay Bây Giờ Tôi Có Thể Làm...", 
			"13. Tinh Thần Đồng Đội",
			"14. Thay Đổi Chính Mình", 
			"15. Thực Hiện Những Gì Mình Nói",
			"16. Chấp Nhận Từ Bỏ", 
			"17. Sức Mạnh Của Sự Đồng Lòng",
			"18. Mỗi Người Là Một Tấm Gương", 
			"19. Hãy Hành Động!",
			"20. Hành Động Nhỏ Tạo Nên Giá...",
			"21. Bạn Có Phải Là Một Nhà Lãnh...", 
			"22. Thuật Lãnh Đạo",
			"23. Những Câu Hỏi QBQ ", 
			"24. Rèn Luyện Tinh Thần QBQ!",
			"25. Học Đi Đôi Với Hành", 
			"26. Lời Kết"

	};
	
	private ListView mLvMucLuc;
	private MucLucAdapter mAdapter;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mLvMucLuc = (ListView) findViewById(R.id.lvMucLuc);
		mAdapter = new MucLucAdapter(this, mMucLucs);
		mLvMucLuc.setAdapter(mAdapter);
		mLvMucLuc.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
			}
		});
	}

}
