package cs.dal.grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by jeyabalaji on 26/01/17.
 */

public class CustomGridAdapter extends BaseAdapter
{


        private Context context;
        private String[] items;
        LayoutInflater inflater;

        public CustomGridAdapter(Context context, String[] items) {
            this.context = context;
            this.items = items;
            inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = inflater.inflate(R.layout.cell, null);
            }
            TextView t = (TextView) convertView.findViewById(R.id.grid_item);
            t.setText(items[position]);
            return convertView;
        }

        @Override
        public int getCount() {
            return items.length;
        }

        @Override
        public Object getItem(int position) {
            return items[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }


    }

