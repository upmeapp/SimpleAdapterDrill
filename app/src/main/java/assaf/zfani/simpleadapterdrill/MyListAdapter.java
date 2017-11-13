package assaf.zfani.simpleadapterdrill;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 11/13/2017.
 */

public class MyListAdapter implements ListAdapter {
    ArrayList<Worker> myList = new ArrayList<Worker>();
    Context context;

    public MyListAdapter(Context context,ArrayList<Worker>myList)
    {
        this.myList = myList;
        this.context = context;
    }
    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Object getItem(int position) {
        return myList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if(convertView==null)
            v=((LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.linecontent,null);
        else
            v = convertView;
        TextView nameText = (TextView)v.findViewById(R.id.textViewName);
        TextView salaryText  =(TextView)v.findViewById(R.id.textViewSalary);
        TextView ageText = (TextView)v.findViewById(R.id.textViewAge);
        nameText.setText(myList.get(position).getName());
        salaryText.setText(myList.get(position).getSalary()+"");
        ageText.setText(myList.get(position).getAge() +"");
        return v;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return myList.size()==0;
    }
}
