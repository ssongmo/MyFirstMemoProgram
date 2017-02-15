package com.example.goodgoodman.myfirstmemoprogram;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Date;
import java.util.List;
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    Context context;
    List<Memo> datas;

    public ListAdapter(Context context, List<Memo> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Memo memo = datas.get(position);
        holder.textView.setText(memo.getMemo()); //홀더에서 받아온 텍스트뷰에 메모 넣기.
        holder.dateView.setText(memo.getDate().toGMTString().toString());
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView dateView ;

        public ViewHolder(View view) { //텍스트파일 리스너
            super(view);
            textView = (TextView)view.findViewById(R.id.textView);
            dateView = (TextView)view.findViewById(R.id.dateView);
        }
    }
}
