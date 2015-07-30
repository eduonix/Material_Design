

package br.liveo.navigationliveo;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.util.SparseIntArray;
import br.liveo.adapter.NavigationLiveoItemAdapter;

import com.example.materialdesign.R;




public class NavigationLiveoList {

    public static List<NavigationLiveoItemAdapter> getNavigationAdapter(List<String> listNameItem, List<Integer> listIcon,
                                                                        List<Integer> listItensHeader, SparseIntArray sparceItensCount,
                                                                        int colorSelected, boolean removeSelector, Context context) {

        List<NavigationLiveoItemAdapter> mList = new ArrayList<>();
        if (listNameItem == null || listNameItem.size() == 0) {
            throw new RuntimeException(context.getString(R.string.list_null_or_empty));
        }

        int icon;
        int count;
        boolean isHeader;

        for (int i = 0; i < listNameItem.size(); i++) {

            String title = listNameItem.get(i);

            NavigationLiveoItemAdapter mItemAdapter;

            icon = (listIcon != null ? listIcon.get(i) : 0);
            isHeader = (listItensHeader != null && listItensHeader.contains(i));
            count = (sparceItensCount != null ? sparceItensCount.get(i, -1) : -1);

            if (isHeader && icon > 0){
                throw new RuntimeException(context.getString(R.string.value_icon_should_be_0));
            }

            if (!isHeader) {
                if (title == null) {
                    throw new RuntimeException(context.getString(R.string.enter_item_name_position) + i);
                }

                if (title.trim().equals("")) {
                    throw new RuntimeException(context.getString(R.string.enter_item_name_position) + i);
                }
            }else{
                if (title == null) {
                    title = "";
                }

                if (title.trim().equals("")) {
                    title = "";
                }
            }

            mItemAdapter = new NavigationLiveoItemAdapter(title, icon, isHeader, count, colorSelected, removeSelector);
            mList.add(mItemAdapter);
        }
        return mList;
    }

}
