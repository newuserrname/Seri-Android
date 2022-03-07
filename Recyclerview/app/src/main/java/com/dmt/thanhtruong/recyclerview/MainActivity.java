package com.dmt.thanhtruong.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvUser;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvUser = findViewById(R.id.rcv_user);
        userAdapter = new UserAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvUser.setLayoutManager(linearLayoutManager);

        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);
    }

    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.jisoo, "Jisoo"));
        list.add(new User(R.drawable.jennie, "Jennie"));
        list.add(new User(R.drawable.roses, "Roses"));
        list.add(new User(R.drawable.lalisa, "Lalisa"));

        list.add(new User(R.drawable.jisoo_a, "Jisoo"));
        list.add(new User(R.drawable.jennie_a, "Jennie"));
        list.add(new User(R.drawable.roses_a, "Roses"));
        list.add(new User(R.drawable.lalisa_a, "Lalisa"));

        list.add(new User(R.drawable.jisoo_b, "Jisoo"));
        list.add(new User(R.drawable.jennie_b, "Jennie"));
        list.add(new User(R.drawable.roses_b, "Roses"));
        list.add(new User(R.drawable.lalisa_b, "Lalisa"));

        list.add(new User(R.drawable.jisoo_c, "Jisoo"));
        list.add(new User(R.drawable.jennie_c, "Jennie"));
        list.add(new User(R.drawable.roses_c, "Roses"));
        list.add(new User(R.drawable.lalisa_c, "Lalisa"));
        return list;
    }
}