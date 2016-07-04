package com.example.owner.tapnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //問題となる数字が入る配列
    int[] hairetu;
    //実際に表示させる問題の文字列
    String mondai;
    //4桁のうち今何桁目を回答しているかを覚えておく変数
    int seikai;
    //問題を表示させるTextView
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //関連付け
        textView = (TextView)findViewById(R.id.textView);
        //start()メソッドを処理する
        start();
    }

    public void start() {
        //hairetuの初期化
        hairetu = new int[4];
        //ランダムな数字を作る
        Random rand = new Random();
        //0から3の乱数にそれぞれ1を足すことで1から4の乱数が作られる
        hairetu[0] = rand.nextInt(4) + 1;
        hairetu[1] = rand.nextInt(4) + 1;
        hairetu[2] = rand.nextInt(4) + 1;
        hairetu[3] = rand.nextInt(4) + 1;

        //mondaiにhairetuのint型をString型に変更して足す
        mondai =
                Integer.toString(hairetu[0])
                        + Integer.toString(hairetu[1])
                        + Integer.toString(hairetu[2])
                        + Integer.toString(hairetu[3]);
        //textViewにmondaiを表示する
        textView.setText(mondai);
        //seikaiを0にする
        seikai = 0;

    }


    public void number1(View v){
        //もしhairetu[seikai]が1の時
        if (hairetu[seikai] == 1){
            //mondaiの先頭の1文字を削除
            mondai = mondai.substring(1);
            //textViewに今のmondaiを表示
            textView.setText(mondai);
            //seikaiに1足す
            seikai = seikai + 1;

            //seikaiが4になったら新しいゲームを始める
            if (seikai == 4){
                start();
            }
            //そうでない場合、
        }else{
            //Toastに”数字が違うよ！！”と表示する
            Toast.makeText(this,"数字が違うよ！！",Toast.LENGTH_SHORT).show();
        }

    }
    public void number2(View v){
        //もしhairetu[seikai]が2の時
        if (hairetu[seikai] == 2){
            //mondaiの先頭の1文字を削除
            mondai = mondai.substring(2);
            //textViewに今のmondaiを表示
            textView.setText(mondai);
            //seikaiに1足す
            seikai = seikai + 1;

            //seikaiが4になったら新しいゲームを始める
            if (seikai == 4){
                start();
            }
          //そうでない場合、
    }else{
        //Toastに”数字が違うよ！！”と表示する
        Toast.makeText(this,"数字が違うよ！！",Toast.LENGTH_SHORT).show();
    }


}
    public void number3(View v){
        //もしhairetu[seikai]が3の時
        if (hairetu[seikai] == 3){
            //mondaiの先頭の1文字を削除
            mondai = mondai.substring(3);
            //textViewに今のmondaiを表示
            textView.setText(mondai);
            //seikaiに1足す
            seikai = seikai + 1;

            //seikaiが4になったら新しいゲームを始める
            if (seikai == 4){
                start();
            }
            //そうでない場合、
        }else{
            //Toastに”数字が違うよ！！”と表示する
            Toast.makeText(this,"数字が違うよ！！",Toast.LENGTH_SHORT).show();
        }


    }
    public void number4(View v){
        //もしhairetu[seikai]が4の時
        if (hairetu[seikai] == 4){
            //mondaiの先頭の1文字を削除
            mondai = mondai.substring(4);
            //textViewに今のmondaiを表示
            textView.setText(mondai);
            //seikaiに1足す
            seikai = seikai + 1;

            //seikaiが4になったら新しいゲームを始める
            if (seikai == 4){
                start();
            }
            //そうでない場合、
        }else{
            //Toastに”数字が違うよ！！”と表示する
            Toast.makeText(this,"数字が違うよ！！",Toast.LENGTH_SHORT).show();
        }


    }
}
