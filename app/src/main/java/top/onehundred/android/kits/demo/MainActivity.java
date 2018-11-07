package top.onehundred.android.kits.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import liupeng.ademo.R;
import top.onehundred.android.kits.demo.activities.AppSystemActivity;
import top.onehundred.android.kits.demo.activities.DialogActivity;
import top.onehundred.android.kits.demo.activities.IntentActivity;
import top.onehundred.android.kits.ok;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_app)
    Button btnApp;
    @BindView(R.id.btn_dialog)
    Button btnDialog;
    @BindView(R.id.btn_datetime)
    Button btnDatetime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ok.init(getApplication());

    }

    @OnClick({R.id.btn_app, R.id.btn_dialog, R.id.btn_datetime, R.id.btn_intents})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_app:
                startActivity(new Intent(this, AppSystemActivity.class));
                break;
            case R.id.btn_dialog:
                startActivity(new Intent(this, DialogActivity.class));
                break;
            case R.id.btn_datetime:
                break;
            case R.id.btn_intents:
                startActivity(new Intent(this, IntentActivity.class));
                break;
        }
    }
}