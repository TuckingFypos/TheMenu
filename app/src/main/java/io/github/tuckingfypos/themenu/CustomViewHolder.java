package io.github.tuckingfypos.themenu;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView mTextView1;
    TextView mTextView2;
    TextView mTextView3;
    TextView mTextView4;
    TextView mTextView5;
    TextView mTextView6;
    TextView mTextView7;

    ImageView mImageView;


    public CustomViewHolder(View itemView){
        super(itemView);

        mTextView1 = (TextView) itemView.findViewById(R.id.textView1);
        mTextView2 = (TextView) itemView.findViewById(R.id.textView2);
        mTextView3 = (TextView) itemView.findViewById(R.id.textView3);
        mTextView4 = (TextView) itemView.findViewById(R.id.textView4);
        mTextView5 = (TextView) itemView.findViewById(R.id.textView5);
        mTextView6 = (TextView) itemView.findViewById(R.id.textView6);
        mTextView7 = (TextView) itemView.findViewById(R.id.textView7);

        mImageView = (ImageView) itemView.findViewById(R.id.imageView1);

    }

    public TextView getmTextView1() {
        return mTextView1;
    }

    public TextView getmTextView2() {
        return mTextView2;
    }

    public TextView getmTextView3() {
        return mTextView3;
    }

    public TextView getmTextView4() {
        return mTextView4;
    }

    public TextView getmTextView5() {
        return mTextView5;
    }

    public TextView getmTextView6() {
        return mTextView6;
    }

    public TextView getmTextView7() {
        return mTextView7;
    }

    public void setmTextView1(String textView1) {
        mTextView1 = (TextView) itemView.findViewById(R.id.textView1);
        mTextView1.setText(textView1);
    }

    public void setmTextView2(String textView2) {
        mTextView2 = (TextView) itemView.findViewById(R.id.textView2);
        mTextView2.setText(textView2);
    }

    public void setmTextView3(String textView3) {
        mTextView3 = (TextView) itemView.findViewById(R.id.textView3);
        mTextView3.setText(textView3);
    }

    public void setmTextView4(String TextView4) {
        mTextView4 = (TextView) itemView.findViewById(R.id.textView4);
        mTextView4.setText(TextView4);
    }

    public void setmTextView5(String TextView5) {
        mTextView5 = (TextView) itemView.findViewById(R.id.textView5);
        mTextView5.setText(TextView5);
    }

    public void setmTextView6(String TextView6) {
        mTextView6 = (TextView) itemView.findViewById(R.id.textView6);
        mTextView6.setText(TextView6);
    }

    public void setmTextView7(String TextView7) {
        mTextView7 = (TextView) itemView.findViewById(R.id.textView7);
        mTextView7.setText(TextView7);
    }


    public ImageView getmImageView() {return mImageView; }

    public void setmImageView(ImageView mImageView) { this.mImageView = mImageView; }
}
