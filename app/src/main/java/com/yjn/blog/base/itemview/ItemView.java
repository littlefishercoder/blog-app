package com.yjn.blog.base.itemview;

import android.os.Bundle;

import com.yjn.blog.base.adapter.ItemAdapter;
import com.yjn.blog.base.item.Item;


public interface ItemView {

	/**
	 * @param bundle TODO
     */
	void findViewsByIds(Bundle bundle);

	/**
     */
	void setObject(Item item, int position, ItemAdapter.OnViewClickListener onViewClickListener);

}
