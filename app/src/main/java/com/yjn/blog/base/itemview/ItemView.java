package com.cct.gridproject_android.base.itemview;

import android.os.Bundle;

import com.cct.gridproject_android.base.adapter.ItemAdapter;
import com.cct.gridproject_android.base.item.Item;


public interface ItemView {

	/**
	 * @param bundle TODO
     */
	void findViewsByIds(Bundle bundle);

	/**
     */
	void setObject(Item item, int position, ItemAdapter.OnViewClickListener onViewClickListener);

}
