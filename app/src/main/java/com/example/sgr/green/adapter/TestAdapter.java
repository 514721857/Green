package com.example.sgr.green.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sgr.green.R;
import com.example.sgr.green.dbBean.Student;
import com.example.sgr.green.dbBean.Users;

import java.util.ArrayList;
import java.util.List;

public class TestAdapter extends BaseAdapter {
	
	private Context context;
	private List<Student> datas;
	
	public TestAdapter(Context context, List<Student> datas){
		
		this.context = context;
		if(datas ==null){
			datas = new ArrayList<Student>();
		}
		this.datas = datas;
		
		
	}

	@Override
	public int getCount() {
		return datas.size();
	}


	public void addData(Student datas ){
		this.datas.add(datas);
		notifyDataSetChanged();


	}

	public void setData(List<Student> data) {
		if (data != null) {
			datas.clear();
			datas.addAll(data);
			notifyDataSetChanged();
		}
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if(convertView ==null){
			holder = new ViewHolder();
			convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
			holder.name = (TextView)convertView.findViewById(R.id.tv_name);
			holder.age = (TextView)convertView.findViewById(R.id.tv_age);

			convertView.setTag(holder);
			
		}else{
			holder = (ViewHolder)convertView.getTag();
		}
		if(datas !=null) {
			Student data = datas.get(position);
			holder.name.setText(data.getName());
			holder.age.setText(data.getAge() + "");

		}
		
		return convertView;
	}
	
	
	
	class ViewHolder{
		
		TextView name,age;
		
	}

	
	
	
	
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

}
