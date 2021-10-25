package com.example.google_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ReActivity extends AppCompatActivity {

    private TextView tv_re;
    private ImageView iv_pr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re);

        Intent intent = getIntent();
        String nickname = intent.getStringExtra("nickname");  // 메인액티비티로 부터 닉네임을 받음
        String photoUrl = intent.getStringExtra("photoUrl");  // 메인액티비티로 부터 프로필사진을 받음

        tv_re = findViewById(R.id.tv_re);
        tv_re.setText(nickname); // 닉네임 text를 텍스트 뷰에 세팅

        iv_pr = findViewById(R.id.iv_pr);
        Glide.with(this).load(photoUrl).into(iv_pr); // 프로필 url을 이미지 뷰에 세팅
    }
}