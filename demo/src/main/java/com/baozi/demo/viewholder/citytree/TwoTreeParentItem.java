package com.baozi.demo.viewholder.citytree;

import com.baozi.demo.R;
import com.baozi.treerecyclerview.viewholder.TreeParentItem;
import com.baozi.treerecyclerview.viewholder.TreeItem;
import com.baozi.treerecyclerview.viewholder.ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baozi on 2016/12/8.
 */
public class TwoTreeParentItem extends TreeParentItem<CityBean.CitysBean> {

    public TwoTreeParentItem(CityBean.CitysBean data) {
        super(data);
    }

    @Override
    protected List<TreeItem> initChildsList(CityBean.CitysBean data) {
        ArrayList<TreeItem> treeItems = new ArrayList<>();
        List<CityBean.CitysBean.AreasBean> citys = data.getAreas();
        if (citys == null) {
            return null;
        }
        for (int i = 0; i < citys.size(); i++) {
            ThreeItem threeItem = new ThreeItem(citys.get(i));
            treeItems.add(threeItem);
        }
        return treeItems;
    }

    @Override
    public int initLayoutId() {
        return R.layout.item_two;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder) {
        holder.setText(R.id.tv_content, data.getCityName());
    }
}