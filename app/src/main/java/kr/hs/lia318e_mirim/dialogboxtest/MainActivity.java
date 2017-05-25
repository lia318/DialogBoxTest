package kr.hs.lia318e_mirim.dialogboxtest;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener { // 현재 클래스에서 OnClickListener 사용 가능
    // Handler Class : 규격화 되어있다. 조건이 있는 인터페이스 추가
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butDialog = (Button) findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this); // MainActivity class 내에서 감시자 역할
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("첫번째 Dialog");
        dialog.setIcon(R.drawable.got7_jinyoung_icon);
        dialog.setMessage("여기는 메시지를 쓰는 곳입니다.");
        dialog.setPositiveButton("Ok", null); // null => 이벤트 발생x
        dialog.show(); // 꼭 설정하기
    }
}
