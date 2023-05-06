package com.utm.foldingcellwithrecyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ramotion.foldingcell.FoldingCell;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.itemViewHolder> {

    private List<ItemObject> mListItem;

    public void setData(List<ItemObject> list){
        this.mListItem = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class itemViewHolder extends RecyclerView.ViewHolder {

        private FoldingCell foldingCell;
        private TextView tvTitle;
        private TextView tvContent;

        public itemViewHolder(@NonNull View itemView) {
            super(itemView);

            foldingCell = itemView.findViewById(R.id.folding_cell);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvContent = itemView.findViewById(R.id.tv_content);


        }
    }
}
