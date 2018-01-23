package com.example.sgr.ui;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sgr.green.adapter.TestAdapter;
import com.example.sgr.green.R;
import com.example.sgr.green.dbBean.Student;
import com.example.sgr.green.dbBean.Users;
import com.example.sgr.green.dbOper.StudentOpt;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ListView list;
    private EditText et_Name, et_age;
    private Button btn, btn_insert, btn_query, btn_queryAll, btn_delete, btn_update;
    private TestAdapter adapter;
    private List<Student> listsUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    /**
     * 初始化 控件
     */
    private void initView() {
        et_Name = (EditText) findViewById(R.id.et_name);
        et_age = (EditText) findViewById(R.id.et_age);


        btn_insert = (Button) findViewById(R.id.btn_insert);
        btn_query = (Button) findViewById(R.id.btn_query);
        btn_queryAll = (Button) findViewById(R.id.btn_queryAll);
        btn_delete = (Button) findViewById(R.id.btn_delete);
        btn_update = (Button) findViewById(R.id.btn_update);
        list = (ListView) findViewById(R.id.list);

        btn_insert.setOnClickListener(this);
        btn_query.setOnClickListener(this);
        btn_queryAll.setOnClickListener(this);
        btn_delete.setOnClickListener(this);
        btn_update.setOnClickListener(this);
        list.setOnItemLongClickListener(new MyOnItemLongClickListener());

        adapter = new TestAdapter(this, listsUser);
        listsUser = StudentOpt.queryAll(MainActivity.this);
        adapter.setData(listsUser);
        list.setAdapter(adapter);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_insert:
                String    name = et_Name.getText().toString().trim();
                String age = et_age.getText().toString();
                Student insertData = new Student( name, age,null);
                Log.e("插入","插入"+insertData);
                StudentOpt.insertData(MainActivity.this,insertData);
                listsUser = StudentOpt.queryAll(MainActivity.this);

                adapter.setData(listsUser);

                break;
            case R.id.btn_query:
//                query();
                break;
            case R.id.btn_queryAll:
//                queryAll();
                break;

            case R.id.btn_update:
/*

                Toast.makeText(MainActivity.this, "编辑", Toast.LENGTH_LONG).show();
                update();
*/


                break;
            case R.id.btn_delete:
                StudentOpt.deleteAllData(MainActivity.this);
                listsUser = StudentOpt.queryAll(MainActivity.this);
                adapter.setData(listsUser);

                break;
        }
    }
    class MyOnItemLongClickListener implements AdapterView.OnItemLongClickListener {

        @Override
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int i, long l) {
            AlertDialog.Builder alerDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alerDialogBuilder.setPositiveButton("修改", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
           /*         name = et_Name.getText().toString().trim();
                    age = et_age.getText().toString();
                    sex = et_sex.getText().toString().trim();
                    salary = et_Salary.getText().toString().trim();
                    User updateData = new User(listsUser.get(i).getId(), name, age, sex, salary);
                    dao.update(updateData);
                    adapter.setData(dao.loadAll());*/
                    dialog.dismiss();

                }
            });
            alerDialogBuilder.setNegativeButton("删除", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

/*                    User listbox = listsUser.get(i);
                    dao.delete(listbox);
                    //boxDao.deleteByKey(listbox.getId());
                    // boxDao.insert(listbox);
                    //  listsBox = boxDao.loadAll();
                    Log.i("AAA", "listsBox=" + listsUser.toString());
                    adapter.setData(dao.loadAll());*/
                    dialog.dismiss();

                }
            });
            alerDialogBuilder.create();
            alerDialogBuilder.show();

            return false;

        }
    }
}
