package com.example.khaddonirapottaovoktaodhikar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.khaddonirapottaovoktaodhikar.ModelClass.SampleClass;

import java.util.List;

public class MyAdapter extends BaseAdapter  {

    Activity activity;
    Context context;
    List<SampleClass> bitmapList;
    List<SampleClass>sampleClassList;


    public MyAdapter(Context context, List<SampleClass> bitmapList) {
        this.context = context;
        this.bitmapList = bitmapList;
//        stringListFull = new ArrayList<>(stringList);
    }

    @Override
    public int getCount() {
        return bitmapList.size();
    }

    @Override
    public Object getItem(int position) {
        return bitmapList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    private class ViewHolder {

        TextView text;
    ImageView imageView;
//        ImageView imageView;
//            MaterialSpinner mSpinner;
//            LinearLayout linearLayout;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
//        LayoutInflater inflater = context.getLayoutInflater();
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.listview_layout, null);
            holder = new ViewHolder();
            holder.text  = convertView.findViewById(R.id.text);
            holder.imageView  = convertView.findViewById(R.id.iconView);
//            holder.medicineImage = convertView.findViewById(R.id.videoImage);
//             holder.linearLayout = convertView.findViewById(R.id.linearLayout);
//             holder.others =convertView.findViewById(R.id.others);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final SampleClass  item= bitmapList.get(position);
//        holder.medicineImage.setImageResource(ImageArray[position]);
//        holder.imageView.setImageBitmap(item);
        holder.text.setText(item.getText());
        holder.imageView.setBackgroundResource(item.getIconId());

    /*    if((position % 2) == 0){

            convertView.setBackgroundResource(R.color.colorWhite);
        }else{
            convertView.setBackgroundResource(R.color.lightGreen);
        }*/

        return convertView;
    }

   /* @Override
    public Filter getFilter() {
        return stringFilter;
    }
    private  Filter stringFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<String> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(stringListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (String item : stringListFull) {
                    if (item.toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            stringList.clear();
            stringList.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };*/
}
