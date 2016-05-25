package com.example.vnleb.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.vnleb.test.Data.model.User;
import com.example.vnleb.test.Data.remote.UserAPI;
import com.example.vnleb.test.utils.DialogFactory;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.button_get_all)
    Button btnGetAll;

    @Bind(R.id.textView_output)
    TextView tvOutput;

    @Bind(R.id.linlayout_main)
    LinearLayout linlayout_main;

    @Bind(R.id.editText_record_id)
    EditText editText;

    private MainActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mContext=MainActivity.this;
    }

    @OnClick(R.id.button_get_all) public void onClick_get_All_User(){
        UserAPI userAPI= UserAPI.Factory.getIstance(getApplicationContext());
        userAPI.getUsers("%"+editText.getText().toString().trim()+"%").enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if (response.isSuccessful()){
                    List<User> userList=response.body();
                    Log.e("Count", " "+userList.size());
                    tvOutput.setText(""+userList.size());
                }else{
                    DialogFactory.showErrorSnackBar(mContext,linlayout_main,new Throwable("Error get data: "+response.code()));
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });
    }


}
