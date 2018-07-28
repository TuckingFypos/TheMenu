package io.github.tuckingfypos.themenu;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    List<JuiceCard> mJuiceCardList;

    public CustomRecyclerViewAdapter(final List<JuiceCard> customJuiceCardList) {
        mJuiceCardList = customJuiceCardList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.juice_card, parent, false);
        CustomViewHolder viewHolder = new CustomViewHolder(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {

        JuiceCard cardObject = mJuiceCardList.get(position);
        final String name = cardObject.getName();
        final String brand = cardObject.getBrand();
        final String desc = cardObject.getDesc();
        final String status = cardObject.getStatus();
        final String price = cardObject.getPrice();
        final String size = cardObject.getSize();
        final String nic = cardObject.getNic();

        holder.setmTextView1(name);
        holder.setmTextView2(brand);
        holder.setmTextView3(desc);
        holder.setmTextView4(status);
        holder.setmTextView5(price);
        holder.setmTextView6(size);
        holder.setmTextView7(nic);

    }

    @Override
    public int getItemCount() { return mJuiceCardList.size();}
}
